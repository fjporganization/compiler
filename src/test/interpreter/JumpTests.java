package test.interpreter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JumpTests extends InterpreterTestsBase{

	@Test
	@DisplayName("Conditional jump asserive")
	void testConditionalAssertive(){
		testOutput("/jumps/conditionalAssertive.pl0", "/jumps/conditionalAssertive.txt");
	}
	
	@Test
	@DisplayName("Conditional jump negative")
	void testConditionalNegative(){
		testOutput("/jumps/conditionalAssertive.pl0", "/jumps/conditionalAssertive.txt");
	}
	
	@Test
	@DisplayName("Unconditional")
	void testUnconditional(){
		testOutput("/jumps/unconditional.pl0", "/jumps/unconditional.txt");
	}

}
