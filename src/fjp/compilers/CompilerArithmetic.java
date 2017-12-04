package fjp.compilers;

import fjp.generated.*;
import fjp.structures.*;

/**
 * Provides arithmetic compiler functionality 
 *
 */
public class CompilerArithmetic extends CBaseListener {
	
	/** Symbol of multiplication operator*/
	private static final String MULTIPLICATION_OPERATOR = "*";
	
	/** Symbol of addition operator*/
	private static final String ADDITION_OPERATOR = "+";
	
	/** Symbol of unary minus */
	private static final String UNARY_MINUS = "-";
	
	/** Symbol of fraction bar */
	private static final String FRACTION_BAR = "|";

    /** Data which are shared across all compilers classes */
    private final CompilerData data;
    
    /**
     * Constructor of the arithmetic compiler
     * @param data compiler data that are shared across all compiler classes
     */
    public CompilerArithmetic(CompilerData data){
        this.data = data;
    }

    /**
     * Processes arithmetic expressions which contains multiplication or division
     */
    @Override
    public void exitMulDivExp(CParser.MulDivExpContext ctx) {
    	DataType result = DataConversions.checkDataTypes(data);
    	Instruction instruction;
    	
    	switch(result) {
    	case INT:
    		OperationCode operationCode = ctx.MULTIPLICATIONDIVISIONOPERATOR().getText().equals(MULTIPLICATION_OPERATOR) ?
                    OperationCode.MULTIPLICATION : OperationCode.DIVISION;

            instruction = new Instruction(InstructionCodes.OPERATION, 0, operationCode);
            data.addInstructionChangeStackPointer(instruction);
            data.pushDataType(DataType.INT);
            break;
            
    	case FRACTION:
    		if(ctx.MULTIPLICATIONDIVISIONOPERATOR().getText().equals(MULTIPLICATION_OPERATOR)) {
    			// multiply numerator of first fraction by numerator of second fraction
    			StackEndManipulations.loadFromStackEnd(3, data);
    			StackEndManipulations.loadFromStackEnd(2, data);
    			
    			data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.MULTIPLICATION));
        		
        		// multiply denominator of first fraction by denominator of second fraction
    			StackEndManipulations.loadFromStackEnd(3, data);
    			StackEndManipulations.loadFromStackEnd(2, data);
    			
        		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.MULTIPLICATION));
        		
    		} else { //division
    			// multiply numerator of first fraction by denominator of second fraction
    			StackEndManipulations.loadFromStackEnd(3, data);
    			StackEndManipulations.loadFromStackEnd(1, data);
    			
    			data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.MULTIPLICATION));
        		
    			//multiply denominator of first fraction by numerator of second fraction
    			StackEndManipulations.loadFromStackEnd(3, data);
    			StackEndManipulations.loadFromStackEnd(3, data);
    			
    			data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.MULTIPLICATION));
    		}
    		
    		shiftFractionInStack();
    		data.pushDataType(DataType.FRACTION);
    		break;
    		
    	case BOOLEAN:
    		Error.throwError(ctx, "Incompatible data types - trying to multiply / divide boolean");
    		break;
    	}
    }


    /**
     * Processes arithmetic expressions which contains addition or subtraction
     */
    @Override
    public void exitAddSubExp(CParser.AddSubExpContext ctx) {
    	OperationCode operationCode;
    	DataType result = DataConversions.checkDataTypes(data);
    	
    	switch(result) {
    	case INT:
    		operationCode = ctx.ADDITIONSUBTRACTIONOPERATOR().getText().equals(ADDITION_OPERATOR) ?
                    OperationCode.ADDITION : OperationCode.SUBTRACTION;

            Instruction instruction = new Instruction(InstructionCodes.OPERATION, 0, operationCode);
            data.addInstructionChangeStackPointer(instruction);
            
            data.pushDataType(DataType.INT);
            break;
            
    	case FRACTION:
    		// multiply numerator of first fraction by denominator of second fraction
    		StackEndManipulations.loadFromStackEnd(3, data);
    		StackEndManipulations.loadFromStackEnd(1, data);
    		
			data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.MULTIPLICATION));
    		
    		// multiply numerator of second fraction by denominator of first fraction
			StackEndManipulations.loadFromStackEnd(2, data);
			StackEndManipulations.loadFromStackEnd(4, data);
			
			data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.MULTIPLICATION));
    		
    		// add/subtract the numerators
    		operationCode = ctx.ADDITIONSUBTRACTIONOPERATOR().getText().equals("+") ?
                    OperationCode.ADDITION : OperationCode.SUBTRACTION;
    		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, operationCode));
    		
    		// compute resulting denominator by multiplicating denominators of both fractions
    		StackEndManipulations.loadFromStackEnd(3, data);
    		StackEndManipulations.loadFromStackEnd(2, data);
			
    		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.MULTIPLICATION));
    		
    		data.pushDataType(DataType.FRACTION);
    		shiftFractionInStack();
    		
    		break;
    		
    	case BOOLEAN:
    		Error.throwError(ctx, "Incompatible data types - trying to add / subtract boolean");
    		break;
    	}
    }  	

    /**
     * Processes numeric atom (single numeric value) (pushes the value of the variable onto the stack)
     */
    @Override
    public void exitNumericAtom(CParser.NumericAtomContext ctx) {
        //load given literal onto the stack
        String literal = ctx.getText();
        
        if(literal.contains(FRACTION_BAR)) { //fraction
        	
        	String[] inputData = literal.split("\\" + FRACTION_BAR); //must escape |
        	String numerator = inputData[0];
        	int denominator = Integer.parseInt(inputData[1]);
        	if(denominator == 0) {
        		Error.throwError(ctx, "Denominator of ratio data type cannot be zero");
        	}
        	
        	data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.PUSH, 0, numerator));
        	data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.PUSH, 0, denominator));
        	data.pushDataType(DataType.FRACTION);
    		        	
        }else { //integer
        	Instruction instruction = new Instruction(InstructionCodes.PUSH, 0, literal);
            data.addInstructionChangeStackPointer(instruction);
            data.pushDataType(DataType.INT);
        }
    }
    
    /**
     * on end of expression evaluation checks if the expression is ratio data type
     * eventually converts fraction into fraction with numerator and denominator as low as possible
     */
    @Override 
    public void exitExpression(CParser.ExpressionContext ctx) { 
    	if(data.peekDataType() == DataType.FRACTION) {
    		shortenFraction();
    	}
    }
    
    /**
     * processes explicit data conversions
     */
    @Override 
    public void exitDataTypeConversion(CParser.DataTypeConversionContext ctx) { 
    	DataType currentType = data.popDataType();
    	String newType = ctx.TYPESPECIFIER().getText();
    	
    	switch(newType) {
    	case "int":
    		switch(currentType) {
    		case INT: //everything is OK
    			break;
    			
    		case FRACTION:
    			data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.DIVISION));
    			break;
    			
    		case BOOLEAN:
    			Error.throwError(ctx, "Cannot convert integer to boolean");
    			break;
    		}
    		
    		data.pushDataType(DataType.INT);
    		break;
    	
    	case "ratio":
    		switch(currentType) {
    		case INT: 
    			data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.PUSH, 0, 1)); //just add denominator 1
    			break;
    			
    		case FRACTION: //everything is OK
    			break;
    			
    		case BOOLEAN:
    			Error.throwError(ctx, "Cannot convert ratio to boolean");
    			break;
    		}
    		
    		data.pushDataType(DataType.FRACTION);
    		break;
    		
    	case "boolean":
    		switch(currentType) {
    		case INT:
    			Error.throwError(ctx, "Cannot convert boolean to integer");
    			break;
    			
    		case FRACTION: 
    			Error.throwError(ctx, "Cannot convert boolean to ratio");
    			break;
    			
    		case BOOLEAN: //everything is OK
    			break;
    		}
    		
    		data.pushDataType(DataType.BOOLEAN);
    		break;
    	}
    }
    
    /**
     * Processes unary operators
     */
    @Override 
    public void exitUnaryOperator(CParser.UnaryOperatorContext ctx) { 
    	DataType current = data.peekDataType();
		
		switch(current) {
		case INT:
			if(ctx.ADDITIONSUBTRACTIONOPERATOR().getText().equals(UNARY_MINUS)) {
				data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.NEGATION));
	    	}
			break;
			
		case FRACTION:
			if(ctx.ADDITIONSUBTRACTIONOPERATOR().getText().equals(UNARY_MINUS)) {
				StackEndManipulations.loadFromStackEnd(1, data);
				data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.NEGATION));
				StackEndManipulations.storeAtStackEnd(2, data);
			}
			break;
			
		case BOOLEAN:
			Error.throwError(ctx, "Unary operators are not applicable to boolean data type");
			break;
		}
    }
    
    /**
     * after numeric operations with fractions in the stack persists original fractions
     * stores resulting fraction to the position of first fraction and erases second fraction from top of the stack
     */
    private void shiftFractionInStack() {
    	// store resulting fraction in position of original fraction
    	StackEndManipulations.storeAtStackEnd(4, data);
    	StackEndManipulations.storeAtStackEnd(4, data);
    	
    	//remove second operand
    	data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0, data.getCurrentInstructionAddress() + 2));
    	data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0, data.getCurrentInstructionAddress() + 2));
    }
    
    /**
     * Adds instructions for fraction shortening by Euclidean algorithm
     */
    private void shortenFraction() {  	
    	sortPartsFraction();
    	calculateLargestCommonDivisor();
    	dividePartsFraction();
    }
    
    /**
     * sorts numerator and denominator of fraction, greater first
     */
    private void sortPartsFraction() {
    	// determine which part of fraction is greater
    	StackEndManipulations.loadFromStackEnd(1, data);
    	StackEndManipulations.loadFromStackEnd(1, data);
		
		// push greater part first
		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.LESS_THAN));
		
		// there is no need to sort when numerator is greater
		Instruction conditionalJump = new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0);
		data.addInstructionChangeStackPointer(conditionalJump);
		
		//denominator is greater
		StackEndManipulations.loadFromStackEnd(0, data);
		StackEndManipulations.loadFromStackEnd(2, data);
		
		Instruction jump = new Instruction(InstructionCodes.JUMP, 0);
		data.addInstructionChangeStackPointer(jump);
		
		data.decStackPointer(2); //only one branch of conditional jump will be executed, so we need to decrease stack pointer
		
		//numerator is greater
		conditionalJump.setOperand(data.getCurrentInstructionAddress() + 1);
		
		StackEndManipulations.loadFromStackEnd(1, data);
		StackEndManipulations.loadFromStackEnd(1, data);
		
		jump.setOperand(data.getCurrentInstructionAddress() + 1);
		
    }
    
    /**
     * calculates largest common divisor of numerator and denominator
     */
    private void calculateLargestCommonDivisor() {
    	Instruction conditionalJump = new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0);
    	
    	//Euclidean algorithm
    	StackEndManipulations.loadFromStackEnd(1, data);
		conditionalJump.setOperand(data.getCurrentInstructionAddress());
		StackEndManipulations.loadFromStackEnd(1, data);
		
		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.MODULUS));
		
		// shift stack - remove first operand, which is now not necessary any more
		StackEndManipulations.loadFromStackEnd(1, data);
		StackEndManipulations.storeAtStackEnd(3, data);
		StackEndManipulations.storeAtStackEnd(1, data);
		StackEndManipulations.loadFromStackEnd(0, data);
		
		//check if modulus is equal to zero
		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.PUSH, 0, 0));
		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.EQUALITY));
		data.addInstructionChangeStackPointer(conditionalJump);
		
		//erase last modulus, which is zero
		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0, data.getCurrentInstructionAddress() + 2));
		// at the top of the stack is the largest common divisor
    }
    
    /**
     * divides parts of fraction by largest common divisor => converts fraction into fraction which numerator and denominator are as low as possible
     */
    private void dividePartsFraction() {
    	StackEndManipulations.loadFromStackEnd(2, data);
    	StackEndManipulations.loadFromStackEnd(1, data);
		
		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.DIVISION));
		StackEndManipulations.storeAtStackEnd(3, data);
		
		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.DIVISION));
    }
}
