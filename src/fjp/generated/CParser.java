package fjp.generated; 
// Generated from ./grammar/C.g4 by ANTLR 4.7
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
		STRINGVALUE=1, WHITESPACE=2, WRITEINT=3, READINT=4, WRITEFRAC=5, READFRAC=6, 
		TYPEQUALIFIER=7, TYPESPECIFIER=8, FUNCTIONRETURNTYPESPECIFIER=9, LOGICALVALUE=10, 
		FORLOOPKEYWORD=11, WHILELOOPKEYWORD=12, DOWHILEKEYWORD=13, CONDITIONKEYWORD=14, 
		CONDITIONELSEKEYWORD=15, SWITCHKEYWORD=16, SWITCHCASEKEYWORD=17, BREAKKEYWORD=18, 
		DEFAULTKEYWORD=19, SEMICOLON=20, COLON=21, STRINGCONCATENATION=22, MULTIPLICATIONDIVISIONOPERATOR=23, 
		ADDITIONSUBTRACTIONOPERATOR=24, RELATIONALOPERATOR=25, EQUALITYOPERATOR=26, 
		ASSIGNMENTOPERATOR=27, LOGICALOR=28, LOGICALAND=29, LOGICALNEGATION=30, 
		QUESTIONMARK=31, IDENTIFIER=32, NUMERICALVALUE=33, LEFTPARENTHESE=34, 
		RIGHTPARENTHESE=35, LEFTBRACE=36, RIGHTBRACE=37, COMMA=38;
	public static final int
		RULE_start = 0, RULE_startsymbol = 1, RULE_declarations = 2, RULE_statement = 3, 
		RULE_variabledeclaration = 4, RULE_constantdeclaration = 5, RULE_assignment = 6, 
		RULE_standardAssignment = 7, RULE_parallelassignment = 8, RULE_identifierlist = 9, 
		RULE_valuelist = 10, RULE_expression = 11, RULE_ternaryoperator = 12, 
		RULE_ternaryassertive = 13, RULE_ternarynegative = 14, RULE_arithmeticexpression = 15, 
		RULE_logicalexpression = 16, RULE_atom = 17, RULE_functiondeclaration = 18, 
		RULE_functionargumentlist = 19, RULE_functioncall = 20, RULE_functioncallarguments = 21, 
		RULE_forloop = 22, RULE_forinitialization = 23, RULE_forafterthought = 24, 
		RULE_whileloop = 25, RULE_whilestatement = 26, RULE_dowhileloop = 27, 
		RULE_condition = 28, RULE_simplecondition = 29, RULE_ifelsecondition = 30, 
		RULE_assertivebranch = 31, RULE_negativebranch = 32, RULE_switchcondition = 33, 
		RULE_switchcase = 34, RULE_switchstatement = 35, RULE_switchdefaultstatement = 36, 
		RULE_inputinteger = 37, RULE_outputinteger = 38, RULE_inputfrac = 39, 
		RULE_outputfrac = 40;
	public static final String[] ruleNames = {
		"start", "startsymbol", "declarations", "statement", "variabledeclaration", 
		"constantdeclaration", "assignment", "standardAssignment", "parallelassignment", 
		"identifierlist", "valuelist", "expression", "ternaryoperator", "ternaryassertive", 
		"ternarynegative", "arithmeticexpression", "logicalexpression", "atom", 
		"functiondeclaration", "functionargumentlist", "functioncall", "functioncallarguments", 
		"forloop", "forinitialization", "forafterthought", "whileloop", "whilestatement", 
		"dowhileloop", "condition", "simplecondition", "ifelsecondition", "assertivebranch", 
		"negativebranch", "switchcondition", "switchcase", "switchstatement", 
		"switchdefaultstatement", "inputinteger", "outputinteger", "inputfrac", 
		"outputfrac"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'writeint'", "'readint'", "'writefrac'", "'readfrac'", 
		"'const'", null, "'void'", null, "'for'", "'while'", "'do'", "'if'", "'else'", 
		"'switch'", "'case'", "'break'", "'default'", "';'", "':'", "'.'", null, 
		null, null, null, "'='", "'||'", "'&&'", "'!'", "'?'", null, null, "'('", 
		"')'", "'{'", "'}'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "STRINGVALUE", "WHITESPACE", "WRITEINT", "READINT", "WRITEFRAC", 
		"READFRAC", "TYPEQUALIFIER", "TYPESPECIFIER", "FUNCTIONRETURNTYPESPECIFIER", 
		"LOGICALVALUE", "FORLOOPKEYWORD", "WHILELOOPKEYWORD", "DOWHILEKEYWORD", 
		"CONDITIONKEYWORD", "CONDITIONELSEKEYWORD", "SWITCHKEYWORD", "SWITCHCASEKEYWORD", 
		"BREAKKEYWORD", "DEFAULTKEYWORD", "SEMICOLON", "COLON", "STRINGCONCATENATION", 
		"MULTIPLICATIONDIVISIONOPERATOR", "ADDITIONSUBTRACTIONOPERATOR", "RELATIONALOPERATOR", 
		"EQUALITYOPERATOR", "ASSIGNMENTOPERATOR", "LOGICALOR", "LOGICALAND", "LOGICALNEGATION", 
		"QUESTIONMARK", "IDENTIFIER", "NUMERICALVALUE", "LEFTPARENTHESE", "RIGHTPARENTHESE", 
		"LEFTBRACE", "RIGHTBRACE", "COMMA"
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
			setState(82);
			startsymbol();
			setState(83);
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
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPEQUALIFIER || _la==TYPESPECIFIER) {
				{
				{
				setState(85);
				declarations();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				functiondeclaration();
				}
				}
				setState(94); 
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
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPESPECIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				variabledeclaration();
				}
				break;
			case TYPEQUALIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
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
		public OutputfracContext outputfrac() {
			return getRuleContext(OutputfracContext.class,0);
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
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				variabledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				variabledeclaration();
				setState(102);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				constantdeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				constantdeclaration();
				setState(106);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(108);
				assignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(109);
				assignment();
				setState(110);
				statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(112);
				forloop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(113);
				forloop();
				setState(114);
				statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(116);
				condition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(117);
				condition();
				setState(118);
				statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(120);
				switchcondition();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(121);
				switchcondition();
				setState(122);
				statement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(124);
				whileloop();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(125);
				whileloop();
				setState(126);
				statement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(128);
				dowhileloop();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(129);
				dowhileloop();
				setState(130);
				statement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(132);
				functioncall();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(133);
				functioncall();
				setState(134);
				statement();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(136);
				parallelassignment();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(137);
				parallelassignment();
				setState(138);
				statement();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(140);
				outputinteger();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(141);
				outputinteger();
				setState(142);
				statement();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(144);
				outputfrac();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(145);
				outputfrac();
				setState(146);
				statement();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
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
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new DeclarationAndInitializationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(TYPESPECIFIER);
				setState(152);
				match(IDENTIFIER);
				setState(153);
				match(ASSIGNMENTOPERATOR);
				setState(154);
				expression();
				setState(155);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new DeclarationOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(TYPESPECIFIER);
				setState(158);
				match(IDENTIFIER);
				setState(159);
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
			setState(162);
			match(TYPEQUALIFIER);
			setState(163);
			match(TYPESPECIFIER);
			setState(164);
			match(IDENTIFIER);
			setState(165);
			match(ASSIGNMENTOPERATOR);
			setState(166);
			expression();
			setState(167);
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
	public static class StandAssignmentContext extends AssignmentContext {
		public StandardAssignmentContext standardAssignment() {
			return getRuleContext(StandardAssignmentContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CParser.SEMICOLON, 0); }
		public StandAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStandAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStandAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			int _alt;
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new StandAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				standardAssignment();
				setState(170);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new MultipleAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(174); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(172);
						match(IDENTIFIER);
						setState(173);
						match(ASSIGNMENTOPERATOR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(176); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(178);
				expression();
				setState(179);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new TernaryOperatorAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				match(IDENTIFIER);
				setState(182);
				match(ASSIGNMENTOPERATOR);
				setState(183);
				logicalexpression(0);
				setState(184);
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

	public static class StandardAssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENTOPERATOR() { return getToken(CParser.ASSIGNMENTOPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StandardAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standardAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStandardAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStandardAssignment(this);
		}
	}

	public final StandardAssignmentContext standardAssignment() throws RecognitionException {
		StandardAssignmentContext _localctx = new StandardAssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_standardAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(IDENTIFIER);
			setState(189);
			match(ASSIGNMENTOPERATOR);
			setState(190);
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
		enterRule(_localctx, 16, RULE_parallelassignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(LEFTBRACE);
			setState(193);
			identifierlist();
			setState(194);
			match(RIGHTBRACE);
			setState(195);
			match(ASSIGNMENTOPERATOR);
			setState(196);
			match(LEFTBRACE);
			setState(197);
			valuelist();
			setState(198);
			match(RIGHTBRACE);
			setState(199);
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
		enterRule(_localctx, 18, RULE_identifierlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(IDENTIFIER);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(202);
				match(COMMA);
				setState(203);
				match(IDENTIFIER);
				}
				}
				setState(208);
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
		enterRule(_localctx, 20, RULE_valuelist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			expression();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(210);
				match(COMMA);
				setState(211);
				expression();
				}
				}
				setState(216);
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
		enterRule(_localctx, 22, RULE_expression);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				arithmeticexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				logicalexpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
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
		enterRule(_localctx, 24, RULE_ternaryoperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(QUESTIONMARK);
			setState(223);
			ternaryassertive();
			setState(224);
			match(COLON);
			setState(225);
			ternarynegative();
			setState(226);
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
		enterRule(_localctx, 26, RULE_ternaryassertive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
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
		enterRule(_localctx, 28, RULE_ternarynegative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_arithmeticexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFTPARENTHESE:
				{
				_localctx = new ParenthesesArithmeticExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(233);
				match(LEFTPARENTHESE);
				setState(234);
				arithmeticexpression(0);
				setState(235);
				match(RIGHTPARENTHESE);
				}
				break;
			case READINT:
			case READFRAC:
			case LOGICALVALUE:
			case IDENTIFIER:
			case NUMERICALVALUE:
				{
				_localctx = new ArithmeticAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(246);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExpContext(new ArithmeticexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticexpression);
						setState(240);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(241);
						match(MULTIPLICATIONDIVISIONOPERATOR);
						setState(242);
						arithmeticexpression(4);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpContext(new ArithmeticexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticexpression);
						setState(243);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(244);
						match(ADDITIONSUBTRACTIONOPERATOR);
						setState(245);
						arithmeticexpression(3);
						}
						break;
					}
					} 
				}
				setState(250);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_logicalexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFTPARENTHESE:
				{
				_localctx = new ParenthesesLogicExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(252);
				match(LEFTPARENTHESE);
				setState(253);
				logicalexpression(0);
				setState(254);
				match(RIGHTPARENTHESE);
				}
				break;
			case LOGICALNEGATION:
				{
				_localctx = new LogicNegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(256);
				match(LOGICALNEGATION);
				setState(257);
				logicalexpression(6);
				}
				break;
			case READINT:
			case READFRAC:
			case LOGICALVALUE:
			case IDENTIFIER:
			case NUMERICALVALUE:
				{
				_localctx = new LogicalAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(258);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(273);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalLogicExpContext(new LogicalexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalexpression);
						setState(261);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(262);
						match(RELATIONALOPERATOR);
						setState(263);
						logicalexpression(6);
						}
						break;
					case 2:
						{
						_localctx = new EqualityLogicExpContext(new LogicalexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalexpression);
						setState(264);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(265);
						match(EQUALITYOPERATOR);
						setState(266);
						logicalexpression(5);
						}
						break;
					case 3:
						{
						_localctx = new LogicalAndExpContext(new LogicalexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalexpression);
						setState(267);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(268);
						match(LOGICALAND);
						setState(269);
						logicalexpression(4);
						}
						break;
					case 4:
						{
						_localctx = new LogicalOrExpContext(new LogicalexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalexpression);
						setState(270);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(271);
						match(LOGICALOR);
						setState(272);
						logicalexpression(3);
						}
						break;
					}
					} 
				}
				setState(277);
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
	public static class FractionIOContext extends AtomContext {
		public InputfracContext inputfrac() {
			return getRuleContext(InputfracContext.class,0);
		}
		public FractionIOContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterFractionIO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitFractionIO(this);
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
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READINT:
				_localctx = new IntegerIOContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				inputinteger();
				}
				break;
			case READFRAC:
				_localctx = new FractionIOContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				inputfrac();
				}
				break;
			case IDENTIFIER:
				_localctx = new IdentifierAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				match(IDENTIFIER);
				}
				break;
			case NUMERICALVALUE:
				_localctx = new NumericAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				match(NUMERICALVALUE);
				}
				break;
			case LOGICALVALUE:
				_localctx = new LogicAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(282);
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
			setState(285);
			match(FUNCTIONRETURNTYPESPECIFIER);
			setState(286);
			match(IDENTIFIER);
			setState(287);
			match(LEFTPARENTHESE);
			setState(288);
			functionargumentlist();
			setState(289);
			match(RIGHTPARENTHESE);
			setState(290);
			match(LEFTBRACE);
			setState(291);
			statement();
			setState(292);
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
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(TYPESPECIFIER);
				setState(295);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(TYPESPECIFIER);
				setState(297);
				match(IDENTIFIER);
				setState(298);
				match(COMMA);
				setState(299);
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
			setState(303);
			match(IDENTIFIER);
			setState(304);
			match(LEFTPARENTHESE);
			setState(305);
			functioncallarguments();
			setState(306);
			match(RIGHTPARENTHESE);
			setState(307);
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
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READINT:
			case READFRAC:
			case LOGICALVALUE:
			case LOGICALNEGATION:
			case QUESTIONMARK:
			case IDENTIFIER:
			case NUMERICALVALUE:
			case LEFTPARENTHESE:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				expression();
				setState(314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(310);
						match(COMMA);
						setState(311);
						functioncallarguments();
						}
						} 
					}
					setState(316);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
			setState(320);
			match(FORLOOPKEYWORD);
			setState(321);
			match(LEFTPARENTHESE);
			setState(322);
			forinitialization();
			setState(323);
			match(SEMICOLON);
			setState(324);
			logicalexpression(0);
			setState(325);
			match(SEMICOLON);
			setState(326);
			forafterthought();
			setState(327);
			match(RIGHTPARENTHESE);
			setState(328);
			match(LEFTBRACE);
			setState(329);
			statement();
			setState(330);
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
		public StandardAssignmentContext standardAssignment() {
			return getRuleContext(StandardAssignmentContext.class,0);
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
			setState(332);
			standardAssignment();
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
		public StandardAssignmentContext standardAssignment() {
			return getRuleContext(StandardAssignmentContext.class,0);
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
			setState(334);
			standardAssignment();
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
			setState(336);
			match(WHILELOOPKEYWORD);
			setState(337);
			match(LEFTPARENTHESE);
			setState(338);
			logicalexpression(0);
			setState(339);
			match(RIGHTPARENTHESE);
			setState(340);
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
			setState(342);
			match(LEFTBRACE);
			setState(343);
			statement();
			setState(344);
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
			setState(346);
			match(DOWHILEKEYWORD);
			setState(347);
			match(LEFTBRACE);
			setState(348);
			statement();
			setState(349);
			match(RIGHTBRACE);
			setState(350);
			match(WHILELOOPKEYWORD);
			setState(351);
			match(LEFTPARENTHESE);
			setState(352);
			logicalexpression(0);
			setState(353);
			match(RIGHTPARENTHESE);
			setState(354);
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
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				match(CONDITIONKEYWORD);
				setState(357);
				match(LEFTPARENTHESE);
				setState(358);
				logicalexpression(0);
				setState(359);
				match(RIGHTPARENTHESE);
				setState(360);
				simplecondition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
			setState(370);
			match(LEFTBRACE);
			setState(371);
			statement();
			setState(372);
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
			setState(374);
			assertivebranch();
			setState(375);
			match(CONDITIONELSEKEYWORD);
			setState(376);
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
			setState(378);
			match(LEFTBRACE);
			setState(379);
			statement();
			setState(380);
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
			setState(382);
			match(LEFTBRACE);
			setState(383);
			statement();
			setState(384);
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
			setState(386);
			match(SWITCHKEYWORD);
			setState(387);
			match(LEFTPARENTHESE);
			setState(388);
			expression();
			setState(389);
			match(RIGHTPARENTHESE);
			setState(390);
			match(LEFTBRACE);
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SWITCHCASEKEYWORD) {
				{
				{
				setState(391);
				switchcase();
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULTKEYWORD) {
				{
				setState(397);
				match(DEFAULTKEYWORD);
				setState(398);
				match(COLON);
				setState(399);
				switchdefaultstatement();
				}
			}

			setState(402);
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
			setState(404);
			match(SWITCHCASEKEYWORD);
			setState(405);
			expression();
			setState(406);
			match(COLON);
			setState(407);
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
			setState(409);
			statement();
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAKKEYWORD) {
				{
				setState(410);
				match(BREAKKEYWORD);
				setState(411);
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
			setState(414);
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
			setState(416);
			match(READINT);
			setState(417);
			match(LEFTPARENTHESE);
			setState(418);
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
			setState(420);
			match(WRITEINT);
			setState(421);
			match(LEFTPARENTHESE);
			setState(422);
			arithmeticexpression(0);
			setState(423);
			match(RIGHTPARENTHESE);
			setState(424);
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

	public static class InputfracContext extends ParserRuleContext {
		public TerminalNode READFRAC() { return getToken(CParser.READFRAC, 0); }
		public TerminalNode LEFTPARENTHESE() { return getToken(CParser.LEFTPARENTHESE, 0); }
		public TerminalNode RIGHTPARENTHESE() { return getToken(CParser.RIGHTPARENTHESE, 0); }
		public InputfracContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputfrac; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterInputfrac(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitInputfrac(this);
		}
	}

	public final InputfracContext inputfrac() throws RecognitionException {
		InputfracContext _localctx = new InputfracContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_inputfrac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(READFRAC);
			setState(427);
			match(LEFTPARENTHESE);
			setState(428);
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

	public static class OutputfracContext extends ParserRuleContext {
		public TerminalNode WRITEFRAC() { return getToken(CParser.WRITEFRAC, 0); }
		public TerminalNode LEFTPARENTHESE() { return getToken(CParser.LEFTPARENTHESE, 0); }
		public ArithmeticexpressionContext arithmeticexpression() {
			return getRuleContext(ArithmeticexpressionContext.class,0);
		}
		public TerminalNode RIGHTPARENTHESE() { return getToken(CParser.RIGHTPARENTHESE, 0); }
		public TerminalNode SEMICOLON() { return getToken(CParser.SEMICOLON, 0); }
		public OutputfracContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputfrac; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterOutputfrac(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitOutputfrac(this);
		}
	}

	public final OutputfracContext outputfrac() throws RecognitionException {
		OutputfracContext _localctx = new OutputfracContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_outputfrac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(WRITEFRAC);
			setState(431);
			match(LEFTPARENTHESE);
			setState(432);
			arithmeticexpression(0);
			setState(433);
			match(RIGHTPARENTHESE);
			setState(434);
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
		case 15:
			return arithmeticexpression_sempred((ArithmeticexpressionContext)_localctx, predIndex);
		case 16:
			return logicalexpression_sempred((LogicalexpressionContext)_localctx, predIndex);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u01b7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\3\7\3Y\n\3\f\3\16\3\\\13\3\3\3\6\3_\n\3\r\3\16\3`\3\4\3\4\5\4e"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0098"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a3\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\6\b\u00b1\n\b\r\b\16\b\u00b2\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00bd\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u00cf\n\13\f\13\16\13\u00d2\13"+
		"\13\3\f\3\f\3\f\7\f\u00d7\n\f\f\f\16\f\u00da\13\f\3\r\3\r\3\r\5\r\u00df"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00f1\n\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00f9"+
		"\n\21\f\21\16\21\u00fc\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5"+
		"\22\u0106\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\7\22\u0114\n\22\f\22\16\22\u0117\13\22\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u011e\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u0130\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\7\27\u013b\n\27\f\27\16\27\u013e\13\27\3\27\5\27\u0141"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0173\n\36\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\7#\u018b\n"+
		"#\f#\16#\u018e\13#\3#\3#\3#\5#\u0193\n#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%"+
		"\5%\u019f\n%\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3"+
		"*\3*\3*\3*\3*\3*\2\4 \"+\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPR\2\2\2\u01c5\2T\3\2\2\2\4Z\3\2\2\2\6d\3\2"+
		"\2\2\b\u0097\3\2\2\2\n\u00a2\3\2\2\2\f\u00a4\3\2\2\2\16\u00bc\3\2\2\2"+
		"\20\u00be\3\2\2\2\22\u00c2\3\2\2\2\24\u00cb\3\2\2\2\26\u00d3\3\2\2\2\30"+
		"\u00de\3\2\2\2\32\u00e0\3\2\2\2\34\u00e6\3\2\2\2\36\u00e8\3\2\2\2 \u00f0"+
		"\3\2\2\2\"\u0105\3\2\2\2$\u011d\3\2\2\2&\u011f\3\2\2\2(\u012f\3\2\2\2"+
		"*\u0131\3\2\2\2,\u0140\3\2\2\2.\u0142\3\2\2\2\60\u014e\3\2\2\2\62\u0150"+
		"\3\2\2\2\64\u0152\3\2\2\2\66\u0158\3\2\2\28\u015c\3\2\2\2:\u0172\3\2\2"+
		"\2<\u0174\3\2\2\2>\u0178\3\2\2\2@\u017c\3\2\2\2B\u0180\3\2\2\2D\u0184"+
		"\3\2\2\2F\u0196\3\2\2\2H\u019b\3\2\2\2J\u01a0\3\2\2\2L\u01a2\3\2\2\2N"+
		"\u01a6\3\2\2\2P\u01ac\3\2\2\2R\u01b0\3\2\2\2TU\5\4\3\2UV\7\2\2\3V\3\3"+
		"\2\2\2WY\5\6\4\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[^\3\2\2\2\\"+
		"Z\3\2\2\2]_\5&\24\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\5\3\2\2\2"+
		"be\5\n\6\2ce\5\f\7\2db\3\2\2\2dc\3\2\2\2e\7\3\2\2\2f\u0098\5\n\6\2gh\5"+
		"\n\6\2hi\5\b\5\2i\u0098\3\2\2\2j\u0098\5\f\7\2kl\5\f\7\2lm\5\b\5\2m\u0098"+
		"\3\2\2\2n\u0098\5\16\b\2op\5\16\b\2pq\5\b\5\2q\u0098\3\2\2\2r\u0098\5"+
		".\30\2st\5.\30\2tu\5\b\5\2u\u0098\3\2\2\2v\u0098\5:\36\2wx\5:\36\2xy\5"+
		"\b\5\2y\u0098\3\2\2\2z\u0098\5D#\2{|\5D#\2|}\5\b\5\2}\u0098\3\2\2\2~\u0098"+
		"\5\64\33\2\177\u0080\5\64\33\2\u0080\u0081\5\b\5\2\u0081\u0098\3\2\2\2"+
		"\u0082\u0098\58\35\2\u0083\u0084\58\35\2\u0084\u0085\5\b\5\2\u0085\u0098"+
		"\3\2\2\2\u0086\u0098\5*\26\2\u0087\u0088\5*\26\2\u0088\u0089\5\b\5\2\u0089"+
		"\u0098\3\2\2\2\u008a\u0098\5\22\n\2\u008b\u008c\5\22\n\2\u008c\u008d\5"+
		"\b\5\2\u008d\u0098\3\2\2\2\u008e\u0098\5N(\2\u008f\u0090\5N(\2\u0090\u0091"+
		"\5\b\5\2\u0091\u0098\3\2\2\2\u0092\u0098\5R*\2\u0093\u0094\5R*\2\u0094"+
		"\u0095\5\b\5\2\u0095\u0098\3\2\2\2\u0096\u0098\3\2\2\2\u0097f\3\2\2\2"+
		"\u0097g\3\2\2\2\u0097j\3\2\2\2\u0097k\3\2\2\2\u0097n\3\2\2\2\u0097o\3"+
		"\2\2\2\u0097r\3\2\2\2\u0097s\3\2\2\2\u0097v\3\2\2\2\u0097w\3\2\2\2\u0097"+
		"z\3\2\2\2\u0097{\3\2\2\2\u0097~\3\2\2\2\u0097\177\3\2\2\2\u0097\u0082"+
		"\3\2\2\2\u0097\u0083\3\2\2\2\u0097\u0086\3\2\2\2\u0097\u0087\3\2\2\2\u0097"+
		"\u008a\3\2\2\2\u0097\u008b\3\2\2\2\u0097\u008e\3\2\2\2\u0097\u008f\3\2"+
		"\2\2\u0097\u0092\3\2\2\2\u0097\u0093\3\2\2\2\u0097\u0096\3\2\2\2\u0098"+
		"\t\3\2\2\2\u0099\u009a\7\n\2\2\u009a\u009b\7\"\2\2\u009b\u009c\7\35\2"+
		"\2\u009c\u009d\5\30\r\2\u009d\u009e\7\26\2\2\u009e\u00a3\3\2\2\2\u009f"+
		"\u00a0\7\n\2\2\u00a0\u00a1\7\"\2\2\u00a1\u00a3\7\26\2\2\u00a2\u0099\3"+
		"\2\2\2\u00a2\u009f\3\2\2\2\u00a3\13\3\2\2\2\u00a4\u00a5\7\t\2\2\u00a5"+
		"\u00a6\7\n\2\2\u00a6\u00a7\7\"\2\2\u00a7\u00a8\7\35\2\2\u00a8\u00a9\5"+
		"\30\r\2\u00a9\u00aa\7\26\2\2\u00aa\r\3\2\2\2\u00ab\u00ac\5\20\t\2\u00ac"+
		"\u00ad\7\26\2\2\u00ad\u00bd\3\2\2\2\u00ae\u00af\7\"\2\2\u00af\u00b1\7"+
		"\35\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\5\30\r\2\u00b5\u00b6\7"+
		"\26\2\2\u00b6\u00bd\3\2\2\2\u00b7\u00b8\7\"\2\2\u00b8\u00b9\7\35\2\2\u00b9"+
		"\u00ba\5\"\22\2\u00ba\u00bb\5\32\16\2\u00bb\u00bd\3\2\2\2\u00bc\u00ab"+
		"\3\2\2\2\u00bc\u00b0\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bd\17\3\2\2\2\u00be"+
		"\u00bf\7\"\2\2\u00bf\u00c0\7\35\2\2\u00c0\u00c1\5\30\r\2\u00c1\21\3\2"+
		"\2\2\u00c2\u00c3\7&\2\2\u00c3\u00c4\5\24\13\2\u00c4\u00c5\7\'\2\2\u00c5"+
		"\u00c6\7\35\2\2\u00c6\u00c7\7&\2\2\u00c7\u00c8\5\26\f\2\u00c8\u00c9\7"+
		"\'\2\2\u00c9\u00ca\7\26\2\2\u00ca\23\3\2\2\2\u00cb\u00d0\7\"\2\2\u00cc"+
		"\u00cd\7(\2\2\u00cd\u00cf\7\"\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d2\3\2"+
		"\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\25\3\2\2\2\u00d2\u00d0"+
		"\3\2\2\2\u00d3\u00d8\5\30\r\2\u00d4\u00d5\7(\2\2\u00d5\u00d7\5\30\r\2"+
		"\u00d6\u00d4\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9"+
		"\3\2\2\2\u00d9\27\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00df\5 \21\2\u00dc"+
		"\u00df\5\"\22\2\u00dd\u00df\5\32\16\2\u00de\u00db\3\2\2\2\u00de\u00dc"+
		"\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\31\3\2\2\2\u00e0\u00e1\7!\2\2\u00e1"+
		"\u00e2\5\34\17\2\u00e2\u00e3\7\27\2\2\u00e3\u00e4\5\36\20\2\u00e4\u00e5"+
		"\7\26\2\2\u00e5\33\3\2\2\2\u00e6\u00e7\5\30\r\2\u00e7\35\3\2\2\2\u00e8"+
		"\u00e9\5\30\r\2\u00e9\37\3\2\2\2\u00ea\u00eb\b\21\1\2\u00eb\u00ec\7$\2"+
		"\2\u00ec\u00ed\5 \21\2\u00ed\u00ee\7%\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00f1"+
		"\5$\23\2\u00f0\u00ea\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00fa\3\2\2\2\u00f2"+
		"\u00f3\f\5\2\2\u00f3\u00f4\7\31\2\2\u00f4\u00f9\5 \21\6\u00f5\u00f6\f"+
		"\4\2\2\u00f6\u00f7\7\32\2\2\u00f7\u00f9\5 \21\5\u00f8\u00f2\3\2\2\2\u00f8"+
		"\u00f5\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb!\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\b\22\1\2\u00fe\u00ff"+
		"\7$\2\2\u00ff\u0100\5\"\22\2\u0100\u0101\7%\2\2\u0101\u0106\3\2\2\2\u0102"+
		"\u0103\7 \2\2\u0103\u0106\5\"\22\b\u0104\u0106\5$\23\2\u0105\u00fd\3\2"+
		"\2\2\u0105\u0102\3\2\2\2\u0105\u0104\3\2\2\2\u0106\u0115\3\2\2\2\u0107"+
		"\u0108\f\7\2\2\u0108\u0109\7\33\2\2\u0109\u0114\5\"\22\b\u010a\u010b\f"+
		"\6\2\2\u010b\u010c\7\34\2\2\u010c\u0114\5\"\22\7\u010d\u010e\f\5\2\2\u010e"+
		"\u010f\7\37\2\2\u010f\u0114\5\"\22\6\u0110\u0111\f\4\2\2\u0111\u0112\7"+
		"\36\2\2\u0112\u0114\5\"\22\5\u0113\u0107\3\2\2\2\u0113\u010a\3\2\2\2\u0113"+
		"\u010d\3\2\2\2\u0113\u0110\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2"+
		"\2\2\u0115\u0116\3\2\2\2\u0116#\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011e"+
		"\5L\'\2\u0119\u011e\5P)\2\u011a\u011e\7\"\2\2\u011b\u011e\7#\2\2\u011c"+
		"\u011e\7\f\2\2\u011d\u0118\3\2\2\2\u011d\u0119\3\2\2\2\u011d\u011a\3\2"+
		"\2\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e%\3\2\2\2\u011f\u0120"+
		"\7\13\2\2\u0120\u0121\7\"\2\2\u0121\u0122\7$\2\2\u0122\u0123\5(\25\2\u0123"+
		"\u0124\7%\2\2\u0124\u0125\7&\2\2\u0125\u0126\5\b\5\2\u0126\u0127\7\'\2"+
		"\2\u0127\'\3\2\2\2\u0128\u0129\7\n\2\2\u0129\u0130\7\"\2\2\u012a\u012b"+
		"\7\n\2\2\u012b\u012c\7\"\2\2\u012c\u012d\7(\2\2\u012d\u0130\5(\25\2\u012e"+
		"\u0130\3\2\2\2\u012f\u0128\3\2\2\2\u012f\u012a\3\2\2\2\u012f\u012e\3\2"+
		"\2\2\u0130)\3\2\2\2\u0131\u0132\7\"\2\2\u0132\u0133\7$\2\2\u0133\u0134"+
		"\5,\27\2\u0134\u0135\7%\2\2\u0135\u0136\7\26\2\2\u0136+\3\2\2\2\u0137"+
		"\u013c\5\30\r\2\u0138\u0139\7(\2\2\u0139\u013b\5,\27\2\u013a\u0138\3\2"+
		"\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u0141\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u0137\3\2"+
		"\2\2\u0140\u013f\3\2\2\2\u0141-\3\2\2\2\u0142\u0143\7\r\2\2\u0143\u0144"+
		"\7$\2\2\u0144\u0145\5\60\31\2\u0145\u0146\7\26\2\2\u0146\u0147\5\"\22"+
		"\2\u0147\u0148\7\26\2\2\u0148\u0149\5\62\32\2\u0149\u014a\7%\2\2\u014a"+
		"\u014b\7&\2\2\u014b\u014c\5\b\5\2\u014c\u014d\7\'\2\2\u014d/\3\2\2\2\u014e"+
		"\u014f\5\20\t\2\u014f\61\3\2\2\2\u0150\u0151\5\20\t\2\u0151\63\3\2\2\2"+
		"\u0152\u0153\7\16\2\2\u0153\u0154\7$\2\2\u0154\u0155\5\"\22\2\u0155\u0156"+
		"\7%\2\2\u0156\u0157\5\66\34\2\u0157\65\3\2\2\2\u0158\u0159\7&\2\2\u0159"+
		"\u015a\5\b\5\2\u015a\u015b\7\'\2\2\u015b\67\3\2\2\2\u015c\u015d\7\17\2"+
		"\2\u015d\u015e\7&\2\2\u015e\u015f\5\b\5\2\u015f\u0160\7\'\2\2\u0160\u0161"+
		"\7\16\2\2\u0161\u0162\7$\2\2\u0162\u0163\5\"\22\2\u0163\u0164\7%\2\2\u0164"+
		"\u0165\7\26\2\2\u01659\3\2\2\2\u0166\u0167\7\20\2\2\u0167\u0168\7$\2\2"+
		"\u0168\u0169\5\"\22\2\u0169\u016a\7%\2\2\u016a\u016b\5<\37\2\u016b\u0173"+
		"\3\2\2\2\u016c\u016d\7\20\2\2\u016d\u016e\7$\2\2\u016e\u016f\5\"\22\2"+
		"\u016f\u0170\7%\2\2\u0170\u0171\5> \2\u0171\u0173\3\2\2\2\u0172\u0166"+
		"\3\2\2\2\u0172\u016c\3\2\2\2\u0173;\3\2\2\2\u0174\u0175\7&\2\2\u0175\u0176"+
		"\5\b\5\2\u0176\u0177\7\'\2\2\u0177=\3\2\2\2\u0178\u0179\5@!\2\u0179\u017a"+
		"\7\21\2\2\u017a\u017b\5B\"\2\u017b?\3\2\2\2\u017c\u017d\7&\2\2\u017d\u017e"+
		"\5\b\5\2\u017e\u017f\7\'\2\2\u017fA\3\2\2\2\u0180\u0181\7&\2\2\u0181\u0182"+
		"\5\b\5\2\u0182\u0183\7\'\2\2\u0183C\3\2\2\2\u0184\u0185\7\22\2\2\u0185"+
		"\u0186\7$\2\2\u0186\u0187\5\30\r\2\u0187\u0188\7%\2\2\u0188\u018c\7&\2"+
		"\2\u0189\u018b\5F$\2\u018a\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a"+
		"\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u0192\3\2\2\2\u018e\u018c\3\2\2\2\u018f"+
		"\u0190\7\25\2\2\u0190\u0191\7\27\2\2\u0191\u0193\5J&\2\u0192\u018f\3\2"+
		"\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\7\'\2\2\u0195"+
		"E\3\2\2\2\u0196\u0197\7\23\2\2\u0197\u0198\5\30\r\2\u0198\u0199\7\27\2"+
		"\2\u0199\u019a\5H%\2\u019aG\3\2\2\2\u019b\u019e\5\b\5\2\u019c\u019d\7"+
		"\24\2\2\u019d\u019f\7\26\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"I\3\2\2\2\u01a0\u01a1\5\b\5\2\u01a1K\3\2\2\2\u01a2\u01a3\7\6\2\2\u01a3"+
		"\u01a4\7$\2\2\u01a4\u01a5\7%\2\2\u01a5M\3\2\2\2\u01a6\u01a7\7\5\2\2\u01a7"+
		"\u01a8\7$\2\2\u01a8\u01a9\5 \21\2\u01a9\u01aa\7%\2\2\u01aa\u01ab\7\26"+
		"\2\2\u01abO\3\2\2\2\u01ac\u01ad\7\b\2\2\u01ad\u01ae\7$\2\2\u01ae\u01af"+
		"\7%\2\2\u01afQ\3\2\2\2\u01b0\u01b1\7\7\2\2\u01b1\u01b2\7$\2\2\u01b2\u01b3"+
		"\5 \21\2\u01b3\u01b4\7%\2\2\u01b4\u01b5\7\26\2\2\u01b5S\3\2\2\2\32Z`d"+
		"\u0097\u00a2\u00b2\u00bc\u00d0\u00d8\u00de\u00f0\u00f8\u00fa\u0105\u0113"+
		"\u0115\u011d\u012f\u013c\u0140\u0172\u018c\u0192\u019e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}