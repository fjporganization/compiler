package test.compiler;

import fjp.compilers.Error;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class VariablesTest extends CompilerTestsBase {

    private static final String path = "variablesTests/";

    @Test
    @DisplayName("Variables success test")
    void testVariables1() {
        testFiles(path + "var1", path + "var1.pl0");
    }

    @Test
    @DisplayName("Variables - out of scope")
    void testVariables2() {
        testCompilerError(path + "varErr1", "Error(9, 4): Unknown identifier: number");
    }

    @Test
    @DisplayName("Variables - more definitions")
    void testVariables3() {
        testCompilerError(path + "varErr2", "Error(4, 4): Identifier counter is already declared");
    }

    @Test
    @DisplayName("Variables - integer declare and assign true")
    void testVariables4() {
        testCompilerError(path + "varErr3", "Error(3, 4): Data type BOOLEAN is not expected in: numb");
    }

    @Test
    @DisplayName("Variables - integer declare and assign frac")
    void testVariables5() {
        testCompilerError(path + "varErr4", "Error(3, 4): Data type FRACTION is not expected in: numb");
    }

    @Test
    @DisplayName("Variables - boolean declare and assign integer")
    void testVariables6() {
        testCompilerError(path + "varErr5", "Error(3, 4): Data type INT is not expected in: bool");
    }

    @Test
    @DisplayName("Variables - boolean declare and assign frac")
    void testVariables7() {
        testCompilerError(path + "varErr6", "Error(3, 4): Data type FRACTION is not expected in: bool");
    }

    @Test
    @DisplayName("Variables - frac declare and assign boolean")
    void testVariables8() {
        testCompilerError(path + "varErr7", "Error(3, 4): Data type BOOLEAN is not expected in: frac");
    }

    @Test
    @DisplayName("Variables - frac declare and assign integer")
    void testVariables9() {
        testCompilerError(path + "varErr8", "Error(3, 4): Data type INT is not expected in: frac");
    }

    @Test
    @DisplayName("Change constant")
    void testVariables10() {
        testCompilerError(path + "varErr9", "Error(5, 4): Variable number is constant.");
    }

    @Test
    @DisplayName("Variables - integer assign boolean")
    void testVariables11() {
        testCompilerError(path + "varErr10", "Error(5, 4): Data type BOOLEAN is not expected in: numb");
    }

    @Test
    @DisplayName("Variables - integer assign frac")
    void testVariables12() {
        testCompilerError(path + "varErr11", "Error(5, 4): Data type FRACTION is not expected in: numb");
    }

    @Test
    @DisplayName("Variables - boolean assign integer")
    void testVariables13() {
        testCompilerError(path + "varErr12", "Error(5, 4): Data type INT is not expected in: bool");
    }

    @Test
    @DisplayName("Variables - boolean assign frac")
    void testVariables14() {
        testCompilerError(path + "varErr13", "Error(5, 4): Data type FRACTION is not expected in: bool");
    }

    @Test
    @DisplayName("Variables - frac assign boolean")
    void testVariables15() {
        testCompilerError(path + "varErr14", "Error(5, 4): Data type BOOLEAN is not expected in: frac");
    }

    @Test
    @DisplayName("Variables - frac assign integer")
    void testVariables16() {
        testCompilerError(path + "varErr15", "Error(5, 4): Data type INT is not expected in: frac");
    }

    @Test
    @DisplayName("Variables - integer declaration and assign boolean value")
    void testVariables17() {
        testCompilerError(path + "varErr16", "Error(3, 4): Data type BOOLEAN is not expected in: number");
    }

    @Test
    @DisplayName("Variables - multiple assignment integer success")
    void testVariables18() {
        testFiles(path + "varMulti1", path + "varMulti1.pl0");
    }

    @Test
    @DisplayName("Variables - multiple assignment boolean success")
    void testVariables19() {
        testFiles(path + "varMulti2", path + "varMulti2.pl0");
    }

    @Test
    @DisplayName("Variables - multiple assignment frac success")
    void testVariables20() {
        testFiles(path + "varMulti3", path + "varMulti3.pl0");
    }

    @Test
    @DisplayName("Variables - multiple assignment invalid data type")
    void testVariables21() {
        testCompilerError(path + "varMulti4", "Error(7, 4): Data type INT is not compatible with FRACTION. Variable: a");
        Error.resetError();
        testCompilerError(path + "varMulti5", "Error(7, 4): Data type INT is not compatible with BOOLEAN. Variable: a");
        Error.resetError();
        testCompilerError(path + "varMulti6", "Error(7, 4): Data type BOOLEAN is not compatible with INT. Variable: a");
        Error.resetError();
        testCompilerError(path + "varMulti7", "Error(5, 4): Data type FRACTION is not compatible with BOOLEAN. Variable: a");
    }

    @Test
    @DisplayName("Variables - parallel assignment success")
    void testVariables22() {
        testFiles(path + "varPara1", path + "varPara1.pl0");
    }

    @Test
    @DisplayName("Variables - parallel assignment invalid data types")
    void testVariables23() {
        testCompilerError(path + "varPara2", "Error(11, 4): Data type FRACTION is not compatible with INT. Variable: a");
        Error.resetError();
        testCompilerError(path + "varPara3", "Error(11, 4): Data type BOOLEAN is not compatible with INT. Variable: b");
        Error.resetError();
        testCompilerError(path + "varPara4", "Error(11, 4): Data type BOOLEAN is not compatible with FRACTION. Variable: c");
        Error.resetError();
        testCompilerError(path + "varPara5", "Error(11, 4): Data type INT is not compatible with BOOLEAN. Variable: e");
    }

    @Test
    @DisplayName("Variables - parallel assignment invalid variable")
    void testVariables24() {
        testCompilerError(path + "varPara6", "Error(11, 4): Data type FRACTION is not compatible with BOOLEAN. Variable: d");
    }

}
