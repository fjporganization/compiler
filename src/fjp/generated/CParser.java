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
		COMMENT=1, WHITESPACE=2, WRITEINT=3, READINT=4, WRITEFRAC=5, READFRAC=6, 
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
		RULE_functionstatement = 4, RULE_variabledeclaration = 5, RULE_variableinitializationvalue = 6, 
		RULE_constantdeclaration = 7, RULE_assignment = 8, RULE_standardAssignment = 9, 
		RULE_parallelassignment = 10, RULE_identifierlist = 11, RULE_valuelist = 12, 
		RULE_expression = 13, RULE_ternaryoperator = 14, RULE_ternaryassertive = 15, 
		RULE_ternarynegative = 16, RULE_arithmeticexpression = 17, RULE_logicalexpression = 18, 
		RULE_atom = 19, RULE_functiondeclaration = 20, RULE_functionargumentlist = 21, 
		RULE_functioncall = 22, RULE_functioncallarguments = 23, RULE_forloop = 24, 
		RULE_forinitialization = 25, RULE_forafterthought = 26, RULE_whileloop = 27, 
		RULE_whilestatement = 28, RULE_dowhileloop = 29, RULE_condition = 30, 
		RULE_simplecondition = 31, RULE_ifelsecondition = 32, RULE_assertivebranch = 33, 
		RULE_negativebranch = 34, RULE_switchcondition = 35, RULE_switchcase = 36, 
		RULE_switchstatement = 37, RULE_switchdefaultstatement = 38, RULE_inputinteger = 39, 
		RULE_outputinteger = 40, RULE_inputfrac = 41, RULE_outputfrac = 42;
	public static final String[] ruleNames = {
		"start", "startsymbol", "declarations", "statement", "functionstatement", 
		"variabledeclaration", "variableinitializationvalue", "constantdeclaration", 
		"assignment", "standardAssignment", "parallelassignment", "identifierlist", 
		"valuelist", "expression", "ternaryoperator", "ternaryassertive", "ternarynegative", 
		"arithmeticexpression", "logicalexpression", "atom", "functiondeclaration", 
		"functionargumentlist", "functioncall", "functioncallarguments", "forloop", 
		"forinitialization", "forafterthought", "whileloop", "whilestatement", 
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
		null, "COMMENT", "WHITESPACE", "WRITEINT", "READINT", "WRITEFRAC", "READFRAC", 
		"TYPEQUALIFIER", "TYPESPECIFIER", "FUNCTIONRETURNTYPESPECIFIER", "LOGICALVALUE", 
		"FORLOOPKEYWORD", "WHILELOOPKEYWORD", "DOWHILEKEYWORD", "CONDITIONKEYWORD", 
		"CONDITIONELSEKEYWORD", "SWITCHKEYWORD", "SWITCHCASEKEYWORD", "BREAKKEYWORD", 
		"DEFAULTKEYWORD", "SEMICOLON", "COLON", "STRINGCONCATENATION", "MULTIPLICATIONDIVISIONOPERATOR", 
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
			setState(86);
			startsymbol();
			setState(87);
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
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPEQUALIFIER || _la==TYPESPECIFIER) {
				{
				{
				setState(89);
				declarations();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(95);
				functiondeclaration();
				}
				}
				setState(98); 
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
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPESPECIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				variabledeclaration();
				}
				break;
			case TYPEQUALIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
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
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				variabledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				variabledeclaration();
				setState(106);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				constantdeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				constantdeclaration();
				setState(110);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				assignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(113);
				assignment();
				setState(114);
				statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(116);
				forloop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(117);
				forloop();
				setState(118);
				statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(120);
				condition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(121);
				condition();
				setState(122);
				statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(124);
				switchcondition();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(125);
				switchcondition();
				setState(126);
				statement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(128);
				whileloop();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(129);
				whileloop();
				setState(130);
				statement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(132);
				dowhileloop();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(133);
				dowhileloop();
				setState(134);
				statement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(136);
				functioncall();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(137);
				functioncall();
				setState(138);
				statement();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(140);
				parallelassignment();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(141);
				parallelassignment();
				setState(142);
				statement();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(144);
				outputinteger();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(145);
				outputinteger();
				setState(146);
				statement();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(148);
				outputfrac();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(149);
				outputfrac();
				setState(150);
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

	public static class FunctionstatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<DeclarationsContext> declarations() {
			return getRuleContexts(DeclarationsContext.class);
		}
		public DeclarationsContext declarations(int i) {
			return getRuleContext(DeclarationsContext.class,i);
		}
		public FunctionstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterFunctionstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitFunctionstatement(this);
		}
	}

	public final FunctionstatementContext functionstatement() throws RecognitionException {
		FunctionstatementContext _localctx = new FunctionstatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionstatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(155);
					declarations();
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(161);
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
		public VariableinitializationvalueContext variableinitializationvalue() {
			return getRuleContext(VariableinitializationvalueContext.class,0);
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
		enterRule(_localctx, 10, RULE_variabledeclaration);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new DeclarationAndInitializationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(TYPESPECIFIER);
				setState(164);
				match(IDENTIFIER);
				setState(165);
				match(ASSIGNMENTOPERATOR);
				setState(166);
				variableinitializationvalue();
				setState(167);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new DeclarationOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(TYPESPECIFIER);
				setState(170);
				match(IDENTIFIER);
				setState(171);
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

	public static class VariableinitializationvalueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LogicalexpressionContext logicalexpression() {
			return getRuleContext(LogicalexpressionContext.class,0);
		}
		public TernaryoperatorContext ternaryoperator() {
			return getRuleContext(TernaryoperatorContext.class,0);
		}
		public VariableinitializationvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableinitializationvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterVariableinitializationvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitVariableinitializationvalue(this);
		}
	}

	public final VariableinitializationvalueContext variableinitializationvalue() throws RecognitionException {
		VariableinitializationvalueContext _localctx = new VariableinitializationvalueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableinitializationvalue);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				logicalexpression(0);
				setState(176);
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
		enterRule(_localctx, 14, RULE_constantdeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(TYPEQUALIFIER);
			setState(181);
			match(TYPESPECIFIER);
			setState(182);
			match(IDENTIFIER);
			setState(183);
			match(ASSIGNMENTOPERATOR);
			setState(184);
			expression();
			setState(185);
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
		enterRule(_localctx, 16, RULE_assignment);
		try {
			int _alt;
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new StandAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				standardAssignment();
				setState(188);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new MultipleAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(192); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(190);
						match(IDENTIFIER);
						setState(191);
						match(ASSIGNMENTOPERATOR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(194); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(196);
				expression();
				setState(197);
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

	public static class StandardAssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENTOPERATOR() { return getToken(CParser.ASSIGNMENTOPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LogicalexpressionContext logicalexpression() {
			return getRuleContext(LogicalexpressionContext.class,0);
		}
		public TernaryoperatorContext ternaryoperator() {
			return getRuleContext(TernaryoperatorContext.class,0);
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
		enterRule(_localctx, 18, RULE_standardAssignment);
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(IDENTIFIER);
				setState(202);
				match(ASSIGNMENTOPERATOR);
				setState(203);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(IDENTIFIER);
				setState(205);
				match(ASSIGNMENTOPERATOR);
				setState(206);
				logicalexpression(0);
				setState(207);
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
		enterRule(_localctx, 20, RULE_parallelassignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(LEFTBRACE);
			setState(212);
			identifierlist();
			setState(213);
			match(RIGHTBRACE);
			setState(214);
			match(ASSIGNMENTOPERATOR);
			setState(215);
			match(LEFTBRACE);
			setState(216);
			valuelist();
			setState(217);
			match(RIGHTBRACE);
			setState(218);
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
		enterRule(_localctx, 22, RULE_identifierlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(IDENTIFIER);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(221);
				match(COMMA);
				setState(222);
				match(IDENTIFIER);
				}
				}
				setState(227);
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
		enterRule(_localctx, 24, RULE_valuelist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			expression();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(229);
				match(COMMA);
				setState(230);
				expression();
				}
				}
				setState(235);
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
		enterRule(_localctx, 26, RULE_expression);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				arithmeticexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				logicalexpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
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
		enterRule(_localctx, 28, RULE_ternaryoperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(QUESTIONMARK);
			setState(242);
			ternaryassertive();
			setState(243);
			match(COLON);
			setState(244);
			ternarynegative();
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
		enterRule(_localctx, 30, RULE_ternaryassertive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
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
		enterRule(_localctx, 32, RULE_ternarynegative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
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
	public static class UnaryOperatorContext extends ArithmeticexpressionContext {
		public TerminalNode ADDITIONSUBTRACTIONOPERATOR() { return getToken(CParser.ADDITIONSUBTRACTIONOPERATOR, 0); }
		public ArithmeticexpressionContext arithmeticexpression() {
			return getRuleContext(ArithmeticexpressionContext.class,0);
		}
		public UnaryOperatorContext(ArithmeticexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitUnaryOperator(this);
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
	public static class DataTypeConversionContext extends ArithmeticexpressionContext {
		public TerminalNode LEFTPARENTHESE() { return getToken(CParser.LEFTPARENTHESE, 0); }
		public TerminalNode TYPESPECIFIER() { return getToken(CParser.TYPESPECIFIER, 0); }
		public TerminalNode RIGHTPARENTHESE() { return getToken(CParser.RIGHTPARENTHESE, 0); }
		public ArithmeticexpressionContext arithmeticexpression() {
			return getRuleContext(ArithmeticexpressionContext.class,0);
		}
		public DataTypeConversionContext(ArithmeticexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDataTypeConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDataTypeConversion(this);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_arithmeticexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(251);
				match(ADDITIONSUBTRACTIONOPERATOR);
				setState(252);
				arithmeticexpression(6);
				}
				break;
			case 2:
				{
				_localctx = new DataTypeConversionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(253);
				match(LEFTPARENTHESE);
				setState(254);
				match(TYPESPECIFIER);
				setState(255);
				match(RIGHTPARENTHESE);
				setState(256);
				arithmeticexpression(5);
				}
				break;
			case 3:
				{
				_localctx = new ParenthesesArithmeticExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(257);
				match(LEFTPARENTHESE);
				setState(258);
				arithmeticexpression(0);
				setState(259);
				match(RIGHTPARENTHESE);
				}
				break;
			case 4:
				{
				_localctx = new ArithmeticAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(261);
				atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(270);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExpContext(new ArithmeticexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticexpression);
						setState(264);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(265);
						match(MULTIPLICATIONDIVISIONOPERATOR);
						setState(266);
						arithmeticexpression(4);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpContext(new ArithmeticexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticexpression);
						setState(267);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(268);
						match(ADDITIONSUBTRACTIONOPERATOR);
						setState(269);
						arithmeticexpression(3);
						}
						break;
					}
					} 
				}
				setState(274);
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
	public static class ArithmeticExpAtomContext extends LogicalexpressionContext {
		public ArithmeticexpressionContext arithmeticexpression() {
			return getRuleContext(ArithmeticexpressionContext.class,0);
		}
		public ArithmeticExpAtomContext(LogicalexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterArithmeticExpAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitArithmeticExpAtom(this);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_logicalexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesesLogicExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(276);
				match(LEFTPARENTHESE);
				setState(277);
				logicalexpression(0);
				setState(278);
				match(RIGHTPARENTHESE);
				}
				break;
			case 2:
				{
				_localctx = new LogicNegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(280);
				match(LOGICALNEGATION);
				setState(281);
				logicalexpression(7);
				}
				break;
			case 3:
				{
				_localctx = new LogicalAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(282);
				atom();
				}
				break;
			case 4:
				{
				_localctx = new ArithmeticExpAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(283);
				arithmeticexpression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(298);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalLogicExpContext(new LogicalexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalexpression);
						setState(286);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(287);
						match(RELATIONALOPERATOR);
						setState(288);
						logicalexpression(7);
						}
						break;
					case 2:
						{
						_localctx = new EqualityLogicExpContext(new LogicalexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalexpression);
						setState(289);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(290);
						match(EQUALITYOPERATOR);
						setState(291);
						logicalexpression(6);
						}
						break;
					case 3:
						{
						_localctx = new LogicalAndExpContext(new LogicalexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalexpression);
						setState(292);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(293);
						match(LOGICALAND);
						setState(294);
						logicalexpression(5);
						}
						break;
					case 4:
						{
						_localctx = new LogicalOrExpContext(new LogicalexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalexpression);
						setState(295);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(296);
						match(LOGICALOR);
						setState(297);
						logicalexpression(4);
						}
						break;
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		enterRule(_localctx, 38, RULE_atom);
		try {
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READINT:
				_localctx = new IntegerIOContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				inputinteger();
				}
				break;
			case READFRAC:
				_localctx = new FractionIOContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				inputfrac();
				}
				break;
			case IDENTIFIER:
				_localctx = new IdentifierAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				match(IDENTIFIER);
				}
				break;
			case NUMERICALVALUE:
				_localctx = new NumericAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(306);
				match(NUMERICALVALUE);
				}
				break;
			case LOGICALVALUE:
				_localctx = new LogicAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(307);
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
		public FunctionstatementContext functionstatement() {
			return getRuleContext(FunctionstatementContext.class,0);
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
		enterRule(_localctx, 40, RULE_functiondeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(FUNCTIONRETURNTYPESPECIFIER);
			setState(311);
			match(IDENTIFIER);
			setState(312);
			match(LEFTPARENTHESE);
			setState(313);
			functionargumentlist();
			setState(314);
			match(RIGHTPARENTHESE);
			setState(315);
			match(LEFTBRACE);
			setState(316);
			functionstatement();
			setState(317);
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
		enterRule(_localctx, 42, RULE_functionargumentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		enterRule(_localctx, 44, RULE_functioncall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(IDENTIFIER);
			setState(322);
			match(LEFTPARENTHESE);
			setState(323);
			functioncallarguments();
			setState(324);
			match(RIGHTPARENTHESE);
			setState(325);
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
		enterRule(_localctx, 46, RULE_functioncallarguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		enterRule(_localctx, 48, RULE_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(FORLOOPKEYWORD);
			setState(330);
			match(LEFTPARENTHESE);
			setState(331);
			forinitialization();
			setState(332);
			match(SEMICOLON);
			setState(333);
			logicalexpression(0);
			setState(334);
			match(SEMICOLON);
			setState(335);
			forafterthought();
			setState(336);
			match(RIGHTPARENTHESE);
			setState(337);
			match(LEFTBRACE);
			setState(338);
			statement();
			setState(339);
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
		enterRule(_localctx, 50, RULE_forinitialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
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
		enterRule(_localctx, 52, RULE_forafterthought);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
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
		enterRule(_localctx, 54, RULE_whileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(WHILELOOPKEYWORD);
			setState(346);
			match(LEFTPARENTHESE);
			setState(347);
			logicalexpression(0);
			setState(348);
			match(RIGHTPARENTHESE);
			setState(349);
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
		enterRule(_localctx, 56, RULE_whilestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(LEFTBRACE);
			setState(352);
			statement();
			setState(353);
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
		enterRule(_localctx, 58, RULE_dowhileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(DOWHILEKEYWORD);
			setState(356);
			match(LEFTBRACE);
			setState(357);
			statement();
			setState(358);
			match(RIGHTBRACE);
			setState(359);
			match(WHILELOOPKEYWORD);
			setState(360);
			match(LEFTPARENTHESE);
			setState(361);
			logicalexpression(0);
			setState(362);
			match(RIGHTPARENTHESE);
			setState(363);
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
		enterRule(_localctx, 60, RULE_condition);
		try {
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(CONDITIONKEYWORD);
				setState(366);
				match(LEFTPARENTHESE);
				setState(367);
				logicalexpression(0);
				setState(368);
				match(RIGHTPARENTHESE);
				setState(369);
				simplecondition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				match(CONDITIONKEYWORD);
				setState(372);
				match(LEFTPARENTHESE);
				setState(373);
				logicalexpression(0);
				setState(374);
				match(RIGHTPARENTHESE);
				setState(375);
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
		enterRule(_localctx, 62, RULE_simplecondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(LEFTBRACE);
			setState(380);
			statement();
			setState(381);
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
		enterRule(_localctx, 64, RULE_ifelsecondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			assertivebranch();
			setState(384);
			match(CONDITIONELSEKEYWORD);
			setState(385);
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
		enterRule(_localctx, 66, RULE_assertivebranch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(LEFTBRACE);
			setState(388);
			statement();
			setState(389);
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
		enterRule(_localctx, 68, RULE_negativebranch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(LEFTBRACE);
			setState(392);
			statement();
			setState(393);
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
		enterRule(_localctx, 70, RULE_switchcondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(SWITCHKEYWORD);
			setState(396);
			match(LEFTPARENTHESE);
			setState(397);
			expression();
			setState(398);
			match(RIGHTPARENTHESE);
			setState(399);
			match(LEFTBRACE);
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SWITCHCASEKEYWORD) {
				{
				{
				setState(400);
				switchcase();
				}
				}
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULTKEYWORD) {
				{
				setState(406);
				match(DEFAULTKEYWORD);
				setState(407);
				match(COLON);
				setState(408);
				switchdefaultstatement();
				}
			}

			setState(411);
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
		enterRule(_localctx, 72, RULE_switchcase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(SWITCHCASEKEYWORD);
			setState(414);
			expression();
			setState(415);
			match(COLON);
			setState(416);
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
		enterRule(_localctx, 74, RULE_switchstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			statement();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAKKEYWORD) {
				{
				setState(419);
				match(BREAKKEYWORD);
				setState(420);
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
		enterRule(_localctx, 76, RULE_switchdefaultstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
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
		enterRule(_localctx, 78, RULE_inputinteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(READINT);
			setState(426);
			match(LEFTPARENTHESE);
			setState(427);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 80, RULE_outputinteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(WRITEINT);
			setState(430);
			match(LEFTPARENTHESE);
			setState(431);
			expression();
			setState(432);
			match(RIGHTPARENTHESE);
			setState(433);
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
		enterRule(_localctx, 82, RULE_inputfrac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(READFRAC);
			setState(436);
			match(LEFTPARENTHESE);
			setState(437);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 84, RULE_outputfrac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(WRITEFRAC);
			setState(440);
			match(LEFTPARENTHESE);
			setState(441);
			expression();
			setState(442);
			match(RIGHTPARENTHESE);
			setState(443);
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
		case 17:
			return arithmeticexpression_sempred((ArithmeticexpressionContext)_localctx, predIndex);
		case 18:
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
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u01c0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\3\7\3]\n\3\f\3\16\3`\13\3\3\3\6\3c\n\3\r\3\16\3d\3"+
		"\4\3\4\5\4i\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\u009c\n\5\3\6\7\6\u009f\n\6\f\6\16\6\u00a2\13\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00af\n\7\3\b\3\b\3\b\3\b\5\b\u00b5\n"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\6\n\u00c3\n\n\r\n\16"+
		"\n\u00c4\3\n\3\n\3\n\5\n\u00ca\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00d4\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\7\r\u00e2\n\r\f\r\16\r\u00e5\13\r\3\16\3\16\3\16\7\16\u00ea\n\16\f\16"+
		"\16\16\u00ed\13\16\3\17\3\17\3\17\5\17\u00f2\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u0109\n\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0111"+
		"\n\23\f\23\16\23\u0114\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\5\24\u011f\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\7\24\u012d\n\24\f\24\16\24\u0130\13\24\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u0137\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u017c\n \3!\3!"+
		"\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\7%\u0194"+
		"\n%\f%\16%\u0197\13%\3%\3%\3%\5%\u019c\n%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'"+
		"\3\'\5\'\u01a8\n\'\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3,"+
		"\3,\3,\3,\3,\3,\3,\2\4$&-\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\2\2\u01cd\2X\3\2\2\2\4^\3\2\2\2\6h"+
		"\3\2\2\2\b\u009b\3\2\2\2\n\u00a0\3\2\2\2\f\u00ae\3\2\2\2\16\u00b4\3\2"+
		"\2\2\20\u00b6\3\2\2\2\22\u00c9\3\2\2\2\24\u00d3\3\2\2\2\26\u00d5\3\2\2"+
		"\2\30\u00de\3\2\2\2\32\u00e6\3\2\2\2\34\u00f1\3\2\2\2\36\u00f3\3\2\2\2"+
		" \u00f8\3\2\2\2\"\u00fa\3\2\2\2$\u0108\3\2\2\2&\u011e\3\2\2\2(\u0136\3"+
		"\2\2\2*\u0138\3\2\2\2,\u0141\3\2\2\2.\u0143\3\2\2\2\60\u0149\3\2\2\2\62"+
		"\u014b\3\2\2\2\64\u0157\3\2\2\2\66\u0159\3\2\2\28\u015b\3\2\2\2:\u0161"+
		"\3\2\2\2<\u0165\3\2\2\2>\u017b\3\2\2\2@\u017d\3\2\2\2B\u0181\3\2\2\2D"+
		"\u0185\3\2\2\2F\u0189\3\2\2\2H\u018d\3\2\2\2J\u019f\3\2\2\2L\u01a4\3\2"+
		"\2\2N\u01a9\3\2\2\2P\u01ab\3\2\2\2R\u01af\3\2\2\2T\u01b5\3\2\2\2V\u01b9"+
		"\3\2\2\2XY\5\4\3\2YZ\7\2\2\3Z\3\3\2\2\2[]\5\6\4\2\\[\3\2\2\2]`\3\2\2\2"+
		"^\\\3\2\2\2^_\3\2\2\2_b\3\2\2\2`^\3\2\2\2ac\5*\26\2ba\3\2\2\2cd\3\2\2"+
		"\2db\3\2\2\2de\3\2\2\2e\5\3\2\2\2fi\5\f\7\2gi\5\20\t\2hf\3\2\2\2hg\3\2"+
		"\2\2i\7\3\2\2\2j\u009c\5\f\7\2kl\5\f\7\2lm\5\b\5\2m\u009c\3\2\2\2n\u009c"+
		"\5\20\t\2op\5\20\t\2pq\5\b\5\2q\u009c\3\2\2\2r\u009c\5\22\n\2st\5\22\n"+
		"\2tu\5\b\5\2u\u009c\3\2\2\2v\u009c\5\62\32\2wx\5\62\32\2xy\5\b\5\2y\u009c"+
		"\3\2\2\2z\u009c\5> \2{|\5> \2|}\5\b\5\2}\u009c\3\2\2\2~\u009c\5H%\2\177"+
		"\u0080\5H%\2\u0080\u0081\5\b\5\2\u0081\u009c\3\2\2\2\u0082\u009c\58\35"+
		"\2\u0083\u0084\58\35\2\u0084\u0085\5\b\5\2\u0085\u009c\3\2\2\2\u0086\u009c"+
		"\5<\37\2\u0087\u0088\5<\37\2\u0088\u0089\5\b\5\2\u0089\u009c\3\2\2\2\u008a"+
		"\u009c\5.\30\2\u008b\u008c\5.\30\2\u008c\u008d\5\b\5\2\u008d\u009c\3\2"+
		"\2\2\u008e\u009c\5\26\f\2\u008f\u0090\5\26\f\2\u0090\u0091\5\b\5\2\u0091"+
		"\u009c\3\2\2\2\u0092\u009c\5R*\2\u0093\u0094\5R*\2\u0094\u0095\5\b\5\2"+
		"\u0095\u009c\3\2\2\2\u0096\u009c\5V,\2\u0097\u0098\5V,\2\u0098\u0099\5"+
		"\b\5\2\u0099\u009c\3\2\2\2\u009a\u009c\3\2\2\2\u009bj\3\2\2\2\u009bk\3"+
		"\2\2\2\u009bn\3\2\2\2\u009bo\3\2\2\2\u009br\3\2\2\2\u009bs\3\2\2\2\u009b"+
		"v\3\2\2\2\u009bw\3\2\2\2\u009bz\3\2\2\2\u009b{\3\2\2\2\u009b~\3\2\2\2"+
		"\u009b\177\3\2\2\2\u009b\u0082\3\2\2\2\u009b\u0083\3\2\2\2\u009b\u0086"+
		"\3\2\2\2\u009b\u0087\3\2\2\2\u009b\u008a\3\2\2\2\u009b\u008b\3\2\2\2\u009b"+
		"\u008e\3\2\2\2\u009b\u008f\3\2\2\2\u009b\u0092\3\2\2\2\u009b\u0093\3\2"+
		"\2\2\u009b\u0096\3\2\2\2\u009b\u0097\3\2\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\t\3\2\2\2\u009d\u009f\5\6\4\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2"+
		"\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a3\u00a4\5\b\5\2\u00a4\13\3\2\2\2\u00a5\u00a6\7\n\2\2\u00a6"+
		"\u00a7\7\"\2\2\u00a7\u00a8\7\35\2\2\u00a8\u00a9\5\16\b\2\u00a9\u00aa\7"+
		"\26\2\2\u00aa\u00af\3\2\2\2\u00ab\u00ac\7\n\2\2\u00ac\u00ad\7\"\2\2\u00ad"+
		"\u00af\7\26\2\2\u00ae\u00a5\3\2\2\2\u00ae\u00ab\3\2\2\2\u00af\r\3\2\2"+
		"\2\u00b0\u00b5\5\34\17\2\u00b1\u00b2\5&\24\2\u00b2\u00b3\5\36\20\2\u00b3"+
		"\u00b5\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b5\17\3\2\2"+
		"\2\u00b6\u00b7\7\t\2\2\u00b7\u00b8\7\n\2\2\u00b8\u00b9\7\"\2\2\u00b9\u00ba"+
		"\7\35\2\2\u00ba\u00bb\5\34\17\2\u00bb\u00bc\7\26\2\2\u00bc\21\3\2\2\2"+
		"\u00bd\u00be\5\24\13\2\u00be\u00bf\7\26\2\2\u00bf\u00ca\3\2\2\2\u00c0"+
		"\u00c1\7\"\2\2\u00c1\u00c3\7\35\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\3"+
		"\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c7\5\34\17\2\u00c7\u00c8\7\26\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00bd"+
		"\3\2\2\2\u00c9\u00c2\3\2\2\2\u00ca\23\3\2\2\2\u00cb\u00cc\7\"\2\2\u00cc"+
		"\u00cd\7\35\2\2\u00cd\u00d4\5\34\17\2\u00ce\u00cf\7\"\2\2\u00cf\u00d0"+
		"\7\35\2\2\u00d0\u00d1\5&\24\2\u00d1\u00d2\5\36\20\2\u00d2\u00d4\3\2\2"+
		"\2\u00d3\u00cb\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d4\25\3\2\2\2\u00d5\u00d6"+
		"\7&\2\2\u00d6\u00d7\5\30\r\2\u00d7\u00d8\7\'\2\2\u00d8\u00d9\7\35\2\2"+
		"\u00d9\u00da\7&\2\2\u00da\u00db\5\32\16\2\u00db\u00dc\7\'\2\2\u00dc\u00dd"+
		"\7\26\2\2\u00dd\27\3\2\2\2\u00de\u00e3\7\"\2\2\u00df\u00e0\7(\2\2\u00e0"+
		"\u00e2\7\"\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\31\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00eb"+
		"\5\34\17\2\u00e7\u00e8\7(\2\2\u00e8\u00ea\5\34\17\2\u00e9\u00e7\3\2\2"+
		"\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\33"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f2\5$\23\2\u00ef\u00f2\5&\24\2\u00f0"+
		"\u00f2\5\36\20\2\u00f1\u00ee\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3"+
		"\2\2\2\u00f2\35\3\2\2\2\u00f3\u00f4\7!\2\2\u00f4\u00f5\5 \21\2\u00f5\u00f6"+
		"\7\27\2\2\u00f6\u00f7\5\"\22\2\u00f7\37\3\2\2\2\u00f8\u00f9\5\34\17\2"+
		"\u00f9!\3\2\2\2\u00fa\u00fb\5\34\17\2\u00fb#\3\2\2\2\u00fc\u00fd\b\23"+
		"\1\2\u00fd\u00fe\7\32\2\2\u00fe\u0109\5$\23\b\u00ff\u0100\7$\2\2\u0100"+
		"\u0101\7\n\2\2\u0101\u0102\7%\2\2\u0102\u0109\5$\23\7\u0103\u0104\7$\2"+
		"\2\u0104\u0105\5$\23\2\u0105\u0106\7%\2\2\u0106\u0109\3\2\2\2\u0107\u0109"+
		"\5(\25\2\u0108\u00fc\3\2\2\2\u0108\u00ff\3\2\2\2\u0108\u0103\3\2\2\2\u0108"+
		"\u0107\3\2\2\2\u0109\u0112\3\2\2\2\u010a\u010b\f\5\2\2\u010b\u010c\7\31"+
		"\2\2\u010c\u0111\5$\23\6\u010d\u010e\f\4\2\2\u010e\u010f\7\32\2\2\u010f"+
		"\u0111\5$\23\5\u0110\u010a\3\2\2\2\u0110\u010d\3\2\2\2\u0111\u0114\3\2"+
		"\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113%\3\2\2\2\u0114\u0112"+
		"\3\2\2\2\u0115\u0116\b\24\1\2\u0116\u0117\7$\2\2\u0117\u0118\5&\24\2\u0118"+
		"\u0119\7%\2\2\u0119\u011f\3\2\2\2\u011a\u011b\7 \2\2\u011b\u011f\5&\24"+
		"\t\u011c\u011f\5(\25\2\u011d\u011f\5$\23\2\u011e\u0115\3\2\2\2\u011e\u011a"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011f\u012e\3\2\2\2\u0120"+
		"\u0121\f\b\2\2\u0121\u0122\7\33\2\2\u0122\u012d\5&\24\t\u0123\u0124\f"+
		"\7\2\2\u0124\u0125\7\34\2\2\u0125\u012d\5&\24\b\u0126\u0127\f\6\2\2\u0127"+
		"\u0128\7\37\2\2\u0128\u012d\5&\24\7\u0129\u012a\f\5\2\2\u012a\u012b\7"+
		"\36\2\2\u012b\u012d\5&\24\6\u012c\u0120\3\2\2\2\u012c\u0123\3\2\2\2\u012c"+
		"\u0126\3\2\2\2\u012c\u0129\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2"+
		"\2\2\u012e\u012f\3\2\2\2\u012f\'\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0137"+
		"\5P)\2\u0132\u0137\5T+\2\u0133\u0137\7\"\2\2\u0134\u0137\7#\2\2\u0135"+
		"\u0137\7\f\2\2\u0136\u0131\3\2\2\2\u0136\u0132\3\2\2\2\u0136\u0133\3\2"+
		"\2\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137)\3\2\2\2\u0138\u0139"+
		"\7\13\2\2\u0139\u013a\7\"\2\2\u013a\u013b\7$\2\2\u013b\u013c\5,\27\2\u013c"+
		"\u013d\7%\2\2\u013d\u013e\7&\2\2\u013e\u013f\5\n\6\2\u013f\u0140\7\'\2"+
		"\2\u0140+\3\2\2\2\u0141\u0142\3\2\2\2\u0142-\3\2\2\2\u0143\u0144\7\"\2"+
		"\2\u0144\u0145\7$\2\2\u0145\u0146\5\60\31\2\u0146\u0147\7%\2\2\u0147\u0148"+
		"\7\26\2\2\u0148/\3\2\2\2\u0149\u014a\3\2\2\2\u014a\61\3\2\2\2\u014b\u014c"+
		"\7\r\2\2\u014c\u014d\7$\2\2\u014d\u014e\5\64\33\2\u014e\u014f\7\26\2\2"+
		"\u014f\u0150\5&\24\2\u0150\u0151\7\26\2\2\u0151\u0152\5\66\34\2\u0152"+
		"\u0153\7%\2\2\u0153\u0154\7&\2\2\u0154\u0155\5\b\5\2\u0155\u0156\7\'\2"+
		"\2\u0156\63\3\2\2\2\u0157\u0158\5\24\13\2\u0158\65\3\2\2\2\u0159\u015a"+
		"\5\24\13\2\u015a\67\3\2\2\2\u015b\u015c\7\16\2\2\u015c\u015d\7$\2\2\u015d"+
		"\u015e\5&\24\2\u015e\u015f\7%\2\2\u015f\u0160\5:\36\2\u01609\3\2\2\2\u0161"+
		"\u0162\7&\2\2\u0162\u0163\5\b\5\2\u0163\u0164\7\'\2\2\u0164;\3\2\2\2\u0165"+
		"\u0166\7\17\2\2\u0166\u0167\7&\2\2\u0167\u0168\5\b\5\2\u0168\u0169\7\'"+
		"\2\2\u0169\u016a\7\16\2\2\u016a\u016b\7$\2\2\u016b\u016c\5&\24\2\u016c"+
		"\u016d\7%\2\2\u016d\u016e\7\26\2\2\u016e=\3\2\2\2\u016f\u0170\7\20\2\2"+
		"\u0170\u0171\7$\2\2\u0171\u0172\5&\24\2\u0172\u0173\7%\2\2\u0173\u0174"+
		"\5@!\2\u0174\u017c\3\2\2\2\u0175\u0176\7\20\2\2\u0176\u0177\7$\2\2\u0177"+
		"\u0178\5&\24\2\u0178\u0179\7%\2\2\u0179\u017a\5B\"\2\u017a\u017c\3\2\2"+
		"\2\u017b\u016f\3\2\2\2\u017b\u0175\3\2\2\2\u017c?\3\2\2\2\u017d\u017e"+
		"\7&\2\2\u017e\u017f\5\b\5\2\u017f\u0180\7\'\2\2\u0180A\3\2\2\2\u0181\u0182"+
		"\5D#\2\u0182\u0183\7\21\2\2\u0183\u0184\5F$\2\u0184C\3\2\2\2\u0185\u0186"+
		"\7&\2\2\u0186\u0187\5\b\5\2\u0187\u0188\7\'\2\2\u0188E\3\2\2\2\u0189\u018a"+
		"\7&\2\2\u018a\u018b\5\b\5\2\u018b\u018c\7\'\2\2\u018cG\3\2\2\2\u018d\u018e"+
		"\7\22\2\2\u018e\u018f\7$\2\2\u018f\u0190\5\34\17\2\u0190\u0191\7%\2\2"+
		"\u0191\u0195\7&\2\2\u0192\u0194\5J&\2\u0193\u0192\3\2\2\2\u0194\u0197"+
		"\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u019b\3\2\2\2\u0197"+
		"\u0195\3\2\2\2\u0198\u0199\7\25\2\2\u0199\u019a\7\27\2\2\u019a\u019c\5"+
		"N(\2\u019b\u0198\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u019e\7\'\2\2\u019eI\3\2\2\2\u019f\u01a0\7\23\2\2\u01a0\u01a1\5\34\17"+
		"\2\u01a1\u01a2\7\27\2\2\u01a2\u01a3\5L\'\2\u01a3K\3\2\2\2\u01a4\u01a7"+
		"\5\b\5\2\u01a5\u01a6\7\24\2\2\u01a6\u01a8\7\26\2\2\u01a7\u01a5\3\2\2\2"+
		"\u01a7\u01a8\3\2\2\2\u01a8M\3\2\2\2\u01a9\u01aa\5\b\5\2\u01aaO\3\2\2\2"+
		"\u01ab\u01ac\7\6\2\2\u01ac\u01ad\7$\2\2\u01ad\u01ae\7%\2\2\u01aeQ\3\2"+
		"\2\2\u01af\u01b0\7\5\2\2\u01b0\u01b1\7$\2\2\u01b1\u01b2\5\34\17\2\u01b2"+
		"\u01b3\7%\2\2\u01b3\u01b4\7\26\2\2\u01b4S\3\2\2\2\u01b5\u01b6\7\b\2\2"+
		"\u01b6\u01b7\7$\2\2\u01b7\u01b8\7%\2\2\u01b8U\3\2\2\2\u01b9\u01ba\7\7"+
		"\2\2\u01ba\u01bb\7$\2\2\u01bb\u01bc\5\34\17\2\u01bc\u01bd\7%\2\2\u01bd"+
		"\u01be\7\26\2\2\u01beW\3\2\2\2\32^dh\u009b\u00a0\u00ae\u00b4\u00c4\u00c9"+
		"\u00d3\u00e3\u00eb\u00f1\u0108\u0110\u0112\u011e\u012c\u012e\u0136\u017b"+
		"\u0195\u019b\u01a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}