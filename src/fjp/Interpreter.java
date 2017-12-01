package fjp;

import fjp.structures.Instruction;
import fjp.structures.InstructionCodes;
import fjp.structures.LogicCode;
import fjp.structures.OperationCode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Class providing interpreter functionality
 *
 */
public class Interpreter {
	
	/**
	 * number of current instruction
	 */
	private int programCounter = 0;
	
	/**
	 * current stack pointer
	 */
	private int stackPointer = 0;
	
	/**
	 * current base address
	 */
	private int base = 0;
	
	/**
	 * stack of the interpreter
	 */
	private int[] stack;
	
	/**
	 * List of instructions to be executed
	 */
	private List<Instruction> instructions = null;

	/**
	 * Constructor
	 */
	public Interpreter() {
		stack = new int[InterpreterConstants.STACK_SIZE + 1];
	}

	/**
	 * starts interpreter and calls functions to execute instructions
	 */
	public void interpret() {
		if(instructions == null || instructions.isEmpty()) {
			System.err.println("INTERPRETER: nothing to interpret");
			return;
		}
		
		programCounter = 0;
		base = 1;
		stackPointer = 0;
		
		System.out.println("START PL/0");
		
		try {
			do {
				Instruction instruction = instructions.get(programCounter);
				
				if(InterpreterConstants.isShowDebug()) {
					System.out.println(programCounter + " " +instruction.toString());
				}
				
				switch(instruction.getCode()) {
				case PUSH:
					processPush(instruction);
					break;
					
				case OPERATION:
					processOperation(instruction);
					break;
					
				case LOAD:
					processLoad(instruction);
					break;
					
				case STORE:
					processStore(instruction);
					break;
					
				case CALL:
					processCall(instruction);
					break;
					
				case RETURN:
					processReturn(instruction);
					break;
					
				case INCREMENT:
					processIncrement(instruction);
					break;
					
				case CONDITIONAL_JUMP:
					processConditionalJump(instruction);
					break;
					
				case JUMP:
					processJump(instruction);
					break;
					
				case READ_INTEGER:
					processReadInteger(instruction);
					break;
					
				case WRITE_INTEGER:
					processWriteInteger(instruction);
					break;
					
				case READ_REAL:
					processReadReal(instruction);
					break;
					
				case WRITE_REAL:
					processWriteReal(instruction);
					break;
					
				case OPERATION_REAL:
					processFloatOperation(instruction);
					break;
					
				case OPERATION_LOGIC:
					processLogicOperation(instruction);
					break;
					
				case REAL_TO_INTEGER:
					processRealToInteger(instruction);
					break;
					
				case INTEGER_TO_REAL:
					processIntegerToReal(instruction);
					break;
					
				case LOAD_FROM_ADDRESS:
					processLoadFromAddress(instruction);
					break;
					
				case STORE_AT_ADDRESS:
					processStoreAtAddress(instruction);
					break;
					
				default: 
					System.err.println("INTERPRETER: Unknown instruction");
				}
				
			}while(programCounter > 0);
			
		}catch(IndexOutOfBoundsException e) {
			System.err.println("INTERPRETER: Instruction addressation error");
			System.exit(1);
		}
		
			if(InterpreterConstants.isShowDebug()) {
				System.out.println("PC: " + programCounter + ", SP: " + stackPointer);
				
				if(InterpreterConstants.isShowStack()) {
					System.out.println(Arrays.toString(Arrays.copyOfRange(stack, 1, stackPointer + 1)));
				}
				
				System.out.println();
			}else if(InterpreterConstants.isShowStack()) {
				System.out.println(Arrays.toString(Arrays.copyOfRange(stack, 1, stackPointer + 1)));
				System.out.println();
			}
		
		System.out.println("END PL/0");
	}
	
	/**
	 * Push literal M onto the stack
	 * @param instruction instruction to be executed
	 */
	private void processPush(Instruction instruction) {
		checkStackOverflow(1); //we will push 1 item onto the stack
		checkStackUnderflow(0);
		
		stackPointer++;
		stack[stackPointer] = instruction.getOperand();
		programCounter++;
	}

