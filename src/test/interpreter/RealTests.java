package test.interpreter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RealTests extends InterpreterTestsBase{
	
	@Test
	@DisplayName("Real unary minus")
	void testIntMinus(){
		testOutput("/realArithmetic/realUnaryMinus.pl0", "/realArithmetic/realUnaryMinus.txt");
	}
	
	@Test
	@DisplayName("Real addition")
	void testIntAddition(){
		testOutput("/realArithmetic/realAddition.pl0", "/realArithmetic/realAddition.txt");
	}
	
	@Test
	@DisplayName("Real subtraction")
	void testIntSubtraction(){
		testOutput("/realArithmetic/realSubtraction.pl0", "/realArithmetic/realSubtraction.txt");
	}
	
	@Test
	@DisplayName("Real multiplication")
	void testIntMultiplication(){
		testOutput("/realArithmetic/realMultiplication.pl0", "/realArithmetic/realMultiplication.txt");
	}
	
	@Test
	@DisplayName("Real division")
	void testIntDivision(){
		testOutput("/realArithmetic/realDivision.pl0", "/realArithmetic/realDivision.txt");
	}
	
	@Test
	@DisplayName("Real equality")
	void testIntEquality(){
		testOutput("/realArithmetic/realEquality.pl0", "/realArithmetic/realEquality.txt");
	}
	
	@Test
	@DisplayName("Real inequality")
	void testIntInequality(){
		testOutput("/realArithmetic/realInequality.pl0", "/realArithmetic/realInequality.txt");
	}
	
	@Test
	@DisplayName("Real less")
	void testIntLess(){
		testOutput("/realArithmetic/realLess.pl0", "/realArithmetic/realLess.txt");
	}
	
	@Test
	@DisplayName("Real less or equal")
	void testIntLessEqual(){
		testOutput("/realArithmetic/realLessEqual.pl0", "/realArithmetic/realLessEqual.txt");
	}
	
	@Test
	@DisplayName("Real greater")
	void testIntGreater(){
		testOutput("/realArithmetic/realGreater.pl0", "/realArithmetic/realGreater.txt");
	}
	
	@Test
	@DisplayName("Real greater or equal")
	void testIntGreaterEqual(){
		testOutput("/realArithmetic/realGreaterEqual.pl0", "/realArithmetic/realGreaterEqual.txt");
	}
}
