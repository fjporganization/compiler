public class CompilerArithmetic extends CBaseListener{

    /** Data which are shared across all compilers classes */
    private final CompilerData data;

    public CompilerArithmetic(CompilerData data){
        this.data = data;
    }

    /**
     * Processes arithmetic expressions which contains multiplication or division
     */
    @Override
    public void exitMulDivExp(CParser.MulDivExpContext ctx) {
        OperationCode operationCode = ctx.MULTIPLICATIONDIVISIONOPERATOR().getText().equals("*") ?
                OperationCode.MULTIPLICATION : OperationCode.DIVISION;

        Instruction instruction = new Instruction(InstructionCodes.OPERATION, 0, operationCode);
        //instruction pops 2 values from the stack (operands) and push 1 value (result)
        data.decStackPointer();

        data.addInstruction(instruction);
    }


    /**
     * Processes arithmetic expressions which contains addition or subtraction
     */
    @Override
    public void exitAddSubExp(CParser.AddSubExpContext ctx) {
        OperationCode operationCode = ctx.ADDITIONSUBTRACTIONOPERATOR().getText().equals("+") ?
                OperationCode.ADDITION : OperationCode.SUBTRACTION;

        Instruction instruction = new Instruction(InstructionCodes.OPERATION, 0, operationCode);
        //instruction pops 2 values from the stack (operands) and push 1 value (result)
        data.decStackPointer();

        data.addInstruction(instruction);
    }


    /**
     * Processes numeric atom (single numeric value) (pushes the value of the variable onto the stack)
     */
    @Override
    public void exitNumericAtom(CParser.NumericAtomContext ctx) {
        //load given literal onto the stack
        String literal = ctx.getText();
        Instruction instruction = new Instruction(InstructionCodes.PUSH, 0, literal);

        //instruction push 1 value onto the stack
        data.incStackPointer();
        data.addInstruction(instruction);
    }
}
