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
		STRINGVALUE=1, WHITESPACE=2, TYPEQUALIFIER=3, TYPESPECIFIER=4, FUNCTIONRETURNTYPESPECIFIER=5, 
		LOGICALVALUE=6, FORLOOPKEYWORD=7, WHILELOOPKEYWORD=8, DOWHILEKEYWORD=9, 
		CONDITIONKEYWORD=10, CONDITIONELSEKEYWORD=11, SWITCHKEYWORD=12, SWITCHCASEKEYWORD=13, 
		BREAKKEYWORD=14, DEFAULTKEYWORD=15, SEMICOLON=16, COLON=17, STRINGCONCATENATION=18, 
		MULTIPLICATIONDIVISIONOPERATOR=19, ADDITIONSUBTRACTIONOPERATOR=20, RELATIONALOPERATOR=21, 
		EQUALITYOPERATOR=22, ASSIGNMENTOPERATOR=23, LOGICALOR=24, LOGICALAND=25, 
		LOGICALNEGATION=26, QUESTIONMARK=27, IDENTIFIER=28, NUMERICALVALUE=29, 
		LEFTPARENTHESE=30, RIGHTPARENTHESE=31, LEFTBRACE=32, RIGHTBRACE=33, COMMA=34;
	public static final int
		RULE_start = 0, RULE_startsymbol = 1, RULE_statement = 2, RULE_variabledeclaration = 3, 
		RULE_constantdeclaration = 4, RULE_assignment = 5, RULE_parallelassignment = 6, 
		RULE_identifierlist = 7, RULE_valuelist = 8, RULE_expression = 9, RULE_arithmeticexpression = 10, 
		RULE_logicalexpression = 11, RULE_stringexpression = 12, RULE_atom = 13, 
		RULE_functiondeclaration = 14, RULE_functionargumentlist = 15, RULE_functioncall = 16, 
		RULE_functioncallarguments = 17, RULE_forloop = 18, RULE_forinitialization = 19, 
		RULE_forafterthought = 20, RULE_whileloop = 21, RULE_dowhileloop = 22, 
		RULE_condition = 23, RULE_switchcondition = 24, RULE_switchcase = 25;
	public static final String[] ruleNames = {
		"start", "startsymbol", "statement", "variabledeclaration", "constantdeclaration", 
		"assignment", "parallelassignment", "identifierlist", "valuelist", "expression", 
		"arithmeticexpression", "logicalexpression", "stringexpression", "atom", 
		"functiondeclaration", "functionargumentlist", "functioncall", "functioncallarguments", 
		"forloop", "forinitialization", "forafterthought", "whileloop", "dowhileloop", 
		"condition", "switchcondition", "switchcase"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'const'", null, "'void'", null, "'for'", "'while'", 
		"'do'", "'if'", "'else'", "'switch'", "'case'", "'break'", "'default'", 
		"';'", "':'", "'.'", null, null, null, null, "'='", "'||'", "'&&'", "'!'", 
		"'?'", null, null, "'('", "')'", "'{'", "'}'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "STRINGVALUE", "WHITESPACE", "TYPEQUALIFIER", "TYPESPECIFIER", "FUNCTIONRETURNTYPESPECIFIER", 
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
			setState(52);
			startsymbol();
			setState(53);
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
		public VariabledeclarationContext variabledeclaration() {
			return getRuleContext(VariabledeclarationContext.class,0);
		}
		public StartsymbolContext startsymbol() {
			return getRuleContext(StartsymbolContext.class,0);
		}
		public ConstantdeclarationContext constantdeclaration() {
			return getRuleContext(ConstantdeclarationContext.class,0);
		}
		public FunctiondeclarationContext functiondeclaration() {
			return getRuleContext(FunctiondeclarationContext.class,0);
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
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				variabledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				variabledeclaration();
				setState(57);
				startsymbol();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				constantdeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				constantdeclaration();
				setState(61);
				startsymbol();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				functiondeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				functiondeclaration();
				setState(65);
				startsymbol();
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
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				variabledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				variabledeclaration();
				setState(71);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				constantdeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				constantdeclaration();
				setState(75);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(77);
				assignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(78);
				assignment();
				setState(79);
				statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(81);
				forloop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(82);
				forloop();
				setState(83);
				statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(85);
				condition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(86);
				condition();
				setState(87);
				statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(89);
				switchcondition();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(90);
				switchcondition();
				setState(91);
				statement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(93);
				whileloop();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(94);
				whileloop();
				setState(95);
				statement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(97);
				dowhileloop();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(98);
				dowhileloop();
				setState(99);
				statement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(101);
				functioncall();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(102);
				functioncall();
				setState(103);
				statement();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(105);
				parallelassignment();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(106);
				parallelassignment();
				setState(107);
				statement();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
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
		enterRule(_localctx, 6, RULE_variabledeclaration);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new DeclarationAndInitializationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(TYPESPECIFIER);
				setState(113);
				match(IDENTIFIER);
				setState(114);
				match(ASSIGNMENTOPERATOR);
				setState(115);
				expression();
				setState(116);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new DeclarationOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(TYPESPECIFIER);
				setState(119);
				match(IDENTIFIER);
				setState(120);
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
		enterRule(_localctx, 8, RULE_constantdeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(TYPEQUALIFIER);
			setState(124);
			match(TYPESPECIFIER);
			setState(125);
			match(IDENTIFIER);
			setState(126);
			match(ASSIGNMENTOPERATOR);
			setState(127);
			expression();
			setState(128);
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
		public TerminalNode QUESTIONMARK() { return getToken(CParser.QUESTIONMARK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(CParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(CParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 10, RULE_assignment);
		try {
			int _alt;
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new StandardAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(IDENTIFIER);
				setState(131);
				match(ASSIGNMENTOPERATOR);
				setState(132);
				expression();
				setState(133);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new MultipleAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(137); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(135);
						match(IDENTIFIER);
						setState(136);
						match(ASSIGNMENTOPERATOR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(139); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(141);
				expression();
				setState(142);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new TernaryOperatorAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				match(IDENTIFIER);
				setState(145);
				match(ASSIGNMENTOPERATOR);
				setState(146);
				logicalexpression(0);
				setState(147);
				match(QUESTIONMARK);
				setState(148);
				expression();
				setState(149);
				match(COLON);
				setState(150);
				expression();
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
		enterRule(_localctx, 12, RULE_parallelassignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(LEFTBRACE);
			setState(156);
			identifierlist();
			setState(157);
			match(RIGHTBRACE);
			setState(158);
			match(ASSIGNMENTOPERATOR);
			setState(159);
			match(LEFTBRACE);
			setState(160);
			valuelist();
			setState(161);
			match(RIGHTBRACE);
			setState(162);
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
		enterRule(_localctx, 14, RULE_identifierlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(IDENTIFIER);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(165);
				match(COMMA);
				setState(166);
				match(IDENTIFIER);
				}
				}
				setState(171);
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
		enterRule(_localctx, 16, RULE_valuelist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			expression();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(173);
				match(COMMA);
				setState(174);
				expression();
				}
				}
				setState(179);
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
		enterRule(_localctx, 18, RULE_expression);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				arithmeticexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				logicalexpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				stringexpression(0);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_arithmeticexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFTPARENTHESE:
				{
				_localctx = new ParenthesesArithmeticExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(186);
				match(LEFTPARENTHESE);
				setState(187);
				arithmeticexpression(0);
				setState(188);
				match(RIGHTPARENTHESE);
				}
				break;
			case STRINGVALUE:
			case LOGICALVALUE:
			case IDENTIFIER:
			case NUMERICALVALUE:
				{
				_localctx = new ArithmeticAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(199);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExpContext(new ArithmeticexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticexpression);
						setState(193);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(194);
						match(MULTIPLICATIONDIVISIONOPERATOR);
						setState(195);
						arithmeticexpression(4);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpContext(new ArithmeticexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticexpression);
						setState(196);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(197);
						match(ADDITIONSUBTRACTIONOPERATOR);
						setState(198);
						arithmeticexpression(3);
						}
						break;
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_logicalexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFTPARENTHESE:
				{
				_localctx = new ParenthesesLogicExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(205);
				match(LEFTPARENTHESE);
				setState(206);
				logicalexpression(0);
				setState(207);
				match(RIGHTPARENTHESE);
				}
				break;
			case LOGICALNEGATION:
				{
				_localctx = new LogicNegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				match(LOGICALNEGATION);
				setState(210);
				logicalexpression(6);
				}
				break;
			case STRINGVALUE:
			case LOGICALVALUE:
			case IDENTIFIER:
			case NUMERICALVALUE:
				{
				_localctx = new LogicalAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(226);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalLogicExpContext(new LogicalexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalexpression);
						setState(214);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(215);
						match(RELATIONALOPERATOR);
						setState(216);
						logicalexpression(6);
						}
						break;
					case 2:
						{
						_localctx = new EqualityLogicExpContext(new LogicalexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalexpression);
						setState(217);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(218);
						match(EQUALITYOPERATOR);
						setState(219);
						logicalexpression(5);
						}
						break;
					case 3:
						{
						_localctx = new LogicalAndExpContext(new LogicalexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalexpression);
						setState(220);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(221);
						match(LOGICALAND);
						setState(222);
						logicalexpression(4);
						}
						break;
					case 4:
						{
						_localctx = new LogicalOrExpContext(new LogicalexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalexpression);
						setState(223);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(224);
						match(LOGICALOR);
						setState(225);
						logicalexpression(3);
						}
						break;
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_stringexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new StringExpAtomContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(232);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StringConcatExpContext(new StringexpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_stringexpression);
					setState(234);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(235);
					match(STRINGCONCATENATION);
					setState(236);
					stringexpression(3);
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_atom);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IdentifierAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(IDENTIFIER);
				}
				break;
			case NUMERICALVALUE:
				_localctx = new NumericAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(NUMERICALVALUE);
				}
				break;
			case STRINGVALUE:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				match(STRINGVALUE);
				}
				break;
			case LOGICALVALUE:
				_localctx = new LogicAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
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
		enterRule(_localctx, 28, RULE_functiondeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(FUNCTIONRETURNTYPESPECIFIER);
			setState(249);
			match(IDENTIFIER);
			setState(250);
			match(LEFTPARENTHESE);
			setState(251);
			functionargumentlist();
			setState(252);
			match(RIGHTPARENTHESE);
			setState(253);
			match(LEFTBRACE);
			setState(254);
			statement();
			setState(255);
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
		enterRule(_localctx, 30, RULE_functionargumentlist);
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(TYPESPECIFIER);
				setState(258);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(TYPESPECIFIER);
				setState(260);
				match(IDENTIFIER);
				setState(261);
				match(COMMA);
				setState(262);
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
		enterRule(_localctx, 32, RULE_functioncall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(IDENTIFIER);
			setState(267);
			match(LEFTPARENTHESE);
			setState(268);
			functioncallarguments();
			setState(269);
			match(RIGHTPARENTHESE);
			setState(270);
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
		enterRule(_localctx, 34, RULE_functioncallarguments);
		try {
			int _alt;
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGVALUE:
			case LOGICALVALUE:
			case LOGICALNEGATION:
			case IDENTIFIER:
			case NUMERICALVALUE:
			case LEFTPARENTHESE:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				expression();
				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(273);
						match(COMMA);
						setState(274);
						functioncallarguments();
						}
						} 
					}
					setState(279);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		enterRule(_localctx, 36, RULE_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(FORLOOPKEYWORD);
			setState(284);
			match(LEFTPARENTHESE);
			setState(285);
			forinitialization();
			setState(286);
			match(SEMICOLON);
			setState(287);
			logicalexpression(0);
			setState(288);
			match(SEMICOLON);
			setState(289);
			forafterthought();
			setState(290);
			match(RIGHTPARENTHESE);
			setState(291);
			match(LEFTBRACE);
			setState(292);
			statement();
			setState(293);
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
		enterRule(_localctx, 38, RULE_forinitialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(IDENTIFIER);
			setState(296);
			match(ASSIGNMENTOPERATOR);
			setState(297);
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
		enterRule(_localctx, 40, RULE_forafterthought);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(IDENTIFIER);
			setState(300);
			match(ASSIGNMENTOPERATOR);
			setState(301);
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
		public TerminalNode LEFTBRACE() { return getToken(CParser.LEFTBRACE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RIGHTBRACE() { return getToken(CParser.RIGHTBRACE, 0); }
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
		enterRule(_localctx, 42, RULE_whileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(WHILELOOPKEYWORD);
			setState(304);
			match(LEFTPARENTHESE);
			setState(305);
			logicalexpression(0);
			setState(306);
			match(RIGHTPARENTHESE);
			setState(307);
			match(LEFTBRACE);
			setState(308);
			statement();
			setState(309);
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
		enterRule(_localctx, 44, RULE_dowhileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(DOWHILEKEYWORD);
			setState(312);
			match(LEFTBRACE);
			setState(313);
			statement();
			setState(314);
			match(RIGHTBRACE);
			setState(315);
			match(WHILELOOPKEYWORD);
			setState(316);
			match(LEFTPARENTHESE);
			setState(317);
			logicalexpression(0);
			setState(318);
			match(RIGHTPARENTHESE);
			setState(319);
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
		public List<TerminalNode> LEFTBRACE() { return getTokens(CParser.LEFTBRACE); }
		public TerminalNode LEFTBRACE(int i) {
			return getToken(CParser.LEFTBRACE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> RIGHTBRACE() { return getTokens(CParser.RIGHTBRACE); }
		public TerminalNode RIGHTBRACE(int i) {
			return getToken(CParser.RIGHTBRACE, i);
		}
		public TerminalNode CONDITIONELSEKEYWORD() { return getToken(CParser.CONDITIONELSEKEYWORD, 0); }
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
		enterRule(_localctx, 46, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(CONDITIONKEYWORD);
			setState(322);
			match(LEFTPARENTHESE);
			setState(323);
			logicalexpression(0);
			setState(324);
			match(RIGHTPARENTHESE);
			setState(325);
			match(LEFTBRACE);
			setState(326);
			statement();
			setState(327);
			match(RIGHTBRACE);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONDITIONELSEKEYWORD) {
				{
				setState(328);
				match(CONDITIONELSEKEYWORD);
				setState(329);
				match(LEFTBRACE);
				setState(330);
				statement();
				setState(331);
				match(RIGHTBRACE);
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
		enterRule(_localctx, 48, RULE_switchcondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(SWITCHKEYWORD);
			setState(336);
			match(LEFTPARENTHESE);
			setState(337);
			expression();
			setState(338);
			match(RIGHTPARENTHESE);
			setState(339);
			match(LEFTBRACE);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SWITCHCASEKEYWORD) {
				{
				{
				setState(340);
				switchcase();
				}
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULTKEYWORD) {
				{
				setState(346);
				match(DEFAULTKEYWORD);
				setState(347);
				match(COLON);
				setState(348);
				statement();
				}
			}

			setState(351);
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode BREAKKEYWORD() { return getToken(CParser.BREAKKEYWORD, 0); }
		public TerminalNode SEMICOLON() { return getToken(CParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 50, RULE_switchcase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(SWITCHCASEKEYWORD);
			setState(354);
			expression();
			setState(355);
			match(COLON);
			setState(356);
			statement();
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAKKEYWORD) {
				{
				setState(357);
				match(BREAKKEYWORD);
				setState(358);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return arithmeticexpression_sempred((ArithmeticexpressionContext)_localctx, predIndex);
		case 11:
			return logicalexpression_sempred((LogicalexpressionContext)_localctx, predIndex);
		case 12:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u016c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3F\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4q\n\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5|\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\6\7\u008c\n\7\r\7\16\7\u008d\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u009c\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\7\t\u00aa\n\t\f\t\16\t\u00ad\13\t\3\n\3\n\3\n\7\n\u00b2"+
		"\n\n\f\n\16\n\u00b5\13\n\3\13\3\13\3\13\5\13\u00ba\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u00c2\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00ca\n\f\f\f\16"+
		"\f\u00cd\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d7\n\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00e5\n\r\f\r\16\r\u00e8\13"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00f0\n\16\f\16\16\16\u00f3\13\16"+
		"\3\17\3\17\3\17\3\17\5\17\u00f9\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u010b\n\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\7\23\u0116\n\23\f\23\16\23\u0119\13"+
		"\23\3\23\5\23\u011c\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u0150\n\31\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0158\n\32\f\32\16\32\u015b"+
		"\13\32\3\32\3\32\3\32\5\32\u0160\n\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\5\33\u016a\n\33\3\33\2\5\26\30\32\34\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\2\2\2\u0187\2\66\3\2\2\2\4E\3\2\2\2"+
		"\6p\3\2\2\2\b{\3\2\2\2\n}\3\2\2\2\f\u009b\3\2\2\2\16\u009d\3\2\2\2\20"+
		"\u00a6\3\2\2\2\22\u00ae\3\2\2\2\24\u00b9\3\2\2\2\26\u00c1\3\2\2\2\30\u00d6"+
		"\3\2\2\2\32\u00e9\3\2\2\2\34\u00f8\3\2\2\2\36\u00fa\3\2\2\2 \u010a\3\2"+
		"\2\2\"\u010c\3\2\2\2$\u011b\3\2\2\2&\u011d\3\2\2\2(\u0129\3\2\2\2*\u012d"+
		"\3\2\2\2,\u0131\3\2\2\2.\u0139\3\2\2\2\60\u0143\3\2\2\2\62\u0151\3\2\2"+
		"\2\64\u0163\3\2\2\2\66\67\5\4\3\2\678\7\2\2\38\3\3\2\2\29F\5\b\5\2:;\5"+
		"\b\5\2;<\5\4\3\2<F\3\2\2\2=F\5\n\6\2>?\5\n\6\2?@\5\4\3\2@F\3\2\2\2AF\5"+
		"\36\20\2BC\5\36\20\2CD\5\4\3\2DF\3\2\2\2E9\3\2\2\2E:\3\2\2\2E=\3\2\2\2"+
		"E>\3\2\2\2EA\3\2\2\2EB\3\2\2\2F\5\3\2\2\2Gq\5\b\5\2HI\5\b\5\2IJ\5\6\4"+
		"\2Jq\3\2\2\2Kq\5\n\6\2LM\5\n\6\2MN\5\6\4\2Nq\3\2\2\2Oq\5\f\7\2PQ\5\f\7"+
		"\2QR\5\6\4\2Rq\3\2\2\2Sq\5&\24\2TU\5&\24\2UV\5\6\4\2Vq\3\2\2\2Wq\5\60"+
		"\31\2XY\5\60\31\2YZ\5\6\4\2Zq\3\2\2\2[q\5\62\32\2\\]\5\62\32\2]^\5\6\4"+
		"\2^q\3\2\2\2_q\5,\27\2`a\5,\27\2ab\5\6\4\2bq\3\2\2\2cq\5.\30\2de\5.\30"+
		"\2ef\5\6\4\2fq\3\2\2\2gq\5\"\22\2hi\5\"\22\2ij\5\6\4\2jq\3\2\2\2kq\5\16"+
		"\b\2lm\5\16\b\2mn\5\6\4\2nq\3\2\2\2oq\3\2\2\2pG\3\2\2\2pH\3\2\2\2pK\3"+
		"\2\2\2pL\3\2\2\2pO\3\2\2\2pP\3\2\2\2pS\3\2\2\2pT\3\2\2\2pW\3\2\2\2pX\3"+
		"\2\2\2p[\3\2\2\2p\\\3\2\2\2p_\3\2\2\2p`\3\2\2\2pc\3\2\2\2pd\3\2\2\2pg"+
		"\3\2\2\2ph\3\2\2\2pk\3\2\2\2pl\3\2\2\2po\3\2\2\2q\7\3\2\2\2rs\7\6\2\2"+
		"st\7\36\2\2tu\7\31\2\2uv\5\24\13\2vw\7\22\2\2w|\3\2\2\2xy\7\6\2\2yz\7"+
		"\36\2\2z|\7\22\2\2{r\3\2\2\2{x\3\2\2\2|\t\3\2\2\2}~\7\5\2\2~\177\7\6\2"+
		"\2\177\u0080\7\36\2\2\u0080\u0081\7\31\2\2\u0081\u0082\5\24\13\2\u0082"+
		"\u0083\7\22\2\2\u0083\13\3\2\2\2\u0084\u0085\7\36\2\2\u0085\u0086\7\31"+
		"\2\2\u0086\u0087\5\24\13\2\u0087\u0088\7\22\2\2\u0088\u009c\3\2\2\2\u0089"+
		"\u008a\7\36\2\2\u008a\u008c\7\31\2\2\u008b\u0089\3\2\2\2\u008c\u008d\3"+
		"\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\5\24\13\2\u0090\u0091\7\22\2\2\u0091\u009c\3\2\2\2\u0092\u0093"+
		"\7\36\2\2\u0093\u0094\7\31\2\2\u0094\u0095\5\30\r\2\u0095\u0096\7\35\2"+
		"\2\u0096\u0097\5\24\13\2\u0097\u0098\7\23\2\2\u0098\u0099\5\24\13\2\u0099"+
		"\u009a\7\22\2\2\u009a\u009c\3\2\2\2\u009b\u0084\3\2\2\2\u009b\u008b\3"+
		"\2\2\2\u009b\u0092\3\2\2\2\u009c\r\3\2\2\2\u009d\u009e\7\"\2\2\u009e\u009f"+
		"\5\20\t\2\u009f\u00a0\7#\2\2\u00a0\u00a1\7\31\2\2\u00a1\u00a2\7\"\2\2"+
		"\u00a2\u00a3\5\22\n\2\u00a3\u00a4\7#\2\2\u00a4\u00a5\7\22\2\2\u00a5\17"+
		"\3\2\2\2\u00a6\u00ab\7\36\2\2\u00a7\u00a8\7$\2\2\u00a8\u00aa\7\36\2\2"+
		"\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\21\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b3\5\24\13\2\u00af"+
		"\u00b0\7$\2\2\u00b0\u00b2\5\24\13\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3"+
		"\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\23\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00ba\5\26\f\2\u00b7\u00ba\5\30\r\2\u00b8\u00ba\5"+
		"\32\16\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba"+
		"\25\3\2\2\2\u00bb\u00bc\b\f\1\2\u00bc\u00bd\7 \2\2\u00bd\u00be\5\26\f"+
		"\2\u00be\u00bf\7!\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00c2\5\34\17\2\u00c1"+
		"\u00bb\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00cb\3\2\2\2\u00c3\u00c4\f\5"+
		"\2\2\u00c4\u00c5\7\25\2\2\u00c5\u00ca\5\26\f\6\u00c6\u00c7\f\4\2\2\u00c7"+
		"\u00c8\7\26\2\2\u00c8\u00ca\5\26\f\5\u00c9\u00c3\3\2\2\2\u00c9\u00c6\3"+
		"\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\27\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\b\r\1\2\u00cf\u00d0\7 \2\2"+
		"\u00d0\u00d1\5\30\r\2\u00d1\u00d2\7!\2\2\u00d2\u00d7\3\2\2\2\u00d3\u00d4"+
		"\7\34\2\2\u00d4\u00d7\5\30\r\b\u00d5\u00d7\5\34\17\2\u00d6\u00ce\3\2\2"+
		"\2\u00d6\u00d3\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00e6\3\2\2\2\u00d8\u00d9"+
		"\f\7\2\2\u00d9\u00da\7\27\2\2\u00da\u00e5\5\30\r\b\u00db\u00dc\f\6\2\2"+
		"\u00dc\u00dd\7\30\2\2\u00dd\u00e5\5\30\r\7\u00de\u00df\f\5\2\2\u00df\u00e0"+
		"\7\33\2\2\u00e0\u00e5\5\30\r\6\u00e1\u00e2\f\4\2\2\u00e2\u00e3\7\32\2"+
		"\2\u00e3\u00e5\5\30\r\5\u00e4\u00d8\3\2\2\2\u00e4\u00db\3\2\2\2\u00e4"+
		"\u00de\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\31\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea"+
		"\b\16\1\2\u00ea\u00eb\5\34\17\2\u00eb\u00f1\3\2\2\2\u00ec\u00ed\f\4\2"+
		"\2\u00ed\u00ee\7\24\2\2\u00ee\u00f0\5\32\16\5\u00ef\u00ec\3\2\2\2\u00f0"+
		"\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\33\3\2\2"+
		"\2\u00f3\u00f1\3\2\2\2\u00f4\u00f9\7\36\2\2\u00f5\u00f9\7\37\2\2\u00f6"+
		"\u00f9\7\3\2\2\u00f7\u00f9\7\b\2\2\u00f8\u00f4\3\2\2\2\u00f8\u00f5\3\2"+
		"\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\35\3\2\2\2\u00fa\u00fb"+
		"\7\7\2\2\u00fb\u00fc\7\36\2\2\u00fc\u00fd\7 \2\2\u00fd\u00fe\5 \21\2\u00fe"+
		"\u00ff\7!\2\2\u00ff\u0100\7\"\2\2\u0100\u0101\5\6\4\2\u0101\u0102\7#\2"+
		"\2\u0102\37\3\2\2\2\u0103\u0104\7\6\2\2\u0104\u010b\7\36\2\2\u0105\u0106"+
		"\7\6\2\2\u0106\u0107\7\36\2\2\u0107\u0108\7$\2\2\u0108\u010b\5 \21\2\u0109"+
		"\u010b\3\2\2\2\u010a\u0103\3\2\2\2\u010a\u0105\3\2\2\2\u010a\u0109\3\2"+
		"\2\2\u010b!\3\2\2\2\u010c\u010d\7\36\2\2\u010d\u010e\7 \2\2\u010e\u010f"+
		"\5$\23\2\u010f\u0110\7!\2\2\u0110\u0111\7\22\2\2\u0111#\3\2\2\2\u0112"+
		"\u0117\5\24\13\2\u0113\u0114\7$\2\2\u0114\u0116\5$\23\2\u0115\u0113\3"+
		"\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u011c\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0112\3\2"+
		"\2\2\u011b\u011a\3\2\2\2\u011c%\3\2\2\2\u011d\u011e\7\t\2\2\u011e\u011f"+
		"\7 \2\2\u011f\u0120\5(\25\2\u0120\u0121\7\22\2\2\u0121\u0122\5\30\r\2"+
		"\u0122\u0123\7\22\2\2\u0123\u0124\5*\26\2\u0124\u0125\7!\2\2\u0125\u0126"+
		"\7\"\2\2\u0126\u0127\5\6\4\2\u0127\u0128\7#\2\2\u0128\'\3\2\2\2\u0129"+
		"\u012a\7\36\2\2\u012a\u012b\7\31\2\2\u012b\u012c\5\24\13\2\u012c)\3\2"+
		"\2\2\u012d\u012e\7\36\2\2\u012e\u012f\7\31\2\2\u012f\u0130\5\24\13\2\u0130"+
		"+\3\2\2\2\u0131\u0132\7\n\2\2\u0132\u0133\7 \2\2\u0133\u0134\5\30\r\2"+
		"\u0134\u0135\7!\2\2\u0135\u0136\7\"\2\2\u0136\u0137\5\6\4\2\u0137\u0138"+
		"\7#\2\2\u0138-\3\2\2\2\u0139\u013a\7\13\2\2\u013a\u013b\7\"\2\2\u013b"+
		"\u013c\5\6\4\2\u013c\u013d\7#\2\2\u013d\u013e\7\n\2\2\u013e\u013f\7 \2"+
		"\2\u013f\u0140\5\30\r\2\u0140\u0141\7!\2\2\u0141\u0142\7\22\2\2\u0142"+
		"/\3\2\2\2\u0143\u0144\7\f\2\2\u0144\u0145\7 \2\2\u0145\u0146\5\30\r\2"+
		"\u0146\u0147\7!\2\2\u0147\u0148\7\"\2\2\u0148\u0149\5\6\4\2\u0149\u014f"+
		"\7#\2\2\u014a\u014b\7\r\2\2\u014b\u014c\7\"\2\2\u014c\u014d\5\6\4\2\u014d"+
		"\u014e\7#\2\2\u014e\u0150\3\2\2\2\u014f\u014a\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150\61\3\2\2\2\u0151\u0152\7\16\2\2\u0152\u0153\7 \2\2\u0153\u0154"+
		"\5\24\13\2\u0154\u0155\7!\2\2\u0155\u0159\7\"\2\2\u0156\u0158\5\64\33"+
		"\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a"+
		"\3\2\2\2\u015a\u015f\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015d\7\21\2\2"+
		"\u015d\u015e\7\23\2\2\u015e\u0160\5\6\4\2\u015f\u015c\3\2\2\2\u015f\u0160"+
		"\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\7#\2\2\u0162\63\3\2\2\2\u0163"+
		"\u0164\7\17\2\2\u0164\u0165\5\24\13\2\u0165\u0166\7\23\2\2\u0166\u0169"+
		"\5\6\4\2\u0167\u0168\7\20\2\2\u0168\u016a\7\22\2\2\u0169\u0167\3\2\2\2"+
		"\u0169\u016a\3\2\2\2\u016a\65\3\2\2\2\31Ep{\u008d\u009b\u00ab\u00b3\u00b9"+
		"\u00c1\u00c9\u00cb\u00d6\u00e4\u00e6\u00f1\u00f8\u010a\u0117\u011b\u014f"+
		"\u0159\u015f\u0169";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}