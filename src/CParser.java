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
		STRINGVALUE=1, WHITESPACE=2, TYPEQUALIFIER=3, TYPESPECIFIER=4, FUNCTIONRETURNTYPESPECIFIER=5, 
		LOGICALVALUE=6, FORLOOPKEYWORD=7, WHILELOOPKEYWORD=8, DOWHILEKEYWORD=9, 
		CONDITIONKEYWORD=10, CONDITIONELSEKEYWORD=11, SWITCHKEYWORD=12, SWITCHCASEKEYWORD=13, 
		BREAKKEYWORD=14, DEFAULTKEYWORD=15, SEMICOLON=16, COLON=17, STRINGCONCATENATION=18, 
		MULTIPLICATIONDIVISIONOPERATOR=19, ADDITIONSUBTRACTIONOPERATOR=20, RELATIONALOPERATOR=21, 
		EQUALITYOPERATOR=22, ASSIGNMENTOPERATOR=23, LOGICALOR=24, LOGICALAND=25, 
		LOGICALNEGATION=26, QUESTIONMARK=27, IDENTIFIER=28, NUMERICALVALUE=29, 
		LEFTPARENTHESE=30, RIGHTPARENTHESE=31, LEFTBRACE=32, RIGHTBRACE=33, COMMA=34;
	public static final int
		RULE_start = 0, RULE_startsymbol = 1, RULE_declarations = 2, RULE_statement = 3, 
		RULE_variabledeclaration = 4, RULE_constantdeclaration = 5, RULE_assignment = 6, 
		RULE_parallelassignment = 7, RULE_identifierlist = 8, RULE_valuelist = 9, 
		RULE_expression = 10, RULE_arithmeticexpression = 11, RULE_logicalexpression = 12, 
		RULE_stringexpression = 13, RULE_atom = 14, RULE_functiondeclaration = 15, 
		RULE_functionargumentlist = 16, RULE_functioncall = 17, RULE_functioncallarguments = 18, 
		RULE_forloop = 19, RULE_forinitialization = 20, RULE_forafterthought = 21, 
		RULE_whileloop = 22, RULE_whilestatement = 23, RULE_dowhileloop = 24, 
		RULE_condition = 25, RULE_simplecondition = 26, RULE_ifelsecondition = 27, 
		RULE_assertivebranch = 28, RULE_negativebranch = 29, RULE_switchcondition = 30, 
		RULE_switchcase = 31, RULE_switchstatement = 32, RULE_switchdefaultstatement = 33;
	public static final String[] ruleNames = {
		"start", "startsymbol", "declarations", "statement", "variabledeclaration", 
		"constantdeclaration", "assignment", "parallelassignment", "identifierlist", 
		"valuelist", "expression", "arithmeticexpression", "logicalexpression", 
		"stringexpression", "atom", "functiondeclaration", "functionargumentlist", 
		"functioncall", "functioncallarguments", "forloop", "forinitialization", 
		"forafterthought", "whileloop", "whilestatement", "dowhileloop", "condition", 
		"simplecondition", "ifelsecondition", "assertivebranch", "negativebranch", 
		"switchcondition", "switchcase", "switchstatement", "switchdefaultstatement"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			startsymbol();
			setState(69);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitStartsymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartsymbolContext startsymbol() throws RecognitionException {
		StartsymbolContext _localctx = new StartsymbolContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_startsymbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPEQUALIFIER || _la==TYPESPECIFIER) {
				{
				{
				setState(71);
				declarations();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(77);
				functiondeclaration();
				}
				}
				setState(80); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declarations);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPESPECIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				variabledeclaration();
				}
				break;
			case TYPEQUALIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				variabledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				variabledeclaration();
				setState(88);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				constantdeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				constantdeclaration();
				setState(92);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				assignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(95);
				assignment();
				setState(96);
				statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(98);
				forloop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(99);
				forloop();
				setState(100);
				statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(102);
				condition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(103);
				condition();
				setState(104);
				statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(106);
				switchcondition();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(107);
				switchcondition();
				setState(108);
				statement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(110);
				whileloop();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(111);
				whileloop();
				setState(112);
				statement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(114);
				dowhileloop();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(115);
				dowhileloop();
				setState(116);
				statement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(118);
				functioncall();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(119);
				functioncall();
				setState(120);
				statement();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(122);
				parallelassignment();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(123);
				parallelassignment();
				setState(124);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitDeclarationAndInitialization(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitDeclarationOnly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariabledeclarationContext variabledeclaration() throws RecognitionException {
		VariabledeclarationContext _localctx = new VariabledeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variabledeclaration);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new DeclarationAndInitializationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(TYPESPECIFIER);
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
				_localctx = new DeclarationOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(TYPESPECIFIER);
				setState(136);
				match(IDENTIFIER);
				setState(137);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitConstantdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantdeclarationContext constantdeclaration() throws RecognitionException {
		ConstantdeclarationContext _localctx = new ConstantdeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constantdeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(TYPEQUALIFIER);
			setState(141);
			match(TYPESPECIFIER);
			setState(142);
			match(IDENTIFIER);
			setState(143);
			match(ASSIGNMENTOPERATOR);
			setState(144);
			expression();
			setState(145);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitMultipleAssignment(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitTernaryOperatorAssignment(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitStandardAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			int _alt;
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new StandardAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(IDENTIFIER);
				setState(148);
				match(ASSIGNMENTOPERATOR);
				setState(149);
				expression();
				setState(150);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new MultipleAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(154); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(152);
						match(IDENTIFIER);
						setState(153);
						match(ASSIGNMENTOPERATOR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(156); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(158);
				expression();
				setState(159);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new TernaryOperatorAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(IDENTIFIER);
				setState(162);
				match(ASSIGNMENTOPERATOR);
				setState(163);
				logicalexpression(0);
				setState(164);
				match(QUESTIONMARK);
				setState(165);
				expression();
				setState(166);
				match(COLON);
				setState(167);
				expression();
				setState(168);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitParallelassignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParallelassignmentContext parallelassignment() throws RecognitionException {
		ParallelassignmentContext _localctx = new ParallelassignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parallelassignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(LEFTBRACE);
			setState(173);
			identifierlist();
			setState(174);
			match(RIGHTBRACE);
			setState(175);
			match(ASSIGNMENTOPERATOR);
			setState(176);
			match(LEFTBRACE);
			setState(177);
			valuelist();
			setState(178);
			match(RIGHTBRACE);
			setState(179);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitIdentifierlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierlistContext identifierlist() throws RecognitionException {
		IdentifierlistContext _localctx = new IdentifierlistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_identifierlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(IDENTIFIER);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(182);
				match(COMMA);
				setState(183);
				match(IDENTIFIER);
				}
				}
				setState(188);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitValuelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuelistContext valuelist() throws RecognitionException {
		ValuelistContext _localctx = new ValuelistContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_valuelist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			expression();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(190);
				match(COMMA);
				setState(191);
				expression();
				}
				}
				setState(196);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				arithmeticexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				logicalexpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitMulDivExp(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitParenthesesArithmeticExp(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitArithmeticAtom(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitAddSubExp(this);
			else return visitor.visitChildren(this);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_arithmeticexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFTPARENTHESE:
				{
				_localctx = new ParenthesesArithmeticExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(203);
				match(LEFTPARENTHESE);
				setState(204);
				arithmeticexpression(0);
				setState(205);
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
				setState(207);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(216);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExpContext(new ArithmeticexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticexpression);
						setState(210);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(211);
						match(MULTIPLICATIONDIVISIONOPERATOR);
						setState(212);
						arithmeticexpression(4);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpContext(new ArithmeticexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticexpression);
						setState(213);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(214);
						match(ADDITIONSUBTRACTIONOPERATOR);
						setState(215);
						arithmeticexpression(3);
						}
						break;
					}
					} 
				}
				setState(220);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitEqualityLogicExp(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitLogicNegation(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitParenthesesLogicExp(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitLogicalAtom(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitLogicalAndExp(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitRelationalLogicExp(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitLogicalOrExp(this);
			else return visitor.visitChildren(this);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_logicalexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFTPARENTHESE:
				{
				_localctx = new ParenthesesLogicExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(222);
				match(LEFTPARENTHESE);
				setState(223);
				logicalexpression(0);
				setState(224);
				match(RIGHTPARENTHESE);
				}
				break;
			case LOGICALNEGATION:
				{
				_localctx = new LogicNegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				match(LOGICALNEGATION);
				setState(227);
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
				setState(228);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(243);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalLogicExpContext(new LogicalexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalexpression);
						setState(231);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(232);
						match(RELATIONALOPERATOR);
						setState(233);
						logicalexpression(6);
						}
						break;
					case 2:
						{
						_localctx = new EqualityLogicExpContext(new LogicalexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalexpression);
						setState(234);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(235);
						match(EQUALITYOPERATOR);
						setState(236);
						logicalexpression(5);
						}
						break;
					case 3:
						{
						_localctx = new LogicalAndExpContext(new LogicalexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalexpression);
						setState(237);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(238);
						match(LOGICALAND);
						setState(239);
						logicalexpression(4);
						}
						break;
					case 4:
						{
						_localctx = new LogicalOrExpContext(new LogicalexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalexpression);
						setState(240);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(241);
						match(LOGICALOR);
						setState(242);
						logicalexpression(3);
						}
						break;
					}
					} 
				}
				setState(247);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitStringExpAtom(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitStringConcatExp(this);
			else return visitor.visitChildren(this);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_stringexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new StringExpAtomContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(249);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(256);
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
					setState(251);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(252);
					match(STRINGCONCATENATION);
					setState(253);
					stringexpression(3);
					}
					} 
				}
				setState(258);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitIdentifierAtom(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitNumericAtom(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitLogicAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atom);
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IdentifierAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(IDENTIFIER);
				}
				break;
			case NUMERICALVALUE:
				_localctx = new NumericAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(NUMERICALVALUE);
				}
				break;
			case STRINGVALUE:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				match(STRINGVALUE);
				}
				break;
			case LOGICALVALUE:
				_localctx = new LogicAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitFunctiondeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondeclarationContext functiondeclaration() throws RecognitionException {
		FunctiondeclarationContext _localctx = new FunctiondeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functiondeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(FUNCTIONRETURNTYPESPECIFIER);
			setState(266);
			match(IDENTIFIER);
			setState(267);
			match(LEFTPARENTHESE);
			setState(268);
			functionargumentlist();
			setState(269);
			match(RIGHTPARENTHESE);
			setState(270);
			match(LEFTBRACE);
			setState(271);
			statement();
			setState(272);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitFunctionargumentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionargumentlistContext functionargumentlist() throws RecognitionException {
		FunctionargumentlistContext _localctx = new FunctionargumentlistContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionargumentlist);
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(TYPESPECIFIER);
				setState(275);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(TYPESPECIFIER);
				setState(277);
				match(IDENTIFIER);
				setState(278);
				match(COMMA);
				setState(279);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitFunctioncall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functioncall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(IDENTIFIER);
			setState(284);
			match(LEFTPARENTHESE);
			setState(285);
			functioncallarguments();
			setState(286);
			match(RIGHTPARENTHESE);
			setState(287);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitFunctioncallarguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncallargumentsContext functioncallarguments() throws RecognitionException {
		FunctioncallargumentsContext _localctx = new FunctioncallargumentsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_functioncallarguments);
		try {
			int _alt;
			setState(298);
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
				setState(289);
				expression();
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(290);
						match(COMMA);
						setState(291);
						functioncallarguments();
						}
						} 
					}
					setState(296);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitForloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(FORLOOPKEYWORD);
			setState(301);
			match(LEFTPARENTHESE);
			setState(302);
			forinitialization();
			setState(303);
			match(SEMICOLON);
			setState(304);
			logicalexpression(0);
			setState(305);
			match(SEMICOLON);
			setState(306);
			forafterthought();
			setState(307);
			match(RIGHTPARENTHESE);
			setState(308);
			match(LEFTBRACE);
			setState(309);
			statement();
			setState(310);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitForinitialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForinitializationContext forinitialization() throws RecognitionException {
		ForinitializationContext _localctx = new ForinitializationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_forinitialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(IDENTIFIER);
			setState(313);
			match(ASSIGNMENTOPERATOR);
			setState(314);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitForafterthought(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForafterthoughtContext forafterthought() throws RecognitionException {
		ForafterthoughtContext _localctx = new ForafterthoughtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_forafterthought);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(IDENTIFIER);
			setState(317);
			match(ASSIGNMENTOPERATOR);
			setState(318);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitWhileloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileloopContext whileloop() throws RecognitionException {
		WhileloopContext _localctx = new WhileloopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_whileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(WHILELOOPKEYWORD);
			setState(321);
			match(LEFTPARENTHESE);
			setState(322);
			logicalexpression(0);
			setState(323);
			match(RIGHTPARENTHESE);
			setState(324);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitWhilestatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestatementContext whilestatement() throws RecognitionException {
		WhilestatementContext _localctx = new WhilestatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_whilestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(LEFTBRACE);
			setState(327);
			statement();
			setState(328);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitDowhileloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DowhileloopContext dowhileloop() throws RecognitionException {
		DowhileloopContext _localctx = new DowhileloopContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_dowhileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(DOWHILEKEYWORD);
			setState(331);
			match(LEFTBRACE);
			setState(332);
			statement();
			setState(333);
			match(RIGHTBRACE);
			setState(334);
			match(WHILELOOPKEYWORD);
			setState(335);
			match(LEFTPARENTHESE);
			setState(336);
			logicalexpression(0);
			setState(337);
			match(RIGHTPARENTHESE);
			setState(338);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_condition);
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				match(CONDITIONKEYWORD);
				setState(341);
				match(LEFTPARENTHESE);
				setState(342);
				logicalexpression(0);
				setState(343);
				match(RIGHTPARENTHESE);
				setState(344);
				simplecondition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				match(CONDITIONKEYWORD);
				setState(347);
				match(LEFTPARENTHESE);
				setState(348);
				logicalexpression(0);
				setState(349);
				match(RIGHTPARENTHESE);
				setState(350);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitSimplecondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleconditionContext simplecondition() throws RecognitionException {
		SimpleconditionContext _localctx = new SimpleconditionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_simplecondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(LEFTBRACE);
			setState(355);
			statement();
			setState(356);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitIfelsecondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfelseconditionContext ifelsecondition() throws RecognitionException {
		IfelseconditionContext _localctx = new IfelseconditionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ifelsecondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			assertivebranch();
			setState(359);
			match(CONDITIONELSEKEYWORD);
			setState(360);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitAssertivebranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertivebranchContext assertivebranch() throws RecognitionException {
		AssertivebranchContext _localctx = new AssertivebranchContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_assertivebranch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(LEFTBRACE);
			setState(363);
			statement();
			setState(364);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitNegativebranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegativebranchContext negativebranch() throws RecognitionException {
		NegativebranchContext _localctx = new NegativebranchContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_negativebranch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(LEFTBRACE);
			setState(367);
			statement();
			setState(368);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitSwitchcondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchconditionContext switchcondition() throws RecognitionException {
		SwitchconditionContext _localctx = new SwitchconditionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_switchcondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(SWITCHKEYWORD);
			setState(371);
			match(LEFTPARENTHESE);
			setState(372);
			expression();
			setState(373);
			match(RIGHTPARENTHESE);
			setState(374);
			match(LEFTBRACE);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SWITCHCASEKEYWORD) {
				{
				{
				setState(375);
				switchcase();
				}
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULTKEYWORD) {
				{
				setState(381);
				match(DEFAULTKEYWORD);
				setState(382);
				match(COLON);
				setState(383);
				switchdefaultstatement();
				}
			}

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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitSwitchcase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchcaseContext switchcase() throws RecognitionException {
		SwitchcaseContext _localctx = new SwitchcaseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_switchcase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(SWITCHCASEKEYWORD);
			setState(389);
			expression();
			setState(390);
			match(COLON);
			setState(391);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitSwitchstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchstatementContext switchstatement() throws RecognitionException {
		SwitchstatementContext _localctx = new SwitchstatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_switchstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			statement();
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAKKEYWORD) {
				{
				setState(394);
				match(BREAKKEYWORD);
				setState(395);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitSwitchdefaultstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchdefaultstatementContext switchdefaultstatement() throws RecognitionException {
		SwitchdefaultstatementContext _localctx = new SwitchdefaultstatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_switchdefaultstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return arithmeticexpression_sempred((ArithmeticexpressionContext)_localctx, predIndex);
		case 12:
			return logicalexpression_sempred((LogicalexpressionContext)_localctx, predIndex);
		case 13:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u0193\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\3\7\3K\n\3\f\3\16\3N\13\3\3\3\6\3Q\n\3"+
		"\r\3\16\3R\3\4\3\4\5\4W\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0082\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u008d\n\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u009d\n\b\r\b\16\b\u009e\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ad\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n\u00bb\n\n\f\n\16\n\u00be\13\n\3\13"+
		"\3\13\3\13\7\13\u00c3\n\13\f\13\16\13\u00c6\13\13\3\f\3\f\3\f\5\f\u00cb"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d3\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r"+
		"\u00db\n\r\f\r\16\r\u00de\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u00e8\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u00f6\n\16\f\16\16\16\u00f9\13\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u0101\n\17\f\17\16\17\u0104\13\17\3\20\3\20\3\20\3\20\5\20"+
		"\u010a\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u011c\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\7\24\u0127\n\24\f\24\16\24\u012a\13\24\3\24\5\24\u012d\n\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0163\n\33\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \7 \u017b\n \f \16 \u017e\13 \3 \3 \3 \5 \u0183"+
		"\n \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\5\"\u018f\n\"\3#\3#\3#\2\5\30\32"+
		"\34$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@"+
		"BD\2\2\2\u01a4\2F\3\2\2\2\4L\3\2\2\2\6V\3\2\2\2\b\u0081\3\2\2\2\n\u008c"+
		"\3\2\2\2\f\u008e\3\2\2\2\16\u00ac\3\2\2\2\20\u00ae\3\2\2\2\22\u00b7\3"+
		"\2\2\2\24\u00bf\3\2\2\2\26\u00ca\3\2\2\2\30\u00d2\3\2\2\2\32\u00e7\3\2"+
		"\2\2\34\u00fa\3\2\2\2\36\u0109\3\2\2\2 \u010b\3\2\2\2\"\u011b\3\2\2\2"+
		"$\u011d\3\2\2\2&\u012c\3\2\2\2(\u012e\3\2\2\2*\u013a\3\2\2\2,\u013e\3"+
		"\2\2\2.\u0142\3\2\2\2\60\u0148\3\2\2\2\62\u014c\3\2\2\2\64\u0162\3\2\2"+
		"\2\66\u0164\3\2\2\28\u0168\3\2\2\2:\u016c\3\2\2\2<\u0170\3\2\2\2>\u0174"+
		"\3\2\2\2@\u0186\3\2\2\2B\u018b\3\2\2\2D\u0190\3\2\2\2FG\5\4\3\2GH\7\2"+
		"\2\3H\3\3\2\2\2IK\5\6\4\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MP\3"+
		"\2\2\2NL\3\2\2\2OQ\5 \21\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\5"+
		"\3\2\2\2TW\5\n\6\2UW\5\f\7\2VT\3\2\2\2VU\3\2\2\2W\7\3\2\2\2X\u0082\5\n"+
		"\6\2YZ\5\n\6\2Z[\5\b\5\2[\u0082\3\2\2\2\\\u0082\5\f\7\2]^\5\f\7\2^_\5"+
		"\b\5\2_\u0082\3\2\2\2`\u0082\5\16\b\2ab\5\16\b\2bc\5\b\5\2c\u0082\3\2"+
		"\2\2d\u0082\5(\25\2ef\5(\25\2fg\5\b\5\2g\u0082\3\2\2\2h\u0082\5\64\33"+
		"\2ij\5\64\33\2jk\5\b\5\2k\u0082\3\2\2\2l\u0082\5> \2mn\5> \2no\5\b\5\2"+
		"o\u0082\3\2\2\2p\u0082\5.\30\2qr\5.\30\2rs\5\b\5\2s\u0082\3\2\2\2t\u0082"+
		"\5\62\32\2uv\5\62\32\2vw\5\b\5\2w\u0082\3\2\2\2x\u0082\5$\23\2yz\5$\23"+
		"\2z{\5\b\5\2{\u0082\3\2\2\2|\u0082\5\20\t\2}~\5\20\t\2~\177\5\b\5\2\177"+
		"\u0082\3\2\2\2\u0080\u0082\3\2\2\2\u0081X\3\2\2\2\u0081Y\3\2\2\2\u0081"+
		"\\\3\2\2\2\u0081]\3\2\2\2\u0081`\3\2\2\2\u0081a\3\2\2\2\u0081d\3\2\2\2"+
		"\u0081e\3\2\2\2\u0081h\3\2\2\2\u0081i\3\2\2\2\u0081l\3\2\2\2\u0081m\3"+
		"\2\2\2\u0081p\3\2\2\2\u0081q\3\2\2\2\u0081t\3\2\2\2\u0081u\3\2\2\2\u0081"+
		"x\3\2\2\2\u0081y\3\2\2\2\u0081|\3\2\2\2\u0081}\3\2\2\2\u0081\u0080\3\2"+
		"\2\2\u0082\t\3\2\2\2\u0083\u0084\7\6\2\2\u0084\u0085\7\36\2\2\u0085\u0086"+
		"\7\31\2\2\u0086\u0087\5\26\f\2\u0087\u0088\7\22\2\2\u0088\u008d\3\2\2"+
		"\2\u0089\u008a\7\6\2\2\u008a\u008b\7\36\2\2\u008b\u008d\7\22\2\2\u008c"+
		"\u0083\3\2\2\2\u008c\u0089\3\2\2\2\u008d\13\3\2\2\2\u008e\u008f\7\5\2"+
		"\2\u008f\u0090\7\6\2\2\u0090\u0091\7\36\2\2\u0091\u0092\7\31\2\2\u0092"+
		"\u0093\5\26\f\2\u0093\u0094\7\22\2\2\u0094\r\3\2\2\2\u0095\u0096\7\36"+
		"\2\2\u0096\u0097\7\31\2\2\u0097\u0098\5\26\f\2\u0098\u0099\7\22\2\2\u0099"+
		"\u00ad\3\2\2\2\u009a\u009b\7\36\2\2\u009b\u009d\7\31\2\2\u009c\u009a\3"+
		"\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a1\5\26\f\2\u00a1\u00a2\7\22\2\2\u00a2\u00ad\3"+
		"\2\2\2\u00a3\u00a4\7\36\2\2\u00a4\u00a5\7\31\2\2\u00a5\u00a6\5\32\16\2"+
		"\u00a6\u00a7\7\35\2\2\u00a7\u00a8\5\26\f\2\u00a8\u00a9\7\23\2\2\u00a9"+
		"\u00aa\5\26\f\2\u00aa\u00ab\7\22\2\2\u00ab\u00ad\3\2\2\2\u00ac\u0095\3"+
		"\2\2\2\u00ac\u009c\3\2\2\2\u00ac\u00a3\3\2\2\2\u00ad\17\3\2\2\2\u00ae"+
		"\u00af\7\"\2\2\u00af\u00b0\5\22\n\2\u00b0\u00b1\7#\2\2\u00b1\u00b2\7\31"+
		"\2\2\u00b2\u00b3\7\"\2\2\u00b3\u00b4\5\24\13\2\u00b4\u00b5\7#\2\2\u00b5"+
		"\u00b6\7\22\2\2\u00b6\21\3\2\2\2\u00b7\u00bc\7\36\2\2\u00b8\u00b9\7$\2"+
		"\2\u00b9\u00bb\7\36\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\23\3\2\2\2\u00be\u00bc\3\2\2"+
		"\2\u00bf\u00c4\5\26\f\2\u00c0\u00c1\7$\2\2\u00c1\u00c3\5\26\f\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\25\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00cb\5\30\r\2\u00c8\u00cb"+
		"\5\32\16\2\u00c9\u00cb\5\34\17\2\u00ca\u00c7\3\2\2\2\u00ca\u00c8\3\2\2"+
		"\2\u00ca\u00c9\3\2\2\2\u00cb\27\3\2\2\2\u00cc\u00cd\b\r\1\2\u00cd\u00ce"+
		"\7 \2\2\u00ce\u00cf\5\30\r\2\u00cf\u00d0\7!\2\2\u00d0\u00d3\3\2\2\2\u00d1"+
		"\u00d3\5\36\20\2\u00d2\u00cc\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00dc\3"+
		"\2\2\2\u00d4\u00d5\f\5\2\2\u00d5\u00d6\7\25\2\2\u00d6\u00db\5\30\r\6\u00d7"+
		"\u00d8\f\4\2\2\u00d8\u00d9\7\26\2\2\u00d9\u00db\5\30\r\5\u00da\u00d4\3"+
		"\2\2\2\u00da\u00d7\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\31\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\b\16\1"+
		"\2\u00e0\u00e1\7 \2\2\u00e1\u00e2\5\32\16\2\u00e2\u00e3\7!\2\2\u00e3\u00e8"+
		"\3\2\2\2\u00e4\u00e5\7\34\2\2\u00e5\u00e8\5\32\16\b\u00e6\u00e8\5\36\20"+
		"\2\u00e7\u00df\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00f7"+
		"\3\2\2\2\u00e9\u00ea\f\7\2\2\u00ea\u00eb\7\27\2\2\u00eb\u00f6\5\32\16"+
		"\b\u00ec\u00ed\f\6\2\2\u00ed\u00ee\7\30\2\2\u00ee\u00f6\5\32\16\7\u00ef"+
		"\u00f0\f\5\2\2\u00f0\u00f1\7\33\2\2\u00f1\u00f6\5\32\16\6\u00f2\u00f3"+
		"\f\4\2\2\u00f3\u00f4\7\32\2\2\u00f4\u00f6\5\32\16\5\u00f5\u00e9\3\2\2"+
		"\2\u00f5\u00ec\3\2\2\2\u00f5\u00ef\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f6\u00f9"+
		"\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\33\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00fa\u00fb\b\17\1\2\u00fb\u00fc\5\36\20\2\u00fc\u0102"+
		"\3\2\2\2\u00fd\u00fe\f\4\2\2\u00fe\u00ff\7\24\2\2\u00ff\u0101\5\34\17"+
		"\5\u0100\u00fd\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103"+
		"\3\2\2\2\u0103\35\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u010a\7\36\2\2\u0106"+
		"\u010a\7\37\2\2\u0107\u010a\7\3\2\2\u0108\u010a\7\b\2\2\u0109\u0105\3"+
		"\2\2\2\u0109\u0106\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a"+
		"\37\3\2\2\2\u010b\u010c\7\7\2\2\u010c\u010d\7\36\2\2\u010d\u010e\7 \2"+
		"\2\u010e\u010f\5\"\22\2\u010f\u0110\7!\2\2\u0110\u0111\7\"\2\2\u0111\u0112"+
		"\5\b\5\2\u0112\u0113\7#\2\2\u0113!\3\2\2\2\u0114\u0115\7\6\2\2\u0115\u011c"+
		"\7\36\2\2\u0116\u0117\7\6\2\2\u0117\u0118\7\36\2\2\u0118\u0119\7$\2\2"+
		"\u0119\u011c\5\"\22\2\u011a\u011c\3\2\2\2\u011b\u0114\3\2\2\2\u011b\u0116"+
		"\3\2\2\2\u011b\u011a\3\2\2\2\u011c#\3\2\2\2\u011d\u011e\7\36\2\2\u011e"+
		"\u011f\7 \2\2\u011f\u0120\5&\24\2\u0120\u0121\7!\2\2\u0121\u0122\7\22"+
		"\2\2\u0122%\3\2\2\2\u0123\u0128\5\26\f\2\u0124\u0125\7$\2\2\u0125\u0127"+
		"\5&\24\2\u0126\u0124\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u012d\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012d\3\2"+
		"\2\2\u012c\u0123\3\2\2\2\u012c\u012b\3\2\2\2\u012d\'\3\2\2\2\u012e\u012f"+
		"\7\t\2\2\u012f\u0130\7 \2\2\u0130\u0131\5*\26\2\u0131\u0132\7\22\2\2\u0132"+
		"\u0133\5\32\16\2\u0133\u0134\7\22\2\2\u0134\u0135\5,\27\2\u0135\u0136"+
		"\7!\2\2\u0136\u0137\7\"\2\2\u0137\u0138\5\b\5\2\u0138\u0139\7#\2\2\u0139"+
		")\3\2\2\2\u013a\u013b\7\36\2\2\u013b\u013c\7\31\2\2\u013c\u013d\5\26\f"+
		"\2\u013d+\3\2\2\2\u013e\u013f\7\36\2\2\u013f\u0140\7\31\2\2\u0140\u0141"+
		"\5\26\f\2\u0141-\3\2\2\2\u0142\u0143\7\n\2\2\u0143\u0144\7 \2\2\u0144"+
		"\u0145\5\32\16\2\u0145\u0146\7!\2\2\u0146\u0147\5\60\31\2\u0147/\3\2\2"+
		"\2\u0148\u0149\7\"\2\2\u0149\u014a\5\b\5\2\u014a\u014b\7#\2\2\u014b\61"+
		"\3\2\2\2\u014c\u014d\7\13\2\2\u014d\u014e\7\"\2\2\u014e\u014f\5\b\5\2"+
		"\u014f\u0150\7#\2\2\u0150\u0151\7\n\2\2\u0151\u0152\7 \2\2\u0152\u0153"+
		"\5\32\16\2\u0153\u0154\7!\2\2\u0154\u0155\7\22\2\2\u0155\63\3\2\2\2\u0156"+
		"\u0157\7\f\2\2\u0157\u0158\7 \2\2\u0158\u0159\5\32\16\2\u0159\u015a\7"+
		"!\2\2\u015a\u015b\5\66\34\2\u015b\u0163\3\2\2\2\u015c\u015d\7\f\2\2\u015d"+
		"\u015e\7 \2\2\u015e\u015f\5\32\16\2\u015f\u0160\7!\2\2\u0160\u0161\58"+
		"\35\2\u0161\u0163\3\2\2\2\u0162\u0156\3\2\2\2\u0162\u015c\3\2\2\2\u0163"+
		"\65\3\2\2\2\u0164\u0165\7\"\2\2\u0165\u0166\5\b\5\2\u0166\u0167\7#\2\2"+
		"\u0167\67\3\2\2\2\u0168\u0169\5:\36\2\u0169\u016a\7\r\2\2\u016a\u016b"+
		"\5<\37\2\u016b9\3\2\2\2\u016c\u016d\7\"\2\2\u016d\u016e\5\b\5\2\u016e"+
		"\u016f\7#\2\2\u016f;\3\2\2\2\u0170\u0171\7\"\2\2\u0171\u0172\5\b\5\2\u0172"+
		"\u0173\7#\2\2\u0173=\3\2\2\2\u0174\u0175\7\16\2\2\u0175\u0176\7 \2\2\u0176"+
		"\u0177\5\26\f\2\u0177\u0178\7!\2\2\u0178\u017c\7\"\2\2\u0179\u017b\5@"+
		"!\2\u017a\u0179\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c"+
		"\u017d\3\2\2\2\u017d\u0182\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0180\7\21"+
		"\2\2\u0180\u0181\7\23\2\2\u0181\u0183\5D#\2\u0182\u017f\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\7#\2\2\u0185?\3\2\2\2\u0186"+
		"\u0187\7\17\2\2\u0187\u0188\5\26\f\2\u0188\u0189\7\23\2\2\u0189\u018a"+
		"\5B\"\2\u018aA\3\2\2\2\u018b\u018e\5\b\5\2\u018c\u018d\7\20\2\2\u018d"+
		"\u018f\7\22\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018fC\3\2\2\2"+
		"\u0190\u0191\5\b\5\2\u0191E\3\2\2\2\33LRV\u0081\u008c\u009e\u00ac\u00bc"+
		"\u00c4\u00ca\u00d2\u00da\u00dc\u00e7\u00f5\u00f7\u0102\u0109\u011b\u0128"+
		"\u012c\u0162\u017c\u0182\u018e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}