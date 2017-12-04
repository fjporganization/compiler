package test.compiler;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LogicTests extends CompilerTestsBase{
	
	// Integer comparisons =====================
	
	@Test
	@DisplayName("integer equality")
	void testIntEquality() {
		testFiles("logicTests/intEquality", "logicTests/intEquality.pl0");
	}
	
	@Test
	@DisplayName("integer inequality")
	void testIntInequality() {
		testFiles("logicTests/intInequality", "logicTests/intInequality.pl0");
	}
	
	@Test
	@DisplayName("integer less")
	void testIntLess() {
		testFiles("logicTests/intLess", "logicTests/intLess.pl0");
	}
	
	@Test
	@DisplayName("integer greater or equal")
	void testIntGreaterEqual() {
		testFiles("logicTests/intGreaterEqual", "logicTests/intGreaterEqual.pl0");
	}
	
	@Test
	@DisplayName("integer greater")
	void testIntGreater() {
		testFiles("logicTests/intGreater", "logicTests/intGreater.pl0");
	}
	
	@Test
	@DisplayName("integer less or equal")
	void testIntLessEqual() {
		testFiles("logicTests/intLessEqual", "logicTests/intLessEqual.pl0");
	}
	
	// Fractions comparisons =====================
	
	@Test
	@DisplayName("fraction equality")
	void testRatioEquality() {
		testFiles("logicTests/ratioEquality", "logicTests/ratioEquality.pl0");
	}
	
	@Test
	@DisplayName("fraction inequality")
	void testRatioInequality() {
		testFiles("logicTests/ratioInequality", "logicTests/ratioInequality.pl0");
	}
	
	@Test
	@DisplayName("fraction less")
	void testRatioLess() {
		testFiles("logicTests/ratioLess", "logicTests/ratioLess.pl0");
	}
	
	@Test
	@DisplayName("fraction greater or equal")
	void testRatioGreaterEqual() {
		testFiles("logicTests/ratioGreaterEqual", "logicTests/ratioGreaterEqual.pl0");
	}
	
	@Test
	@DisplayName("fraction greater")
	void testRatioGreater() {
		testFiles("logicTests/ratioGreater", "logicTests/ratioGreater.pl0");
	}
	
	@Test
	@DisplayName("fraction less or equal")
	void testRatioLessEqual() {
		testFiles("logicTests/ratioLessEqual", "logicTests/ratioLessEqual.pl0");
	}
	
	// Boolean operations ========================
	
	@Test
	@DisplayName("logical AND")
	void testLogicalAnd() {
		testFiles("logicTests/booleanAnd", "logicTests/booleanAnd.pl0");
	}
	
	@Test
	@DisplayName("logical OR")
	void testLogicalOr() {
		testFiles("logicTests/booleanOr", "logicTests/booleanOr.pl0");
	}
	
	@Test
	@DisplayName("logical negation")
	void testLogicalNegation() {
		testFiles("logicTests/booleanNegation", "logicTests/booleanNegation.pl0");
	}
	
	@Test
	@DisplayName("boolean equality")
	void testBooleanEquality() {
		testFiles("logicTests/booleanEquality", "logicTests/booleanEquality.pl0");
	}
	
	@Test
	@DisplayName("boolean inequality")
	void testBooleanInequality() {
		testFiles("logicTests/booleanInequality", "logicTests/booleanInequality.pl0");
	}
	
	@Test
	@DisplayName("complex logic expression")
	void testComplexExpression() {
		testFiles("logicTests/complexExpression", "logicTests/complexExpression.pl0");
	}
}
