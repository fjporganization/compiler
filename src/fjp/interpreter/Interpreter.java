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
	private final static String FRACTION_BAR = "|"; 
	
	/** number of current instruction */
	private int programCounter;
	
	/** current stack pointer */
	private int stackPointer;
	
	/** current base address */
	private int base;
	
	/** stack of the interpreter */
	private int[] stack;
	
	/** used indexes in stack for heap data storage */
	private boolean[] heap;
	
	/** List of instructions to be executed */
	private List<Instruction> instructions = null;
	
	/** scanner used for IO operations */
	private final Scanner sc;

	/**
	 * Constructor
	 */
	public Interpreter() {
		stack = new int[InterpreterConstants.getStackSize()];
		heap = new boolean[InterpreterConstants.getStackSize()];
		sc = new Scanner(System.in);
	}

	/**
	 * starts interpreter and calls functions to execute instructions
	 */
	public void interpret() {
		if(instructions == null || instructions.isEmpty()) {
			System.err.println("nothing to interpret");
			return; 
		}
		
		Arrays.fill(stack, 0); //reset interpreter stack and heap
		Arrays.fill(heap, false);
		
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
					
				case ALLOCATE_HEAP:
					processHeapAllocation();
					break;
					
				case RELEASE_HEAP:
					processHeapRelease();
					break;
					
				case LOAD_FROM_GIVEN_ADDRESS:
					processLoadinGivenAddress();
					break;
					
				case STORE_AT_GIVEN_ADDRESS:
					processStoringGivenAddress();
					break;
					
				case PUSH_REAL:
					processPushReal(instruction);
					break;
					
				default: 
					System.err.println("Unknown instruction");
					return;
				}
				
				showPostInstructionDebug();
				
			}while(programCounter > 0);
			
		}catch(IndexOutOfBoundsException e) {
			System.err.println("Instruction addressation error");
			return;
		}catch(ArithmeticException e) {
			System.err.println("Arithmetic operation error: " + e.getMessage());
			return;
		}
		
		System.out.println("END PL/0");
	}
	
	/**
	 * Pushes one real number onto the stack
	 * @param instruction instruction to be executed
	 */
	private void processPushReal(Instruction instruction) {
		if(checkStackOverflow(2) == false) {
			return;
		}
		
		stackPointer = stackPointer + 2;
		pushRealNumber(instruction.getOperand());
		programCounter++;
	}

	/**
	 * Pushes literal M onto the stack
	 * @param instruction instruction to be executed
	 */
	private void processPush(Instruction instruction) {
		if(checkStackOverflow(1) == false) {
			return;
		}  //we will push 1 item onto the stack
		
		stackPointer++;
		stack[stackPointer] = (int)instruction.getOperand();
		programCounter++;
	}

	/**
	 * Provides numeric and comparison operation to be performed on integer data at the top of the stack
	 * @param instruction instruction to be executed
	 */
	private void processOperation(Instruction instruction) throws ArithmeticException{
		int code = (int)instruction.getOperand();
		programCounter++; 
		
		if(code == OperationCode.NEGATION.getCode()) {
			stack[stackPointer] = -stack[stackPointer];
			
		}else if(code == OperationCode.ODD.getCode()) {
			stack[stackPointer] = stack[stackPointer] % 2 == 0 ? 1 : 0;
			
		}else {
			if(checkStackUnderflow(1) == false) {
				return;
			}
			
			//we will pop 2 items from the stack and pop 1 item onto the stack
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
				System.err.println("Unknown operation code");
				programCounter = 0;
				return;
			}
		}
	}
	
	/**
	 * Loads value to top of the stack from the provided stack location
	 * @param instruction instruction to be executed
	 */
	private void processLoad(Instruction instruction) {
		//we will push 1 item onto the stack
		if(checkStackOverflow(1) == false) {
			return;
		}
		
		int address = findLowerBase(base, instruction.getNestingLevel()) + (int)instruction.getOperand();
		stackPointer++;
		stack[stackPointer] = stack[address];
		programCounter++;
	}
	
	/**
	 * Stores value at top of the stack in the provided stack location
	 * @param instruction instruction to be executed
	 */
	private void processStore(Instruction instruction) {
		//we will pop 1 item from the stack
		if(checkStackUnderflow(1) == false) {
			return;
		}
		
		int address = findLowerBase(base, instruction.getNestingLevel()) + (int)instruction.getOperand();
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
		if(checkStackOverflow(3) == false) {
			return;
		} 
		
		int lowerBase = findLowerBase(base, instruction.getNestingLevel());
		stack[stackPointer + 1] = lowerBase;
		stack[stackPointer + 2] = base;
		stack[stackPointer + 3] = programCounter + 1;
		programCounter = (int)instruction.getOperand();
		base = stackPointer + 1;
	}
	
	/**
	 * Returns from the procedure
	 */
	private void processReturn() {
		if(checkStackOverflow(3) == false) {
			return;
		} 
		
		stackPointer = base - 1;
		base = stack[stackPointer + 2];
		programCounter = stack[stackPointer + 3];
	}
	
	/**
	 * Increments stack pointer (allocate locals)
	 * @param instruction instruction to be executed
	 */
	private void processIncrement(Instruction instruction) {
		if(checkStackOverflow((int)instruction.getOperand()) == false) {
			return;
		} 
		
		stackPointer = stackPointer + (int)instruction.getOperand();
		programCounter++;
	}
	
	/**
	 * Reads integer given by user
	 */
	private void processReadInteger() {
		if(checkStackOverflow(1) == false) {
			return;
		} 
		
		stackPointer++;
		
		while(true) {
			try {
				stack[stackPointer] = sc.nextInt();
				sc.nextLine();
				break;
			} catch (InputMismatchException e) {
				System.err.println("Invalid input - enter integer number");
				sc.next();
			}
		}
		
		programCounter++;
	}
	
	/**
	 * writes integer to the CLI
	 */
	private void processWriteInteger() {
		if(checkStackUnderflow(1) == false) {
			return;
		}
		
		System.out.println(stack[stackPointer]);
		stackPointer--;
		programCounter++;
	}
	
	/**
	 * Reads real number given by user
	 */
	private void processReadReal() {
		if(checkStackOverflow(2) == false) {
			return;
		} 
		
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
		
		programCounter++;
	}
	
	/**
	 * writes real number to the output
	 */
	private void processWriteReal() {
		if(checkStackUnderflow(2) == false) {
			return;
		}
		
		System.out.println(Double.longBitsToDouble(((long)stack[stackPointer - 1] << 32) | (long)(stack[stackPointer] & 0xFFFFFFFFL)));
		stackPointer = stackPointer - 2;
		programCounter++;
	}
	
	/**
	 * Provides numeric and comparison operation to be performed on real numbers at the top of the stack
	 * @param instruction instruction to be executed
	 */
	private void processFloatOperation(Instruction instruction) throws ArithmeticException {
		int code = (int)instruction.getOperand();
		programCounter++;
		
		/*
		 *  integer and real parts of float number are stored separately, on the top of the stack is real part, 
		 *  on position top-1 is stored integer part
		 */
		
		if(code == OperationCode.NEGATION.getCode()) {
			if(checkStackUnderflow(1) == false) {
				return;
			}
			
			pushRealNumber(-Double.longBitsToDouble(((long)stack[stackPointer - 1] << 32) | (long)(stack[stackPointer] & 0xFFFFFFFFL)));
			
		}else{
			if(checkStackUnderflow(3) == false) {
				return;
			}
			
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
					System.err.println("Unknown operation code");
					programCounter = 0;
					return;
				}
			}
		}
	}
	
	/**
	 * transforms real number to integer
	 */
	private void processRealToInteger() {
		if(checkStackUnderflow(1) == false) {
			return;
		}
		
		stack[stackPointer - 1] = (int)Double.longBitsToDouble(((long)stack[stackPointer - 1] << 32) | (stack[stackPointer] & 0xFFFFFFFFL));
		stackPointer--;
		programCounter++;
	}
	
	/**
	 * transforms integer to real number
	 */
	private void processIntegerToReal() {
		if(checkStackOverflow(1) == false) {
			return;
		} 
		 
		stackPointer++;
		pushRealNumber(stack[stackPointer - 1]);
		programCounter++;
	}
	
	/**
	 * Loads data from the the stack from the stack location given by absolute address onto the stack
	 */
	private void processLoadFromAddress() {
		if(checkStackOverflow(1) == false) {
			return;
		} 
		
		programCounter++;
		
		if(stack[stackPointer] < 0) {
			System.err.println("Stack underflow");
			programCounter = 0;
			return;
		}
		
		if(stack[stackPointer] > InterpreterConstants.STACK_SIZE - 1) {
			System.err.println("Stack overflow");
			programCounter = 0;
			return;
		}
		
		stack[stackPointer] = stack[stack[stackPointer]];
	}
	
	/**
	 * Stores data at top of the stack to the stack location given by absolute address
	 */
	private void processStoreAtAddress() {
		if(checkStackUnderflow(2) == false) {
			return;
		}
		
		programCounter++;
		
		if(stack[stackPointer] < 0) {
			System.err.println("Stack underflow");
			programCounter = 0;
			return;
		}
		
		if(stack[stackPointer] > InterpreterConstants.STACK_SIZE - 1) {
			System.err.println("Stack overflow");
			programCounter = 0;
			return;
		}
		
		if(InterpreterConstants.isShowStore()) {
			System.out.println(stack[stackPointer - 1]);
		}
		
		stackPointer = stackPointer - 2;
		stack[stack[stackPointer + 2]] = stack[stackPointer + 1];
	}
	
	/**
	 * Jumps to given instruction address if there is zero on top of the stack
	 * @param instruction instruction to be executed
	 */
	private void processConditionalJump(Instruction instruction) {
		programCounter = stack[stackPointer] == 0 ? (int)instruction.getOperand() : programCounter + 1;
		stackPointer--;
	}
	
	/**
	 * jumps to given instruction address
	 * @param instruction instruction to be executed
	 */
	private void processJump(Instruction instruction) {
		programCounter = (int)instruction.getOperand();
	}
	
	/**
	 * Reads fraction from the user input
	 */
	private void processReadFrac() {
		if(checkStackOverflow(2) == false) {
			return;
		} 
		
		stackPointer = stackPointer + 2;
		
		String value[] = null; 
		int numerator = 0;
		int denominator = 0;
		
		while(sc.hasNext()) {
			try {
				String input = sc.next();
				
				if(!input.contains(FRACTION_BAR)) {
					System.err.println("Invalid input - enter fraction (use pipe as fraction bar, e.g. 1|2)");
					continue;
				}
				
				value = input.split("\\" + FRACTION_BAR); //must escape fraction bar symbol
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
		
		programCounter++;
	}
	
	/**
	 * processes fraction output
	 */
	private void processWriteFrac() {
		if(checkStackUnderflow(2) == false) {
			return;
		}
		
		System.out.println(stack[stackPointer - 1] + FRACTION_BAR + stack[stackPointer]);
		stackPointer = stackPointer - 2;
		programCounter++;
	}
	
	/**
	 * processes allocation position on the heap
	 */
	private void processHeapAllocation() {
		if(checkStackOverflow(1) == false) {
			return;
		}
		
		int i;
		
		for(i = InterpreterConstants.getStackSize() - 1; i > 0; i--) {
			if(heap[i] == false) {
				break;
			}
		}
		
		if(i == 0) {
			System.err.println("Cannot allocate position on the heap");
			programCounter = 0;
			return;
		}
		
		stackPointer++;
		stack[stackPointer] = i;
		heap[i] = true;
		
		programCounter++;
	}
	
	/**
	 * processes release of the position in the heap given in the top of the stack
	 */
	private void processHeapRelease() {
		if(checkStackUnderflow(1) == false) {
			return;
		}
		
		if(heap[stack[stackPointer]] == false) {
			System.err.println("Cannot deallocate given position");
			programCounter = 0;
			return;
		}
		
		heap[stack[stackPointer]] = false;
		stackPointer--;
		
		programCounter++;
	}
	
	/**
	 * loads data from the position and nesting level obtained from the stack
	 */
	private void processLoadinGivenAddress() {
		if(checkStackUnderflow(1) == false) {
			return;
		}
		
		int address = findLowerBase(base, stack[stackPointer - 1]) + stack[stackPointer];
		if(address < 0 || address > InterpreterConstants.getStackSize() - 1) {
			System.err.println("Stack addressation error");
			programCounter = 0;
			return;
		}
		
		stack[stackPointer - 1] = stack[address];
		stackPointer--;
		
		programCounter++;
	}
	
	/**
	 * stores data to the position and nesting level obtained from the stack
	 */
	private void processStoringGivenAddress() {
		if(checkStackUnderflow(3) == false) {
			return;
		}
		
		programCounter++;
		
		int address = findLowerBase(base, stack[stackPointer - 1]) + stack[stackPointer];
		if(address < 0 || address > InterpreterConstants.getStackSize() - 1) {
			System.err.println("Stack addressation error");
			programCounter = 0;
			return;
		}
		
		stackPointer = stackPointer - 3;
		stack[address] = stack[stackPointer + 1];
		
		if(InterpreterConstants.isShowStore()) {
			System.out.println(stack[stackPointer + 1]);
		}
		
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
	private boolean checkStackUnderflow(int items) {
		if(stackPointer - items < -1) { //check for stack boundaries (stack has no empty space on the beginning, therefore -1)
			System.err.println("Stack underflow");
			programCounter = 0;
			return false;
		}
		
		return true;
	}
	
	/**
	 * check whether pushing given number of values onto the stack causes stack underflow
	 * @param items number of values to be pushed
	 */
	private boolean checkStackOverflow(int items) {
		if(stackPointer - items > InterpreterConstants.STACK_SIZE - 1) { //check for stack boundaries
			System.err.println("Stack overflow");
			programCounter = 0;
			return false;
		}
		
		return true;
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
		// use decimal dot as decimal separator
		Locale.setDefault(Locale.US);
				
		instructions = new ArrayList<Instruction>();
		stackPointer = 0;
		try(Stream<String> stream = Files.lines(Paths.get(filePath))){
			
			stream.forEach(e -> {
				Scanner scanner = new Scanner(e);
				
				int address = scanner.nextInt();
				
				if(address != stackPointer) {
					System.err.println("Input file is corrupted");
					instructions.clear();
					scanner.close();
					return;
				}
				
				stackPointer++;
				
				String instruction = scanner.next();
				int nestingLevel = scanner.nextInt();
				double operand = scanner.nextDouble();
				scanner.close();
				
				Optional<InstructionCodes> code = Arrays.stream(InstructionCodes.values())
											.filter(x -> instruction.equals(x.getOperation()))
											.findFirst();
				
				if(!code.isPresent()) {
					System.err.println("Input file is corrupted");
					instructions.clear();
					return;
				}
				
				this.instructions.add(new Instruction(code.get(), nestingLevel, operand));
				
			});
			
		} catch (IOException e) {
			System.err.println("Cannot read input file");
			instructions.clear();
			return;
			
		} catch (Exception e1) {
			System.err.println("Input file is corrupted");
			instructions.clear();
			return;
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
	 * peeks two real numbers from the stack
	 * @return two real numbers peeked from the stack
	 */
	private double[] getTwoRealNumbers() {
		double[] values = new double[2];
		values[0] = Double.longBitsToDouble(((long)stack[stackPointer - 3] << 32) | (stack[stackPointer - 2] & 0xFFFFFFFFL));
		values[1] = Double.longBitsToDouble(((long)stack[stackPointer - 1] << 32) | (stack[stackPointer] & 0xFFFFFFFFL));
		
		return values;
	}
	
	/**
	 * pushes real number onto the stack
	 * @param number number to be popped
	 */
	private void pushRealNumber(double number) {
		long bits = Double.doubleToLongBits(number); //gets bits of real number stored as IEEE 754
		stack[stackPointer - 1] = (int)(bits >> 32);
		stack[stackPointer] = (int)bits;
	}
}