	/**
	 * Provides numeric and comparison operation to be performed on integer data at the top of the stack
	 * @param instruction instruction to be executed
	 */
	private void processOperation(Instruction instruction) {
		int code = instruction.getOperand();
		programCounter++;
		
		if(code == OperationCode.NEGATION.getCode()) {
			checkStackOverflow(0);
			checkStackUnderflow(0);
			
			stack[stackPointer] = -stack[stackPointer];
			
		}else if(code == OperationCode.ADDITION.getCode()) {
			checkStackUnderflow(1); //we will pop 2 items from the stack and pop 1 item onto the stack
			checkStackUnderflow(0);
			
			int result = stack[stackPointer] + stack[stackPointer - 1];
			stackPointer--;
			stack[stackPointer] = result;
			
		}else if(code == OperationCode.SUBTRACTION.getCode()) {
			checkStackUnderflow(1); //we will pop 2 items from the stack and pop 1 item onto the stack
			checkStackUnderflow(0);
			
			int result = stack[stackPointer - 1] - stack[stackPointer];
			stackPointer--;			
			stack[stackPointer] = result;
			
		}else if(code == OperationCode.MULTIPLICATION.getCode()) {
			checkStackUnderflow(1); //we will pop 2 items from the stack and pop 1 item onto the stack
			checkStackUnderflow(0);
			
			int result = stack[stackPointer] * stack[stackPointer - 1];
			stackPointer--;
			stack[stackPointer] = result;
			
		}else if(code == OperationCode.DIVISION.getCode()) {
			checkStackUnderflow(1); //we will pop 2 items from the stack and pop 1 item onto the stack
			checkStackUnderflow(0);
			
			int result = stack[stackPointer - 1] / stack[stackPointer];
			stackPointer--;
			stack[stackPointer] = result;
			
		}else if(code == OperationCode.MODULUS.getCode()) {
			checkStackUnderflow(1); //we will pop 2 items from the stack and pop 1 item onto the stack
			checkStackUnderflow(0);
			
			int result = stack[stackPointer - 1] % stack[stackPointer];
			stackPointer--;
			stack[stackPointer] = result;
			
		}else if(code == OperationCode.ODD.getCode()) {
			checkStackOverflow(0);
			checkStackUnderflow(0);
			
			stack[stackPointer] = stack[stackPointer] % 2 == 0 ? 1 : 0;
			
		}else if(code == OperationCode.EQUALITY.getCode()) {
			checkStackUnderflow(1); //we will pop 2 items from the stack and pop 1 item onto the stack
			checkStackOverflow(0);
			
			int result = stack[stackPointer] == stack[stackPointer - 1] ? 1 : 0;
			stackPointer--;
			stack[stackPointer] = result;
			
		}else if(code == OperationCode.INEQUALITY.getCode()) {
			checkStackUnderflow(1); //we will pop 2 items from the stack and pop 1 item onto the stack
			checkStackOverflow(0);
			
			int result = stack[stackPointer] != stack[stackPointer - 1] ? 1 : 0;
			stackPointer--;
			stack[stackPointer] = result;
			
		}else if(code == OperationCode.LESS_THAN.getCode()) {
			checkStackUnderflow(1); //we will pop 2 items from the stack and pop 1 item onto the stack
			checkStackOverflow(0);
			
			int result = stack[stackPointer - 1] < stack[stackPointer] ? 1 : 0;
			stackPointer--;
			stack[stackPointer] = result;
			
		}else if(code == OperationCode.GREATER_EQUAL.getCode()) {
			checkStackUnderflow(1); //we will pop 2 items from the stack and pop 1 item onto the stack
			checkStackOverflow(0);
			
			int result = stack[stackPointer - 1] >= stack[stackPointer] ? 1 : 0;
			stackPointer--;
			stack[stackPointer] = result;
			
		}else if(code == OperationCode.GREATER_THAN.getCode()) {
			checkStackUnderflow(1); //we will pop 2 items from the stack and pop 1 item onto the stack
			checkStackOverflow(0);
			
			int result = stack[stackPointer - 1] > stack[stackPointer] ? 1 : 0;
			stackPointer--;
			stack[stackPointer] = result;
			
		}else if(code == OperationCode.LESS_EQUAL.getCode()) {
			checkStackUnderflow(1); //we will pop 2 items from the stack and pop 1 item onto the stack
			checkStackOverflow(0);
			
			int result = stack[stackPointer - 1] <= stack[stackPointer] ? 1 : 0;
			stackPointer--;
			stack[stackPointer] = result;
			
		}else if(code == OperationCode.LOGIC_NEGATION.getCode()) {
			checkStackOverflow(0);
			checkStackUnderflow(0);
			
			stack[stackPointer] = stack[stackPointer] == 0 ? 1 : 0;
			
		}else {
			System.err.println("INTERPRETER: Unknown operation code");
			System.exit(1);
		}
	}
	
