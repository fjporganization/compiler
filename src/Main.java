import java.io.FileInputStream;
import java.io.IOException;

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
		
		Compiler compiler = new Compiler(outputFileName);
		
		parser.addParseListener(compiler);
		parser.start();
		
		compiler.writeToFile();
	}

}
