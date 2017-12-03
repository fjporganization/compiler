package test.compiler;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IOTests extends CompilerTestsBase{

	@Test
	@DisplayName("Integer IO")
	void testIntIO() {
		testFiles("IOTests/intIO", "IOTests/intIO.pl0");
	}
	
	@Test
	@DisplayName("Fraction IO")
	void testRatioIO() {
		testFiles("IOTests/ratioIO", "IOTests/ratioIO.pl0");
	}

}
