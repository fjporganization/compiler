package test.compiler;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ComplexTests extends CompilerTestsBase{
	
	private static final String path = "complexTests/";

	@Test
	@DisplayName("Linear equation")
	void testLinEq() {
		testFiles(path + "linEq", path + "linEq.pl0");
	}
	
	@Test
	@DisplayName("Simple int calculator")
	void testIntCalc() {
		testFiles(path + "intCalc", path + "intCalc.pl0");
	}
	
	@Test
	@DisplayName("Bigger ratio output")
	void testRatioOutput() {
		testFiles(path + "ratioBigger", path + "ratioBigger.pl0");
	}
}