	/**
	 * Loads value to top of the stack from the provided stack location
	 * @param instruction instruction to be executed
	 */
	private void processLoad(Instruction instruction) {
		checkStackOverflow(1); //we will push 1 item onto the stack
		checkStackUnderflow(0);
		
		int address = findLowerBase(base, instruction.getNestingLevel()) + instruction.getOperand();
		stackPointer++;
		stack[stackPointer] = stack[address];
		programCounter++;
	}
	
	/**
	 * Stores value at top of the stack in the provided stack location
	 * @param instruction instruction to be executed
	 */
	private void processStore(Instruction instruction) {
		checkStackUnderflow(1); //we will pop 1 item from the stack
		checkStackOverflow(0);
		
		int address = findLowerBase(base, instruction.getNestingLevel()) + instruction.getOperand();
		stack[address] = stack[stackPointer];
		
		if(InterpreterConstants.isShowStore()) {
			System.out.println(stack[stackPointer]);
		}
		
		stackPointer--;
		programCounter++;
	}
	
	/**
	 * Calls the procedure on the provided address
	 * @param instruction instruction to be executed
	 */
	private void processCall(Instruction instruction) {
		checkStackOverflow(3); //we will push 3 items onto the stack
		checkStackUnderflow(0);
		
		int lowerBase = findLowerBase(base, instruction.getNestingLevel());
		stack[stackPointer + 1] = lowerBase;
		stack[stackPointer + 2] = base;
		stack[stackPointer + 3] = programCounter + 1;
		programCounter = instruction.getOperand();
		base = stackPointer + 1;
	}
	
	/**
	 * Returns from the procedure
	 * @param instruction instruction to be executed
	 */
	private void processReturn(Instruction instruction) {
		checkStackOverflow(3);
		checkStackUnderflow(0);
		
		stackPointer = base - 1;
		base = stack[stackPointer + 2];
		programCounter = stack[stackPointer + 3];
	}
	
	/**
	 * Increments stack pointer (allocate locals)
	 * @param instruction instruction to be executed
	 */
	private void processIncrement(Instruction instruction) {
		checkStackOverflow(instruction.getOperand());
		checkStackUnderflow(0);
		
		stackPointer = stackPointer + instruction.getOperand();
		programCounter++;
	}
	
	/**
	 * Reads integer given by user
	 * @param instruction instruction to be executed
	 */
	private void processReadInteger(Instruction instruction) {
		checkStackOverflow(1);
		checkStackUnderflow(0);
		
		Scanner sc = new Scanner(System.in);
		stackPointer++;
		
		while(sc.hasNext()) {
			try {
				stack[stackPointer] = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.err.println("Invalid input - enter integer number");
				sc.next();
			}
		}
		
		sc.close();	
		programCounter++;
	}
	
	/**
	 * writes integer to the CLI
	 * @param instruction instruction to be executed
	 */
	private void processWriteInteger(Instruction instruction) {
		checkStackOverflow(0);
		checkStackUnderflow(1);
		
		System.out.println(stack[stackPointer]);
		stackPointer--;
		programCounter++;
	}
	
	/**
	 * Reads real number given by user
	 * @param instruction instruction to be executed
	 */
	private void processReadReal(Instruction instruction) {
		checkStackOverflow(2);
		checkStackUnderflow(0);
		
		Scanner sc = new Scanner(System.in);
		stackPointer = stackPointer + 2;
		
		double value = 0; 
		
		while(sc.hasNext()) {
			try {
				value = sc.nextDouble();
				break;
			} catch (InputMismatchException e) {
				System.err.println("Invalid input - enter real number");
				sc.next();
			}
		}
		
		stack[stackPointer - 1] = (int)value;
		stack[stackPointer] = getRealPartOfNumber(value);
		
		sc.close();	
		programCounter++;
	}
	
