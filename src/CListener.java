// Generated from ./grammar/C.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CParser}.
 */
public interface CListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#startsymbol}.
	 * @param ctx the parse tree
	 */
	void enterStartsymbol(CParser.StartsymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#startsymbol}.
	 * @param ctx the parse tree
	 */
	void exitStartsymbol(CParser.StartsymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#variabledeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariabledeclaration(CParser.VariabledeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#variabledeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariabledeclaration(CParser.VariabledeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#constantdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantdeclaration(CParser.ConstantdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#constantdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantdeclaration(CParser.ConstantdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#parallelassignment}.
	 * @param ctx the parse tree
	 */
	void enterParallelassignment(CParser.ParallelassignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#parallelassignment}.
	 * @param ctx the parse tree
	 */
	void exitParallelassignment(CParser.ParallelassignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#identifierlist}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierlist(CParser.IdentifierlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#identifierlist}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierlist(CParser.IdentifierlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#valuelist}.
	 * @param ctx the parse tree
	 */
	void enterValuelist(CParser.ValuelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#valuelist}.
	 * @param ctx the parse tree
	 */
	void exitValuelist(CParser.ValuelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#arithmeticexpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticexpression(CParser.ArithmeticexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#arithmeticexpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticexpression(CParser.ArithmeticexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#logicalexpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalexpression(CParser.LogicalexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#logicalexpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalexpression(CParser.LogicalexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#stringexpression}.
	 * @param ctx the parse tree
	 */
	void enterStringexpression(CParser.StringexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#stringexpression}.
	 * @param ctx the parse tree
	 */
	void exitStringexpression(CParser.StringexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#functiondeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondeclaration(CParser.FunctiondeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#functiondeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondeclaration(CParser.FunctiondeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#functionargumentlist}.
	 * @param ctx the parse tree
	 */
	void enterFunctionargumentlist(CParser.FunctionargumentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#functionargumentlist}.
	 * @param ctx the parse tree
	 */
	void exitFunctionargumentlist(CParser.FunctionargumentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(CParser.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(CParser.FunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#functioncallarguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncallarguments(CParser.FunctioncallargumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#functioncallarguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncallarguments(CParser.FunctioncallargumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#forloop}.
	 * @param ctx the parse tree
	 */
	void enterForloop(CParser.ForloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#forloop}.
	 * @param ctx the parse tree
	 */
	void exitForloop(CParser.ForloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#forinitialization}.
	 * @param ctx the parse tree
	 */
	void enterForinitialization(CParser.ForinitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#forinitialization}.
	 * @param ctx the parse tree
	 */
	void exitForinitialization(CParser.ForinitializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#forafterthought}.
	 * @param ctx the parse tree
	 */
	void enterForafterthought(CParser.ForafterthoughtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#forafterthought}.
	 * @param ctx the parse tree
	 */
	void exitForafterthought(CParser.ForafterthoughtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void enterWhileloop(CParser.WhileloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void exitWhileloop(CParser.WhileloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#dowhileloop}.
	 * @param ctx the parse tree
	 */
	void enterDowhileloop(CParser.DowhileloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#dowhileloop}.
	 * @param ctx the parse tree
	 */
	void exitDowhileloop(CParser.DowhileloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(CParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(CParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#switchcondition}.
	 * @param ctx the parse tree
	 */
	void enterSwitchcondition(CParser.SwitchconditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#switchcondition}.
	 * @param ctx the parse tree
	 */
	void exitSwitchcondition(CParser.SwitchconditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#switchcase}.
	 * @param ctx the parse tree
	 */
	void enterSwitchcase(CParser.SwitchcaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#switchcase}.
	 * @param ctx the parse tree
	 */
	void exitSwitchcase(CParser.SwitchcaseContext ctx);
}