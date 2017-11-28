import java.util.List;
import java.util.Scanner;

public class Interpreter {
	
	private final int STACK_SIZE = 1000;
	
	private int programCounter = 0;
	
	private int stackPointer = 0;
	
	private int base = 0;
	
	private int[] stack;
	
	private List<Instruction> instructions = null;
	
	public Interpreter() {
		stack = new int[STACK_SIZE + 1];
	}

	public void interpret() {
		if(instructions == null || instructions.isEmpty()) {
			System.err.println("INTERPRETER: nothing to interpret");
			return;
		}
		
		programCounter = 0;
		base = 1;
		stackPointer = 0;
		
		System.out.println("START PL/0");
		
		do {
			Instruction instruction = instructions.get(programCounter);
			
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
				
			case READ:
				processRead(instruction);
				break;
				
			case WRITE:
				processWrite(instruction);
				break;
				
			case OPERATION_REAL:
				processFloatOperation(instruction);
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
		}while(programCounter != 0);
		
		System.out.println("END PL/0");
	}

	private void processPush(Instruction instruction) {
		stackPointer++;
		stack[stackPointer] = instruction.getOperand();
		programCounter++;
	}
	
	private void processOperation(Instruction instruction) {
		int code = instruction.getOperand();
		programCounter++;
		
		if(code == OperationCode.NEGATION.getCode()) {
			stack[stackPointer] = -stack[stackPointer];
			
		}else if(code == OperationCode.ADDITION.getCode()) {
			int result = stack[stackPointer] + stack[stackPointer - 1];
			stackPointer--;
			stack[stackPointer] = result;
			
		}else if(code == OperationCode.SUBTRACTION.getCode()) {
			int result = stack[stackPointer] - stack[stackPointer - 1];
			stackPointer--;
			stack[stackPointer] = result;
			
		}else if(code == OperationCode.MULTIPLICATION.getCode()) {
			int result = stack[stackPointer] * stack[stackPointer - 1];
			stackPointer--;
			stack[stackPointer] = result;
			
		}else if(code == OperationCode.DIVISION.getCode()) {
			int result = stack[stackPointer] / stack[stackPointer - 1];
			stackPointer--;
			stack[stackPointer] = result;
			
		}else if(code == OperationCode.MODULUS.getCode()) {
			int result = stack[stackPointer] % stack[stackPointer - 1];
			stackPointer--;
			stack[stackPointer] = result;
			
		}else if(code == OperationCode.ODD.getCode()) {
			stack[stackPointer] = stack[stackPointer] % 2 == 0 ? 1 : 0;
			
		}else if(code == OperationCode.EQUALITY.getCode()) {
			int result = stack[stackPointer] == stack[stackPointer - 1] ? 1 : 0;
			stackPointer--;
			stack[stackPointer] = result;
			
		}else if(code == OperationCode.INEQUALITY.getCode()) {
			int result = stack[stackPointer] != stack[stackPointer - 1] ? 1 : 0;
			stackPointer--;
			stack[stackPointer] = result;
			
		}else if(code == OperationCode.LESS_THAN.getCode()) {
			int result = stack[stackPointer] < stack[stackPointer - 1] ? 1 : 0;
			stackPointer--;
			stack[stackPointer] = result;
			
		}else if(code == OperationCode.GREATER_EQUAL.getCode()) {
			int result = stack[stackPointer] >= stack[stackPointer - 1] ? 1 : 0;
			stackPointer--;
			stack[stackPointer] = result;
			
		}else if(code == OperationCode.GREATER_THAN.getCode()) {
			int result = stack[stackPointer] > stack[stackPointer - 1] ? 1 : 0;
			stackPointer--;
			stack[stackPointer] = result;
			
		}else if(code == OperationCode.LESS_EQUAL.getCode()) {
			int result = stack[stackPointer] < stack[stackPointer - 1] ? 1 : 0;
			stackPointer--;
			stack[stackPointer] = result;
			
		}else if(code == OperationCode.LOGIC_NEGATION.getCode()) {
			stack[stackPointer] = stack[stackPointer] == 0 ? 1 : 0;
			
		}else {
			System.err.println("INTERPRETER: Unknown operation code");
			System.exit(1);
		}
	}
	
	private void processLoad(Instruction instruction) {
		int address = findLowerBase(base, instruction.getNestingLevel()) + instruction.getOperand();
		stackPointer++;
		stack[stackPointer] = stack[address];
		programCounter++;
	}
	
	private void processStore(Instruction instruction) {
		int address = findLowerBase(base, instruction.getNestingLevel()) + instruction.getOperand();
		stackPointer--;
		stack[address] = stack[stackPointer];
		programCounter++;
	}
	
	private void processCall(Instruction instruction) {
		int lowerBase = findLowerBase(base, instruction.getNestingLevel());
		stack[stackPointer + 1] = lowerBase;
		stack[stackPointer + 2] = base;
		
		programCounter++;
		stack[stackPointer + 3] = programCounter;
		base = stackPointer + 1;
	}
	
	private void processReturn(Instruction instruction) {
		stackPointer = base - 1;
		base = stack[stackPointer + 2];
		programCounter = stack[stackPointer + 3];
	}
	
	private void processIncrement(Instruction instruction) {
		stackPointer = stackPointer + instruction.getOperand();
		programCounter++;
	}
	
	private void processRead(Instruction instruction) {
		Scanner sc = new Scanner(System.in);
		stackPointer++;
		stack[stackPointer] = sc.nextInt();
		sc.close();	
		programCounter++;
	}
	
	private void processWrite(Instruction instruction) {
		System.out.println(stack[stackPointer]);
		stackPointer--;
		programCounter++;
	}
	
	private void processFloatOperation(Instruction instruction) {
		// TODO Auto-generated method stub
		
	}
	
	private void processRealToInteger(Instruction instruction) {
		// TODO Auto-generated method stub
		
	}
	
	private void processIntegerToReal(Instruction instruction) {
		// TODO Auto-generated method stub
		
	}
	
	private void processLoadFromAddress(Instruction instruction) {
		stack[stackPointer] = stack[stack[stackPointer]];
		programCounter++;
	}
	
	private void processStoreAtAddress(Instruction instruction) {
		stackPointer = stackPointer - 2;
		stack[stackPointer + 2] = stack[stackPointer + 1];
		programCounter++;
	}

	private void processConditionalJump(Instruction instruction) {
		programCounter = stack[stackPointer] == 0 ? instruction.getOperand() : programCounter + 1;
		stackPointer--;
	}
	
	private void processJump(Instruction instruction) {
		programCounter = instruction.getOperand();
	}
	
	public void setInstructions(List<Instruction> instructions) {
		programCounter = 0;
		this.instructions = instructions;
	}
	
	public int findLowerBase(int currentBase, int levels) {
		int base = currentBase;
		for(int i = 0; i < levels; i++) {
			base = findOneLevelLowerBase(base);
		}
		
		return base;
	}
	
	public int findOneLevelLowerBase(int currentBase) {
		return stack[currentBase];
	}
}