	/**
	 * writes real number to the CLI
	 * @param instruction instruction to be executed
	 */
	private void processWriteReal(Instruction instruction) {
		checkStackOverflow(0);
		checkStackUnderflow(2);
		
		System.out.println(stack[stackPointer - 1] + "." + stack[stackPointer]);
		stackPointer = stackPointer - 2;
		programCounter++;
	}
	
	/**
	 * Provides numeric and comparison operation to be performed on real numbers at the top of the stack
	 * @param instruction instruction to be executed
	 */
	private void processFloatOperation(Instruction instruction) {
		int code = instruction.getOperand();
		programCounter++;
		
		/*
		 *  integer and real parts of float number are stored separately, on the top of the stack is real part, 
		 *  on position top-1 is stored integer part
		 */
		
		if(code == OperationCode.NEGATION.getCode()) {
			checkStackOverflow(0);
			checkStackUnderflow(0);
			stack[stackPointer] = -stack[stackPointer];
			
		}else if(code == OperationCode.ADDITION.getCode()) {
			checkStackOverflow(0);
			checkStackUnderflow(3);
			
			double value1 = stack[stackPointer - 3] + 
					(stack[stackPointer - 3] < 0 ? -stack[stackPointer - 2] : stack[stackPointer - 2])/
					(Math.pow(10, (int)Math.log10(stack[stackPointer - 2]) + 1));
			double value2 = stack[stackPointer - 1] + 
					(stack[stackPointer - 1] < 0 ? -stack[stackPointer] : stack[stackPointer])/
					(Math.pow(10, (int)Math.log10(stack[stackPointer]) + 1));
			
			double result = value1 + value2;
			stackPointer = stackPointer - 2;
			
			stack[stackPointer] = getRealPartOfNumber(result);
			stack[stackPointer - 1] = (int) result;
			
		}else if(code == OperationCode.SUBTRACTION.getCode()) {
			checkStackOverflow(0);
			checkStackUnderflow(3);
			
			double value1 = stack[stackPointer - 3] + 
					(stack[stackPointer - 3] < 0 ? -stack[stackPointer - 2] : stack[stackPointer - 2])/
					(Math.pow(10, (int)Math.log10(stack[stackPointer - 2]) + 1));
			double value2 = stack[stackPointer - 1] + 
					(stack[stackPointer - 1] < 0 ? -stack[stackPointer] : stack[stackPointer])/
					(Math.pow(10, (int)Math.log10(stack[stackPointer]) + 1));
			
			double result = value1 - value2;
			stackPointer = stackPointer - 2;
			
			stack[stackPointer] = getRealPartOfNumber(result);
			stack[stackPointer - 1] = (int) result;
			
		}else if(code == OperationCode.MULTIPLICATION.getCode()) {
			checkStackOverflow(0);
			checkStackUnderflow(3);
			
			double value1 = stack[stackPointer - 3] + 
					(stack[stackPointer - 3] < 0 ? -stack[stackPointer - 2] : stack[stackPointer - 2])/
					(Math.pow(10, (int)Math.log10(stack[stackPointer - 2]) + 1));
			double value2 = stack[stackPointer - 1] + 
					(stack[stackPointer - 1] < 0 ? -stack[stackPointer] : stack[stackPointer])/
					(Math.pow(10, (int)Math.log10(stack[stackPointer]) + 1));
			
			double result = value1 * value2;
			stackPointer = stackPointer - 2;

			stack[stackPointer] = getRealPartOfNumber(result);
			stack[stackPointer - 1] = (int) result;
			
		}else if(code == OperationCode.DIVISION.getCode()) {
			checkStackOverflow(0);
			checkStackUnderflow(3);
			
			double value1 = stack[stackPointer - 3] + 
					(stack[stackPointer - 3] < 0 ? -stack[stackPointer - 2] : stack[stackPointer - 2])/
					(Math.pow(10, (int)Math.log10(stack[stackPointer - 2]) + 1));
			double value2 = stack[stackPointer - 1] + 
					(stack[stackPointer - 1] < 0 ? -stack[stackPointer] : stack[stackPointer])/
					(Math.pow(10, (int)Math.log10(stack[stackPointer]) + 1));
			
			double result = value1 / value2;
			stackPointer = stackPointer - 2;

			stack[stackPointer] = getRealPartOfNumber(result);
			stack[stackPointer - 1] = (int) result;
			
		}else if(code == OperationCode.EQUALITY.getCode()) {
			checkStackOverflow(0);
			checkStackUnderflow(3);
			
			double value1 = stack[stackPointer - 3] + 
					(stack[stackPointer - 3] < 0 ? -stack[stackPointer - 2] : stack[stackPointer - 2])/
					(Math.pow(10, (int)Math.log10(stack[stackPointer - 2]) + 1));
			double value2 = stack[stackPointer - 1] + 
					(stack[stackPointer - 1] < 0 ? -stack[stackPointer] : stack[stackPointer])/
					(Math.pow(10, (int)Math.log10(stack[stackPointer]) + 1));
			
			stackPointer = stackPointer - 3;
			stack[stackPointer] = value1 == value2 ? 1 : 0; 
			
		}else if(code == OperationCode.INEQUALITY.getCode()) {
			checkStackOverflow(0);
			checkStackUnderflow(3);
			
			double value1 = stack[stackPointer - 3] + 
					(stack[stackPointer - 3] < 0 ? -stack[stackPointer - 2] : stack[stackPointer - 2])/
					(Math.pow(10, (int)Math.log10(stack[stackPointer - 2]) + 1));
			double value2 = stack[stackPointer - 1] + 
					(stack[stackPointer - 1] < 0 ? -stack[stackPointer] : stack[stackPointer])/
					(Math.pow(10, (int)Math.log10(stack[stackPointer]) + 1));
			
			stackPointer = stackPointer - 3;
			stack[stackPointer] = value1 != value2 ? 1 : 0; 
			
		}else if(code == OperationCode.LESS_THAN.getCode()) {
			checkStackOverflow(0);
			checkStackUnderflow(3);
			
			double value1 = stack[stackPointer - 3] + 
					(stack[stackPointer - 3] < 0 ? -stack[stackPointer - 2] : stack[stackPointer - 2])/
					(Math.pow(10, (int)Math.log10(stack[stackPointer - 2]) + 1));
			double value2 = stack[stackPointer - 1] + 
					(stack[stackPointer - 1] < 0 ? -stack[stackPointer] : stack[stackPointer])/
					(Math.pow(10, (int)Math.log10(stack[stackPointer]) + 1));
			
			stackPointer = stackPointer - 3;
			stack[stackPointer] = value1 < value2 ? 1 : 0; 
			
		}else if(code == OperationCode.GREATER_EQUAL.getCode()) {
			checkStackOverflow(0);
			checkStackUnderflow(3);
			
			double value1 = stack[stackPointer - 3] + 
					(stack[stackPointer - 3] < 0 ? -stack[stackPointer - 2] : stack[stackPointer - 2])/
					(Math.pow(10, (int)Math.log10(stack[stackPointer - 2]) + 1));
			double value2 = stack[stackPointer - 1] + 
					(stack[stackPointer - 1] < 0 ? -stack[stackPointer] : stack[stackPointer])/
					(Math.pow(10, (int)Math.log10(stack[stackPointer]) + 1));
			
			stackPointer = stackPointer - 3;
			stack[stackPointer] = value1 >= value2 ? 1 : 0; 
			
		}else if(code == OperationCode.GREATER_THAN.getCode()) {
			checkStackOverflow(0);
			checkStackUnderflow(3);
			
			double value1 = stack[stackPointer - 3] + 
					(stack[stackPointer - 3] < 0 ? -stack[stackPointer - 2] : stack[stackPointer - 2])/
					(Math.pow(10, (int)Math.log10(stack[stackPointer - 2]) + 1));
			double value2 = stack[stackPointer - 1] + 
					(stack[stackPointer - 1] < 0 ? -stack[stackPointer] : stack[stackPointer])/
					(Math.pow(10, (int)Math.log10(stack[stackPointer]) + 1));
			
			stackPointer = stackPointer - 3;
			stack[stackPointer] = value1 > value2 ? 1 : 0; 
			
		}else if(code == OperationCode.LESS_EQUAL.getCode()) {
			checkStackOverflow(0);
			checkStackUnderflow(3);
			
			double value1 = stack[stackPointer - 3] + 
					(stack[stackPointer - 3] < 0 ? -stack[stackPointer - 2] : stack[stackPointer - 2])/
					(Math.pow(10, (int)Math.log10(stack[stackPointer - 2]) + 1));
			double value2 = stack[stackPointer - 1] + 
					(stack[stackPointer - 1] < 0 ? -stack[stackPointer] : stack[stackPointer])/
					(Math.pow(10, (int)Math.log10(stack[stackPointer]) + 1));
			
			stackPointer = stackPointer - 3;
			stack[stackPointer] = value1 <= value2 ? 1 : 0; 
			
		}else {
			System.err.println("INTERPRETER: Unknown operation code");
			System.exit(1);
		}
	}
	
