// Generated from C.g4 by ANTLR 4.7
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
	 * Enter a parse tree produced by {@link CParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctions(CParser.FunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctions(CParser.FunctionsContext ctx);
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
	 * Enter a parse tree produced by the {@code declarationAndInitialization}
	 * labeled alternative in {@link CParser#variabledeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationAndInitialization(CParser.DeclarationAndInitializationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationAndInitialization}
	 * labeled alternative in {@link CParser#variabledeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationAndInitialization(CParser.DeclarationAndInitializationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationOnly}
	 * labeled alternative in {@link CParser#variabledeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationOnly(CParser.DeclarationOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationOnly}
	 * labeled alternative in {@link CParser#variabledeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationOnly(CParser.DeclarationOnlyContext ctx);
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
	 * Enter a parse tree produced by the {@code standardAssignment}
	 * labeled alternative in {@link CParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterStandardAssignment(CParser.StandardAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code standardAssignment}
	 * labeled alternative in {@link CParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitStandardAssignment(CParser.StandardAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleAssignment}
	 * labeled alternative in {@link CParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterMultipleAssignment(CParser.MultipleAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleAssignment}
	 * labeled alternative in {@link CParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitMultipleAssignment(CParser.MultipleAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryOperatorAssignment}
	 * labeled alternative in {@link CParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterTernaryOperatorAssignment(CParser.TernaryOperatorAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryOperatorAssignment}
	 * labeled alternative in {@link CParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitTernaryOperatorAssignment(CParser.TernaryOperatorAssignmentContext ctx);
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
	 * Enter a parse tree produced by the {@code mulDivExp}
	 * labeled alternative in {@link CParser#arithmeticexpression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExp(CParser.MulDivExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivExp}
	 * labeled alternative in {@link CParser#arithmeticexpression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExp(CParser.MulDivExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesesArithmeticExp}
	 * labeled alternative in {@link CParser#arithmeticexpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesesArithmeticExp(CParser.ParenthesesArithmeticExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesesArithmeticExp}
	 * labeled alternative in {@link CParser#arithmeticexpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesesArithmeticExp(CParser.ParenthesesArithmeticExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticAtom}
	 * labeled alternative in {@link CParser#arithmeticexpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticAtom(CParser.ArithmeticAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticAtom}
	 * labeled alternative in {@link CParser#arithmeticexpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticAtom(CParser.ArithmeticAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubExp}
	 * labeled alternative in {@link CParser#arithmeticexpression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExp(CParser.AddSubExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubExp}
	 * labeled alternative in {@link CParser#arithmeticexpression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExp(CParser.AddSubExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityLogicExp}
	 * labeled alternative in {@link CParser#logicalexpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityLogicExp(CParser.EqualityLogicExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityLogicExp}
	 * labeled alternative in {@link CParser#logicalexpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityLogicExp(CParser.EqualityLogicExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicNegation}
	 * labeled alternative in {@link CParser#logicalexpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicNegation(CParser.LogicNegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicNegation}
	 * labeled alternative in {@link CParser#logicalexpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicNegation(CParser.LogicNegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesesLogicExp}
	 * labeled alternative in {@link CParser#logicalexpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesesLogicExp(CParser.ParenthesesLogicExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesesLogicExp}
	 * labeled alternative in {@link CParser#logicalexpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesesLogicExp(CParser.ParenthesesLogicExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalAtom}
	 * labeled alternative in {@link CParser#logicalexpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAtom(CParser.LogicalAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalAtom}
	 * labeled alternative in {@link CParser#logicalexpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAtom(CParser.LogicalAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAndExp}
	 * labeled alternative in {@link CParser#logicalexpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExp(CParser.LogicalAndExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAndExp}
	 * labeled alternative in {@link CParser#logicalexpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExp(CParser.LogicalAndExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalLogicExp}
	 * labeled alternative in {@link CParser#logicalexpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalLogicExp(CParser.RelationalLogicExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalLogicExp}
	 * labeled alternative in {@link CParser#logicalexpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalLogicExp(CParser.RelationalLogicExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOrExp}
	 * labeled alternative in {@link CParser#logicalexpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExp(CParser.LogicalOrExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOrExp}
	 * labeled alternative in {@link CParser#logicalexpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExp(CParser.LogicalOrExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpAtom}
	 * labeled alternative in {@link CParser#stringexpression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpAtom(CParser.StringExpAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpAtom}
	 * labeled alternative in {@link CParser#stringexpression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpAtom(CParser.StringExpAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringConcatExp}
	 * labeled alternative in {@link CParser#stringexpression}.
	 * @param ctx the parse tree
	 */
	void enterStringConcatExp(CParser.StringConcatExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringConcatExp}
	 * labeled alternative in {@link CParser#stringexpression}.
	 * @param ctx the parse tree
	 */
	void exitStringConcatExp(CParser.StringConcatExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierAtom}
	 * labeled alternative in {@link CParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierAtom(CParser.IdentifierAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierAtom}
	 * labeled alternative in {@link CParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierAtom(CParser.IdentifierAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericAtom}
	 * labeled alternative in {@link CParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumericAtom(CParser.NumericAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericAtom}
	 * labeled alternative in {@link CParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumericAtom(CParser.NumericAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link CParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(CParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link CParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(CParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicAtom}
	 * labeled alternative in {@link CParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterLogicAtom(CParser.LogicAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicAtom}
	 * labeled alternative in {@link CParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitLogicAtom(CParser.LogicAtomContext ctx);
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
	 * Enter a parse tree produced by {@link CParser#simplecondition}.
	 * @param ctx the parse tree
	 */
	void enterSimplecondition(CParser.SimpleconditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#simplecondition}.
	 * @param ctx the parse tree
	 */
	void exitSimplecondition(CParser.SimpleconditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#ifelsecondition}.
	 * @param ctx the parse tree
	 */
	void enterIfelsecondition(CParser.IfelseconditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#ifelsecondition}.
	 * @param ctx the parse tree
	 */
	void exitIfelsecondition(CParser.IfelseconditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#assertivebranch}.
	 * @param ctx the parse tree
	 */
	void enterAssertivebranch(CParser.AssertivebranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#assertivebranch}.
	 * @param ctx the parse tree
	 */
	void exitAssertivebranch(CParser.AssertivebranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#negativebranch}.
	 * @param ctx the parse tree
	 */
	void enterNegativebranch(CParser.NegativebranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#negativebranch}.
	 * @param ctx the parse tree
	 */
	void exitNegativebranch(CParser.NegativebranchContext ctx);
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