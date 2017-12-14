package fjp.compilers;

import java.util.Stack;

import fjp.generated.*;
import fjp.structures.*;

/**
 * Provides functionality for parsing conditions
 *
 */
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
     * Constructor of CompilerCondition
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
    	if(Error.inError()) { //skip method when previous parse error occurred
    		return;
    	}
    	
        //method is called AFTER parser processed block 'if(condition)', so condition is already processed and evaluated
    	if(data.popDataType() != DataType.BOOLEAN) {
    		Error.throwError(ctx, "In if condition must be boolean data type");
    		return;
    	}
    	
        Instruction conditionalJump = new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0);
        data.addInstructionChangeStackPointer(conditionalJump);
        instructionStack.add(conditionalJump);
    }


    /**
     * Processes end of the simple condition statement
     * Completes instruction with conditional jump - adds address to conditional
     * jump beyond the statements block
     */
    @Override
    public void exitSimplecondition(CParser.SimpleconditionContext ctx) {
    	if(Error.inError()) { //skip method when previous parse error occurred
    		return;
    	}
    	
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
    	if(Error.inError()) { //skip method when previous parse error occurred
    		return;
    	}
    	
        //method is called AFTER parser processed block 'if(condition)' so condition is already processed
    	if(data.popDataType() != DataType.BOOLEAN) {
    		Error.throwError(ctx, "In if condition must be boolean data type");
    		return;
    	}
    	
        Instruction conditionalJump = new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0);
        data.addInstructionChangeStackPointer(conditionalJump);
        instructionStack.add(conditionalJump);
    }


    /**
     * Processes end of the if-else condition assertive branch
     * Completes instruction with conditional jump - adds address to conditional
     * jump beyond the assertive branch statements block
     */
    @Override
    public void exitAssertivebranch(CParser.AssertivebranchContext ctx) {
    	if(Error.inError()) { //skip method when previous parse error occurred
    		return;
    	}
    	
        Instruction conditionalJump = instructionStack.pop();
        // must jump to instruction beyond instruction for unconditional jump beyond negative branch, therefore +2
        conditionalJump.setOperand(data.getCurrentInstructionAddress() + 2);

        // jump beyond negative branch
        Instruction jump = new Instruction(InstructionCodes.JUMP, 0);
        data.addInstructionChangeStackPointer(jump);
        instructionStack.add(jump);
    }


    /**
     * Processes end of the if-else condition negative branch
     * Completes instruction with jump in the end of assertive branch -
     * adds address to jump beyond the negative branch statements block
     */
    @Override
    public void exitNegativebranch(CParser.NegativebranchContext ctx) {
    	if(Error.inError()) { //skip method when previous parse error occurred
    		return;
    	}
    	
        Instruction jump = instructionStack.pop();
        jump.setOperand(data.getCurrentInstructionAddress() + 1);
    }

    // TERNARY OPERATOR ====================
    
    /**
     * Processes beginning of the ternary operator
     * Prepares instruction for conditional jump
     */
    @Override
    public void enterTernaryoperator(CParser.TernaryoperatorContext ctx) {
       	if(Error.inError()) { //skip method when previous parse error occurred
    		return;
    	}
       	
    	DataType type = data.popDataType();
    	
        // condition has been processed yet
    	if(type != DataType.BOOLEAN) {
    		Error.throwError(ctx, "In ternary operator condition must be boolean data type");
    		return;
    	}
    	
        Instruction conditionalJump = new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0);
        data.addInstructionChangeStackPointer(conditionalJump);
        instructionStack.add(conditionalJump);
    }
    
    /**
     * Processes end of assertive branch of ternary operator
     * Fulfill the next instruction address in conditional jump instruction
     * to jump into the negative branch
     */
    @Override
    public void exitTernaryassertive(CParser.TernaryassertiveContext ctx) {
    	if(Error.inError()) { //skip method when previous parse error occurred
    		return;
    	}
    	
        Instruction conditionalJump = instructionStack.pop();
        // must jump to instruction beyond instruction for unconditional jump beyond negative branch, therefore +2
        conditionalJump.setOperand(data.getCurrentInstructionAddress() + 2);

        // jump beyond negative branch
        Instruction jump = new Instruction(InstructionCodes.JUMP, 0);
        data.addInstructionChangeStackPointer(jump);
        instructionStack.add(jump);
    }
    
    /**
     * Processes enter of negative branch of ternary operator
     * After processing ternary assertive branch is stack pointer wrong as the compiler will enter only one branch
     * Method makes current stack pointer correct
     */
    @Override
    public void enterTernarynegative(CParser.TernarynegativeContext ctx) {
    	switch(data.peekDataType()) {
    	case INT:
    	case BOOLEAN:
    		data.decStackPointer();
    		break;
    	case FRACTION:
    		data.decStackPointer(2);
    		break;
    	}
    }
    
    /**
     * Processes end of negative branch of ternary operator
     * Fulfill the next instruction address in jump instruction 
     * to jump beyond the negative branch 
     */
    @Override
    public void exitTernarynegative(CParser.TernarynegativeContext ctx) {
    	if(Error.inError()) { //skip method when previous parse error occurred
    		return;
    	}
    	
        Instruction jump = instructionStack.pop();
        jump.setOperand(data.getCurrentInstructionAddress() + 1);
        
        DataType assertiveExpression = data.popDataType();
    	DataType negativeExpression = data.popDataType();
    	
    	if(assertiveExpression != negativeExpression) {
    		Error.throwError(ctx, "Incompatible data types in ternary operators - data types in both expressions of ternary operator may not differs");
    		return;
    	}
    	
    	data.pushDataType(assertiveExpression);
    }
}
