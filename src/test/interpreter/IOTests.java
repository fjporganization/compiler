package test.interpreter;

import java.io.ByteArrayInputStream;
import java.util.Locale;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IOTests extends InterpreterTestsBase {
	
	private static final String path = "/IO/";
	
	private static final String inputInteger = "3";
	
	private static final String inputFloat = "3.1";
	
	private static final String inputRatio = "1|2";
	
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
		testOutput(path + "intIO.pl0", path + "intIO.txt");
	}
	
	@Test
	@DisplayName("Float IO")
	void testFloatIO(){
		ByteArrayInputStream in = new ByteArrayInputStream(inputFloat.getBytes());
		System.setIn(in);
		testOutput(path + "floatIO.pl0", path + "floatIO.txt");
	}
	
	@Test
	@DisplayName("Ratio IO")
	void testRatioIO(){
		ByteArrayInputStream in = new ByteArrayInputStream(inputRatio.getBytes());
		System.setIn(in);
		testOutput(path + "ratioIO.pl0", path + "ratioIO.txt");
	}
}