	/**
	 * Provides logic operation to be performed on boolean data at the top of the stack
	 * @param instruction instruction to be executed
	 */
	private void processLogicOperation(Instruction instruction) {
		int code = instruction.getOperand();
		programCounter++;
		
		/*
		 * Booleans are stored in stack as numeric values, 0 = false, non-zero = true 
		 */
		
		if(code == LogicCode.AND.getCode()) {
			checkStackOverflow(0);
			checkStackUnderflow(1);
			
			boolean value1 = stack[stackPointer] != 0;
			boolean value2 = stack[stackPointer - 1] != 0;
			
			stackPointer--;
			stack[stackPointer] = value1 && value2 ? 1 : 0;
			
		}else if(code == LogicCode.OR.getCode()) {
			checkStackOverflow(0);
			checkStackUnderflow(1);
			
			boolean value1 = stack[stackPointer] != 0;
			boolean value2 = stack[stackPointer - 1] != 0;
			
			stackPointer--;
			stack[stackPointer] = value1 || value2 ? 1 : 0;
			
		}else if(code == LogicCode.NEGATION.getCode()) {
			checkStackOverflow(0);
			checkStackUnderflow(1);
			
			stack[stackPointer] = stack[stackPointer] == 0 ? 1 : 0;
			
		}else {
			System.err.println("INTERPRETER: Unknown operation code");
			System.exit(1);
		}
	}
	
