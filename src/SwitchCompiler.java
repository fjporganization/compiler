import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Create instructions which are connected witch switch command
 */
public class SwitchCompiler extends CBaseListener {

    /**
     * Data which are shared across all compilers classes
     */
    private final CompilerData data;

    /**
     * Stack of nested switches
     */
    private Stack<SwitchObject> switches;

    /**
     * Class contains all needed data of one switch
     */
    private class SwitchObject {
        Queue<Instruction> insQueue;
        List<Instruction> insList;
        Instruction loadCmpValue;

        SwitchObject(){
            insQueue = new LinkedBlockingQueue<>();
            insList = new ArrayList<>();
            this.loadCmpValue = null;
        }
    }


    public SwitchCompiler(CompilerData data){
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
     * Set all left jump instructions to jump at the end of switch
     */
    @Override
    public void exitSwitchcondition(CParser.SwitchconditionContext ctx) {
        SwitchObject obj = switches.pop();

        int endAdr = data.getCurrentInstructionAddress() + 1;

        for(Instruction ins : obj.insList){
            ins.setOperand(endAdr);
        }

        for (Instruction ins : obj.insQueue){
            ins.setOperand(endAdr);
        }

        // TODO expecting that value from expression is at the end of switch on top of stack
        // TODO exist instruction for remove value from stack?
        // remove last value from stack
        data.addInstruction(new Instruction(InstructionCodes.PUSH, 0, 0));
        Instruction store = new Instruction(InstructionCodes.STORE, 0, obj.loadCmpValue.getOperand());
        data.addInstruction(store);
        data.toShift.add(store);
        data.addInstruction(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.ADDITION));
        data.decStackPointer();
    }


    /**
     * Set address of jump in last case to start of this case.
     */
    @Override
    public void enterSwitchcase(CParser.SwitchcaseContext ctx) {
        // first switch case create load instruction to last value from stack
        // new instruction will be added in all switch case branches
        if(switches.peek().loadCmpValue == null) {
            switches.peek().loadCmpValue = new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer());
            data.toShift.add(switches.peek().loadCmpValue);
        }

        // Get jump from last case block to set address
        Instruction lastJump = switches.peek().insQueue.poll();
        if(lastJump != null){
            lastJump.setOperand(data.getCurrentInstructionAddress() + 1);
        }
    }

    /**
     * Set address to jump from last case and add comparison of case
     */
    @Override
    public void enterSwitchstatement(CParser.SwitchstatementContext ctx) {
        // Get jump from last case block to set address
        Instruction lastJump = switches.peek().insQueue.poll();

        // Comparison
        data.addInstruction(switches.peek().loadCmpValue);
        data.incStackPointer();
        data.addInstruction(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.EQUALITY));

        // Jump to next next case
        Instruction jump = new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0, -1);
        data.addInstruction(jump);
        switches.peek().insQueue.offer(jump);
        data.incStackPointer();

        if(lastJump != null){
            lastJump.setOperand(data.getCurrentInstructionAddress() + 1);
        }
    }

    /**
     * Check key word break at the end of case. Add jump to body of next case.
     */
    @Override
    public void exitSwitchstatement(CParser.SwitchstatementContext ctx) {
        if(ctx.BREAKKEYWORD() != null) {
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

        for(int i = 0; i < 2; i ++) {
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
