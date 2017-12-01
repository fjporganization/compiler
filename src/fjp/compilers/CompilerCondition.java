package fjp.compilers;

import java.util.Stack;

import fjp.generated.*;
import fjp.structures.*;

public class CompilerCondition extends CBaseListener {

    /**
     * used for storing instructions, in which will be changed operands
     * (e.g. changing address of conditional jump instruction created on
     * entering if statement at the time of exiting if statement)
     */
    private final Stack<Instruction> instructionStack;

    /** Data which are shared across all compilers classes */
    private final CompilerData data;

    /**
     * Constructor of fjp.compilers.CompilerCondition
     * @param data contains data which are shared with all compiler classes
     */
    public CompilerCondition(CompilerData data){
        this.data = data;
        this.instructionStack = new Stack<>();
    }

    /**
     * Processes beginning of the simple condition statement
     * Prepares instruction with conditional jump, address to conditional
     * jump will be completed after processing the statements block
     */
    @Override
    public void enterSimplecondition(CParser.SimpleconditionContext ctx) {
        //method is called AFTER parser processed block 'if(condition)' so condition is already processed
        Instruction conditionalJump = new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0);
        // pops one value
        data.decStackPointer();
        data.addInstruction(conditionalJump);
        instructionStack.add(conditionalJump);
    }


    /**
     * Processes end of the simple condition statement
     * Completes instruction with conditional jump - adds address to conditional
     * jump beyond the statements block
     */
    @Override
    public void exitSimplecondition(CParser.SimpleconditionContext ctx) {
        Instruction conditionalJump = instructionStack.pop();
        conditionalJump.setOperand(data.getCurrentInstructionAddress() + 1);
    }

	 // IF ELSE CONDITION ==================

    /**
     * Processes beginning of the if-else condition statement
     * Prepares instruction with conditional jump, address to conditional
     * jump will be completed after processing the assertive branch statements block
     */
    @Override
    public void enterIfelsecondition(CParser.IfelseconditionContext ctx) {
        //method is called AFTER parser processed block 'if(condition)' so condition is already processed
        Instruction conditionalJump = new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0);
        data.decStackPointer();
        data.addInstruction(conditionalJump);
        instructionStack.add(conditionalJump);
    }


    /**
     * Processes end of the if-else condition assertive branch
     * Completes instruction with conditional jump - adds address to conditional
     * jump beyond the assertive branch statements block
     */
    @Override
    public void exitAssertivebranch(CParser.AssertivebranchContext ctx) {
        Instruction conditionalJump = instructionStack.pop();
        // must jump to instruction beyond instruction for unconditional jump beyond negative branch, therefore +2
        conditionalJump.setOperand(data.getCurrentInstructionAddress() + 2);

        // jump beyond negative branch
        Instruction jump = new Instruction(InstructionCodes.JUMP, 0);
        data.addInstruction(jump);
        instructionStack.add(jump);
    }


    /**
     * Processes end of the if-else condition negative branch
     * Completes instruction with jump on the end of assertive branch -
     * adds address to jump beyond the negative branch statements block
     */
    @Override
    public void exitNegativebranch(CParser.NegativebranchContext ctx) {
        Instruction jump = instructionStack.pop();
        jump.setOperand(data.getCurrentInstructionAddress() + 1);
    }

    // TERNARY OPERATOR ====================

    @Override
    public void enterTernaryoperator(CParser.TernaryoperatorContext ctx) {
        // condition has been processed yet
        Instruction conditionalJump = new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0);
        data.decStackPointer();
        data.addInstruction(conditionalJump);
        instructionStack.add(conditionalJump);
    }

    @Override
    public void exitTernaryassertive(CParser.TernaryassertiveContext ctx) {
        Instruction conditionalJump = instructionStack.pop();
        // must jump to instruction beyond instruction for unconditional jump beyond negative branch, therefore +2
        conditionalJump.setOperand(data.getCurrentInstructionAddress() + 2);

        // jump beyond negative branch
        Instruction jump = new Instruction(InstructionCodes.JUMP, 0);
        data.addInstruction(jump);
        instructionStack.add(jump);
    }

    @Override
    public void exitTernarynegative(CParser.TernarynegativeContext ctx) {
        Instruction jump = instructionStack.pop();
        jump.setOperand(data.getCurrentInstructionAddress() + 1);
    }
}
