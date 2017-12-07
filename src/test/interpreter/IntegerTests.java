package test.interpreter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IntegerTests extends InterpreterTestsBase{

	@Test
	@DisplayName("Integer unary minus")
	void testIntMinus(){
		testOutput("/integerArithmetic/intUnaryMinus.pl0", "/integerArithmetic/intUnaryMinus.txt");
	}
	
	@Test
	@DisplayName("Integer addition")
	void testIntAddition(){
		testOutput("/integerArithmetic/intAddition.pl0", "/integerArithmetic/intAddition.txt");
	}
	
	@Test
	@DisplayName("Integer subtraction")
	void testIntSubtraction(){
		testOutput("/integerArithmetic/intSubtraction.pl0", "/integerArithmetic/intSubtraction.txt");
	}
	
	@Test
	@DisplayName("Integer multiplication")
	void testIntMultiplication(){
		testOutput("/integerArithmetic/intMultiplication.pl0", "/integerArithmetic/intMultiplication.txt");
	}
	
	@Test
	@DisplayName("Integer division")
	void testIntDivision(){
		testOutput("/integerArithmetic/intDivision.pl0", "/integerArithmetic/intDivision.txt");
	}
	
	@Test
	@DisplayName("Integer modulus")
	void testIntModulus(){
		testOutput("/integerArithmetic/intModulus.pl0", "/integerArithmetic/intModulus.txt");
	}
	
	@Test
	@DisplayName("Integer even")
	void testIntEven(){
		testOutput("/integerArithmetic/intEven.pl0", "/integerArithmetic/intEven.txt");
	}
	
	@Test
	@DisplayName("Integer equality")
	void testIntEquality(){
		testOutput("/integerArithmetic/intEquality.pl0", "/integerArithmetic/intEquality.txt");
	}
	
	@Test
	@DisplayName("Integer inequality")
	void testIntInequality(){
		testOutput("/integerArithmetic/intInequality.pl0", "/integerArithmetic/intInequality.txt");
	}
	
	@Test
	@DisplayName("Integer less")
	void testIntLess(){
		testOutput("/integerArithmetic/intLess.pl0", "/integerArithmetic/intLess.txt");
	}
	
	@Test
	@DisplayName("Integer less or equal")
	void testIntLessEqual(){
		testOutput("/integerArithmetic/intLessEqual.pl0", "/integerArithmetic/intLessEqual.txt");
	}
	
	@Test
	@DisplayName("Integer greater")
	void testIntGreater(){
		testOutput("/integerArithmetic/intGreater.pl0", "/integerArithmetic/intGreater.txt");
	}
	
	@Test
	@DisplayName("Integer greater or equal")
	void testIntGreaterEqual(){
		testOutput("/integerArithmetic/intGreaterEqual.pl0", "/integerArithmetic/intGreaterEqual.txt");
	}
}
