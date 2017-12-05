package fjp.interpreter;

import fjp.structures.*;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Stream;

/**
 * Class providing interpreter functionality
 *
 */
public class Interpreter {
	
	/** symbol of fraction bar */
	private final String FRACTION_BAR = "|"; 
	
	/** symbol of decimal mark (separator) */
	private final String DECIMAL_MARK = ".";
	
	/** indicates maximum length of fractional part of real number (used for avoiding integer overflow)*/
	private final int FRACTIONAL_PART_CROP = 9;
	
	/** number of current instruction */
	private int programCounter;
	
	/** current stack pointer */
	private int stackPointer;
	
	/** current base address */
	private int base;
	
	/** stack of the interpreter */
	private int[] stack;
	
	/** List of instructions to be executed */
	private List<Instruction> instructions = null;

	/**
	 * Constructor
	 */
	public Interpreter() {
		stack = new int[InterpreterConstants.getStackSize()];
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
		base = 0;
		
		stackPointer = -1;
		
		System.out.println("START PL/0");
		
		try {
			do {
				Instruction instruction = instructions.get(programCounter);
				
				showPreInstructionDebug(instruction);
				
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
					processReturn();
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
					processReadInteger();
					break;
					
				case WRITE_INTEGER:
					processWriteInteger();
					break;
					
				case READ_REAL:
					processReadReal();
					break;
					
				case WRITE_REAL:
					processWriteReal();
					break;
					
				case OPERATION_REAL:
					processFloatOperation(instruction);
					break;
					
				case OPERATION_LOGIC:
					processLogicOperation(instruction);
					break;
					
				case REAL_TO_INTEGER:
					processRealToInteger();
					break;
					
				case INTEGER_TO_REAL:
					processIntegerToReal();
					break;
					
				case LOAD_FROM_ADDRESS:
					processLoadFromAddress();
					break;
					
				case STORE_AT_ADDRESS:
					processStoreAtAddress();
					break;
					
				case READ_FRAC:
					processReadFrac();
					break;
					
				case WRITE_FRAC:
					processWriteFrac();
					break;
					
				default: 
					System.err.println("INTERPRETER: Unknown instruction");
					System.exit(1);
				}
				
				showPostInstructionDebug();
				
			}while(programCounter > 0);
			
		}catch(IndexOutOfBoundsException e) {
			System.err.println("INTERPRETER: Instruction addressation error");
			System.exit(1);
		}
		
