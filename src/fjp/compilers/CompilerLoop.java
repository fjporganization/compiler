package fjp.compilers;

import java.util.Stack;

import fjp.generated.*;
import fjp.structures.*;

public class CompilerLoop extends CBaseListener {

    /**
     * used for storing instructions, in which will be changed operands
     * (e.g. changing address of conditional jump instruction created on
     * entering if statement at the time of exiting if statement)
     */
    private final Stack<Instruction> instructionStack;

    /** Data which are shared across all compilers classes */
    private final Stack<Integer> addressStack;

    /** Data which are shared across all compilers classes */
    private final CompilerData data;

    /**
     * Constructor of CompilerLoop
     * @param data contains data which are shared with all compiler classes
     */
    public CompilerLoop(CompilerData data){
        this.data = data;
        this.instructionStack = new Stack<>();
        this.addressStack = new Stack<>();
    }

    @Override
    public void enterWhilestatement(CParser.WhilestatementContext ctx) {
        //method is called AFTER parser processed block 'if(condition)' so condition is already processed
        if(data.popDataType() != DataType.BOOLEAN){
            Error.throwError(ctx, "Unexpected data type in 'while' expression.");
        }
        Instruction conditionalJump = new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0, -1);
        data.decStackPointer();
        data.addInstruction(conditionalJump);
        instructionStack.push(conditionalJump);
    }

    @Override
    public void exitWhilestatement(CParser.WhilestatementContext ctx) {

        instructionStack.pop().setOperand(data.getCurrentInstructionAddress() + 2);
        data.addInstruction(new Instruction(InstructionCodes.JUMP, 0, addressStack.pop()));
    }

    @Override
    public void enterWhileloop(CParser.WhileloopContext ctx) {
        addressStack.push(data.getCurrentInstructionAddress() + 1);
    }

    @Override
    public void enterDowhileloop(CParser.DowhileloopContext ctx) {
        addressStack.push(data.getCurrentInstructionAddress() + 1);
    }

    @Override
    public void exitDowhileloop(CParser.DowhileloopContext ctx) {
        // JMC - jump on zero -> need to neg. resutl
        if(data.popDataType() != DataType.BOOLEAN){
            Error.throwError(ctx, "Unexpected data type in 'while' expression.");
        }
        data.addInstruction(new Instruction(InstructionCodes.PUSH, 0, 0));
        data.addInstruction(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.EQUALITY));
        Instruction jump = new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0, addressStack.pop());
        data.addInstruction(jump);
        data.decStackPointer();
    }

    @Override
    public void exitForinitialization(CParser.ForinitializationContext ctx) {

        addressStack.push(data.getCurrentInstructionAddress() + 1);
    }

    @Override
    public void enterForafterthought(CParser.ForafterthoughtContext ctx) {
        if(data.popDataType() != DataType.BOOLEAN){
            Error.throwError(ctx, "Unexpected data type in 'for' expression.");
        }
        Instruction conditionalJump = new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0, -1);
        data.decStackPointer();
        data.addInstruction(conditionalJump);
        instructionStack.push(conditionalJump);

        Instruction jump = new Instruction(InstructionCodes.JUMP, 0, -1);
        data.addInstruction(jump);
        instructionStack.push(jump);

        addressStack.push(data.getCurrentInstructionAddress() + 1);
    }

    @Override
    public void exitForafterthought(CParser.ForafterthoughtContext ctx) {

        int temp = addressStack.pop();

        Instruction jump = new Instruction(InstructionCodes.JUMP, 0, addressStack.pop());
        data.addInstruction(jump);

        addressStack.push(temp);

        instructionStack.pop().setOperand(data.getCurrentInstructionAddress() + 1);
    }

    @Override
    public void exitForloop(CParser.ForloopContext ctx) {

        Instruction jump = new Instruction(InstructionCodes.JUMP, 0, addressStack.pop());
        data.addInstruction(jump);

        instructionStack.pop().setOperand(data.getCurrentInstructionAddress() + 1);
    }
}
