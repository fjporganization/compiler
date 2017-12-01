import java.io.*;
import java.util.List;

import org.antlr.v4.runtime.*;

public class Main {
	
	@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
	public static void main(String[] args) {
		ANTLRInputStream input = null;
		try {
			input = new ANTLRInputStream(new FileInputStream(args[0]));	
		}catch (IOException e) {
			System.err.println("Source file cannot be found");
			System.exit(1);
		}
		
		CLexer lexer = new CLexer(input);
		CParser parser = new CParser(new CommonTokenStream(lexer));
		
		String outputFileName = args.length == 2 ? args[1] : 
			args[0].substring(0, args[0].lastIndexOf(".")) + CompilerConstants.outputFileExtension;

		CompilerData data = new CompilerData();

		Compiler compiler = new Compiler(data);
		CompilerSwitch compilerSwitch = new CompilerSwitch(data);
		CompilerLogic compilerLogic = new CompilerLogic(data);
		CompilerVariables compilerVariables = new CompilerVariables(data);
		CompilerArithmetic compilerArithmetic = new CompilerArithmetic(data);
		CompilerCondition compilerCondition = new CompilerCondition(data);
		CompilerLoop compilerLoop = new CompilerLoop(data);
		
		parser.addParseListener(compiler);
		parser.addParseListener(compilerSwitch);
		parser.addParseListener(compilerLogic);
		parser.addParseListener(compilerVariables);
		parser.addParseListener(compilerArithmetic);
		parser.addParseListener(compilerCondition);
		parser.addParseListener(compilerLoop);
		parser.start();
		
		writeToFile(outputFileName, data.getOutput());
		
		Interpreter interpreter = new Interpreter();
		interpreter.setInstructions(data.getOutput());
		interpreter.interpret();
	}

	/**
	 * Writes generated instructions into the output file.
	 */
	public static void writeToFile(String outputFileName, List<Instruction> output) {
		Writer bw = null;
		int currentAddress = 0;

		try {
			bw = new BufferedWriter(new FileWriter(outputFileName));
			for(Instruction instruction : output) {
				if(instruction != null) {
					bw.write(currentAddress + " " + instruction.toString() + "\n");
					currentAddress++;
				}
			}

		} catch (IOException e) {
			System.err.println("Cannot write to the output file");
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				System.err.println("Cannot close the output file");
			}
		}
	}

}
