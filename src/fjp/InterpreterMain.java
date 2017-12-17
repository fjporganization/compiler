package fjp;

import fjp.interpreter.*;

/**
 * Main class of interpreter
 *
 */
public class InterpreterMain {
	
	/**
	 * executes the interpreter
	 * @param args file name of file containing instructions to be executed
	 */
	public static void main(String[] args) {
		
		if(args.length >= 1) {
			Interpreter interpreter = new Interpreter();
			interpreter.loadInstructionsFromFile(args[0]);
			interpreter.interpret();
			
		}else {
			System.err.println("Missing input file name");
		}
	}
}
