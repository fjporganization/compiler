package fjp;

import java.io.*;
import java.util.List;

import fjp.compilers.*;
import fjp.compilers.Compiler;
import fjp.generated.*;
import fjp.interpreter.Interpreter;
import fjp.structures.Instruction;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class Main {

	private static final String outputFileExtension = ".pl0";

	public static void main(String[] args) {

		if (args.length < 1 || args.length > 2) {
			System.err.println("Invalid input parameters. Expected input file name and optional output file name.");
			System.exit(1);
		}

		new Main().compile(args);
	}

	public void compile(String [] args){
		CharStream input = readFile(args[0]);
		CLexer lexer = new CLexer(input);
		CParser parser = new CParser(new CommonTokenStream(lexer));

		CompilerData data = new CompilerData();
		registerCompilers(parser, data);
		try {
			parser.start();
		} catch (ParseCancellationException e){
			System.err.println(e.getMessage());
			return;
		}

		// Write compiled data to file
		String outputFileName = getPLFileName(args);

		writeToFile(outputFileName, data.getOutput());
	}

	/**
	 * Create file name of new created file from input arguments.
	 *
	 * @param args array contains input file name and optionally output file name
	 * @return created name
	 */
	private String getPLFileName(String []args){
		if(args.length == 2) {
			return args[1];
		}

		if(args[0].contains(".")){
			return args[0].substring(0, args[0].lastIndexOf(".")) + outputFileExtension;
		}

		return args[0] + outputFileExtension;
	}

	/**
	 * Read file given by filename.
	 *
	 * @param fileName path to file which contains code to compile
	 * @return open file as CharStream
	 */
	private CharStream readFile(String fileName){
		CharStream input = null;
		try {
			input = CharStreams.fromFileName(fileName);
		}catch (IOException e) {
			System.err.println("Source file cannot be found");
			System.exit(1);
		}
		return input;
	}

	/**
	 * Register all compilers to parser.
	 *
	 * @param parser to which compilers will be registered
	 * @param data shared object between compilers contains all data
	 */
	private void registerCompilers(CParser parser, CompilerData data) {
		parser.addParseListener(new Compiler(data));
		parser.addParseListener(new CompilerSwitch(data));
		parser.addParseListener(new CompilerLogic(data));
		parser.addParseListener(new CompilerVariables(data));
		parser.addParseListener(new CompilerArithmetic(data));
		parser.addParseListener(new CompilerCondition(data));
		parser.addParseListener(new CompilerLoop(data));
		parser.addParseListener(new CompilerIO(data));
	}

	/**
	 * Writes generated instructions into the output file.
	 */
	private void writeToFile(String outputFileName, List<Instruction> output) {
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
				if(bw != null) {
					bw.close();
				}
			} catch (IOException e) {
				System.err.println("Cannot close the output file");
			}
		}
	}
}
