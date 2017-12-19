package test.interpreter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IntegerTests extends InterpreterTestsBase{
	
	private static final String path = "integerArithmetic/";

	@Test
	@DisplayName("Integer unary minus")
	void testIntMinus(){
		testOutput(path + "intUnaryMinus.pl0", path + "intUnaryMinus.txt");
	}
	
	@Test
	@DisplayName("Integer addition")
	void testIntAddition(){
		testOutput(path + "intAddition.pl0", path + "intAddition.txt");
	}
	
	@Test
	@DisplayName("Integer subtraction")
	void testIntSubtraction(){
		testOutput(path + "intSubtraction.pl0", path + "intSubtraction.txt");
	}
	
	@Test
	@DisplayName("Integer multiplication")
	void testIntMultiplication(){
		testOutput(path + "intMultiplication.pl0", path + "intMultiplication.txt");
	}
	
	@Test
	@DisplayName("Integer division")
	void testIntDivision(){
		testOutput(path + "intDivision.pl0", path + "intDivision.txt");
	}
	
	@Test
	@DisplayName("Integer modulus")
	void testIntModulus(){
		testOutput(path + "intModulus.pl0", path + "intModulus.txt");
	}
	
	@Test
	@DisplayName("Integer even")
	void testIntEven(){
		testOutput(path + "intEven.pl0", path + "intEven.txt");
	}
	
	@Test
	@DisplayName("Integer equality")
	void testIntEquality(){
		testOutput(path + "intEquality.pl0", path + "intEquality.txt");
	}
	
	@Test
	@DisplayName("Integer inequality")
	void testIntInequality(){
		testOutput(path + "intInequality.pl0", path + "intInequality.txt");
	}
	
	@Test
	@DisplayName("Integer less")
	void testIntLess(){
		testOutput(path + "intLess.pl0", path + "intLess.txt");
	}
	
	@Test
	@DisplayName("Integer less or equal")
	void testIntLessEqual(){
		testOutput(path + "intLessEqual.pl0", path + "intLessEqual.txt");
	}
	
	@Test
	@DisplayName("Integer greater")
	void testIntGreater(){
		testOutput(path + "intGreater.pl0", path + "intGreater.txt");
	}
	
	@Test
	@DisplayName("Integer greater or equal")
	void testIntGreaterEqual(){
		testOutput(path + "intGreaterEqual.pl0", path + "intGreaterEqual.txt");
	}
}
