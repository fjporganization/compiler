package test.compiler;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FunctionsTests extends CompilerTestsBase {

    private static final String path = "functionsTests/";

    @Test
    @DisplayName("Functions - Lots of functions")
    void testFunction1() {
        testFiles(path + "function1", path + "function1.pl0");
    }

    @Test
    @DisplayName("Functions - recursion")
    void testFunction2() {
        testFiles(path + "function2", path + "function2.pl0");
    }

    @Test
    @DisplayName("Functions - Get variable out of scope")
    void testFunction4() {
        testCompilerError(path + "functionErr1", "Error(8, 4): Unknown identifier: promenna");
    }

    @Test
    @DisplayName("Functions - Call invalid function")
    void testFunction5() {
        testCompilerError(path + "functionErr2", "Error(2, 0): Unknown function identifier: b");
    }
}
