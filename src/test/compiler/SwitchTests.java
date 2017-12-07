package test.compiler;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SwitchTests extends CompilerTestsBase {

    private static final String path = "switchTests/";

    @Test
    @DisplayName("Switch without default case")
    void testSwitch1() {
        testFiles(path + "woDefault", path + "woDefault.pl0");
    }

    @Test
    @DisplayName("Switch with default case")
    void testSwitch2() {
        testFiles(path + "wthDefault", path + "wthDefault.pl0");
    }

    @Test
    @DisplayName("Switch with fractal input")
    void testSwitch3() {
        testFiles(path + "fracInput", path + "fracInput.pl0");
    }

}
