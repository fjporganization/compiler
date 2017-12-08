package test.compiler;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LogicTests extends CompilerTestsBase{
	
	private static final String path = "logicTests/";
	
	// Integer comparisons =====================
	
	@Test
	@DisplayName("integer equality")
	void testIntEquality() {
		testFiles(path + "intEquality", path + "intEquality.pl0");
	}
	
	@Test
	@DisplayName("integer inequality")
	void testIntInequality() {
		testFiles(path + "intInequality", path + "intInequality.pl0");
	}
	
	@Test
	@DisplayName("integer less")
	void testIntLess() {
		testFiles(path + "intLess", path + "intLess.pl0");
	}
	
	@Test
	@DisplayName("integer greater or equal")
	void testIntGreaterEqual() {
		testFiles(path + "intGreaterEqual", path + "intGreaterEqual.pl0");
	}
	
	@Test
	@DisplayName("integer greater")
	void testIntGreater() {
		testFiles(path + "intGreater", path + "intGreater.pl0");
	}
	
	@Test
	@DisplayName("integer less or equal")
	void testIntLessEqual() {
		testFiles(path + "intLessEqual", path + "intLessEqual.pl0");
	}
	
	// Fractions comparisons =====================
	
	@Test
	@DisplayName("fraction equality")
	void testRatioEquality() {
		testFiles(path + "ratioEquality", path + "ratioEquality.pl0");
	}
	
	@Test
	@DisplayName("fraction inequality")
	void testRatioInequality() {
		testFiles(path + "ratioInequality", path + "ratioInequality.pl0");
	}
	
	@Test
	@DisplayName("fraction less")
	void testRatioLess() {
		testFiles(path + "ratioLess", path + "ratioLess.pl0");
	}
	
	@Test
	@DisplayName("fraction greater or equal")
	void testRatioGreaterEqual() {
		testFiles(path + "ratioGreaterEqual", path + "ratioGreaterEqual.pl0");
	}
	
	@Test
	@DisplayName("fraction greater")
	void testRatioGreater() {
		testFiles(path + "ratioGreater", path + "ratioGreater.pl0");
	}
	
	@Test
	@DisplayName("fraction less or equal")
	void testRatioLessEqual() {
		testFiles(path + "ratioLessEqual", path + "ratioLessEqual.pl0");
	}
	
	// Boolean operations ========================
	
	@Test
	@DisplayName("logical AND")
	void testLogicalAnd() {
		testFiles(path + "booleanAnd", path + "booleanAnd.pl0");
	}
	
	@Test
	@DisplayName("logical OR")
	void testLogicalOr() {
		testFiles(path + "booleanOr", path + "booleanOr.pl0");
	}
	
	@Test
	@DisplayName("logical negation")
	void testLogicalNegation() {
		testFiles(path + "booleanNegation", path + "booleanNegation.pl0");
	}
	
	@Test
	@DisplayName("boolean equality")
	void testBooleanEquality() {
		testFiles(path + "booleanEquality", path + "booleanEquality.pl0");
	}
	
	@Test
	@DisplayName("boolean inequality")
	void testBooleanInequality() {
		testFiles(path + "booleanInequality", path + "booleanInequality.pl0");
	}
	
	@Test
	@DisplayName("complex logic expression")
	void testComplexExpression() {
		testFiles(path + "complexExpression", path + "complexExpression.pl0");
	}
	
	@Test
	@DisplayName("logic precedence")
	void testLogicPrecedence() {
		testFiles(path + "logicPrecedence", path + "logicPrecedence.pl0");
	}
	
	// negative tests =======================
	
	@Test
	@DisplayName("Negative - boolean less")
	void testBooleanLess() {
		testCompilerError(path + "errBooleanLess", "Error(2, 14): Booleans cannot be compared with operator <");
	}
	
	@Test
	@DisplayName("Negative - boolean less equal")
	void testBooleanLessEqual() {
		testCompilerError(path + "errBooleanLessEqual", "Error(2, 14): Booleans cannot be compared with operator <=");
	}
	
	@Test
	@DisplayName("Negative - boolean greater")
	void testBooleanGreater() {
		testCompilerError(path + "errBooleanGreater", "Error(2, 14): Booleans cannot be compared with operator >");
	}
	
	@Test
	@DisplayName("Negative - boolean greater equal")
	void testBooleanGreaterEqual() {
		testCompilerError(path + "errBooleanGreaterEqual", "Error(2, 14): Booleans cannot be compared with operator >=");
	}
	
	@Test
	@DisplayName("Negative - logical negation integer")
	void testIntNegation() {
		testCompilerError(path + "errNegationInteger", "Error(2, 14): Only boolean data type is allowed in logical negation expression");
	}
	
	@Test
	@DisplayName("Negative - logical negation ratio")
	void testRatioNegation() {
		testCompilerError(path + "errNegationRatio", "Error(2, 14): Only boolean data type is allowed in logical negation expression");
	}
	
	@Test
	@DisplayName("Negative - logical AND integer")
	void testIntAnd() {
		testCompilerError(path + "errIntAnd", "Error(2, 14): Only boolean data type is allowed in logical AND expression");
	}
	
	@Test
	@DisplayName("Negative - logical AND ratio")
	void testRatioAnd() {
		testCompilerError(path + "errRatioAnd", "Error(2, 14): Only boolean data type is allowed in logical AND expression");
	}
	
	@Test
	@DisplayName("Negative - logical OR integer")
	void testIntOr() {
		testCompilerError(path + "errIntOr", "Error(2, 14): Only boolean data type is allowed in logical OR expression");
	}
	
	@Test
	@DisplayName("Negative - logical OR ratio")
	void testRatioOr() {
		testCompilerError(path + "errRatioOr", "Error(2, 14): Only boolean data type is allowed in logical OR expression");
	}
}
