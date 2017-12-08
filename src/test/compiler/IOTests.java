package test.compiler;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IOTests extends CompilerTestsBase{
	
	private static final String path = "IOTests/";

	@Test
	@DisplayName("Integer IO")
	void testIntIO() {
		testFiles(path + "intIO", path + "intIO.pl0");
	}
	
	@Test
	@DisplayName("Fraction IO")
	void testRatioIO() {
		testFiles(path + "ratioIO", path + "ratioIO.pl0");
	}
	
	@Test
	@DisplayName("Int in ratio output - implicit conversion")
	void testRatioOutputInt() {
		testFiles(path + "ratioOutputInt", path + "ratioOutputInt.pl0");
	}
	
	// negative tests ===========================
	
	@Test
	@DisplayName("Negative - boolean in ratio output")
	void testRatioOutputBoolean() {
		testCompilerError(path + "errRatioOutputBoolean", "Error(3, 2): Incompatible data type for ratio output");
	}
	
	@Test
	@DisplayName("Negative - boolean in int output")
	void testIntOutputBoolean() {
		testCompilerError(path + "errIntOutputBoolean", "Error(3, 2): Incompatible data type for integer output");
	}
	
	@Test
	@DisplayName("Negative - ratio in int output")
	void testIntOutputRatio() {
		testCompilerError(path + "errIntOutputRatio", "Error(3, 2): Incompatible data type for integer output");
	}
}
