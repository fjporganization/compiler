package test.compiler;

import fjp.Main;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CompilerTestsBase {

    private static final String outFileName = "out.test";
    private static final String testPath = "testFiles/";

    private static Main main;

    @BeforeAll
    static void setUp() {
        main = new Main();
    }

    @AfterEach
    void removeTestFile() {
        File file = new File(outFileName);
        if(file.exists()) {
            assertTrue(file.delete());
        }
    }

    /**
     * Compare two files by lines given by file names.
     * @param filePath1 file path to first file
     * @param filePath2 file path to second file
     */
    void assertFiles(String filePath1, String filePath2){
        Stream<String> stream1 = null;
        Stream<String> stream2 = null;

        try {
            stream1 = Files.lines(Paths.get(filePath1));
            stream2 = Files.lines(Paths.get(filePath2));
        } catch (IOException e) {
            e.printStackTrace();
            
            if(stream1 != null) stream1.close();
            // stream2 is always null there

            assertFalse(true); // If throw exception
        }

        Object [] file1Content = stream1.toArray();
        Object [] file2Content = stream2.toArray();

        stream1.close();
        stream2.close();

        assertArrayEquals(file1Content, file2Content);
    }

    void testFiles(String input, String expectedResult){

        main.compile(new String[]{testPath + input, outFileName});
        assertFiles(testPath + expectedResult, outFileName);
    }
}