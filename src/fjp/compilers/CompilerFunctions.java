package fjp.compilers;

import fjp.generated.*;
import fjp.structures.*;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * Class providing compiler functionality for parsing functions and code in general
 */
public class CompilerFunctions extends CBaseListener {

    /**
     * Instruction Increment(INT) which is at beginning of function.
     * At the end of function is change operand to let space in stack for variables
     */
    private Instruction intInstruction = null;

    /**
     * Address of first instruction (INT) of current processing function.
     */
    private int intInstructionAdr = 0;

    /**
     * Data which are shared across all compilers classes
     */
    private final CompilerData data;

    /**
     * List of function calls.
     * At the end of program is add address to first instruction of function to all function call instructions.
     */
    private final List<Pair<String, Instruction>> funcCalls;


    /**
     * Constructor of CompilerFunctions
     *
     * @param data contains data which are shared with all compiler classes
     */
    public CompilerFunctions(CompilerData data) {
        this.data = data;

        funcCalls = new ArrayList<>();
    }


    /**
     * Method is called at start of program. Initialize code like on start of function.
     */
    @Override
    public void enterStartsymbol(CParser.StartsymbolContext ctx) {
        data.addInstruction(new Instruction(InstructionCodes.JUMP, 0, 1));

        Instruction increment = new Instruction(InstructionCodes.INCREMENT, 0, CompilerData.BASE_FUNC_STACK_SIZE);
        data.addInstruction(increment);
        intInstruction = increment;
        intInstructionAdr = data.getCurrentInstructionAddress();

        data.incStackPointer(CompilerData.BASE_FUNC_STACK_SIZE);
    }

    /**
     * Method is called a the end of program.
     * Add specific address to all function calls.
     */
    @Override
    public void exitStartsymbol(CParser.StartsymbolContext ctx) {

        for (Pair<String, Instruction> pair : funcCalls) {

            Addressable func = data.symbolTableGet(pair.getKey());

            if (func == null) {
                Error.throwError(ctx, "Unknown function identifier: " + pair.getKey());
                return;
            }

            if (!(func instanceof Function)) {
                Error.throwError(ctx, pair.getKey() + "is not function");
                return;
            }

            pair.getValue().setOperand(func.getAddress());
        }

        funcCalls.clear();
    }

    /**
     * Method is called at beginning of function declaration.
     * If its first function, end variable declaration and add call to first function.
     * Initialize new function.
     */
    @Override
    public void enterFunctiondeclaration(CParser.FunctiondeclarationContext ctx) {
        if (intInstruction != null) {
            shiftInstructions();
            // first function in code is start function
            data.addInstruction(new Instruction(InstructionCodes.CALL, 0, data.getCurrentInstructionAddress() + 3));
            data.addInstruction(new Instruction(InstructionCodes.RETURN, 0, 0));
        }
        data.incScopeId();
        data.resetStackPointer();

        // add increment instruction
        Instruction increment = new Instruction(InstructionCodes.INCREMENT, 0, CompilerData.BASE_FUNC_STACK_SIZE);
        data.addInstruction(increment);
        intInstruction = increment;
        intInstructionAdr = data.getCurrentInstructionAddress();

        data.incStackPointer(CompilerData.BASE_FUNC_STACK_SIZE);
    }

    /**
     * Method is called at the end of function declaration.
     */
    @Override
    public void exitFunctiondeclaration(CParser.FunctiondeclarationContext ctx) {
        // add identifier to identifier table
        String identifier = ctx.IDENTIFIER().getText();

        if (data.symbolTableGet(identifier) != null) {
            Error.throwError(ctx, "Identifier " + identifier + " is already declared");
            return;
        }

        Function func = new Function(intInstructionAdr, identifier);
        data.symbolTablePut(identifier, func, 0);

        shiftInstructions();

        data.addInstruction(new Instruction(InstructionCodes.RETURN, 0, 0));
    }

    /**
     * Create call instruction and add function call to list of function calls to later process.
     */
    @Override
    public void exitFunctioncall(CParser.FunctioncallContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();

        Instruction call = new Instruction(InstructionCodes.CALL, 0, 0);
        data.addInstruction(call);
        funcCalls.add(new Pair<>(identifier, call));
    }

    /**
     * Add to operation value of all instructions which are in data.toShift list number of variables in function.
     * Is used for instructions which operate with specific stack address.
     */
    private void shiftInstructions() {

        intInstruction.setOperand(intInstruction.getOperand() + data.getVarCounter());

        for (Instruction ins : data.toShift) {
            ins.setOperand(ins.getOperand() + data.getVarCounter());
        }

        data.toShift.clear();

        data.resetVarCounter();
        intInstruction = null;
    }
}