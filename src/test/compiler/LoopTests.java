package test.compiler;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LoopTests extends CompilerTestsBase {

    private static final String path = "loopsTests/";

    @Test
    @DisplayName("While - int < 10 expression")
    void testWhile1() {
        testFiles(path + "while1", path + "while1.pl0");
    }

    @Test
    @DisplayName("While - boolean expression")
    void testWhile2() {
        testFiles(path + "while2", path + "while2.pl0");
    }

    @Test
    @DisplayName("While - not known variable in expression")
    void testWhile3() {
        testCompilerError(path + "while3", "Error(2, 10): Unknown identifier: a");
    }

    @Test
    @DisplayName("While - three while loops")
    void testWhile4() {
        testFiles(path + "while4", path + "while4.pl0");
    }

    @Test
    @DisplayName("Do While - simple expression")
    void testDoWhile1() {
        testFiles(path + "doWhile1", path + "doWhile1.pl0");
    }

    @Test
    @DisplayName("Do While - two loops")
    void testDoWhile2() {
        testFiles(path + "doWhile2", path + "doWhile2.pl0");
    }

    @Test
    @DisplayName("For - simple expression")
    void testFor1() {
        testFiles(path + "for1", path + "for1.pl0");
    }

    @Test
    @DisplayName("For - sophisticate expression")
    void testFor2() {
        testFiles(path + "for2", path + "for2.pl0");
    }

    @Test
    @DisplayName("For - two for loops")
    void testFor3() {
        testFiles(path + "for3", path + "for3.pl0");
    }

    @Test
    @DisplayName("Combination of all loops")
    void testAllLoops() {
        testFiles(path + "allLoops", path + "allLoops.pl0");
    }
}
