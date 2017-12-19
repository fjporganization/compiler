package test.interpreter;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;

import fjp.interpreter.*;

class InterpreterTestsBase {
	
	Interpreter interpreter;
	
	String testPath = "testFiles/interpreterTests";
	
	private static ByteArrayOutputStream out = null;
	
	private static ByteArrayOutputStream err = null;

	@BeforeEach
	void setUp() throws Exception {
		interpreter = new Interpreter();
		out = new ByteArrayOutputStream();
		err = new ByteArrayOutputStream();
		
        System.setOut(new PrintStream(out));
        System.setErr(new PrintStream(err));
	}
	
	@AfterAll
    public static void cleanUpStreams() {		
		System.setOut(System.out);
        System.setErr(System.err);
    }
	
	
	/**
	 * compares system output stream with expected system output stream content
	 * @param inputInstructionFile file that contains instructions to be executed
	 * @param expectedOutputFile file that contains expected output to output stream
	 */
	void testOutput(String inputInstructionFile, String expectedOutputFile) {
		interpreter.loadInstructionsFromFile(testPath + inputInstructionFile);
		interpreter.interpret();
		
		String[] expectedOutput = null;
		String[] actualOutput = null;
		
		Stream<String> expectedLinesStream = null;
		try{
			expectedLinesStream = Files.lines(Paths.get(testPath + expectedOutputFile));
			expectedOutput = expectedLinesStream.toArray(String[]::new);
					
		}catch(IOException e) {
			System.setOut(System.out);
	        System.setErr(System.err);
	        
			e.printStackTrace();
			assertFalse(true);
			
		}finally {
			if(expectedLinesStream != null) {
				expectedLinesStream.close();
			}
		}
		
		actualOutput = out.toString().trim().split("[\\r?\\n]+");
		
		assertArrayEquals(expectedOutput, actualOutput);
	}

}
