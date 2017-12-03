package test.compiler;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LoopTests extends CompilerTestsBase {

    @Test
    @DisplayName("While - int < 10 expression")
    void testWhile1() {
        testFiles("while1", "while1.pl0");
    }

    @Test
    @DisplayName("While - boolean expression")
    void testWhile2() {
        testFiles("while2", "while2.pl0");
    }



}
