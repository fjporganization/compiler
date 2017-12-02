package fjp.compilers;

import fjp.generated.*;
import fjp.structures.*;

/**
 * Provides arithmetic compiler functionality 
 *
 */
public class CompilerArithmetic extends CBaseListener {

    /** Data which are shared across all compilers classes */
    private final CompilerData data;

    public CompilerArithmetic(CompilerData data){
        this.data = data;
    }

    /**
     * Processes arithmetic expressions which contains multiplication or division
     */
    @Override
    public void exitMulDivExp(CParser.MulDivExpContext ctx) {
    	DataType result = DataConversions.checkDataTypes(data);
    	
    	switch(result) {
    	case INT:
    		OperationCode operationCode = ctx.MULTIPLICATIONDIVISIONOPERATOR().getText().equals("*") ?
                    OperationCode.MULTIPLICATION : OperationCode.DIVISION;

            Instruction instruction = new Instruction(InstructionCodes.OPERATION, 0, operationCode);
            data.addInstructionChangeStackPointer(instruction);
            data.pushDataType(DataType.INT);
            break;
            
    	case FRACTION:
    		if(ctx.MULTIPLICATIONDIVISIONOPERATOR().getText().equals("*")) {
    			// multiply numerator of first fraction by numerator of second fraction
    			data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 2));
        		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 1));
        		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.MULTIPLICATION));
        		
        		// multiply denominator of first fraction by denominator of second fraction
        		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 2));
        		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 1));
        		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.MULTIPLICATION));
        		
    		} else {
    			// multiply numerator of first fraction by denominator of second fraction
    			data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 2));
    			data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 0));
    			data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.MULTIPLICATION));
        		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 2));
    			data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 2));
    			data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.MULTIPLICATION));
 
    		}
    		
    		shiftFractionInStack();
    		data.pushDataType(DataType.FRACTION);
    		break;
    		
    	case BOOLEAN:
    		System.err.println("Incompatible data types");
    		System.exit(1);
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
    		operationCode = ctx.ADDITIONSUBTRACTIONOPERATOR().getText().equals("+") ?
                    OperationCode.ADDITION : OperationCode.SUBTRACTION;

            Instruction instruction = new Instruction(InstructionCodes.OPERATION, 0, operationCode);
            data.addInstructionChangeStackPointer(instruction);
            
            data.pushDataType(DataType.INT);
            break;
            
    	case FRACTION:
    		// multiply numerator of first fraction by denominator of second fraction
    		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 2));
    		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 0));
			data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.MULTIPLICATION));
    		
    		// multiply numerator of second fraction by denominator of first fraction
    		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 1));
			data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 3));
			data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.MULTIPLICATION));
    		
    		// add/subtract the numerators
    		operationCode = ctx.ADDITIONSUBTRACTIONOPERATOR().getText().equals("+") ?
                    OperationCode.ADDITION : OperationCode.SUBTRACTION;
    		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, operationCode));
    		
    		// compute resulting denominator by multiplicating denominators of both fractions
    		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 2));
    		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 1));
    		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.MULTIPLICATION));
    		
    		data.pushDataType(DataType.FRACTION);
    		shiftFractionInStack();
    		
    		break;
    		
    	case BOOLEAN:
    		System.err.println("Incompatible data types");
    		System.exit(1);
    		break;
    	}
    }
    
    /**
     * after numeric operations with fractions in the stack persists original fractions
     * stores resulting fraction to the position of first fraction and erases second fraction from top of the stack
     */
    private void shiftFractionInStack() {
    	// store resulting fraction
    	data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.STORE, 0, data.getStackPointer() - 3));
    	data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.STORE, 0, data.getStackPointer() - 3));
    	
    	//remove second operand
    	data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0, data.getCurrentInstructionAddress() + 2));
    	data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0, data.getCurrentInstructionAddress() + 2));
    }
       	

    /**
     * Processes numeric atom (single numeric value) (pushes the value of the variable onto the stack)
     */
    @Override
    public void exitNumericAtom(CParser.NumericAtomContext ctx) {
        //load given literal onto the stack
        String literal = ctx.getText();
        
        if(literal.contains("|")) { //fraction
        	
        	String[] inputData = literal.split("\\|");
        	String numerator = inputData[0];
        	int denominator = Integer.parseInt(inputData[1]);
        	if(denominator == 0) {
        		System.err.println("Division by zero");
        		System.exit(1);
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
    	if(data.popDataType() == DataType.FRACTION) {
    		shortenFraction();
    	}
    }
    
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
    			System.err.println("Incompatible explicit conversion");
    			System.exit(1);
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
    			System.err.println("Incompatible explicit conversion");
    			System.exit(1);
    			break;
    		}
    		
    		data.pushDataType(DataType.FRACTION);
    		break;
    		
    	case "boolean":
    		switch(currentType) {
    		case INT: 
    			
    		case FRACTION: 
    			System.err.println("Incompatible explicit conversion");
    			System.exit(1);
    			break;
    			
    		case BOOLEAN: //everything is OK
    			break;
    		}
    		
    		data.pushDataType(DataType.BOOLEAN);
    		break;
    	}
    }
    
    /**
     * Adds instructions for fraction shortening by Euclidean algorithm
     */
    private void shortenFraction() {  	
    	int addressOriginalFraction = data.getStackPointer() - 1;
    	
    	sortPartsFraction();
    	calculateLargestCommonDivisor();
    	dividePartsFraction(addressOriginalFraction);
    }
    
    /**
     * sorts numerator and denominator of fraction, greater first
     */
    private void sortPartsFraction() {
    	// determine which part of fraction is greater
    	data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 0));
		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 0));
		// push greater part first
		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.LESS_THAN));
		
		// there is no need to sort when numerator is greater
		Instruction conditionalJump = new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0);
		data.addInstructionChangeStackPointer(conditionalJump);
		
		//denominator is greater
		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() + 1));
		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 1));
		Instruction jump = new Instruction(InstructionCodes.JUMP, 0);
		data.addInstructionChangeStackPointer(jump);
		
		data.decStackPointer(); //stack pointer was incremented twice, decremented for negative branch
		data.decStackPointer();
		
		//numerator is greater
		conditionalJump.setOperand(data.getCurrentInstructionAddress() + 1);
		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 0));
		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 0));
		jump.setOperand(data.getCurrentInstructionAddress() + 1);
    }
    
    /**
     * calculates largest common divisor of numerator and denominator
     */
    private void calculateLargestCommonDivisor() {
    	//Euclidean algorithm
    	data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 0));
    	Instruction condJump = new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0, data.getCurrentInstructionAddress());
    	
		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 0));
		
		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.MODULUS));
		
		// shift stack - erase first operand, which is now not necessary
		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 0));
		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.STORE, 0, data.getStackPointer() - 2));
		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.STORE, 0, data.getStackPointer() - 0));
		
		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() + 1));
		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.PUSH, 0, 0));
		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.EQUALITY));
		
		data.addInstructionChangeStackPointer(condJump);
		
		//remove zero computed in last step of algorithm
		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0, data.getCurrentInstructionAddress() + 2));
		
		// at the top of the stack is the largest common divisor
    }
    
    /**
     * divides parts of fraction by largest common divisor => converts fraction into fraction which numerator and denominator are as low as possible
     * @param addressOriginalFraction address of orginila fraction in the stack
     */
    private void dividePartsFraction(int addressOriginalFraction) {
    	//divide numerator by the largest common divisor
    	data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.LOAD, 0, addressOriginalFraction + 1));
    	data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 0));
    	data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.DIVISION));
    	
    	//divide denominator by the largest common divisor
    	data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.LOAD, 0, addressOriginalFraction + 2));
    	data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 1));
    	data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.DIVISION));
    	
    	//replace old fraction i the stack with shortened fraction
    	data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.STORE, 0, data.getStackPointer() - 2));
    	data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.STORE, 0, data.getStackPointer() - 2));
    	
    	//remove the computed largest common divisor
    	data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0, data.getCurrentInstructionAddress() + 2));
    }
}
