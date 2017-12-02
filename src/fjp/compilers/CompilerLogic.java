package fjp.compilers;

import fjp.generated.*;
import fjp.structures.*;

public class CompilerLogic extends CBaseListener {

    /** Data which are shared across all compilers classes */
    private final CompilerData data;

    /**
     * Constructor of CompilerLogic
     * @param data contains data which are shared with all compiler classes
     */
    public CompilerLogic(CompilerData data){
        this.data = data;
    }

    /**
     * Processes logic negation
     */
    @Override
    public void exitLogicNegation(CParser.LogicNegationContext ctx) {
    	// TODO
    	
        //Instruction instruction = new Instruction(InstructionCodes.OPERATION, 0, OperationCode.LOGIC_NEGATION);
        //no change of stack pointer
        //data.addInstruction(instruction);
    }

    /**
     * Processes logic expression which contains relational operator
     */
    @Override
    public void exitRelationalLogicExp(CParser.RelationalLogicExpContext ctx) {
        OperationCode operationCode = null;
        String operator = ctx.RELATIONALOPERATOR().getText();

        switch(operator) {
            case ">":
                operationCode = OperationCode.GREATER_THAN;
                break;
            case ">=":
                operationCode = OperationCode.GREATER_EQUAL;
                break;
            case "<":
                operationCode = OperationCode.LESS_THAN;
                break;
            case "<=":
                operationCode = OperationCode.LESS_EQUAL;
                break;
        }

        Instruction instruction = new Instruction(InstructionCodes.OPERATION, 0, operationCode);

        //instruction pops 2 values from the stack (operands) and push 1 value (result)
        data.decStackPointer();
        data.addInstruction(instruction);
    }

    /**
     * Processes logic expression which contains equality operator
     */
    @Override
    public void exitEqualityLogicExp(CParser.EqualityLogicExpContext ctx) {
        int operationCode = -1;
        String operator = ctx.EQUALITYOPERATOR().getText();

        switch(operator) {
            case "==":
                operationCode = OperationCode.EQUALITY.getCode();
                break;
            case "!=":
                operationCode = OperationCode.INEQUALITY.getCode();
                break;
        }

        Instruction instruction = new Instruction(InstructionCodes.OPERATION, 0, operationCode);
        //instruction pops 2 values from the stack (operands) and push 1 value (result)
        data.decStackPointer();

        data.addInstruction(instruction);
    }

    /**
     * Processes logic expression which contains AND operator
     */
    @Override
    public void exitLogicalAndExp(CParser.LogicalAndExpContext ctx) {
        data.addInstruction(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.ADDITION));
        data.decStackPointer();
        // sum of two trues must be 2 (T = true = 1; F = false = 0)
        data.addInstruction(new Instruction(InstructionCodes.PUSH, 0, 2));
        data.incStackPointer();

        data.addInstruction(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.EQUALITY));
        data.decStackPointer();
    }

    /**
     * Processes logic expression which contains OR operator
     */
    @Override
    public void exitLogicalOrExp(CParser.LogicalOrExpContext ctx) {
        data.addInstruction(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.ADDITION));
        data.decStackPointer();
        // sum of (T,T | T,F | F,T) must be >= 1 (T = true = 1; F = false = 0)
        data.addInstruction(new Instruction(InstructionCodes.PUSH, 0, 1));
        data.incStackPointer();
        data.addInstruction(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.GREATER_EQUAL));
        data.decStackPointer();
    }

    /**
     * Processes logic literal atom
     */
    @Override
    public void exitLogicAtom(CParser.LogicAtomContext ctx) {
        int value = ctx.LOGICALVALUE().getText().equals("true") ? 1 : 0;
        Instruction instruction = new Instruction(InstructionCodes.PUSH, 0, value);
        data.incStackPointer();
        data.addInstruction(instruction);
    }
}
