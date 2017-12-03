package fjp.interpreter;

public class InterpreterMain {

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
