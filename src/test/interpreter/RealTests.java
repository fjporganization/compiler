package test.interpreter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RealTests extends InterpreterTestsBase{
	
	private static final String path = "/realArithmetic/";
	
	@Test
	@DisplayName("Real unary minus")
	void testIntMinus(){
		testOutput(path + "realUnaryMinus.pl0", path + "realUnaryMinus.txt");
	}
	
	@Test
	@DisplayName("Real addition")
	void testIntAddition(){
		testOutput(path + "realAddition.pl0", path + "realAddition.txt");
	}
	
	@Test
	@DisplayName("Real subtraction")
	void testIntSubtraction(){
		testOutput(path + "realSubtraction.pl0", path + "realSubtraction.txt");
	}
	
	@Test
	@DisplayName("Real multiplication")
	void testIntMultiplication(){
		testOutput(path + "realMultiplication.pl0", path + "realMultiplication.txt");
	}
	
	@Test
	@DisplayName("Real division")
	void testIntDivision(){
		testOutput(path + "realDivision.pl0", path + "realDivision.txt");
	}
	
	@Test
	@DisplayName("Real equality")
	void testIntEquality(){
		testOutput(path + "realEquality.pl0", path + "realEquality.txt");
	}
	
	@Test
	@DisplayName("Real inequality")
	void testIntInequality(){
		testOutput(path + "realInequality.pl0", path + "realInequality.txt");
	}
	
	@Test
	@DisplayName("Real less")
	void testIntLess(){
		testOutput(path + "realLess.pl0", path + "realLess.txt");
	}
	
	@Test
	@DisplayName("Real less or equal")
	void testIntLessEqual(){
		testOutput(path + "realLessEqual.pl0", path + "realLessEqual.txt");
	}
	
	@Test
	@DisplayName("Real greater")
	void testIntGreater(){
		testOutput(path + "realGreater.pl0", path + "realGreater.txt");
	}
	
	@Test
	@DisplayName("Real greater or equal")
	void testIntGreaterEqual(){
		testOutput(path + "realGreaterEqual.pl0", path + "realGreaterEqual.txt");
	}
}