	/**
	 * transforms real number to integer
	 * @param instruction instruction to be executed
	 */
	private void processRealToInteger(Instruction instruction) {
		checkStackOverflow(0);
		checkStackUnderflow(1);
		
		// just remove real part of the number (e.g. number 3.99 will be converted to 3)
		stackPointer--;
		programCounter++;
	}
	
	/**
	 * transforms integer to real number
	 * @param instruction instruction to be executed
	 */
	private void processIntegerToReal(Instruction instruction) {
		checkStackOverflow(1);
		checkStackUnderflow(0);
		
		// just add real part (= .0) to the number 
		stackPointer++;
		stack[stackPointer] = 0;
		programCounter++;
	}
	
	/**
	 * Loads data from the the stack from the stack location given by absolute address onto the stack
	 * @param instruction instruction to be executed
	 */
	private void processLoadFromAddress(Instruction instruction) {
		checkStackOverflow(1);
		checkStackUnderflow(0);
		
		if(stack[stackPointer] < 0) {
			System.err.println("INTERPRETER: Stack underflow");
			System.exit(1);
		}
		
		if(stack[stackPointer] > InterpreterConstants.STACK_SIZE - 1) {
			System.err.println("INTERPRETER: Stack overflow");
			System.exit(1);
		}
		
		stackPointer++;
		stack[stackPointer] = stack[stack[stackPointer - 1]];
		programCounter++;
	}
	
	/**
	 * Stores data at top of the stack to the stack location given by absolute address
	 * @param instruction instruction to be executed
	 */
	private void processStoreAtAddress(Instruction instruction) {
		checkStackOverflow(0);
		checkStackUnderflow(2);
		
		if(stack[stackPointer] < 0) {
			System.err.println("INTERPRETER: Stack underflow");
			System.exit(1);
		}
		
		if(stack[stackPointer] > InterpreterConstants.STACK_SIZE - 1) {
			System.err.println("INTERPRETER: Stack overflow");
			System.exit(1);
		}
		
		stackPointer = stackPointer - 2;
		stack[stack[stackPointer + 2]] = stack[stackPointer + 1];
		programCounter++;
	}
	
