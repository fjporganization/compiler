package test.compiler;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ConditionsTests extends CompilerTestsBase{

	@Test
	@DisplayName("Simple condition (no else)")
	void testSimpleIf() {
		testFiles("conditionsTests/simpleIf", "conditionsTests/simpleIf.pl0");
	}
	
	@Test
	@DisplayName("If-else condition")
	void testIfElse() {
		testFiles("conditionsTests/ifElse", "conditionsTests/ifElse.pl0");
	}
	
	@Test
	@DisplayName("Ternary operator")
	void testTernaryOperator() {
		testFiles("conditionsTests/ternary", "conditionsTests/ternary.pl0");
	}
	
	@Test
	@DisplayName("Complex conditions")
	void testComplexIf() {
		testFiles("conditionsTests/complexIf", "conditionsTests/complexIf.pl0");
	}
}
