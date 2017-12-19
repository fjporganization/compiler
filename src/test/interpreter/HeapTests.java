package test.interpreter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HeapTests extends InterpreterTestsBase{
	
	private static final String path = "heap/";
	
	@Test
	@DisplayName("Allocate on heap")
	void testNew(){
		testOutput(path + "new.pl0", path + "new.txt");
	}
	
	@Test
	@DisplayName("Release on heap")
	void testDel(){
		testOutput(path + "del.pl0", path + "del.txt"); //we test that there is no error during execution
	}
}