	/**
	 * Jumps to given instruction address if there is zero on top of the stack
	 * @param instruction instruction to be executed
	 */
	private void processConditionalJump(Instruction instruction) {
		checkStackOverflow(0);
		checkStackUnderflow(0);
		
		programCounter = stack[stackPointer] == 0 ? instruction.getOperand() : programCounter + 1;
		stackPointer--;
	}
	
	/**
	 * jumps to given instruction address
	 * @param instruction instruction to be executed
	 */
	private void processJump(Instruction instruction) {
		programCounter = instruction.getOperand();
	}
	
	/**
	 * finds base of given number lexicographical levels down
	 * @param currentBase current base address
	 * @param levels defines which lexicographical level base address user need
	 * @return base address of given number lexicographical levels down
	 */
	private int findLowerBase(int currentBase, int levels) {
		int base = currentBase;
		for(int i = 0; i < levels; i++) {
			base = findOneLevelLowerBase(base);
		}
		
		return base;
	}
	
	/**
	 * finds one lexicographical level down base address
	 * @param currentBase current base address
	 * @return one lexicographical level down base address
	 */
	private int findOneLevelLowerBase(int currentBase) {
		return stack[currentBase];
	}

	/**
	 * checks whether popping given number of values from the stack causes stack underflow
	 * @param items number of values to be popped
	 */
	private void checkStackUnderflow(int items) {
		if(stackPointer - items < 0) { //check for stack boundaries
			System.err.println("INTERPRETER: Stack underflow");
			System.exit(1);
		}
	}
	
	/**
	 * check whether pushing given number of values onto the stack causes stack underflow
	 * @param items number of values to be pushed
	 */
	private void checkStackOverflow(int items) {
		if(stackPointer - items > InterpreterConstants.STACK_SIZE - 1) { //check for stack boundaries
			System.err.println("INTERPRETER: Stack overflow");
			System.exit(1);
		}
	}
	
	/**
	 * sets list of instructions to be executed
	 * @param instructions
	 */
	public void setInstructions(List<Instruction> instructions) {
		programCounter = 0;
		this.instructions = instructions;
	}
	
	/**
	 * loads instructions to be executed from the given file
	 * @param filePath file with instructions to be load 
	 */
	public void loadInstructionsFromFile(String filePath) {
		instructions = new ArrayList<Instruction>();
		stackPointer = 0;
		try(Stream<String> stream = Files.lines(Paths.get(filePath))){
			
			stream.forEach(e -> {
				Scanner sc = new Scanner(e);
				
				int address = sc.nextInt();
				
				if(address != stackPointer) {
					System.err.println("INTERPRETER: Input file is corrupted");
					System.exit(1);
				}
				
				stackPointer++;
				
				String instruction = sc.next();
				int nestingLevel = sc.nextInt();
				int operand = sc.nextInt();
				sc.close();
				
				Optional<InstructionCodes> code = Arrays.stream(InstructionCodes.values())
											.filter(x -> instruction.equals(x.getOperation()))
											.findFirst();
				
				if(!code.isPresent()) {
					System.err.println("INTERPRETER: Input file is corrupted");
					System.exit(1);
				}
				
				this.instructions.add(new Instruction(code.get(), nestingLevel, operand));
				
			});
			
		} catch (IOException e) {
			System.err.println("INTERPRETER: Cannot read input file");
			System.exit(1);
			
		} catch (NumberFormatException | ArrayIndexOutOfBoundsException e1) {
			System.err.println("INTERPRETER: Input file is corrupted");
			System.exit(1);
		}
		
		stackPointer = 0;
	}
	
	/**
	 * gets real part of the real number as integer
	 * @param number number which real part will be determined
	 * @return real part of the number as integer
	 */
	private int getRealPartOfNumber(double number) {
		String data = String.valueOf(number);
		int realPartIndex = data.lastIndexOf(".") + 1;
		String real = data.substring(realPartIndex, 
				data.length() - realPartIndex > 9 ? realPartIndex + 9 : data.length()); //avoiding integer overflow
		return Integer.parseInt(real);
	}
}
