package test.compiler;

import fjp.Main;
import fjp.compilers.Error;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

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

    /**
     * Create instance of compiler before all tests.
     */
    @BeforeAll
    static void setUp() {
        main = new Main();
    }

    /**
     * Before each test clean errors.
     */
    @BeforeEach
    void clear() {
        Error.resetError();
    }

    /**
     * After each test delete created file if exists.
     */
    @AfterEach
    void removeTestFile() {
        File file = new File(outFileName);
        if (file.exists()) {
            assertTrue(file.delete());
        }
    }

    /**
     * Compare two files by lines given by file names.
     *
     * @param filePath1 file path to first file
     * @param filePath2 file path to second file
     */
    void assertFiles(String filePath1, String filePath2) {
        Stream<String> stream1 = null;
        Stream<String> stream2 = null;
        boolean error = false;

        try {
            stream1 = Files.lines(Paths.get(filePath1));
            stream2 = Files.lines(Paths.get(filePath2));
        } catch (IOException e) {
            e.printStackTrace();

            if (stream1 != null) stream1.close();
            // stream2 is always null there

            error = true;
        }

        assertFalse(error); // If throw exception

        Object[] file1Content = stream1.toArray();
        Object[] file2Content = stream2.toArray();

        stream1.close();
        stream2.close();

        assertArrayEquals(file1Content, file2Content);
    }

    /**
     * Compile file given by input and compare if result is equals to expectedResult.
     *
     * @param input          file name of file with c-like code which will be compiled
     * @param expectedResult file name of file with expected instructions.
     */
    void testFiles(String input, String expectedResult) {
        main.compile(new String[]{testPath + input, outFileName});
        assertFiles(testPath + expectedResult, outFileName);
    }

    /**
     * Try compile file given by name input and expect ParseCancellationException.
     * Compare if message in exception is equals to expectedError.
     *
     * @param input         file name with c-like code
     * @param expectedError expected error message
     */
    void testCompilerError(String input, String expectedError) {

        boolean exception = false;

        try {
            main.compile(new String[]{testPath + input, outFileName});

        } catch (ParseCancellationException ex) {
            assertEquals(expectedError, ex.getMessage());
            exception = true;
        }

        assertTrue(exception);
    }
}