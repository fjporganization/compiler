import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.*;

public class Main {
	
	@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
	public static void main(String[] args) {
		try {
			ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(args[0]));
			CLexer lexer = new CLexer(input);
			CParser parser = new CParser(new CommonTokenStream(lexer));
			
			parser.addParseListener(new Compiler());
			
			parser.start();
			
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
