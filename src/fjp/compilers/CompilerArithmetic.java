package fjp.compilers;

import fjp.generated.*;
import fjp.structures.*;

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
    	switch(data.getCurrentExpDataType()) {
    	case INT:
    		OperationCode operationCode = ctx.MULTIPLICATIONDIVISIONOPERATOR().getText().equals("*") ?
                    OperationCode.MULTIPLICATION : OperationCode.DIVISION;

            Instruction instruction = new Instruction(InstructionCodes.OPERATION, 0, operationCode);
            //instruction pops 2 values from the stack (operands) and push 1 value (result)
            data.decStackPointer();

            data.addInstruction(instruction);
            break;
            
    	case FRACTION:
    		if(ctx.MULTIPLICATIONDIVISIONOPERATOR().getText().equals("*")) {
    			// multiply numerator of first fraction by numerator of second fraction
    			data.addInstruction(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 2));
    			data.incStackPointer();
        		
        		data.addInstruction(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 1));
        		data.incStackPointer();
        		
        		data.addInstruction(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.MULTIPLICATION));
        		data.decStackPointer();
        		
        		// multiply denominator of first fraction by denominator of second fraction
        		data.addInstruction(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 2));
        		data.incStackPointer();
        		
        		data.addInstruction(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 1));
        		data.incStackPointer();
        		
        		data.addInstruction(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.MULTIPLICATION));
        		data.decStackPointer();
        		
    		} else {
    			// multiply numerator of first fraction by denominator of second fraction
    			data.addInstruction(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 2));
    			data.incStackPointer();
        		
        		data.addInstruction(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 0));
    			data.incStackPointer();

        		data.addInstruction(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.MULTIPLICATION));
        		data.decStackPointer();
        		
        		// multiply denominator of first fraction by numerator of second fraction
        		data.addInstruction(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 2));
    			data.incStackPointer();
        		
        		data.addInstruction(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 2));
    			data.incStackPointer();
        		
        		data.addInstruction(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.MULTIPLICATION));
        		data.decStackPointer();
    		}
    	}
    }


    /**
     * Processes arithmetic expressions which contains addition or subtraction
     */
    @Override
    public void exitAddSubExp(CParser.AddSubExpContext ctx) {
    	OperationCode operationCode;
    	switch(data.getCurrentExpDataType()) {
    	case INT:
    		operationCode = ctx.ADDITIONSUBTRACTIONOPERATOR().getText().equals("+") ?
                    OperationCode.ADDITION : OperationCode.SUBTRACTION;

            Instruction instruction = new Instruction(InstructionCodes.OPERATION, 0, operationCode);
            //instruction pops 2 values from the stack (operands) and push 1 value (result)
            data.decStackPointer();

            data.addInstruction(instruction);
            break;
            
    	case FRACTION:
    		// multiply numerator of first fraction by denominator of second fraction
    		System.out.println(data.getStackPointer());
    		data.addInstruction(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 2));
    		data.incStackPointer();
    		
    		data.addInstruction(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 0));
			data.incStackPointer();
    		
    		data.addInstruction(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.MULTIPLICATION));
    		data.decStackPointer();
    		
    		// multiply numerator of second fraction by denominator of first fraction
    		data.addInstruction(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 1));
			data.incStackPointer();
    		
    		data.addInstruction(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 3));
			data.incStackPointer();
    		
    		data.addInstruction(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.MULTIPLICATION));
    		data.decStackPointer();
    		
    		// add/subtract the resulting numerator
    		operationCode = ctx.ADDITIONSUBTRACTIONOPERATOR().getText().equals("+") ?
                    OperationCode.ADDITION : OperationCode.SUBTRACTION;
    		data.addInstruction(new Instruction(InstructionCodes.OPERATION, 0, operationCode));
    		data.decStackPointer();
    		
    		// compute resulting denominator by multiplicating denominators of both fractions
    		data.addInstruction(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 2));
    		data.incStackPointer();
    		
    		data.addInstruction(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 1));
    		data.incStackPointer();
    		
    		data.addInstruction(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.MULTIPLICATION));
    		data.decStackPointer();
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
        
        if(literal.contains("|")) { //fraction
        	switch(data.getCurrentExpDataType()) { //type control and eventual type conversion      		
        		
        	case INT: //must convert current result into fraction
        		data.addInstruction(new Instruction(InstructionCodes.PUSH, 0, 1)); //just add denominator 1
        		data.incStackPointer();
        		//continue to NONE_YET branch to set fraction data type
        		
        	case NONE_YET:
        		data.setCurrentExpDataType(DataType.FRACTION);
        		// continue to push fraction onto the stack
        		
        	case FRACTION:
        		String[] inputData = literal.split("|");
            	String numerator = inputData[0];
            	int denominator = Integer.parseInt(inputData[2]);
            	
            	if(denominator == 0) {
            		System.err.println("Division by zero");
            		System.exit(1);
            	}
            	
            	data.addInstruction(new Instruction(InstructionCodes.PUSH, 0, numerator));
            	data.incStackPointer();
            	data.addInstruction(new Instruction(InstructionCodes.PUSH, 0, denominator));
            	data.incStackPointer();
            	System.out.println("F" + data.getStackPointer());
            	break;
        		
        	default:
        		System.err.println("Incompatible data types");
        		System.exit(1);
        	}
        	
        }else { //integer
        	
        	switch(data.getCurrentExpDataType()) { //type control and eventual type conversion
        	case NONE_YET:
        		data.setCurrentExpDataType(DataType.INT);
        		//continue to integer branch
        		
        	case INT:
        		Instruction instruction = new Instruction(InstructionCodes.PUSH, 0, literal);
                data.incStackPointer();
                data.addInstruction(instruction);
        		break;
        		
        	case FRACTION: //must convert current atom into fraction
        		data.addInstruction(new Instruction(InstructionCodes.PUSH, 0, literal)); //literal is numerator
        		data.incStackPointer();
        		data.addInstruction(new Instruction(InstructionCodes.PUSH, 0, 1)); //just add denominator 1
        		data.incStackPointer();
        		data.setCurrentExpDataType(DataType.FRACTION);
        		break;
        		
        	default:
        			System.err.println("Incompatible data types");
            		System.exit(1);
            		break;
        	}
        }
    }
    
    @Override 
    public void enterExpression(CParser.ExpressionContext ctx) {
    	data.setCurrentExpDataType(DataType.NONE_YET);
    }
    
    @Override 
    public void exitExpression(CParser.ExpressionContext ctx) { 
    	if(data.getCurrentExpDataType() == DataType.FRACTION) {
    		//shortenFraction();
    	}
    }
    
    /**
     * Adds instructions for fraction shortening by Euclidean algorithm
     */
    public void shortenFraction() {
    	sortPartsFraction();
    	int addressOriginalFraction = data.getStackPointer() - 1;
    	
    	calculateLargestCommonDivisor();
    	dividePartsFraction(addressOriginalFraction);
    }
    
    /**
     * sorts numerator and denominator of fraction, greater first
     */
    public void sortPartsFraction() {
    	// determine which part of fraction is greater
    	data.addInstruction(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 1));
		data.incStackPointer();
		
		data.addInstruction(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 1));
		data.incStackPointer();
		
		// push greater part first
		data.addInstruction(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.LESS_THAN));
		data.decStackPointer();
		
		// there is no need to sort when numerator is greater
		Instruction conditionalJump = new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0);
		data.addInstruction(conditionalJump);
		data.decStackPointer();
		
		//denominator is greater
		data.addInstruction(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer()));
		data.incStackPointer();
		
		data.addInstruction(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 2));
		data.incStackPointer();
		
		conditionalJump.setOperand(data.getCurrentInstructionAddress() + 1);
		
    }
    
    public void calculateLargestCommonDivisor() {
    	// copy fraction
    	data.addInstruction(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 1));
		data.incStackPointer();
		
		data.addInstruction(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 1));
		data.incStackPointer();
		
		//Euclidean algorithm
		data.addInstruction(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.MODULUS));
		
		Instruction condition = new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0, data.getCurrentInstructionAddress());
		
		data.addInstruction(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer()));
		data.incStackPointer();
		
		//negation for conditional jump
		data.addInstruction(new Instruction(InstructionCodes.PUSH, 0, 0));
		data.incStackPointer();
		
		data.addInstruction(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.INEQUALITY));
		data.decStackPointer();
		
		data.addInstruction(condition);
		data.decStackPointer();
		// at the top of the stack is the largest common divisor
    }
    
    public void dividePartsFraction(int addressOriginalFraction) {
    	//divide numerator by the largest common divisor
    	data.addInstruction(new Instruction(InstructionCodes.LOAD, 0, addressOriginalFraction));
    	data.incStackPointer();
    			
    	data.addInstruction(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 1));
    	data.incStackPointer();
    			
    	data.addInstruction(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.DIVISION));
    	data.decStackPointer();
    			
    	//divide denominator by the largest common divisor
    	data.addInstruction(new Instruction(InstructionCodes.LOAD, 0, addressOriginalFraction + 1));
    	data.incStackPointer();
    			
    	data.addInstruction(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 2));
    	data.incStackPointer();
    			
    	data.addInstruction(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.DIVISION));
    	data.decStackPointer();
    }
}
