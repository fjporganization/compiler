package test.interpreter;

import java.io.ByteArrayInputStream;
import java.util.Locale;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IOTests extends InterpreterTestsBase {
	
	private final String inputInteger = "3";
	
	private final String inputFloat = "3.1";
	
	private final String inputRatio = "1|2";
	
	@BeforeAll
    public static void setUpDecimalSeparator() {	
		// to use decimal dot instead of decimal comma
		Locale.setDefault(Locale.US);
    }
	
	@AfterAll
    public static void cleanUpStreams() {		
		System.setIn(System.in);
    }
	
	@Test
	@DisplayName("Integer IO")
	void testIntegerIO(){
		ByteArrayInputStream in = new ByteArrayInputStream(inputInteger.getBytes());
		System.setIn(in);
		testOutput("/IO/intIO.pl0", "/IO/intIO.txt");
	}
	
	@Test
	@DisplayName("Float IO")
	void testFloatIO(){
		ByteArrayInputStream in = new ByteArrayInputStream(inputFloat.getBytes());
		System.setIn(in);
		testOutput("/IO/floatIO.pl0", "/IO/floatIO.txt");
	}
	
	@Test
	@DisplayName("Ratio IO")
	void testRatioIO(){
		ByteArrayInputStream in = new ByteArrayInputStream(inputRatio.getBytes());
		System.setIn(in);
		testOutput("/IO/ratioIO.pl0", "/IO/ratioIO.txt");
	}
}
