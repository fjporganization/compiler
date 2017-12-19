package test.interpreter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ConversionTests  extends InterpreterTestsBase{
	
	private static final String path = "conversions/";
	
	@Test
	@DisplayName("RTI - float to integer")
	void testRti(){
		testOutput(path + "rti.pl0", path + "rti.txt");
	}
	
	@Test
	@DisplayName("ITR - integer to float")
	void testItr(){
		testOutput(path + "itr.pl0", path + "itr.txt");
	}

}
