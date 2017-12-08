package test.compiler;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ConditionsTests extends CompilerTestsBase{
	
	private static final String path = "conditionsTests/";

	@Test
	@DisplayName("Simple condition (no else)")
	void testSimpleIf() {
		testFiles(path + "simpleIf", path + "simpleIf.pl0");
	}
	
	@Test
	@DisplayName("If-else condition")
	void testIfElse() {
		testFiles(path + "ifElse", path + "ifElse.pl0");
	}
	
	@Test
	@DisplayName("Ternary operator")
	void testTernaryOperator() {
		testFiles(path + "ternary", path + "ternary.pl0");
	}
	
	@Test
	@DisplayName("Complex conditions")
	void testComplexIf() {
		testFiles(path + "complexIf", path + "complexIf.pl0");
	}
	
	// negative tests ===============================
	
	@Test
	@DisplayName("Negative - if - integer in condition")
	void testIfInt() {
		testCompilerError(path + "errIfInt", "Error(3, 7): In if condition must be boolean data type");
	}
	
	@Test
	@DisplayName("Negative - if - ratio in condition")
	void testIfRatio() {
		testCompilerError(path + "errIfRatio", "Error(3, 7): In if condition must be boolean data type");
	}
	
	@Test
	@DisplayName("Negative - if-else - integer in condition")
	void testIfElseInt() {
		testCompilerError(path + "errIfElseInt", "Error(3, 7): In if condition must be boolean data type");
	}
	
	@Test
	@DisplayName("Negative - if-else - ratio in condition")
	void testIfElseRatio() {
		testCompilerError(path + "errIfElseRatio", "Error(3, 7): In if condition must be boolean data type");
	}
	
	@Test
	@DisplayName("Negative - ternary operator - int in condition")
	void testTernaryInt() {
		testCompilerError(path + "errTernaryInt", "Error(3, 8): In ternary operator condition must be boolean data type");
	}
	
	@Test
	@DisplayName("Negative - ternary operator - ratio in condition")
	void testTernaryRatio() {
		testCompilerError(path + "errTernaryRatio", "Error(3, 10): In ternary operator condition must be boolean data type");
	}
	
	@Test
	@DisplayName("Negative - ternary operator different data types - boolean : int")
	void testTernaryBooleanInt() {
		testCompilerError(path + "errTernaryBooleanInt", "Error(3, 20): Incompatible data types in ternary operators - data "
				+ "types in both expressions of ternary operator may not differs");
	}
	
	@Test
	@DisplayName("Negative - ternary operator different data types - boolean : ratio")
	void testTernaryBooleanRatio() {
		testCompilerError(path + "errTernaryBooleanInt", "Error(3, 20): Incompatible data types in ternary operators - data "
				+ "types in both expressions of ternary operator may not differs");
	}
	
	@Test
	@DisplayName("Negative - ternary operator different data types - int : ratio")
	void testTernaryIntRatio() {
		testCompilerError(path + "errTernaryIntRatio", "Error(3, 17): Incompatible data types in ternary operators - data "
				+ "types in both expressions of ternary operator may not differs");
	}
}
