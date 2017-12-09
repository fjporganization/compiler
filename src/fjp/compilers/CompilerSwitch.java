package fjp.compilers;

import fjp.generated.CBaseListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

import fjp.generated.*;
import fjp.structures.*;

/**
 * Create instructions which are connected witch switch command
 */
public class CompilerSwitch extends CBaseListener {

    /**
     * Data which are shared across all compilers classes
     */
    private final CompilerData data;

    /**
     * Stack of nested switches
     */
    private Stack<SwitchObject> switches;

    /**
     * Class contains all data which are need for compile of one switch.
     */
    private class SwitchObject {
        /** Store instructions which need change operand. */
        Queue<Instruction> insQueue;
        /** Store instructions which need to set operand to end of switch. */
        List<Instruction> insList;
        /** Contains instructions to load values to compare(input expression). */
        Instruction loadCmpValue[] = null;
        /** Number of values on stack which are in input expression. */
        int valueLenght;
        /** Data type of value in input expression. */
        DataType valueType;

        /**
         * Initialize new switch object.
         */
        SwitchObject() {
            insQueue = new LinkedBlockingQueue<>();
            insList = new ArrayList<>();
            this.loadCmpValue = null;
        }
    }


    /**
     * Constructor of CompilerSwitch
     *
     * @param data contains data which are shared with all compiler classes
     */
    public CompilerSwitch(CompilerData data) {
        this.data = data;
        switches = new Stack<>();
    }

    /**
     * Create new SwitchObject on beginning of switch
     */
    @Override
    public void enterSwitchcondition(CParser.SwitchconditionContext ctx) {
        switches.push(new SwitchObject());
    }

    /**
     * Set all left jump instructions to jump at the end of switch and remove values left values from stack.
     */
    @Override
    public void exitSwitchcondition(CParser.SwitchconditionContext ctx) {
        SwitchObject obj = switches.pop();

        int endAdr = data.getCurrentInstructionAddress() + 1;

        for (Instruction ins : obj.insList) {
            ins.setOperand(endAdr);
        }

        for (Instruction ins : obj.insQueue) {
            ins.setOperand(endAdr);
        }

        // expecting that value from expression is at the end of switch on top of stack
        // remove last value from stack
        for (int i = 0; i < obj.valueLenght; i++) {
            data.addInstruction(new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0, data.getCurrentInstructionAddress() + 2));
            data.decStackPointer();
        }
    }

    /**
     * If it is first case block set initialize values in switch object.
     * Set address of jump in last case to start in this case.
     */
    @Override
    public void enterSwitchcase(CParser.SwitchcaseContext ctx) {
        // first switch case create load instruction to last value from stack
        // new instruction will be added in all switch case branches
        SwitchObject mSwitch = switches.peek();

        if (mSwitch.loadCmpValue == null) {
            mSwitch.valueType = data.popDataType();
            mSwitch.valueLenght = mSwitch.valueType == DataType.FRACTION ? 2 : 1;
            mSwitch.loadCmpValue = new Instruction[mSwitch.valueLenght];
            for (int i = 0; i < mSwitch.valueLenght; i++) {
                int address = data.getStackPointer() - mSwitch.valueLenght + 1 + i;
                mSwitch.loadCmpValue[i] = new Instruction(InstructionCodes.LOAD, 0, address);
                data.toShift.add(mSwitch.loadCmpValue[i]);
            }
        }

        // Get jump from last case block to set address
        Instruction lastJump = mSwitch.insQueue.poll();
        if (lastJump != null) {
            lastJump.setOperand(data.getCurrentInstructionAddress() + 1);
        }
    }

    /**
     * Set address to jump from last case and add comparison of case.
     */
    @Override
    public void enterSwitchstatement(CParser.SwitchstatementContext ctx) {
        // Get jump from last case block to set address
        Instruction lastJump = switches.peek().insQueue.poll();

        DataType type = data.popDataType();
        if (type != switches.peek().valueType) {
            String msg = "Incompatible data type. Expected: " + switches.peek().valueType + " but is: " + type;
            Error.throwError(ctx, msg);
            return;
        }

        // Comparison
        for (int i = 0; i < switches.peek().valueLenght; i++) {
            data.addInstruction(switches.peek().loadCmpValue[i]);
            data.incStackPointer();
        }

        // must convert fractions to common divisor when data type is ratio
        if (type == DataType.FRACTION) {
            //multiply numerator of first fraction by denominator of second fraction
            StackEndManipulations.loadFromStackEnd(3, data);
            data.addInstruction(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.MULTIPLICATION));
            data.decStackPointer();
            StackEndManipulations.storeAtStackEnd(3, data); //save to index of first fraction numerator

            //multiply denominator of first fraction by numerator of second fraction
            data.addInstruction(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.MULTIPLICATION));
            data.decStackPointer();
        }

        data.addInstruction(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.EQUALITY));
        data.decStackPointer();

        // Jump to next next case
        Instruction jump = new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0, -1);
        data.addInstruction(jump);
        switches.peek().insQueue.offer(jump);
        data.decStackPointer();

        if (lastJump != null) {
            lastJump.setOperand(data.getCurrentInstructionAddress() + 1);
        }
    }

    /**
     * Check key word 'break' at the end of case. Add jump to body of next case.
     */
    @Override
    public void exitSwitchstatement(CParser.SwitchstatementContext ctx) {
        if (ctx.BREAKKEYWORD() != null) {
            Instruction breakJump = new Instruction(InstructionCodes.JUMP, 0, -1);
            data.addInstruction(breakJump);
            switches.peek().insList.add(breakJump);
        }

        Instruction jump = new Instruction(InstructionCodes.JUMP, 0, -1);
        data.addInstruction(jump);
        switches.peek().insQueue.offer(jump);
    }

    /**
     * Set address of jump in last case to this default branch
     */
    @Override
    public void enterSwitchdefaultstatement(CParser.SwitchdefaultstatementContext ctx) {

        for (int i = 0; i < 2; i++) {
            // Get jump from last case block to set address
            Instruction lastJump = switches.peek().insQueue.poll();

            if (lastJump != null) {
                lastJump.setOperand(data.getCurrentInstructionAddress() + 1);
            } else {
                break;
            }
        }
    }
}
