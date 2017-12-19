package test.interpreter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LoadStoreTests extends InterpreterTestsBase{
	
	private static final String path = "loadStore/";

	@Test
	@DisplayName("LOD instruction - no nesting")
	void testLod0(){
		testOutput(path + "lod0.pl0", path + "lod0.txt");
	}
	
	@Test
	@DisplayName("STO instruction - no nesting")
	void testSto0(){
		testOutput(path + "sto0.pl0", path + "sto0.txt");
	}
	
	@Test
	@DisplayName("LOD instruction - nested")
	void testLod1(){
		testOutput(path + "lod1.pl0", path + "lod1.txt");
	}
	
	@Test
	@DisplayName("STO instruction - nested")
	void testSto1(){
		testOutput(path + "sto1.pl0", path + "sto1.txt");
	}
	
	@Test
	@DisplayName("LDA instruction - nested")
	void testLda(){
		testOutput(path + "lda.pl0", path + "lda.txt");
	}
	
	@Test
	@DisplayName("STA instruction - nested")
	void testSta(){
		testOutput(path + "sta.pl0", path + "sta.txt");
	}
	
	@Test
	@DisplayName("PLD instruction - nested")
	void testPld(){
		testOutput(path + "pld.pl0", path + "pld.txt");
	}
	
	@Test
	@DisplayName("PST instruction - nested")
	void testPst(){
		testOutput(path + "pst.pl0", path + "pst.txt");
	}
}
