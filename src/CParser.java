// Generated from C.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRINGVALUE=1, WHITESPACE=2, WRITEINT=3, READINT=4, TYPEQUALIFIER=5, TYPESPECIFIER=6, 
		FUNCTIONRETURNTYPESPECIFIER=7, LOGICALVALUE=8, FORLOOPKEYWORD=9, WHILELOOPKEYWORD=10, 
		DOWHILEKEYWORD=11, CONDITIONKEYWORD=12, CONDITIONELSEKEYWORD=13, SWITCHKEYWORD=14, 
		SWITCHCASEKEYWORD=15, BREAKKEYWORD=16, DEFAULTKEYWORD=17, SEMICOLON=18, 
		COLON=19, STRINGCONCATENATION=20, MULTIPLICATIONDIVISIONOPERATOR=21, ADDITIONSUBTRACTIONOPERATOR=22, 
		RELATIONALOPERATOR=23, EQUALITYOPERATOR=24, ASSIGNMENTOPERATOR=25, LOGICALOR=26, 
		LOGICALAND=27, LOGICALNEGATION=28, QUESTIONMARK=29, IDENTIFIER=30, NUMERICALVALUE=31, 
		LEFTPARENTHESE=32, RIGHTPARENTHESE=33, LEFTBRACE=34, RIGHTBRACE=35, COMMA=36;
	public static final int
		RULE_start = 0, RULE_startsymbol = 1, RULE_declarations = 2, RULE_statement = 3, 
		RULE_variabledeclaration = 4, RULE_constantdeclaration = 5, RULE_assignment = 6, 
		RULE_parallelassignment = 7, RULE_identifierlist = 8, RULE_valuelist = 9, 
		RULE_expression = 10, RULE_ternaryoperator = 11, RULE_ternaryassertive = 12, 
		RULE_ternarynegative = 13, RULE_arithmeticexpression = 14, RULE_logicalexpression = 15, 
		RULE_stringexpression = 16, RULE_atom = 17, RULE_functiondeclaration = 18, 
		RULE_functionargumentlist = 19, RULE_functioncall = 20, RULE_functioncallarguments = 21, 
		RULE_forloop = 22, RULE_forinitialization = 23, RULE_forafterthought = 24, 
		RULE_whileloop = 25, RULE_whilestatement = 26, RULE_dowhileloop = 27, 
		RULE_condition = 28, RULE_simplecondition = 29, RULE_ifelsecondition = 30, 
		RULE_assertivebranch = 31, RULE_negativebranch = 32, RULE_switchcondition = 33, 
		RULE_switchcase = 34, RULE_switchstatement = 35, RULE_switchdefaultstatement = 36, 
		RULE_inputinteger = 37, RULE_outputinteger = 38;
	public static final String[] ruleNames = {
		"start", "startsymbol", "declarations", "statement", "variabledeclaration", 
		"constantdeclaration", "assignment", "parallelassignment", "identifierlist", 
		"valuelist", "expression", "ternaryoperator", "ternaryassertive", "ternarynegative", 
		"arithmeticexpression", "logicalexpression", "stringexpression", "atom", 
		"functiondeclaration", "functionargumentlist", "functioncall", "functioncallarguments", 
		"forloop", "forinitialization", "forafterthought", "whileloop", "whilestatement", 
		"dowhileloop", "condition", "simplecondition", "ifelsecondition", "assertivebranch", 
		"negativebranch", "switchcondition", "switchcase", "switchstatement", 
		"switchdefaultstatement", "inputinteger", "outputinteger"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'writeInt'", "'readInt'", "'const'", null, "'void'", 
		null, "'for'", "'while'", "'do'", "'if'", "'else'", "'switch'", "'case'", 
		"'break'", "'default'", "';'", "':'", "'.'", null, null, null, null, "'='", 
		"'||'", "'&&'", "'!'", "'?'", null, null, "'('", "')'", "'{'", "'}'", 
		"','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "STRINGVALUE", "WHITESPACE", "WRITEINT", "READINT", "TYPEQUALIFIER", 
		"TYPESPECIFIER", "FUNCTIONRETURNTYPESPECIFIER", "LOGICALVALUE", "FORLOOPKEYWORD", 
		"WHILELOOPKEYWORD", "DOWHILEKEYWORD", "CONDITIONKEYWORD", "CONDITIONELSEKEYWORD", 
		"SWITCHKEYWORD", "SWITCHCASEKEYWORD", "BREAKKEYWORD", "DEFAULTKEYWORD", 
		"SEMICOLON", "COLON", "STRINGCONCATENATION", "MULTIPLICATIONDIVISIONOPERATOR", 
		"ADDITIONSUBTRACTIONOPERATOR", "RELATIONALOPERATOR", "EQUALITYOPERATOR", 
		"ASSIGNMENTOPERATOR", "LOGICALOR", "LOGICALAND", "LOGICALNEGATION", "QUESTIONMARK", 
		"IDENTIFIER", "NUMERICALVALUE", "LEFTPARENTHESE", "RIGHTPARENTHESE", "LEFTBRACE", 
		"RIGHTBRACE", "COMMA"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "C.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public StartsymbolContext startsymbol() {
			return getRuleContext(StartsymbolContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			startsymbol();
			setState(79);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartsymbolContext extends ParserRuleContext {
		public List<DeclarationsContext> declarations() {
			return getRuleContexts(DeclarationsContext.class);
		}
		public DeclarationsContext declarations(int i) {
			return getRuleContext(DeclarationsContext.class,i);
		}
		public List<FunctiondeclarationContext> functiondeclaration() {
			return getRuleContexts(FunctiondeclarationContext.class);
		}
		public FunctiondeclarationContext functiondeclaration(int i) {
			return getRuleContext(FunctiondeclarationContext.class,i);
		}
		public StartsymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startsymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStartsymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStartsymbol(this);
		}
	}

	public final StartsymbolContext startsymbol() throws RecognitionException {
		StartsymbolContext _localctx = new StartsymbolContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_startsymbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPEQUALIFIER || _la==TYPESPECIFIER) {
				{
				{
				setState(81);
				declarations();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(87);
				functiondeclaration();
				}
				}
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNCTIONRETURNTYPESPECIFIER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public VariabledeclarationContext variabledeclaration() {
			return getRuleContext(VariabledeclarationContext.class,0);
		}
		public ConstantdeclarationContext constantdeclaration() {
			return getRuleContext(ConstantdeclarationContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDeclarations(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declarations);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPESPECIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				variabledeclaration();
				}
				break;
			case TYPEQUALIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				constantdeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public VariabledeclarationContext variabledeclaration() {
			return getRuleContext(VariabledeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ConstantdeclarationContext constantdeclaration() {
			return getRuleContext(ConstantdeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ForloopContext forloop() {
			return getRuleContext(ForloopContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public SwitchconditionContext switchcondition() {
			return getRuleContext(SwitchconditionContext.class,0);
		}
		public WhileloopContext whileloop() {
			return getRuleContext(WhileloopContext.class,0);
		}
		public DowhileloopContext dowhileloop() {
			return getRuleContext(DowhileloopContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public ParallelassignmentContext parallelassignment() {
			return getRuleContext(ParallelassignmentContext.class,0);
		}
		public OutputintegerContext outputinteger() {
			return getRuleContext(OutputintegerContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				variabledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				variabledeclaration();
				setState(98);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				constantdeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				constantdeclaration();
				setState(102);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				assignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(105);
				assignment();
				setState(106);
				statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(108);
				forloop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(109);
				forloop();
				setState(110);
				statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(112);
				condition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(113);
				condition();
				setState(114);
				statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(116);
				switchcondition();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(117);
				switchcondition();
				setState(118);
				statement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(120);
				whileloop();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(121);
				whileloop();
				setState(122);
				statement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(124);
				dowhileloop();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(125);
				dowhileloop();
				setState(126);
				statement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(128);
				functioncall();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(129);
				functioncall();
				setState(130);
				statement();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(132);
				parallelassignment();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(133);
				parallelassignment();
				setState(134);
				statement();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(136);
				outputinteger();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(137);
				outputinteger();
				setState(138);
				statement();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariabledeclarationContext extends ParserRuleContext {
		public VariabledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabledeclaration; }
	 
		public VariabledeclarationContext() { }
		public void copyFrom(VariabledeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarationAndInitializationContext extends VariabledeclarationContext {
		public TerminalNode TYPESPECIFIER() { return getToken(CParser.TYPESPECIFIER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENTOPERATOR() { return getToken(CParser.ASSIGNMENTOPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CParser.SEMICOLON, 0); }
		public DeclarationAndInitializationContext(VariabledeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDeclarationAndInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDeclarationAndInitialization(this);
		}
	}
	public static class DeclarationOnlyContext extends VariabledeclarationContext {
		public TerminalNode TYPESPECIFIER() { return getToken(CParser.TYPESPECIFIER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(CParser.SEMICOLON, 0); }
		public DeclarationOnlyContext(VariabledeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDeclarationOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDeclarationOnly(this);
		}
	}

	public final VariabledeclarationContext variabledeclaration() throws RecognitionException {
		VariabledeclarationContext _localctx = new VariabledeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variabledeclaration);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new DeclarationAndInitializationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(TYPESPECIFIER);
				setState(144);
				match(IDENTIFIER);
				setState(145);
				match(ASSIGNMENTOPERATOR);
				setState(146);
				expression();
				setState(147);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new DeclarationOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(TYPESPECIFIER);
				setState(150);
				match(IDENTIFIER);
				setState(151);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantdeclarationContext extends ParserRuleContext {
		public TerminalNode TYPEQUALIFIER() { return getToken(CParser.TYPEQUALIFIER, 0); }
		public TerminalNode TYPESPECIFIER() { return getToken(CParser.TYPESPECIFIER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENTOPERATOR() { return getToken(CParser.ASSIGNMENTOPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CParser.SEMICOLON, 0); }
		public ConstantdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterConstantdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitConstantdeclaration(this);
		}
	}

	public final ConstantdeclarationContext constantdeclaration() throws RecognitionException {
		ConstantdeclarationContext _localctx = new ConstantdeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constantdeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(TYPEQUALIFIER);
			setState(155);
			match(TYPESPECIFIER);
			setState(156);
			match(IDENTIFIER);
			setState(157);
			match(ASSIGNMENTOPERATOR);
			setState(158);
			expression();
			setState(159);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleAssignmentContext extends AssignmentContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CParser.SEMICOLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(CParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CParser.IDENTIFIER, i);
		}
		public List<TerminalNode> ASSIGNMENTOPERATOR() { return getTokens(CParser.ASSIGNMENTOPERATOR); }
		public TerminalNode ASSIGNMENTOPERATOR(int i) {
			return getToken(CParser.ASSIGNMENTOPERATOR, i);
		}
		public MultipleAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterMultipleAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitMultipleAssignment(this);
		}
	}
	public static class TernaryOperatorAssignmentContext extends AssignmentContext {
		public TerminalNode IDENTIFIER() { return getToken(CParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENTOPERATOR() { return getToken(CParser.ASSIGNMENTOPERATOR, 0); }
		public LogicalexpressionContext logicalexpression() {
			return getRuleContext(LogicalexpressionContext.class,0);
		}
		public TernaryoperatorContext ternaryoperator() {
			return getRuleContext(TernaryoperatorContext.class,0);
		}
		public TernaryOperatorAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterTernaryOperatorAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitTernaryOperatorAssignment(this);
		}
	}
	public static class StandardAssignmentContext extends AssignmentContext {
		public TerminalNode IDENTIFIER() { return getToken(CParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENTOPERATOR() { return getToken(CParser.ASSIGNMENTOPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CParser.SEMICOLON, 0); }
		public StandardAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStandardAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStandardAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			int _alt;
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new StandardAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(IDENTIFIER);
				setState(162);
				match(ASSIGNMENTOPERATOR);
				setState(163);
				expression();
				setState(164);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new MultipleAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(168); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(166);
						match(IDENTIFIER);
						setState(167);
						match(ASSIGNMENTOPERATOR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(170); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(172);
				expression();
				setState(173);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new TernaryOperatorAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(IDENTIFIER);
				setState(176);
				match(ASSIGNMENTOPERATOR);
				setState(177);
				logicalexpression(0);
				setState(178);
				ternaryoperator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParallelassignmentContext extends ParserRuleContext {
		public List<TerminalNode> LEFTBRACE() { return getTokens(CParser.LEFTBRACE); }
		public TerminalNode LEFTBRACE(int i) {
			return getToken(CParser.LEFTBRACE, i);
		}
		public IdentifierlistContext identifierlist() {
			return getRuleContext(IdentifierlistContext.class,0);
		}
		public List<TerminalNode> RIGHTBRACE() { return getTokens(CParser.RIGHTBRACE); }
		public TerminalNode RIGHTBRACE(int i) {
			return getToken(CParser.RIGHTBRACE, i);
		}
		public TerminalNode ASSIGNMENTOPERATOR() { return getToken(CParser.ASSIGNMENTOPERATOR, 0); }
		public ValuelistContext valuelist() {
			return getRuleContext(ValuelistContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CParser.SEMICOLON, 0); }
		public ParallelassignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parallelassignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterParallelassignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitParallelassignment(this);
		}
	}

	public final ParallelassignmentContext parallelassignment() throws RecognitionException {
		ParallelassignmentContext _localctx = new ParallelassignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parallelassignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(LEFTBRACE);
			setState(183);
			identifierlist();
			setState(184);
			match(RIGHTBRACE);
			setState(185);
			match(ASSIGNMENTOPERATOR);
			setState(186);
			match(LEFTBRACE);
			setState(187);
			valuelist();
			setState(188);
			match(RIGHTBRACE);
			setState(189);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierlistContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(CParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CParser.COMMA, i);
		}
		public IdentifierlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterIdentifierlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitIdentifierlist(this);
		}
	}

	public final IdentifierlistContext identifierlist() throws RecognitionException {
		IdentifierlistContext _localctx = new IdentifierlistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_identifierlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(IDENTIFIER);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(192);
				match(COMMA);
				setState(193);
				match(IDENTIFIER);
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValuelistContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CParser.COMMA, i);
		}
		public ValuelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterValuelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitValuelist(this);
		}
	}

	public final ValuelistContext valuelist() throws RecognitionException {
		ValuelistContext _localctx = new ValuelistContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_valuelist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			expression();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(200);
				match(COMMA);
				setState(201);
				expression();
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ArithmeticexpressionContext arithmeticexpression() {
			return getRuleContext(ArithmeticexpressionContext.class,0);
		}
		public LogicalexpressionContext logicalexpression() {
			return getRuleContext(LogicalexpressionContext.class,0);
		}
		public StringexpressionContext stringexpression() {
			return getRuleContext(StringexpressionContext.class,0);
		}
		public TernaryoperatorContext ternaryoperator() {
			return getRuleContext(TernaryoperatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				arithmeticexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				logicalexpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				stringexpression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				ternaryoperator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TernaryoperatorContext extends ParserRuleContext {
		public TerminalNode QUESTIONMARK() { return getToken(CParser.QUESTIONMARK, 0); }
		public TernaryassertiveContext ternaryassertive() {
			return getRuleContext(TernaryassertiveContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CParser.COLON, 0); }
		public TernarynegativeContext ternarynegative() {
			return getRuleContext(TernarynegativeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CParser.SEMICOLON, 0); }
		public TernaryoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterTernaryoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitTernaryoperator(this);
		}
	}

	public final TernaryoperatorContext ternaryoperator() throws RecognitionException {
		TernaryoperatorContext _localctx = new TernaryoperatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ternaryoperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(QUESTIONMARK);
			setState(214);
			ternaryassertive();
			setState(215);
			match(COLON);
			setState(216);
			ternarynegative();
			setState(217);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TernaryassertiveContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TernaryassertiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryassertive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterTernaryassertive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitTernaryassertive(this);
		}
	}

	public final TernaryassertiveContext ternaryassertive() throws RecognitionException {
		TernaryassertiveContext _localctx = new TernaryassertiveContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ternaryassertive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TernarynegativeContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TernarynegativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternarynegative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterTernarynegative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitTernarynegative(this);
		}
	}

	public final TernarynegativeContext ternarynegative() throws RecognitionException {
		TernarynegativeContext _localctx = new TernarynegativeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ternarynegative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticexpressionContext extends ParserRuleContext {
		public ArithmeticexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticexpression; }
	 
		public ArithmeticexpressionContext() { }
		public void copyFrom(ArithmeticexpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MulDivExpContext extends ArithmeticexpressionContext {
		public List<ArithmeticexpressionContext> arithmeticexpression() {
			return getRuleContexts(ArithmeticexpressionContext.class);
		}
		public ArithmeticexpressionContext arithmeticexpression(int i) {
			return getRuleContext(ArithmeticexpressionContext.class,i);
		}
		public TerminalNode MULTIPLICATIONDIVISIONOPERATOR() { return getToken(CParser.MULTIPLICATIONDIVISIONOPERATOR, 0); }
		public MulDivExpContext(ArithmeticexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterMulDivExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitMulDivExp(this);
		}
	}
	public static class ParenthesesArithmeticExpContext extends ArithmeticexpressionContext {
		public TerminalNode LEFTPARENTHESE() { return getToken(CParser.LEFTPARENTHESE, 0); }
		public ArithmeticexpressionContext arithmeticexpression() {
			return getRuleContext(ArithmeticexpressionContext.class,0);
		}
		public TerminalNode RIGHTPARENTHESE() { return getToken(CParser.RIGHTPARENTHESE, 0); }
		public ParenthesesArithmeticExpContext(ArithmeticexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterParenthesesArithmeticExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitParenthesesArithmeticExp(this);
		}
	}
	public static class ArithmeticAtomContext extends ArithmeticexpressionContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ArithmeticAtomContext(ArithmeticexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterArithmeticAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitArithmeticAtom(this);
		}
	}
	public static class AddSubExpContext extends ArithmeticexpressionContext {
		public List<ArithmeticexpressionContext> arithmeticexpression() {
			return getRuleContexts(ArithmeticexpressionContext.class);
		}
		public ArithmeticexpressionContext arithmeticexpression(int i) {
			return getRuleContext(ArithmeticexpressionContext.class,i);
		}
		public TerminalNode ADDITIONSUBTRACTIONOPERATOR() { return getToken(CParser.ADDITIONSUBTRACTIONOPERATOR, 0); }
		public AddSubExpContext(ArithmeticexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAddSubExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAddSubExp(this);
		}
	}

	public final ArithmeticexpressionContext arithmeticexpression() throws RecognitionException {
		return arithmeticexpression(0);
	}

	private ArithmeticexpressionContext arithmeticexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticexpressionContext _localctx = new ArithmeticexpressionContext(_ctx, _parentState);
		ArithmeticexpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_arithmeticexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFTPARENTHESE:
				{
				_localctx = new ParenthesesArithmeticExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(224);
				match(LEFTPARENTHESE);
				setState(225);
				arithmeticexpression(0);
				setState(226);
				match(RIGHTPARENTHESE);
				}
				break;
			case STRINGVALUE:
			case READINT:
			case LOGICALVALUE:
			case IDENTIFIER:
			case NUMERICALVALUE:
				{
				_localctx = new ArithmeticAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(228);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(237);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExpContext(new ArithmeticexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticexpression);
						setState(231);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(232);
						match(MULTIPLICATIONDIVISIONOPERATOR);
						setState(233);
						arithmeticexpression(4);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpContext(new ArithmeticexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticexpression);
						setState(234);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(235);
						match(ADDITIONSUBTRACTIONOPERATOR);
						setState(236);
						arithmeticexpression(3);
						}
						break;
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalexpressionContext extends ParserRuleContext {
		public LogicalexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalexpression; }
	 
		public LogicalexpressionContext() { }
		public void copyFrom(LogicalexpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualityLogicExpContext extends LogicalexpressionContext {
		public List<LogicalexpressionContext> logicalexpression() {
			return getRuleContexts(LogicalexpressionContext.class);
		}
		public LogicalexpressionContext logicalexpression(int i) {
			return getRuleContext(LogicalexpressionContext.class,i);
		}
		public TerminalNode EQUALITYOPERATOR() { return getToken(CParser.EQUALITYOPERATOR, 0); }
		public EqualityLogicExpContext(LogicalexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterEqualityLogicExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitEqualityLogicExp(this);
		}
	}
	public static class LogicNegationContext extends LogicalexpressionContext {
		public TerminalNode LOGICALNEGATION() { return getToken(CParser.LOGICALNEGATION, 0); }
		public LogicalexpressionContext logicalexpression() {
			return getRuleContext(LogicalexpressionContext.class,0);
		}
		public LogicNegationContext(LogicalexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterLogicNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitLogicNegation(this);
		}
	}
	public static class ParenthesesLogicExpContext extends LogicalexpressionContext {
		public TerminalNode LEFTPARENTHESE() { return getToken(CParser.LEFTPARENTHESE, 0); }
		public LogicalexpressionContext logicalexpression() {
			return getRuleContext(LogicalexpressionContext.class,0);
		}
		public TerminalNode RIGHTPARENTHESE() { return getToken(CParser.RIGHTPARENTHESE, 0); }
		public ParenthesesLogicExpContext(LogicalexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterParenthesesLogicExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitParenthesesLogicExp(this);
		}
	}
	public static class LogicalAtomContext extends LogicalexpressionContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public LogicalAtomContext(LogicalexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterLogicalAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitLogicalAtom(this);
		}
	}
	public static class LogicalAndExpContext extends LogicalexpressionContext {
		public List<LogicalexpressionContext> logicalexpression() {
			return getRuleContexts(LogicalexpressionContext.class);
		}
		public LogicalexpressionContext logicalexpression(int i) {
			return getRuleContext(LogicalexpressionContext.class,i);
		}
		public TerminalNode LOGICALAND() { return getToken(CParser.LOGICALAND, 0); }
		public LogicalAndExpContext(LogicalexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterLogicalAndExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitLogicalAndExp(this);
		}
	}
	public static class RelationalLogicExpContext extends LogicalexpressionContext {
		public List<LogicalexpressionContext> logicalexpression() {
			return getRuleContexts(LogicalexpressionContext.class);
		}
		public LogicalexpressionContext logicalexpression(int i) {
			return getRuleContext(LogicalexpressionContext.class,i);
		}
		public TerminalNode RELATIONALOPERATOR() { return getToken(CParser.RELATIONALOPERATOR, 0); }
		public RelationalLogicExpContext(LogicalexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterRelationalLogicExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitRelationalLogicExp(this);
		}
	}
	public static class LogicalOrExpContext extends LogicalexpressionContext {
		public List<LogicalexpressionContext> logicalexpression() {
			return getRuleContexts(LogicalexpressionContext.class);
		}
		public LogicalexpressionContext logicalexpression(int i) {
			return getRuleContext(LogicalexpressionContext.class,i);
		}
		public TerminalNode LOGICALOR() { return getToken(CParser.LOGICALOR, 0); }
		public LogicalOrExpContext(LogicalexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterLogicalOrExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitLogicalOrExp(this);
		}
	}

	public final LogicalexpressionContext logicalexpression() throws RecognitionException {
		return logicalexpression(0);
	}

	private LogicalexpressionContext logicalexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalexpressionContext _localctx = new LogicalexpressionContext(_ctx, _parentState);
		LogicalexpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_logicalexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFTPARENTHESE:
				{
				_localctx = new ParenthesesLogicExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(243);
				match(LEFTPARENTHESE);
				setState(244);
				logicalexpression(0);
				setState(245);
				match(RIGHTPARENTHESE);
				}
				break;
			case LOGICALNEGATION:
				{
				_localctx = new LogicNegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(247);
				match(LOGICALNEGATION);
				setState(248);
				logicalexpression(6);
				}
				break;
			case STRINGVALUE:
			case READINT:
			case LOGICALVALUE:
			case IDENTIFIER:
			case NUMERICALVALUE:
				{
				_localctx = new LogicalAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(249);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(264);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalLogicExpContext(new LogicalexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalexpression);
						setState(252);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(253);
						match(RELATIONALOPERATOR);
						setState(254);
						logicalexpression(6);
						}
						break;
					case 2:
						{
						_localctx = new EqualityLogicExpContext(new LogicalexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalexpression);
						setState(255);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(256);
						match(EQUALITYOPERATOR);
						setState(257);
						logicalexpression(5);
						}
						break;
					case 3:
						{
						_localctx = new LogicalAndExpContext(new LogicalexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalexpression);
						setState(258);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(259);
						match(LOGICALAND);
						setState(260);
						logicalexpression(4);
						}
						break;
					case 4:
						{
						_localctx = new LogicalOrExpContext(new LogicalexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalexpression);
						setState(261);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(262);
						match(LOGICALOR);
						setState(263);
						logicalexpression(3);
						}
						break;
					}
					} 
				}
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StringexpressionContext extends ParserRuleContext {
		public StringexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringexpression; }
	 
		public StringexpressionContext() { }
		public void copyFrom(StringexpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringExpAtomContext extends StringexpressionContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public StringExpAtomContext(StringexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStringExpAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStringExpAtom(this);
		}
	}
	public static class StringConcatExpContext extends StringexpressionContext {
		public List<StringexpressionContext> stringexpression() {
			return getRuleContexts(StringexpressionContext.class);
		}
		public StringexpressionContext stringexpression(int i) {
			return getRuleContext(StringexpressionContext.class,i);
		}
		public TerminalNode STRINGCONCATENATION() { return getToken(CParser.STRINGCONCATENATION, 0); }
		public StringConcatExpContext(StringexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStringConcatExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStringConcatExp(this);
		}
	}

	public final StringexpressionContext stringexpression() throws RecognitionException {
		return stringexpression(0);
	}

	private StringexpressionContext stringexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StringexpressionContext _localctx = new StringexpressionContext(_ctx, _parentState);
		StringexpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_stringexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new StringExpAtomContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(270);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StringConcatExpContext(new StringexpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_stringexpression);
					setState(272);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(273);
					match(STRINGCONCATENATION);
					setState(274);
					stringexpression(3);
					}
					} 
				}
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentifierAtomContext extends AtomContext {
		public TerminalNode IDENTIFIER() { return getToken(CParser.IDENTIFIER, 0); }
		public IdentifierAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterIdentifierAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitIdentifierAtom(this);
		}
	}
	public static class StringAtomContext extends AtomContext {
		public TerminalNode STRINGVALUE() { return getToken(CParser.STRINGVALUE, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStringAtom(this);
		}
	}
	public static class NumericAtomContext extends AtomContext {
		public TerminalNode NUMERICALVALUE() { return getToken(CParser.NUMERICALVALUE, 0); }
		public NumericAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterNumericAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitNumericAtom(this);
		}
	}
	public static class LogicAtomContext extends AtomContext {
		public TerminalNode LOGICALVALUE() { return getToken(CParser.LOGICALVALUE, 0); }
		public LogicAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterLogicAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitLogicAtom(this);
		}
	}
	public static class IntegerIOContext extends AtomContext {
		public InputintegerContext inputinteger() {
			return getRuleContext(InputintegerContext.class,0);
		}
		public IntegerIOContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterIntegerIO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitIntegerIO(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_atom);
		try {
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READINT:
				_localctx = new IntegerIOContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				inputinteger();
				}
				break;
			case IDENTIFIER:
				_localctx = new IdentifierAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(IDENTIFIER);
				}
				break;
			case NUMERICALVALUE:
				_localctx = new NumericAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
				match(NUMERICALVALUE);
				}
				break;
			case STRINGVALUE:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(283);
				match(STRINGVALUE);
				}
				break;
			case LOGICALVALUE:
				_localctx = new LogicAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(284);
				match(LOGICALVALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctiondeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTIONRETURNTYPESPECIFIER() { return getToken(CParser.FUNCTIONRETURNTYPESPECIFIER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CParser.IDENTIFIER, 0); }
		public TerminalNode LEFTPARENTHESE() { return getToken(CParser.LEFTPARENTHESE, 0); }
		public FunctionargumentlistContext functionargumentlist() {
			return getRuleContext(FunctionargumentlistContext.class,0);
		}
		public TerminalNode RIGHTPARENTHESE() { return getToken(CParser.RIGHTPARENTHESE, 0); }
		public TerminalNode LEFTBRACE() { return getToken(CParser.LEFTBRACE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RIGHTBRACE() { return getToken(CParser.RIGHTBRACE, 0); }
		public FunctiondeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterFunctiondeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitFunctiondeclaration(this);
		}
	}

	public final FunctiondeclarationContext functiondeclaration() throws RecognitionException {
		FunctiondeclarationContext _localctx = new FunctiondeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_functiondeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(FUNCTIONRETURNTYPESPECIFIER);
			setState(288);
			match(IDENTIFIER);
			setState(289);
			match(LEFTPARENTHESE);
			setState(290);
			functionargumentlist();
			setState(291);
			match(RIGHTPARENTHESE);
			setState(292);
			match(LEFTBRACE);
			setState(293);
			statement();
			setState(294);
			match(RIGHTBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionargumentlistContext extends ParserRuleContext {
		public TerminalNode TYPESPECIFIER() { return getToken(CParser.TYPESPECIFIER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CParser.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(CParser.COMMA, 0); }
		public FunctionargumentlistContext functionargumentlist() {
			return getRuleContext(FunctionargumentlistContext.class,0);
		}
		public FunctionargumentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionargumentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterFunctionargumentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitFunctionargumentlist(this);
		}
	}

	public final FunctionargumentlistContext functionargumentlist() throws RecognitionException {
		FunctionargumentlistContext _localctx = new FunctionargumentlistContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionargumentlist);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(TYPESPECIFIER);
				setState(297);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				match(TYPESPECIFIER);
				setState(299);
				match(IDENTIFIER);
				setState(300);
				match(COMMA);
				setState(301);
				functionargumentlist();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctioncallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CParser.IDENTIFIER, 0); }
		public TerminalNode LEFTPARENTHESE() { return getToken(CParser.LEFTPARENTHESE, 0); }
		public FunctioncallargumentsContext functioncallarguments() {
			return getRuleContext(FunctioncallargumentsContext.class,0);
		}
		public TerminalNode RIGHTPARENTHESE() { return getToken(CParser.RIGHTPARENTHESE, 0); }
		public TerminalNode SEMICOLON() { return getToken(CParser.SEMICOLON, 0); }
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterFunctioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitFunctioncall(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functioncall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(IDENTIFIER);
			setState(306);
			match(LEFTPARENTHESE);
			setState(307);
			functioncallarguments();
			setState(308);
			match(RIGHTPARENTHESE);
			setState(309);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctioncallargumentsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(CParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CParser.COMMA, i);
		}
		public List<FunctioncallargumentsContext> functioncallarguments() {
			return getRuleContexts(FunctioncallargumentsContext.class);
		}
		public FunctioncallargumentsContext functioncallarguments(int i) {
			return getRuleContext(FunctioncallargumentsContext.class,i);
		}
		public FunctioncallargumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncallarguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterFunctioncallarguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitFunctioncallarguments(this);
		}
	}

	public final FunctioncallargumentsContext functioncallarguments() throws RecognitionException {
		FunctioncallargumentsContext _localctx = new FunctioncallargumentsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functioncallarguments);
		try {
			int _alt;
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGVALUE:
			case READINT:
			case LOGICALVALUE:
			case LOGICALNEGATION:
			case QUESTIONMARK:
			case IDENTIFIER:
			case NUMERICALVALUE:
			case LEFTPARENTHESE:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				expression();
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(312);
						match(COMMA);
						setState(313);
						functioncallarguments();
						}
						} 
					}
					setState(318);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			case RIGHTPARENTHESE:
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForloopContext extends ParserRuleContext {
		public TerminalNode FORLOOPKEYWORD() { return getToken(CParser.FORLOOPKEYWORD, 0); }
		public TerminalNode LEFTPARENTHESE() { return getToken(CParser.LEFTPARENTHESE, 0); }
		public ForinitializationContext forinitialization() {
			return getRuleContext(ForinitializationContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CParser.SEMICOLON, i);
		}
		public LogicalexpressionContext logicalexpression() {
			return getRuleContext(LogicalexpressionContext.class,0);
		}
		public ForafterthoughtContext forafterthought() {
			return getRuleContext(ForafterthoughtContext.class,0);
		}
		public TerminalNode RIGHTPARENTHESE() { return getToken(CParser.RIGHTPARENTHESE, 0); }
		public TerminalNode LEFTBRACE() { return getToken(CParser.LEFTBRACE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RIGHTBRACE() { return getToken(CParser.RIGHTBRACE, 0); }
		public ForloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterForloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitForloop(this);
		}
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(FORLOOPKEYWORD);
			setState(323);
			match(LEFTPARENTHESE);
			setState(324);
			forinitialization();
			setState(325);
			match(SEMICOLON);
			setState(326);
			logicalexpression(0);
			setState(327);
			match(SEMICOLON);
			setState(328);
			forafterthought();
			setState(329);
			match(RIGHTPARENTHESE);
			setState(330);
			match(LEFTBRACE);
			setState(331);
			statement();
			setState(332);
			match(RIGHTBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForinitializationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENTOPERATOR() { return getToken(CParser.ASSIGNMENTOPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForinitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forinitialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterForinitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitForinitialization(this);
		}
	}

	public final ForinitializationContext forinitialization() throws RecognitionException {
		ForinitializationContext _localctx = new ForinitializationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_forinitialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(IDENTIFIER);
			setState(335);
			match(ASSIGNMENTOPERATOR);
			setState(336);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForafterthoughtContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENTOPERATOR() { return getToken(CParser.ASSIGNMENTOPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForafterthoughtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forafterthought; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterForafterthought(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitForafterthought(this);
		}
	}

	public final ForafterthoughtContext forafterthought() throws RecognitionException {
		ForafterthoughtContext _localctx = new ForafterthoughtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_forafterthought);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(IDENTIFIER);
			setState(339);
			match(ASSIGNMENTOPERATOR);
			setState(340);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileloopContext extends ParserRuleContext {
		public TerminalNode WHILELOOPKEYWORD() { return getToken(CParser.WHILELOOPKEYWORD, 0); }
		public TerminalNode LEFTPARENTHESE() { return getToken(CParser.LEFTPARENTHESE, 0); }
		public LogicalexpressionContext logicalexpression() {
			return getRuleContext(LogicalexpressionContext.class,0);
		}
		public TerminalNode RIGHTPARENTHESE() { return getToken(CParser.RIGHTPARENTHESE, 0); }
		public WhilestatementContext whilestatement() {
			return getRuleContext(WhilestatementContext.class,0);
		}
		public WhileloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterWhileloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitWhileloop(this);
		}
	}

	public final WhileloopContext whileloop() throws RecognitionException {
		WhileloopContext _localctx = new WhileloopContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_whileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(WHILELOOPKEYWORD);
			setState(343);
			match(LEFTPARENTHESE);
			setState(344);
			logicalexpression(0);
			setState(345);
			match(RIGHTPARENTHESE);
			setState(346);
			whilestatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhilestatementContext extends ParserRuleContext {
		public TerminalNode LEFTBRACE() { return getToken(CParser.LEFTBRACE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RIGHTBRACE() { return getToken(CParser.RIGHTBRACE, 0); }
		public WhilestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterWhilestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitWhilestatement(this);
		}
	}

	public final WhilestatementContext whilestatement() throws RecognitionException {
		WhilestatementContext _localctx = new WhilestatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_whilestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(LEFTBRACE);
			setState(349);
			statement();
			setState(350);
			match(RIGHTBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DowhileloopContext extends ParserRuleContext {
		public TerminalNode DOWHILEKEYWORD() { return getToken(CParser.DOWHILEKEYWORD, 0); }
		public TerminalNode LEFTBRACE() { return getToken(CParser.LEFTBRACE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RIGHTBRACE() { return getToken(CParser.RIGHTBRACE, 0); }
		public TerminalNode WHILELOOPKEYWORD() { return getToken(CParser.WHILELOOPKEYWORD, 0); }
		public TerminalNode LEFTPARENTHESE() { return getToken(CParser.LEFTPARENTHESE, 0); }
		public LogicalexpressionContext logicalexpression() {
			return getRuleContext(LogicalexpressionContext.class,0);
		}
		public TerminalNode RIGHTPARENTHESE() { return getToken(CParser.RIGHTPARENTHESE, 0); }
		public TerminalNode SEMICOLON() { return getToken(CParser.SEMICOLON, 0); }
		public DowhileloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhileloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDowhileloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDowhileloop(this);
		}
	}

	public final DowhileloopContext dowhileloop() throws RecognitionException {
		DowhileloopContext _localctx = new DowhileloopContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_dowhileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(DOWHILEKEYWORD);
			setState(353);
			match(LEFTBRACE);
			setState(354);
			statement();
			setState(355);
			match(RIGHTBRACE);
			setState(356);
			match(WHILELOOPKEYWORD);
			setState(357);
			match(LEFTPARENTHESE);
			setState(358);
			logicalexpression(0);
			setState(359);
			match(RIGHTPARENTHESE);
			setState(360);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode CONDITIONKEYWORD() { return getToken(CParser.CONDITIONKEYWORD, 0); }
		public TerminalNode LEFTPARENTHESE() { return getToken(CParser.LEFTPARENTHESE, 0); }
		public LogicalexpressionContext logicalexpression() {
			return getRuleContext(LogicalexpressionContext.class,0);
		}
		public TerminalNode RIGHTPARENTHESE() { return getToken(CParser.RIGHTPARENTHESE, 0); }
		public SimpleconditionContext simplecondition() {
			return getRuleContext(SimpleconditionContext.class,0);
		}
		public IfelseconditionContext ifelsecondition() {
			return getRuleContext(IfelseconditionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_condition);
		try {
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				match(CONDITIONKEYWORD);
				setState(363);
				match(LEFTPARENTHESE);
				setState(364);
				logicalexpression(0);
				setState(365);
				match(RIGHTPARENTHESE);
				setState(366);
				simplecondition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				match(CONDITIONKEYWORD);
				setState(369);
				match(LEFTPARENTHESE);
				setState(370);
				logicalexpression(0);
				setState(371);
				match(RIGHTPARENTHESE);
				setState(372);
				ifelsecondition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleconditionContext extends ParserRuleContext {
		public TerminalNode LEFTBRACE() { return getToken(CParser.LEFTBRACE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RIGHTBRACE() { return getToken(CParser.RIGHTBRACE, 0); }
		public SimpleconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplecondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterSimplecondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitSimplecondition(this);
		}
	}

	public final SimpleconditionContext simplecondition() throws RecognitionException {
		SimpleconditionContext _localctx = new SimpleconditionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_simplecondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(LEFTBRACE);
			setState(377);
			statement();
			setState(378);
			match(RIGHTBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfelseconditionContext extends ParserRuleContext {
		public AssertivebranchContext assertivebranch() {
			return getRuleContext(AssertivebranchContext.class,0);
		}
		public TerminalNode CONDITIONELSEKEYWORD() { return getToken(CParser.CONDITIONELSEKEYWORD, 0); }
		public NegativebranchContext negativebranch() {
			return getRuleContext(NegativebranchContext.class,0);
		}
		public IfelseconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelsecondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterIfelsecondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitIfelsecondition(this);
		}
	}

	public final IfelseconditionContext ifelsecondition() throws RecognitionException {
		IfelseconditionContext _localctx = new IfelseconditionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ifelsecondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			assertivebranch();
			setState(381);
			match(CONDITIONELSEKEYWORD);
			setState(382);
			negativebranch();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertivebranchContext extends ParserRuleContext {
		public TerminalNode LEFTBRACE() { return getToken(CParser.LEFTBRACE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RIGHTBRACE() { return getToken(CParser.RIGHTBRACE, 0); }
		public AssertivebranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertivebranch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAssertivebranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAssertivebranch(this);
		}
	}

	public final AssertivebranchContext assertivebranch() throws RecognitionException {
		AssertivebranchContext _localctx = new AssertivebranchContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_assertivebranch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(LEFTBRACE);
			setState(385);
			statement();
			setState(386);
			match(RIGHTBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NegativebranchContext extends ParserRuleContext {
		public TerminalNode LEFTBRACE() { return getToken(CParser.LEFTBRACE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RIGHTBRACE() { return getToken(CParser.RIGHTBRACE, 0); }
		public NegativebranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negativebranch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterNegativebranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitNegativebranch(this);
		}
	}

	public final NegativebranchContext negativebranch() throws RecognitionException {
		NegativebranchContext _localctx = new NegativebranchContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_negativebranch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(LEFTBRACE);
			setState(389);
			statement();
			setState(390);
			match(RIGHTBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchconditionContext extends ParserRuleContext {
		public TerminalNode SWITCHKEYWORD() { return getToken(CParser.SWITCHKEYWORD, 0); }
		public TerminalNode LEFTPARENTHESE() { return getToken(CParser.LEFTPARENTHESE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHTPARENTHESE() { return getToken(CParser.RIGHTPARENTHESE, 0); }
		public TerminalNode LEFTBRACE() { return getToken(CParser.LEFTBRACE, 0); }
		public TerminalNode RIGHTBRACE() { return getToken(CParser.RIGHTBRACE, 0); }
		public List<SwitchcaseContext> switchcase() {
			return getRuleContexts(SwitchcaseContext.class);
		}
		public SwitchcaseContext switchcase(int i) {
			return getRuleContext(SwitchcaseContext.class,i);
		}
		public TerminalNode DEFAULTKEYWORD() { return getToken(CParser.DEFAULTKEYWORD, 0); }
		public TerminalNode COLON() { return getToken(CParser.COLON, 0); }
		public SwitchdefaultstatementContext switchdefaultstatement() {
			return getRuleContext(SwitchdefaultstatementContext.class,0);
		}
		public SwitchconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchcondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterSwitchcondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitSwitchcondition(this);
		}
	}

	public final SwitchconditionContext switchcondition() throws RecognitionException {
		SwitchconditionContext _localctx = new SwitchconditionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_switchcondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(SWITCHKEYWORD);
			setState(393);
			match(LEFTPARENTHESE);
			setState(394);
			expression();
			setState(395);
			match(RIGHTPARENTHESE);
			setState(396);
			match(LEFTBRACE);
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SWITCHCASEKEYWORD) {
				{
				{
				setState(397);
				switchcase();
				}
				}
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULTKEYWORD) {
				{
				setState(403);
				match(DEFAULTKEYWORD);
				setState(404);
				match(COLON);
				setState(405);
				switchdefaultstatement();
				}
			}

			setState(408);
			match(RIGHTBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchcaseContext extends ParserRuleContext {
		public TerminalNode SWITCHCASEKEYWORD() { return getToken(CParser.SWITCHCASEKEYWORD, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CParser.COLON, 0); }
		public SwitchstatementContext switchstatement() {
			return getRuleContext(SwitchstatementContext.class,0);
		}
		public SwitchcaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchcase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterSwitchcase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitSwitchcase(this);
		}
	}

	public final SwitchcaseContext switchcase() throws RecognitionException {
		SwitchcaseContext _localctx = new SwitchcaseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_switchcase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(SWITCHCASEKEYWORD);
			setState(411);
			expression();
			setState(412);
			match(COLON);
			setState(413);
			switchstatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchstatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode BREAKKEYWORD() { return getToken(CParser.BREAKKEYWORD, 0); }
		public TerminalNode SEMICOLON() { return getToken(CParser.SEMICOLON, 0); }
		public SwitchstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterSwitchstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitSwitchstatement(this);
		}
	}

	public final SwitchstatementContext switchstatement() throws RecognitionException {
		SwitchstatementContext _localctx = new SwitchstatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_switchstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			statement();
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAKKEYWORD) {
				{
				setState(416);
				match(BREAKKEYWORD);
				setState(417);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchdefaultstatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SwitchdefaultstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchdefaultstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterSwitchdefaultstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitSwitchdefaultstatement(this);
		}
	}

	public final SwitchdefaultstatementContext switchdefaultstatement() throws RecognitionException {
		SwitchdefaultstatementContext _localctx = new SwitchdefaultstatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_switchdefaultstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputintegerContext extends ParserRuleContext {
		public TerminalNode READINT() { return getToken(CParser.READINT, 0); }
		public TerminalNode LEFTPARENTHESE() { return getToken(CParser.LEFTPARENTHESE, 0); }
		public TerminalNode RIGHTPARENTHESE() { return getToken(CParser.RIGHTPARENTHESE, 0); }
		public InputintegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputinteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterInputinteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitInputinteger(this);
		}
	}

	public final InputintegerContext inputinteger() throws RecognitionException {
		InputintegerContext _localctx = new InputintegerContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_inputinteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(READINT);
			setState(423);
			match(LEFTPARENTHESE);
			setState(424);
			match(RIGHTPARENTHESE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputintegerContext extends ParserRuleContext {
		public TerminalNode WRITEINT() { return getToken(CParser.WRITEINT, 0); }
		public TerminalNode LEFTPARENTHESE() { return getToken(CParser.LEFTPARENTHESE, 0); }
		public ArithmeticexpressionContext arithmeticexpression() {
			return getRuleContext(ArithmeticexpressionContext.class,0);
		}
		public TerminalNode RIGHTPARENTHESE() { return getToken(CParser.RIGHTPARENTHESE, 0); }
		public TerminalNode SEMICOLON() { return getToken(CParser.SEMICOLON, 0); }
		public OutputintegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputinteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterOutputinteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitOutputinteger(this);
		}
	}

	public final OutputintegerContext outputinteger() throws RecognitionException {
		OutputintegerContext _localctx = new OutputintegerContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_outputinteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(WRITEINT);
			setState(427);
			match(LEFTPARENTHESE);
			setState(428);
			arithmeticexpression(0);
			setState(429);
			match(RIGHTPARENTHESE);
			setState(430);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return arithmeticexpression_sempred((ArithmeticexpressionContext)_localctx, predIndex);
		case 15:
			return logicalexpression_sempred((LogicalexpressionContext)_localctx, predIndex);
		case 16:
			return stringexpression_sempred((StringexpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmeticexpression_sempred(ArithmeticexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean logicalexpression_sempred(LogicalexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean stringexpression_sempred(StringexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u01b3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\3\7\3"+
		"U\n\3\f\3\16\3X\13\3\3\3\6\3[\n\3\r\3\16\3\\\3\4\3\4\5\4a\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0090\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6\u009b\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\6\b\u00ab\n\b\r\b\16\b\u00ac\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u00b7\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n"+
		"\u00c5\n\n\f\n\16\n\u00c8\13\n\3\13\3\13\3\13\7\13\u00cd\n\13\f\13\16"+
		"\13\u00d0\13\13\3\f\3\f\3\f\3\f\5\f\u00d6\n\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e8\n\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\7\20\u00f0\n\20\f\20\16\20\u00f3\13\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00fd\n\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u010b\n\21\f\21\16\21\u010e"+
		"\13\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0116\n\22\f\22\16\22\u0119"+
		"\13\22\3\23\3\23\3\23\3\23\3\23\5\23\u0120\n\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0132"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\7\27\u013d\n\27\f\27"+
		"\16\27\u0140\13\27\3\27\5\27\u0143\n\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u0179\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\7#\u0191\n#\f#\16#\u0194"+
		"\13#\3#\3#\3#\5#\u0199\n#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\5%\u01a5\n%\3"+
		"&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\2\5\36 \")\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLN\2\2\2\u01c3\2P"+
		"\3\2\2\2\4V\3\2\2\2\6`\3\2\2\2\b\u008f\3\2\2\2\n\u009a\3\2\2\2\f\u009c"+
		"\3\2\2\2\16\u00b6\3\2\2\2\20\u00b8\3\2\2\2\22\u00c1\3\2\2\2\24\u00c9\3"+
		"\2\2\2\26\u00d5\3\2\2\2\30\u00d7\3\2\2\2\32\u00dd\3\2\2\2\34\u00df\3\2"+
		"\2\2\36\u00e7\3\2\2\2 \u00fc\3\2\2\2\"\u010f\3\2\2\2$\u011f\3\2\2\2&\u0121"+
		"\3\2\2\2(\u0131\3\2\2\2*\u0133\3\2\2\2,\u0142\3\2\2\2.\u0144\3\2\2\2\60"+
		"\u0150\3\2\2\2\62\u0154\3\2\2\2\64\u0158\3\2\2\2\66\u015e\3\2\2\28\u0162"+
		"\3\2\2\2:\u0178\3\2\2\2<\u017a\3\2\2\2>\u017e\3\2\2\2@\u0182\3\2\2\2B"+
		"\u0186\3\2\2\2D\u018a\3\2\2\2F\u019c\3\2\2\2H\u01a1\3\2\2\2J\u01a6\3\2"+
		"\2\2L\u01a8\3\2\2\2N\u01ac\3\2\2\2PQ\5\4\3\2QR\7\2\2\3R\3\3\2\2\2SU\5"+
		"\6\4\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WZ\3\2\2\2XV\3\2\2\2Y[\5"+
		"&\24\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\5\3\2\2\2^a\5\n\6\2"+
		"_a\5\f\7\2`^\3\2\2\2`_\3\2\2\2a\7\3\2\2\2b\u0090\5\n\6\2cd\5\n\6\2de\5"+
		"\b\5\2e\u0090\3\2\2\2f\u0090\5\f\7\2gh\5\f\7\2hi\5\b\5\2i\u0090\3\2\2"+
		"\2j\u0090\5\16\b\2kl\5\16\b\2lm\5\b\5\2m\u0090\3\2\2\2n\u0090\5.\30\2"+
		"op\5.\30\2pq\5\b\5\2q\u0090\3\2\2\2r\u0090\5:\36\2st\5:\36\2tu\5\b\5\2"+
		"u\u0090\3\2\2\2v\u0090\5D#\2wx\5D#\2xy\5\b\5\2y\u0090\3\2\2\2z\u0090\5"+
		"\64\33\2{|\5\64\33\2|}\5\b\5\2}\u0090\3\2\2\2~\u0090\58\35\2\177\u0080"+
		"\58\35\2\u0080\u0081\5\b\5\2\u0081\u0090\3\2\2\2\u0082\u0090\5*\26\2\u0083"+
		"\u0084\5*\26\2\u0084\u0085\5\b\5\2\u0085\u0090\3\2\2\2\u0086\u0090\5\20"+
		"\t\2\u0087\u0088\5\20\t\2\u0088\u0089\5\b\5\2\u0089\u0090\3\2\2\2\u008a"+
		"\u0090\5N(\2\u008b\u008c\5N(\2\u008c\u008d\5\b\5\2\u008d\u0090\3\2\2\2"+
		"\u008e\u0090\3\2\2\2\u008fb\3\2\2\2\u008fc\3\2\2\2\u008ff\3\2\2\2\u008f"+
		"g\3\2\2\2\u008fj\3\2\2\2\u008fk\3\2\2\2\u008fn\3\2\2\2\u008fo\3\2\2\2"+
		"\u008fr\3\2\2\2\u008fs\3\2\2\2\u008fv\3\2\2\2\u008fw\3\2\2\2\u008fz\3"+
		"\2\2\2\u008f{\3\2\2\2\u008f~\3\2\2\2\u008f\177\3\2\2\2\u008f\u0082\3\2"+
		"\2\2\u008f\u0083\3\2\2\2\u008f\u0086\3\2\2\2\u008f\u0087\3\2\2\2\u008f"+
		"\u008a\3\2\2\2\u008f\u008b\3\2\2\2\u008f\u008e\3\2\2\2\u0090\t\3\2\2\2"+
		"\u0091\u0092\7\b\2\2\u0092\u0093\7 \2\2\u0093\u0094\7\33\2\2\u0094\u0095"+
		"\5\26\f\2\u0095\u0096\7\24\2\2\u0096\u009b\3\2\2\2\u0097\u0098\7\b\2\2"+
		"\u0098\u0099\7 \2\2\u0099\u009b\7\24\2\2\u009a\u0091\3\2\2\2\u009a\u0097"+
		"\3\2\2\2\u009b\13\3\2\2\2\u009c\u009d\7\7\2\2\u009d\u009e\7\b\2\2\u009e"+
		"\u009f\7 \2\2\u009f\u00a0\7\33\2\2\u00a0\u00a1\5\26\f\2\u00a1\u00a2\7"+
		"\24\2\2\u00a2\r\3\2\2\2\u00a3\u00a4\7 \2\2\u00a4\u00a5\7\33\2\2\u00a5"+
		"\u00a6\5\26\f\2\u00a6\u00a7\7\24\2\2\u00a7\u00b7\3\2\2\2\u00a8\u00a9\7"+
		" \2\2\u00a9\u00ab\7\33\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\5\26"+
		"\f\2\u00af\u00b0\7\24\2\2\u00b0\u00b7\3\2\2\2\u00b1\u00b2\7 \2\2\u00b2"+
		"\u00b3\7\33\2\2\u00b3\u00b4\5 \21\2\u00b4\u00b5\5\30\r\2\u00b5\u00b7\3"+
		"\2\2\2\u00b6\u00a3\3\2\2\2\u00b6\u00aa\3\2\2\2\u00b6\u00b1\3\2\2\2\u00b7"+
		"\17\3\2\2\2\u00b8\u00b9\7$\2\2\u00b9\u00ba\5\22\n\2\u00ba\u00bb\7%\2\2"+
		"\u00bb\u00bc\7\33\2\2\u00bc\u00bd\7$\2\2\u00bd\u00be\5\24\13\2\u00be\u00bf"+
		"\7%\2\2\u00bf\u00c0\7\24\2\2\u00c0\21\3\2\2\2\u00c1\u00c6\7 \2\2\u00c2"+
		"\u00c3\7&\2\2\u00c3\u00c5\7 \2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c8\3\2\2"+
		"\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\23\3\2\2\2\u00c8\u00c6"+
		"\3\2\2\2\u00c9\u00ce\5\26\f\2\u00ca\u00cb\7&\2\2\u00cb\u00cd\5\26\f\2"+
		"\u00cc\u00ca\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf"+
		"\3\2\2\2\u00cf\25\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d6\5\36\20\2\u00d2"+
		"\u00d6\5 \21\2\u00d3\u00d6\5\"\22\2\u00d4\u00d6\5\30\r\2\u00d5\u00d1\3"+
		"\2\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6"+
		"\27\3\2\2\2\u00d7\u00d8\7\37\2\2\u00d8\u00d9\5\32\16\2\u00d9\u00da\7\25"+
		"\2\2\u00da\u00db\5\34\17\2\u00db\u00dc\7\24\2\2\u00dc\31\3\2\2\2\u00dd"+
		"\u00de\5\26\f\2\u00de\33\3\2\2\2\u00df\u00e0\5\26\f\2\u00e0\35\3\2\2\2"+
		"\u00e1\u00e2\b\20\1\2\u00e2\u00e3\7\"\2\2\u00e3\u00e4\5\36\20\2\u00e4"+
		"\u00e5\7#\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e8\5$\23\2\u00e7\u00e1\3\2"+
		"\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00f1\3\2\2\2\u00e9\u00ea\f\5\2\2\u00ea"+
		"\u00eb\7\27\2\2\u00eb\u00f0\5\36\20\6\u00ec\u00ed\f\4\2\2\u00ed\u00ee"+
		"\7\30\2\2\u00ee\u00f0\5\36\20\5\u00ef\u00e9\3\2\2\2\u00ef\u00ec\3\2\2"+
		"\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\37"+
		"\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\b\21\1\2\u00f5\u00f6\7\"\2\2"+
		"\u00f6\u00f7\5 \21\2\u00f7\u00f8\7#\2\2\u00f8\u00fd\3\2\2\2\u00f9\u00fa"+
		"\7\36\2\2\u00fa\u00fd\5 \21\b\u00fb\u00fd\5$\23\2\u00fc\u00f4\3\2\2\2"+
		"\u00fc\u00f9\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\u010c\3\2\2\2\u00fe\u00ff"+
		"\f\7\2\2\u00ff\u0100\7\31\2\2\u0100\u010b\5 \21\b\u0101\u0102\f\6\2\2"+
		"\u0102\u0103\7\32\2\2\u0103\u010b\5 \21\7\u0104\u0105\f\5\2\2\u0105\u0106"+
		"\7\35\2\2\u0106\u010b\5 \21\6\u0107\u0108\f\4\2\2\u0108\u0109\7\34\2\2"+
		"\u0109\u010b\5 \21\5\u010a\u00fe\3\2\2\2\u010a\u0101\3\2\2\2\u010a\u0104"+
		"\3\2\2\2\u010a\u0107\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d!\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\b\22\1\2"+
		"\u0110\u0111\5$\23\2\u0111\u0117\3\2\2\2\u0112\u0113\f\4\2\2\u0113\u0114"+
		"\7\26\2\2\u0114\u0116\5\"\22\5\u0115\u0112\3\2\2\2\u0116\u0119\3\2\2\2"+
		"\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118#\3\2\2\2\u0119\u0117\3"+
		"\2\2\2\u011a\u0120\5L\'\2\u011b\u0120\7 \2\2\u011c\u0120\7!\2\2\u011d"+
		"\u0120\7\3\2\2\u011e\u0120\7\n\2\2\u011f\u011a\3\2\2\2\u011f\u011b\3\2"+
		"\2\2\u011f\u011c\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120"+
		"%\3\2\2\2\u0121\u0122\7\t\2\2\u0122\u0123\7 \2\2\u0123\u0124\7\"\2\2\u0124"+
		"\u0125\5(\25\2\u0125\u0126\7#\2\2\u0126\u0127\7$\2\2\u0127\u0128\5\b\5"+
		"\2\u0128\u0129\7%\2\2\u0129\'\3\2\2\2\u012a\u012b\7\b\2\2\u012b\u0132"+
		"\7 \2\2\u012c\u012d\7\b\2\2\u012d\u012e\7 \2\2\u012e\u012f\7&\2\2\u012f"+
		"\u0132\5(\25\2\u0130\u0132\3\2\2\2\u0131\u012a\3\2\2\2\u0131\u012c\3\2"+
		"\2\2\u0131\u0130\3\2\2\2\u0132)\3\2\2\2\u0133\u0134\7 \2\2\u0134\u0135"+
		"\7\"\2\2\u0135\u0136\5,\27\2\u0136\u0137\7#\2\2\u0137\u0138\7\24\2\2\u0138"+
		"+\3\2\2\2\u0139\u013e\5\26\f\2\u013a\u013b\7&\2\2\u013b\u013d\5,\27\2"+
		"\u013c\u013a\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f"+
		"\3\2\2\2\u013f\u0143\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0143\3\2\2\2\u0142"+
		"\u0139\3\2\2\2\u0142\u0141\3\2\2\2\u0143-\3\2\2\2\u0144\u0145\7\13\2\2"+
		"\u0145\u0146\7\"\2\2\u0146\u0147\5\60\31\2\u0147\u0148\7\24\2\2\u0148"+
		"\u0149\5 \21\2\u0149\u014a\7\24\2\2\u014a\u014b\5\62\32\2\u014b\u014c"+
		"\7#\2\2\u014c\u014d\7$\2\2\u014d\u014e\5\b\5\2\u014e\u014f\7%\2\2\u014f"+
		"/\3\2\2\2\u0150\u0151\7 \2\2\u0151\u0152\7\33\2\2\u0152\u0153\5\26\f\2"+
		"\u0153\61\3\2\2\2\u0154\u0155\7 \2\2\u0155\u0156\7\33\2\2\u0156\u0157"+
		"\5\26\f\2\u0157\63\3\2\2\2\u0158\u0159\7\f\2\2\u0159\u015a\7\"\2\2\u015a"+
		"\u015b\5 \21\2\u015b\u015c\7#\2\2\u015c\u015d\5\66\34\2\u015d\65\3\2\2"+
		"\2\u015e\u015f\7$\2\2\u015f\u0160\5\b\5\2\u0160\u0161\7%\2\2\u0161\67"+
		"\3\2\2\2\u0162\u0163\7\r\2\2\u0163\u0164\7$\2\2\u0164\u0165\5\b\5\2\u0165"+
		"\u0166\7%\2\2\u0166\u0167\7\f\2\2\u0167\u0168\7\"\2\2\u0168\u0169\5 \21"+
		"\2\u0169\u016a\7#\2\2\u016a\u016b\7\24\2\2\u016b9\3\2\2\2\u016c\u016d"+
		"\7\16\2\2\u016d\u016e\7\"\2\2\u016e\u016f\5 \21\2\u016f\u0170\7#\2\2\u0170"+
		"\u0171\5<\37\2\u0171\u0179\3\2\2\2\u0172\u0173\7\16\2\2\u0173\u0174\7"+
		"\"\2\2\u0174\u0175\5 \21\2\u0175\u0176\7#\2\2\u0176\u0177\5> \2\u0177"+
		"\u0179\3\2\2\2\u0178\u016c\3\2\2\2\u0178\u0172\3\2\2\2\u0179;\3\2\2\2"+
		"\u017a\u017b\7$\2\2\u017b\u017c\5\b\5\2\u017c\u017d\7%\2\2\u017d=\3\2"+
		"\2\2\u017e\u017f\5@!\2\u017f\u0180\7\17\2\2\u0180\u0181\5B\"\2\u0181?"+
		"\3\2\2\2\u0182\u0183\7$\2\2\u0183\u0184\5\b\5\2\u0184\u0185\7%\2\2\u0185"+
		"A\3\2\2\2\u0186\u0187\7$\2\2\u0187\u0188\5\b\5\2\u0188\u0189\7%\2\2\u0189"+
		"C\3\2\2\2\u018a\u018b\7\20\2\2\u018b\u018c\7\"\2\2\u018c\u018d\5\26\f"+
		"\2\u018d\u018e\7#\2\2\u018e\u0192\7$\2\2\u018f\u0191\5F$\2\u0190\u018f"+
		"\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u0198\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0196\7\23\2\2\u0196\u0197\7"+
		"\25\2\2\u0197\u0199\5J&\2\u0198\u0195\3\2\2\2\u0198\u0199\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u019b\7%\2\2\u019bE\3\2\2\2\u019c\u019d\7\21\2\2"+
		"\u019d\u019e\5\26\f\2\u019e\u019f\7\25\2\2\u019f\u01a0\5H%\2\u01a0G\3"+
		"\2\2\2\u01a1\u01a4\5\b\5\2\u01a2\u01a3\7\22\2\2\u01a3\u01a5\7\24\2\2\u01a4"+
		"\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5I\3\2\2\2\u01a6\u01a7\5\b\5\2"+
		"\u01a7K\3\2\2\2\u01a8\u01a9\7\6\2\2\u01a9\u01aa\7\"\2\2\u01aa\u01ab\7"+
		"#\2\2\u01abM\3\2\2\2\u01ac\u01ad\7\5\2\2\u01ad\u01ae\7\"\2\2\u01ae\u01af"+
		"\5\36\20\2\u01af\u01b0\7#\2\2\u01b0\u01b1\7\24\2\2\u01b1O\3\2\2\2\33V"+
		"\\`\u008f\u009a\u00ac\u00b6\u00c6\u00ce\u00d5\u00e7\u00ef\u00f1\u00fc"+
		"\u010a\u010c\u0117\u011f\u0131\u013e\u0142\u0178\u0192\u0198\u01a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}