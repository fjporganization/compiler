package test.interpreter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JumpTests extends InterpreterTestsBase{
	
	private static final String path = "jumps/";

	@Test
	@DisplayName("Conditional jump asserive")
	void testConditionalAssertive(){
		testOutput(path + "conditionalAssertive.pl0", path + "conditionalAssertive.txt");
	}
	
	@Test
	@DisplayName("Conditional jump negative")
	void testConditionalNegative(){
		testOutput(path + "conditionalAssertive.pl0", path + "conditionalAssertive.txt");
	}
	
	@Test
	@DisplayName("Unconditional")
	void testUnconditional(){
		testOutput(path + "unconditional.pl0", path + "unconditional.txt");
	}

}