		System.out.println("END PL/0");
	}

	/**
	 * Pushes literal M onto the stack
	 * @param instruction instruction to be executed
	 */
	private void processPush(Instruction instruction) {
		checkStackOverflow(1); //we will push 1 item onto the stack
		
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
			stack[stackPointer] = -stack[stackPointer];
			
		}else if(code == OperationCode.ODD.getCode()) {
			stack[stackPointer] = stack[stackPointer] % 2 == 0 ? 1 : 0;
			
		}else {
			checkStackUnderflow(1); //we will pop 2 items from the stack and pop 1 item onto the stack
			stackPointer--;
			
			if(code == OperationCode.ADDITION.getCode()) {
				stack[stackPointer] = stack[stackPointer] + stack[stackPointer + 1];
				
			}else if(code == OperationCode.SUBTRACTION.getCode()) {
				stack[stackPointer] = stack[stackPointer] - stack[stackPointer + 1];
				
			}else if(code == OperationCode.MULTIPLICATION.getCode()) {
				stack[stackPointer] = stack[stackPointer] * stack[stackPointer + 1];
				
			}else if(code == OperationCode.DIVISION.getCode()) {
				stack[stackPointer] = stack[stackPointer] / stack[stackPointer + 1];
				
			}else if(code == OperationCode.MODULUS.getCode()) {
				stack[stackPointer] = stack[stackPointer] % stack[stackPointer + 1];
				
			}else if(code == OperationCode.EQUALITY.getCode()) {
				stack[stackPointer] = stack[stackPointer] == stack[stackPointer + 1] ? 1 : 0;
				
			}else if(code == OperationCode.INEQUALITY.getCode()) {
				stack[stackPointer] = stack[stackPointer] != stack[stackPointer + 1] ? 1 : 0;
				
			}else if(code == OperationCode.LESS_THAN.getCode()) {
				stack[stackPointer] = stack[stackPointer] < stack[stackPointer + 1] ? 1 : 0;
				
			}else if(code == OperationCode.GREATER_EQUAL.getCode()) {
				stack[stackPointer] = stack[stackPointer] >= stack[stackPointer + 1] ? 1 : 0;
				
			}else if(code == OperationCode.GREATER_THAN.getCode()) {
				stack[stackPointer] = stack[stackPointer] > stack[stackPointer + 1] ? 1 : 0;
				
			}else if(code == OperationCode.LESS_EQUAL.getCode()) {
				stack[stackPointer] = stack[stackPointer] <= stack[stackPointer + 1] ? 1 : 0;
				
			}else {
				System.err.println("INTERPRETER: Unknown operation code");
				System.exit(1);
			}
			
		}
	}
	
	/**
	 * Loads value to top of the stack from the provided stack location
	 * @param instruction instruction to be executed
	 */
	private void processLoad(Instruction instruction) {
		checkStackOverflow(1); //we will push 1 item onto the stack
		
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
		
		int lowerBase = findLowerBase(base, instruction.getNestingLevel());
		stack[stackPointer + 1] = lowerBase;
		stack[stackPointer + 2] = base;
		stack[stackPointer + 3] = programCounter + 1;
		programCounter = instruction.getOperand();
		base = stackPointer + 1;
	}
	
	/**
	 * Returns from the procedure
	 */
	private void processReturn() {
		checkStackOverflow(3);
		
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
		
		stackPointer = stackPointer + instruction.getOperand();
		programCounter++;
	}
	
	/**
	 * Reads integer given by user
	 */
	private void processReadInteger() {
		checkStackOverflow(1);
		
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
	 */
	private void processWriteInteger() {
		checkStackUnderflow(1);
		
		System.out.println(stack[stackPointer]);
		stackPointer--;
		programCounter++;
	}
	
	/**
	 * Reads real number given by user
	 */
	private void processReadReal() {
		checkStackOverflow(2);
		
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
		
		pushRealNumber(value);
		
		sc.close();	
		programCounter++;
	}
	
	/**
	 * writes real number to the output
	 */
	private void processWriteReal() {
		checkStackUnderflow(2);
		
		System.out.println(stack[stackPointer - 1] + DECIMAL_MARK + stack[stackPointer]);
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
			stack[stackPointer - 1] = -stack[stackPointer - 1];
			
		}else{
			checkStackUnderflow(3);
			double[] values = getTwoRealNumbers();
			stackPointer = stackPointer - 2;
			
			if(code == OperationCode.ADDITION.getCode()) {
				double result = values[0] + values[1];
				pushRealNumber(result);
				
			}else if(code == OperationCode.SUBTRACTION.getCode()) {
				double result = values[0] - values[1];
				pushRealNumber(result);
				
			}else if(code == OperationCode.MULTIPLICATION.getCode()) {
				double result = values[0] * values[1];
				pushRealNumber(result);
				
			}else if(code == OperationCode.DIVISION.getCode()) {
				double result = values[0] / values[1];
				pushRealNumber(result);
				
			}else {
				stackPointer = stackPointer - 1; //decrementation of the stack pointer by 2 has been already done
				
				if(code == OperationCode.EQUALITY.getCode()) {
					stack[stackPointer] = values[0] == values[1] ? 1 : 0; 
					
				}else if(code == OperationCode.INEQUALITY.getCode()) {
					stack[stackPointer] = values[0] != values[1] ? 1 : 0; 
					
				}else if(code == OperationCode.LESS_THAN.getCode()) {
					stack[stackPointer] = values[0] < values[1] ? 1 : 0; 
					
				}else if(code == OperationCode.GREATER_EQUAL.getCode()) {
					stack[stackPointer] = values[0] >= values[1] ? 1 : 0; 
					
				}else if(code == OperationCode.GREATER_THAN.getCode()) {
					stack[stackPointer] = values[0] > values[1] ? 1 : 0;  
					
				}else if(code == OperationCode.LESS_EQUAL.getCode()) {
					stack[stackPointer] = values[0] <= values[1] ? 1 : 0; 
					
				}else {
					System.err.println("INTERPRETER: Unknown operation code");
					System.exit(1);
				}
			}
		}
	}
	
	/**
	 * Provides logic operation to be performed on boolean data at the top of the stack
	 * @param instruction instruction to be executed
	 */
	private void processLogicOperation(Instruction instruction) {
		int code = instruction.getOperand();
		programCounter++;
		
		//Booleans are stored in stack as numeric values, 0 = false, non-zero = true 
		
		boolean value1 = stack[stackPointer] != 0;
		boolean value2 = stack[stackPointer - 1] != 0;
		
		if(code == LogicCode.AND.getCode()) {
			checkStackUnderflow(1);
			stackPointer--;
			stack[stackPointer] = value1 && value2 ? 1 : 0;
			
		}else if(code == LogicCode.OR.getCode()) {
			checkStackUnderflow(1);
			stackPointer--;
			stack[stackPointer] = value1 || value2 ? 1 : 0;
			
		}else if(code == LogicCode.NEGATION.getCode()) {
			checkStackUnderflow(1);
			stack[stackPointer] = stack[stackPointer] == 0 ? 1 : 0;
			
		}else {
			System.err.println("INTERPRETER: Unknown operation code");
			System.exit(1);
		}
	}
	
	/**
	 * transforms real number to integer
	 */
	private void processRealToInteger() {
		checkStackUnderflow(1);
		
		// just remove real part of the number (e.g. number 3.99 will be converted to 3)
		stackPointer--;
		programCounter++;
	}
	
	/**
	 * transforms integer to real number
	 */
	private void processIntegerToReal() {
		checkStackOverflow(1);
		
		// just add real part (= .0) to the number 
		stackPointer++;
		stack[stackPointer] = 0;
		programCounter++;
	}
	
	/**
	 * Loads data from the the stack from the stack location given by absolute address onto the stack
	 */
	private void processLoadFromAddress() {
		checkStackOverflow(1);
		
		if(stack[stackPointer] < 0) {
			System.err.println("INTERPRETER: Stack underflow");
			System.exit(1);
		}
		
		if(stack[stackPointer] > InterpreterConstants.STACK_SIZE - 1) {
			System.err.println("INTERPRETER: Stack overflow");
			System.exit(1);
		}
		
		stack[stackPointer] = stack[stack[stackPointer]];
		programCounter++;
	}
	
	/**
	 * Stores data at top of the stack to the stack location given by absolute address
	 */
	private void processStoreAtAddress() {
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
	 * Reads fraction from the user input
	 */
	private void processReadFrac() {
		checkStackOverflow(2);
		
		Scanner sc = new Scanner(System.in);
		stackPointer = stackPointer + 2;
		
		String value[] = null; 
		int numerator = 0;
		int denominator = 0;
		
		while(sc.hasNext()) {
			try {
				value = sc.next().split("\\" + FRACTION_BAR); //must escape fraction bar symbol
				numerator = Integer.parseInt(value[0]);
				denominator = Integer.parseInt(value[1]);
				
				if(denominator == 0) {
					System.err.println("Invalid input - denominator of fraction must be non-zero value");
					continue;
				}
				
				break;
			} catch (InputMismatchException e) {
				System.err.println("Invalid input - enter fraction (use pipe as fraction bar, e.g. 1|2)");
				sc.next();
			}
		}
		
		stack[stackPointer - 1] = numerator;
		stack[stackPointer] = denominator;
		
		sc.close();	
		programCounter++;
	}
	
	/**
	 * processes fraction output
	 */
	private void processWriteFrac() {
		checkStackUnderflow(2);
		
		System.out.println(stack[stackPointer - 1] + FRACTION_BAR + stack[stackPointer]);
		stackPointer = stackPointer - 2;
		programCounter++;
	}
	
	/**
	 * finds base of given number lexicographical levels down
	 * @param currentBase current base address
	 * @param levels defines which lexicographical level down base address is user looking for
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
	 * shows debug informations after instruction execution
	 */
	private void showPostInstructionDebug() {
		if(InterpreterConstants.isShowDebug()) {
			System.out.println("PC: " + programCounter + ", SP: " + stackPointer);
			
			if(InterpreterConstants.isShowStack() && stackPointer >= 0) {
				System.out.println(Arrays.toString(Arrays.copyOfRange(stack, 0, stackPointer + 1)));
			}
			
			System.out.println();
			
		}else if(InterpreterConstants.isShowStack() && stackPointer >= 0) {
			System.out.println(Arrays.toString(Arrays.copyOfRange(stack, 0, stackPointer + 1)));
			System.out.println();
		}
	}
	
	/**
	 * shows debug informations before instruction execution
	 * @param current current instruction to execute
	 */
	private void showPreInstructionDebug(Instruction current) {
		if(InterpreterConstants.isShowDebug()) {
			System.out.println(programCounter + " " + current.toString());
		}
	}
	
	/**
	 * gets fractional part of the real number as integer
	 * @param number number which fractional part will be determined
	 * @return fractional part of the number as integer
	 */
	private int getFractionalPartOfNumber(double number) {
		String data = String.valueOf(number);
		
		int fractionalPartIndex = data.lastIndexOf(DECIMAL_MARK) + 1;
		String fractional = data.substring(fractionalPartIndex, 
				data.length() - fractionalPartIndex > FRACTIONAL_PART_CROP ? 
						fractionalPartIndex + FRACTIONAL_PART_CROP : data.length()); //avoiding integer overflow
		
		return Integer.parseInt(fractional);
	}
	
	/**
	 * peeks two real numbers from the stack
	 * @return two real numbers peeked from the stack
	 */
	private double[] getTwoRealNumbers() {
		double[] values = new double[2];
		
		values[0] = stack[stackPointer - 3] + 
				(stack[stackPointer - 3] < 0 ? -stack[stackPointer - 2] : stack[stackPointer - 2])/
				(Math.pow(10, (int)Math.log10(stack[stackPointer - 2]) + 1));
		
		values[1] = stack[stackPointer - 1] + 
				(stack[stackPointer - 1] < 0 ? -stack[stackPointer] : stack[stackPointer])/
				(Math.pow(10, (int)Math.log10(stack[stackPointer]) + 1));
		
		return values;
	}
	
	/**
	 * pushes real number onto the stack
	 * @param number number to be popped
	 */
	private void pushRealNumber(double number) {
		stack[stackPointer] = getFractionalPartOfNumber(number);
		stack[stackPointer - 1] = (int) number;
	}
}
