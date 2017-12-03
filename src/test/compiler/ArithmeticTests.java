package test.compiler;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ArithmeticTests extends CompilerTestsBase{
	
	// integers tests =====================
	
	@Test
	@DisplayName("Addition of two integers")
	void testIntAdd() {
		testFiles("arithmeticTests/intAddition", "arithmeticTests/intAddition.pl0");
	}
	
	@Test
	@DisplayName("Subtraction of two integers")
	void testIntSub() {
		testFiles("arithmeticTests/intSubtraction", "arithmeticTests/intSubtraction.pl0");
	}
	
	@Test
	@DisplayName("Multiplication of two integers")
	void testIntMul() {
		testFiles("arithmeticTests/intMultiplication", "arithmeticTests/intMultiplication.pl0");
	}
	
	@Test
	@DisplayName("Division of two integers")
	void testIntDiv() {
		testFiles("arithmeticTests/intDivision", "arithmeticTests/intDivision.pl0");
	}
	
	// fractions tests =====================
	
	@Test
	@DisplayName("Addition of two fractions")
	void testRatioAdd() {
		testFiles("arithmeticTests/ratioAddition", "arithmeticTests/ratioAddition.pl0");
	}
	
	@Test
	@DisplayName("Subtraction of two fractions")
	void testRatioSub() {
		testFiles("arithmeticTests/ratioSubtraction", "arithmeticTests/ratioSubtraction.pl0");
	}
	
	@Test
	@DisplayName("Multiplication of two fractions")
	void testRatioMul() {
		testFiles("arithmeticTests/ratioMultiplication", "arithmeticTests/ratioMultiplication.pl0");
	}
	
	@Test
	@DisplayName("Division of two fractions")
	void testRatioDiv() {
		testFiles("arithmeticTests/ratioDivision", "arithmeticTests/ratioDivision.pl0");
	}
	
	// type conversion tests =========================
	
	@Test
	@DisplayName("Explicit conversion ratio -> int")
	void testRatioToInt() {
		testFiles("arithmeticTests/ratioToInt", "arithmeticTests/ratioToInt.pl0");
	}
	
	@Test
	@DisplayName("Explicit conversion int -> ratio")
	void testIntToRatio() {
		testFiles("arithmeticTests/intToRatio", "arithmeticTests/intToRatio.pl0");
	}
	
	@Test
	@DisplayName("Implicit conversion int -> ratio")
	void testImplicitIntToRatio() {
		testFiles("arithmeticTests/implicitConversion", "arithmeticTests/implicitConversion.pl0");
	}
	
	@Test
	@DisplayName("Ratio saving")
	void testRatioStack() {
		testFiles("arithmeticTests/ratioVariable", "arithmeticTests/ratioVariable.pl0");
	}
}
