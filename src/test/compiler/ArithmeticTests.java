package test.compiler;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ArithmeticTests extends CompilerTestsBase{
	
	private static final String path = "arithmeticTests/";
	
	// integers tests =====================
	
	@Test
	@DisplayName("Addition of two integers")
	void testIntAdd() {
		testFiles(path + "intAddition", path + "intAddition.pl0");
	}
	
	@Test
	@DisplayName("Subtraction of two integers")
	void testIntSub() {
		testFiles(path + "intSubtraction", path + "intSubtraction.pl0");
	}
	
	@Test
	@DisplayName("Multiplication of two integers")
	void testIntMul() {
		testFiles(path + "intMultiplication", path + "intMultiplication.pl0");
	}
	
	@Test
	@DisplayName("Division of two integers")
	void testIntDiv() {
		testFiles(path + "intDivision", path + "intDivision.pl0");
	}
	
	@Test
	@DisplayName("Integer operators precedence")
	void testIntPrecedence() {
		testFiles(path + "intPrecedence", path + "intPrecedence.pl0");
	}
	
	@Test
	@DisplayName("Integer unary operators")
	void testIntUnary() {
		testFiles(path + "intUnaryOperator", path + "intUnaryOperator.pl0");
	}
	
	// fractions tests =====================
	
	@Test
	@DisplayName("Addition of two fractions")
	void testRatioAdd() {
		testFiles(path + "ratioAddition", path + "ratioAddition.pl0");
	}
	
	@Test
	@DisplayName("Subtraction of two fractions")
	void testRatioSub() {
		testFiles(path + "ratioSubtraction", path + "ratioSubtraction.pl0");
	}
	
	@Test
	@DisplayName("Multiplication of two fractions")
	void testRatioMul() {
		testFiles(path + "ratioMultiplication", path + "ratioMultiplication.pl0");
	}
	
	@Test
	@DisplayName("Division of two fractions")
	void testRatioDiv() {
		testFiles(path + "ratioDivision", path + "ratioDivision.pl0");
	}
	
	@Test
	@DisplayName("Fraction operators precedence and unary operators")
	void testRatioPrecedence() {
		testFiles(path + "ratioPrecedenceUnary", path + "ratioPrecedenceUnary.pl0");
	}
	
	// type conversion tests =========================
	
	@Test
	@DisplayName("Explicit conversion ratio -> int")
	void testRatioToInt() {
		testFiles(path + "ratioToInt", path + "ratioToInt.pl0");
	}
	
	@Test
	@DisplayName("Explicit conversion int -> ratio")
	void testIntToRatio() {
		testFiles(path + "intToRatio", path + "intToRatio.pl0");
	}
	
	@Test
	@DisplayName("Implicit conversion int -> ratio")
	void testImplicitIntToRatio() {
		testFiles(path + "implicitConversion", path + "implicitConversion.pl0");
	}
	
	@Test
	@DisplayName("Ratio saving")
	void testRatioStack() {
		testFiles(path + "ratioVariable", path + "ratioVariable.pl0");
	}
	
	// negative tests - arithmetic operations on boolean ===============
	
	@Test
	@DisplayName("Negative - addition of booleans")
	void testBooleanAdd() {
		testCompilerError(path + "errBooleanAddition", "Error(2, 14): Incompatible data types - trying to add / subtract boolean");
	}
	
	@Test
	@DisplayName("Negative - subtraction of booleans")
	void testBooleanSub() {
		testCompilerError(path + "errBooleanSubtraction", "Error(2, 14): Incompatible data types - trying to add / subtract boolean");
	}
	
	@Test
	@DisplayName("Negative - multiplication of booleans")
	void testBooleanMul() {
		testCompilerError(path + "errBooleanMultiplication", "Error(2, 14): Incompatible data types - trying to multiply / divide boolean");
	}
	
	@Test
	@DisplayName("Negative - division of booleans")
	void testBooleanDiv() {
		testCompilerError(path + "errBooleanDivision", "Error(2, 14): Incompatible data types - trying to multiply / divide boolean");
	}
	
	@Test
	@DisplayName("Negative - zero denominator of fraction")
	void testZeroDenominator() {
		testCompilerError(path + "errRatioZeroDenominator", "Error(2, 12): Denominator of ratio data type cannot be zero");
	}
	
	@Test
	@DisplayName("Negative - too large number in ratio")
	void testRatioTooLarge() {
		testCompilerError(path + "errRatioTooLarge", "Error(2, 12): Too large number");
	}
	
	@Test
	@DisplayName("Negative - too large number in integer")
	void testIntTooLarge() {
		testCompilerError(path + "errIntTooLarge", "Error(2, 10): Too large number");
	}
	
	@Test
	@DisplayName("Negative - boolean conversion to int")
	void testBooleanToInt() {
		testCompilerError(path + "errBooleanToInt", "Error(3, 10): Cannot convert boolean to integer");
	}
	
	@Test
	@DisplayName("Negative - boolean conversion to ratio")
	void testBooleanToRatio() {
		testCompilerError(path + "errBooleanToRatio", "Error(3, 12): Cannot convert boolean to ratio");
	}
	
	@Test
	@DisplayName("Negative - int conversion to boolean")
	void testIntToBoolean() {
		testCompilerError(path + "errIntToBoolean", "Error(3, 14): Cannot convert integer to boolean");
	}
	
	@Test
	@DisplayName("Negative - ratio conversion to boolean")
	void testRatioToBoolean() {
		testCompilerError(path + "errRatioToBoolean", "Error(3, 14): Cannot convert ratio to boolean");
	}
	
	@Test
	@DisplayName("Negative - unary plus boolean")
	void testUnaryPlusBoolean() {
		testCompilerError(path + "errUnaryPlusBoolean", "Error(2, 14): Unary operators are not applicable to boolean data type");
	}
	
	@Test
	@DisplayName("Negative - unary minus boolean")
	void testUnaryMinusBoolean() {
		testCompilerError(path + "errUnaryMinusBoolean", "Error(2, 14): Unary operators are not applicable to boolean data type");
	}
	
	@Test
	@DisplayName("Negative - implicit conversion boolean -> int")
	void testImplicitBoolean() {
		testCompilerError(path + "errImplicit", "Error(2, 14): Cannot implicitly convert BOOLEAN and INT to the same data type");
	}
	
}
