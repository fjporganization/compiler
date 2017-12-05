package fjp.compilers;

import fjp.generated.*;
import fjp.structures.*;

/**
 * Provides functionality of logic compiler
 *
 */
public class CompilerLogic extends CBaseListener {
	
	/** Symbol of greater */
	private static final String GREATER = ">";
	
	/** Symbol of greater or equal */
	private static final String GREATER_EQUAL = ">=";
	
	/** Symbol of less */
	private static final String LESS = "<";
	
	/** Symbol of less or equal */
	private static final String LESS_EQUAL = "<=";
	
	/** Symbol of equality */
	private static final String EQUAL = "==";
	
	/** Symbol of inequality */
	private static final String INEQUAL = "!=";

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
     * Processes logic expression which contains relational operator
     */
    @Override
    public void exitRelationalLogicExp(CParser.RelationalLogicExpContext ctx) {
        OperationCode operationCode = null;
        Instruction instruction;
        String operator = ctx.RELATIONALOPERATOR().getText();

        switch(operator) {
            case GREATER:
                operationCode = OperationCode.GREATER_THAN;
                break;
                
            case GREATER_EQUAL:
                operationCode = OperationCode.GREATER_EQUAL;
                break;
                
            case LESS:
                operationCode = OperationCode.LESS_THAN;
                break;
                
            case LESS_EQUAL:
                operationCode = OperationCode.LESS_EQUAL;
                break;
                                	
        }
        
        DataType type = DataConversions.checkDataTypes(data, ctx);
        
        switch(type) {            
        case FRACTION:
        	convertFractionsCommonDivisor();
        	instruction = new Instruction(InstructionCodes.OPERATION, 0, operationCode);
            data.addInstructionChangeStackPointer(instruction);
            shiftFractionInStack();
            break;
        	
        case INT:
        	instruction = new Instruction(InstructionCodes.OPERATION, 0, operationCode);
            data.addInstructionChangeStackPointer(instruction);
            break;
        
        case BOOLEAN:
        	Error.throwError(ctx, "Booleans cannot be compared with operator " + operator);
        	break;
        }
        
        data.pushDataType(DataType.BOOLEAN);
    }

    /**
     * Processes logic expression which contains equality operator
     */
    @Override
    public void exitEqualityLogicExp(CParser.EqualityLogicExpContext ctx) {
        int operationCode = -1;
        Instruction instruction;
        String operator = ctx.EQUALITYOPERATOR().getText();

        switch(operator) {
            case EQUAL:
                operationCode = OperationCode.EQUALITY.getCode();
                break;
                
            case INEQUAL:
                operationCode = OperationCode.INEQUALITY.getCode();
                break;
        }
        
        DataType type = DataConversions.checkDataTypes(data, ctx);
        
        switch(type) {            
        case FRACTION:
        	convertFractionsCommonDivisor();
        	instruction = new Instruction(InstructionCodes.OPERATION, 0, operationCode);
            data.addInstructionChangeStackPointer(instruction);
            shiftFractionInStack();
            break;
        	
        case INT:
        	instruction = new Instruction(InstructionCodes.OPERATION, 0, operationCode);
            data.addInstructionChangeStackPointer(instruction);
            break;
        
        case BOOLEAN:        	
            data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, operationCode));
            break;
        }
        
        data.pushDataType(DataType.BOOLEAN);
    }
    
    /**
     * after comparison operations with fractions in the stack persists original fractions
     * stores resulting fraction to the position of first fraction and erases second fraction from top of the stack
     */
    public void shiftFractionInStack() {
    	// store resulting fraction
    	StackEndManipulations.storeAtStackEnd(3, data);
    	
    	//remove second operand
    	data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0, data.getCurrentInstructionAddress() + 2));
    	data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0, data.getCurrentInstructionAddress() + 2));
    }
    
    /**
     * converts two fractions on the stack to numerators of fractions with common divisor
     */
    public void convertFractionsCommonDivisor() {
    	//multiply numerator of first fraction by denominator of second fraction
    	StackEndManipulations.loadFromStackEnd(3, data);
    	
    	data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.MULTIPLICATION));
    	
    	//multiply denominator of first fraction by numerator of first fraction
    	StackEndManipulations.loadFromStackEnd(2, data);
    	StackEndManipulations.loadFromStackEnd(2, data);
    	
    	data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.MULTIPLICATION));
    	
    	//now are on the top of the stack two integer values, which represents numerators of given fractions converted to common divisor
    }
    
    /**
     * Processes logic negation
     */
    @Override
    public void exitLogicNegation(CParser.LogicNegationContext ctx) {
    	if(data.popDataType() != DataType.BOOLEAN) { //check data types on the stack
    		Error.throwError(ctx, "Only boolean data type is allowed in logical negation expression");
    	}
    	
    	data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.PUSH, 0, 0));
    	data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.EQUALITY));
    	data.pushDataType(DataType.BOOLEAN);
    }

    /**
     * Processes logic expression which contains AND operator
     */
    @Override
    public void exitLogicalAndExp(CParser.LogicalAndExpContext ctx) {
    	if(data.popDataType() != DataType.BOOLEAN || data.popDataType() != DataType.BOOLEAN) { //check data types on the stack
    		Error.throwError(ctx, "Only boolean data type is allowed in logical AND expression");
    	}
    	
        data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.ADDITION));
        // sum of two trues must be 2 (T = true = 1; F = false = 0)
        data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.PUSH, 0, 2));
        data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.EQUALITY));
        
        data.pushDataType(DataType.BOOLEAN);
    }

    /**
     * Processes logic expression which contains OR operator
     */
    @Override
    public void exitLogicalOrExp(CParser.LogicalOrExpContext ctx) {
    	if(data.popDataType() != DataType.BOOLEAN || data.popDataType() != DataType.BOOLEAN) { //check data types on the stack
    		Error.throwError(ctx, "Only boolean data type is allowed in logical OR expression");
    	}
    	
        data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.ADDITION));
        // sum of (T,T | T,F | F,T) must be >= 1 (T = true = 1; F = false = 0)
        data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.PUSH, 0, 1));
        data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.GREATER_EQUAL));
        
        data.pushDataType(DataType.BOOLEAN);
    }

    /**
     * Processes logic literal atom
     */
    @Override
    public void exitLogicAtom(CParser.LogicAtomContext ctx) {
        int value = ctx.LOGICALVALUE().getText().equals("true") ? 1 : 0;
        Instruction instruction = new Instruction(InstructionCodes.PUSH, 0, value);
        data.addInstructionChangeStackPointer(instruction);
        
        data.pushDataType(DataType.BOOLEAN);
    }
}
