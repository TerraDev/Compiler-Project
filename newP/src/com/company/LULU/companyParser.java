// Generated from F:/Behdad/University/Books/Term 5/Compilers/Proj/Phase 2/newP/src/com/company\company.g4 by ANTLR 4.7.2
package com.company.LULU;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class companyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, Ws=29, Comment=30, Int=31, Float=32, 
		Bool=33, String=34, Function=35, If=36, Else=37, Switch=38, Default=39, 
		Break=40, For=41, While=42, Continue=43, Const=44, Caseof=45, This=46, 
		Super=47, Type=48, Declare=49, Read=50, Write=51, Nil=52, Destruct=53, 
		Allocate=54, Public=55, Private=56, Protected=57, Int_val=58, Float_val=59, 
		String_val=60, Bool_val=61, ID=62;
	public static final int
		RULE_program = 0, RULE_test = 1, RULE_ft_dcl = 2, RULE_func_dcl = 3, RULE_args = 4, 
		RULE_args_var = 5, RULE_type_dcl = 6, RULE_var_def = 7, RULE_var_val = 8, 
		RULE_ft_def = 9, RULE_type_def = 10, RULE_component = 11, RULE_access_modifier = 12, 
		RULE_fun_def = 13, RULE_block = 14, RULE_stmt = 15, RULE_assign = 16, 
		RULE_var = 17, RULE_ref = 18, RULE_expr = 19, RULE_func_call = 20, RULE_list = 21, 
		RULE_handle_call = 22, RULE_params = 23, RULE_cond_stmt = 24, RULE_switch_body = 25, 
		RULE_loop_stmt = 26, RULE_type = 27, RULE_const_val = 28, RULE_unary_op = 29, 
		RULE_op1 = 30, RULE_op2 = 31, RULE_op3 = 32, RULE_op4 = 33, RULE_bitwise = 34, 
		RULE_logical = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "test", "ft_dcl", "func_dcl", "args", "args_var", "type_dcl", 
			"var_def", "var_val", "ft_def", "type_def", "component", "access_modifier", 
			"fun_def", "block", "stmt", "assign", "var", "ref", "expr", "func_call", 
			"list", "handle_call", "params", "cond_stmt", "switch_body", "loop_stmt", 
			"type", "const_val", "unary_op", "op1", "op2", "op3", "op4", "bitwise", 
			"logical"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "'='", "';'", "'['", "']'", "','", 
			"':'", "'.'", "'!'", "'~'", "'-'", "'*'", "'/'", "'%'", "'+'", "'<='", 
			"'>='", "'<'", "'>'", "'=='", "'!='", "'&'", "'|'", "'||'", "'&&'", null, 
			null, "'int'", "'float'", "'bool'", "'string'", "'function'", "'if'", 
			"'else'", "'switch'", "'default'", "'break'", "'for'", "'while'", "'continue'", 
			"'const'", "'caseof'", "'this'", "'super'", "'type'", "'declare'", "'read'", 
			"'write'", "'nil'", "'destruct'", "'allocate'", "'public'", "'private'", 
			"'protected'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "Ws", "Comment", "Int", "Float", "Bool", 
			"String", "Function", "If", "Else", "Switch", "Default", "Break", "For", 
			"While", "Continue", "Const", "Caseof", "This", "Super", "Type", "Declare", 
			"Read", "Write", "Nil", "Destruct", "Allocate", "Public", "Private", 
			"Protected", "Int_val", "Float_val", "String_val", "Bool_val", "ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "company.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public companyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(companyParser.EOF, 0); }
		public Ft_dclContext ft_dcl() {
			return getRuleContext(Ft_dclContext.class,0);
		}
		public List<Ft_defContext> ft_def() {
			return getRuleContexts(Ft_defContext.class);
		}
		public Ft_defContext ft_def(int i) {
			return getRuleContext(Ft_defContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Declare) {
				{
				setState(72);
				ft_dcl();
				}
			}

			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(75);
				ft_def();
				}
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Function) | (1L << Type))) != 0) );
			setState(80);
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

	public static class TestContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(companyParser.EOF, 0); }
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			expr(0);
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

	public static class Ft_dclContext extends ParserRuleContext {
		public TerminalNode Declare() { return getToken(companyParser.Declare, 0); }
		public List<Func_dclContext> func_dcl() {
			return getRuleContexts(Func_dclContext.class);
		}
		public Func_dclContext func_dcl(int i) {
			return getRuleContext(Func_dclContext.class,i);
		}
		public List<Type_dclContext> type_dcl() {
			return getRuleContexts(Type_dclContext.class);
		}
		public Type_dclContext type_dcl(int i) {
			return getRuleContext(Type_dclContext.class,i);
		}
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public Ft_dclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ft_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterFt_dcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitFt_dcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitFt_dcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ft_dclContext ft_dcl() throws RecognitionException {
		Ft_dclContext _localctx = new Ft_dclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ft_dcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(Declare);
			setState(86);
			match(T__0);
			setState(90); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(90);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(87);
					func_dcl();
					}
					break;
				case 2:
					{
					setState(88);
					type_dcl();
					}
					break;
				case 3:
					{
					setState(89);
					var_def();
					}
					break;
				}
				}
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Int) | (1L << Float) | (1L << Bool) | (1L << String) | (1L << Const) | (1L << ID))) != 0) );
			setState(94);
			match(T__1);
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

	public static class Func_dclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(companyParser.ID, 0); }
		public List<ArgsContext> args() {
			return getRuleContexts(ArgsContext.class);
		}
		public ArgsContext args(int i) {
			return getRuleContext(ArgsContext.class,i);
		}
		public Args_varContext args_var() {
			return getRuleContext(Args_varContext.class,0);
		}
		public Func_dclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterFunc_dcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitFunc_dcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitFunc_dcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_dclContext func_dcl() throws RecognitionException {
		Func_dclContext _localctx = new Func_dclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func_dcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(96);
				match(T__2);
				setState(97);
				args(0);
				setState(98);
				match(T__3);
				setState(99);
				match(T__4);
				}
			}

			setState(103);
			match(ID);
			setState(104);
			match(T__2);
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(105);
				args(0);
				}
				break;
			case 2:
				{
				setState(106);
				args_var(0);
				}
				break;
			}
			setState(109);
			match(T__3);
			setState(110);
			match(T__5);
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

	public static class ArgsContext extends ParserRuleContext {
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	 
		public ArgsContext() { }
		public void copyFrom(ArgsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Args1Context extends ArgsContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Args1Context(ArgsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterArgs1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitArgs1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitArgs1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Args2Context extends ArgsContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Args2Context(ArgsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterArgs2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitArgs2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitArgs2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		return args(0);
	}

	private ArgsContext args(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgsContext _localctx = new ArgsContext(_ctx, _parentState);
		ArgsContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_args, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Args1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(113);
			type();
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(114);
					match(T__6);
					setState(115);
					match(T__7);
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Args2Context(new ArgsContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_args);
					setState(121);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(122);
					match(T__8);
					setState(123);
					type();
					setState(128);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(124);
							match(T__6);
							setState(125);
							match(T__7);
							}
							} 
						}
						setState(130);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					}
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class Args_varContext extends ParserRuleContext {
		public Args_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args_var; }
	 
		public Args_varContext() { }
		public void copyFrom(Args_varContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Args_var2Context extends Args_varContext {
		public Args_varContext args_var() {
			return getRuleContext(Args_varContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(companyParser.ID, 0); }
		public Args_var2Context(Args_varContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterArgs_var2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitArgs_var2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitArgs_var2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Args_var1Context extends Args_varContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(companyParser.ID, 0); }
		public Args_var1Context(Args_varContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterArgs_var1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitArgs_var1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitArgs_var1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Args_varContext args_var() throws RecognitionException {
		return args_var(0);
	}

	private Args_varContext args_var(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Args_varContext _localctx = new Args_varContext(_ctx, _parentState);
		Args_varContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_args_var, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Args_var1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(137);
			type();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(138);
				match(T__6);
				setState(139);
				match(T__7);
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Args_var2Context(new Args_varContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_args_var);
					setState(147);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(148);
					match(T__8);
					setState(149);
					type();
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(150);
						match(T__6);
						setState(151);
						match(T__7);
						}
						}
						setState(156);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(157);
					match(ID);
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class Type_dclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(companyParser.ID, 0); }
		public Type_dclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterType_dcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitType_dcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitType_dcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_dclContext type_dcl() throws RecognitionException {
		Type_dclContext _localctx = new Type_dclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type_dcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(ID);
			setState(165);
			match(T__5);
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

	public static class Var_defContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<Var_valContext> var_val() {
			return getRuleContexts(Var_valContext.class);
		}
		public Var_valContext var_val(int i) {
			return getRuleContext(Var_valContext.class,i);
		}
		public TerminalNode Const() { return getToken(companyParser.Const, 0); }
		public Var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterVar_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitVar_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitVar_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Const) {
				{
				setState(167);
				match(Const);
				}
			}

			setState(170);
			type();
			setState(171);
			var_val();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(172);
				match(T__8);
				setState(173);
				var_val();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
			match(T__5);
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

	public static class Var_valContext extends ParserRuleContext {
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Var_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterVar_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitVar_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitVar_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_valContext var_val() throws RecognitionException {
		Var_valContext _localctx = new Var_valContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			ref();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(182);
				match(T__4);
				setState(183);
				expr(0);
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

	public static class Ft_defContext extends ParserRuleContext {
		public Type_defContext type_def() {
			return getRuleContext(Type_defContext.class,0);
		}
		public Fun_defContext fun_def() {
			return getRuleContext(Fun_defContext.class,0);
		}
		public Ft_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ft_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterFt_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitFt_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitFt_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ft_defContext ft_def() throws RecognitionException {
		Ft_defContext _localctx = new Ft_defContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ft_def);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Type:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				type_def();
				}
				break;
			case T__2:
			case Function:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				fun_def();
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

	public static class Type_defContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(companyParser.Type, 0); }
		public List<TerminalNode> ID() { return getTokens(companyParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(companyParser.ID, i);
		}
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public Type_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterType_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitType_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitType_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_defContext type_def() throws RecognitionException {
		Type_defContext _localctx = new Type_defContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(Type);
			setState(191);
			match(ID);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(192);
				match(T__9);
				setState(193);
				match(ID);
				}
			}

			setState(196);
			match(T__0);
			setState(198); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(197);
				component();
				}
				}
				setState(200); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Int) | (1L << Float) | (1L << Bool) | (1L << String) | (1L << Function) | (1L << Const) | (1L << Public) | (1L << Private) | (1L << Protected) | (1L << ID))) != 0) );
			setState(202);
			match(T__1);
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

	public static class ComponentContext extends ParserRuleContext {
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
	 
		public ComponentContext() { }
		public void copyFrom(ComponentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncComponentContext extends ComponentContext {
		public Fun_defContext fun_def() {
			return getRuleContext(Fun_defContext.class,0);
		}
		public Access_modifierContext access_modifier() {
			return getRuleContext(Access_modifierContext.class,0);
		}
		public FuncComponentContext(ComponentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterFuncComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitFuncComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitFuncComponent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarComponentContext extends ComponentContext {
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public Access_modifierContext access_modifier() {
			return getRuleContext(Access_modifierContext.class,0);
		}
		public VarComponentContext(ComponentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterVarComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitVarComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitVarComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_component);
		int _la;
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new VarComponentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Public) | (1L << Private) | (1L << Protected))) != 0)) {
					{
					setState(204);
					access_modifier();
					}
				}

				setState(207);
				var_def();
				}
				break;
			case 2:
				_localctx = new FuncComponentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Public) | (1L << Private) | (1L << Protected))) != 0)) {
					{
					setState(208);
					access_modifier();
					}
				}

				setState(211);
				fun_def();
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

	public static class Access_modifierContext extends ParserRuleContext {
		public TerminalNode Private() { return getToken(companyParser.Private, 0); }
		public TerminalNode Public() { return getToken(companyParser.Public, 0); }
		public TerminalNode Protected() { return getToken(companyParser.Protected, 0); }
		public Access_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterAccess_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitAccess_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitAccess_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_modifierContext access_modifier() throws RecognitionException {
		Access_modifierContext _localctx = new Access_modifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_access_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Public) | (1L << Private) | (1L << Protected))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Fun_defContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(companyParser.Function, 0); }
		public TerminalNode ID() { return getToken(companyParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<Args_varContext> args_var() {
			return getRuleContexts(Args_varContext.class);
		}
		public Args_varContext args_var(int i) {
			return getRuleContext(Args_varContext.class,i);
		}
		public Fun_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterFun_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitFun_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitFun_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fun_defContext fun_def() throws RecognitionException {
		Fun_defContext _localctx = new Fun_defContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fun_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(216);
				match(T__2);
				setState(217);
				args_var(0);
				setState(218);
				match(T__3);
				setState(219);
				match(T__4);
				}
			}

			setState(223);
			match(Function);
			setState(224);
			match(ID);
			setState(225);
			match(T__2);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Float) | (1L << Bool) | (1L << String) | (1L << ID))) != 0)) {
				{
				setState(226);
				args_var(0);
				}
			}

			setState(229);
			match(T__3);
			setState(230);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__0);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Int) | (1L << Float) | (1L << Bool) | (1L << String) | (1L << If) | (1L << Switch) | (1L << Break) | (1L << For) | (1L << While) | (1L << Continue) | (1L << Const) | (1L << This) | (1L << Super) | (1L << Read) | (1L << Write) | (1L << Destruct) | (1L << ID))) != 0)) {
				{
				setState(235);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(233);
					var_def();
					}
					break;
				case 2:
					{
					setState(234);
					stmt();
					}
					break;
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			match(T__1);
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

	public static class StmtContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Cond_stmtContext cond_stmt() {
			return getRuleContext(Cond_stmtContext.class,0);
		}
		public Loop_stmtContext loop_stmt() {
			return getRuleContext(Loop_stmtContext.class,0);
		}
		public TerminalNode Break() { return getToken(companyParser.Break, 0); }
		public TerminalNode Continue() { return getToken(companyParser.Continue, 0); }
		public TerminalNode Destruct() { return getToken(companyParser.Destruct, 0); }
		public TerminalNode ID() { return getToken(companyParser.ID, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stmt);
		int _la;
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				assign();
				setState(243);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				func_call();
				setState(246);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				cond_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(249);
				loop_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(250);
				match(Break);
				setState(251);
				match(T__5);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(252);
				match(Continue);
				setState(253);
				match(T__5);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(254);
				match(Destruct);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(255);
					match(T__6);
					setState(256);
					match(T__7);
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(262);
				match(ID);
				setState(263);
				match(T__5);
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

	public static class AssignContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case This:
			case Super:
			case ID:
				{
				setState(266);
				var();
				}
				break;
			case T__2:
				{
				setState(267);
				match(T__2);
				setState(268);
				var();
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(269);
					match(T__8);
					setState(270);
					var();
					}
					}
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(276);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(280);
			match(T__4);
			setState(281);
			expr(0);
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

	public static class VarContext extends ParserRuleContext {
		public List<RefContext> ref() {
			return getRuleContexts(RefContext.class);
		}
		public RefContext ref(int i) {
			return getRuleContext(RefContext.class,i);
		}
		public TerminalNode This() { return getToken(companyParser.This, 0); }
		public TerminalNode Super() { return getToken(companyParser.Super, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_var);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==This || _la==Super) {
				{
				setState(283);
				_la = _input.LA(1);
				if ( !(_la==This || _la==Super) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(284);
				match(T__10);
				}
			}

			setState(287);
			ref();
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(288);
					match(T__10);
					setState(289);
					ref();
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class RefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(companyParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefContext ref() throws RecognitionException {
		RefContext _localctx = new RefContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ref);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(ID);
			setState(302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(296);
					match(T__6);
					setState(297);
					expr(0);
					setState(298);
					match(T__7);
					}
					} 
				}
				setState(304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParanthesisContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParanthesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterParanthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitParanthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitParanthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Oper1Context extends ExprContext {
		public Unary_opContext unary_op() {
			return getRuleContext(Unary_opContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Oper1Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterOper1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitOper1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitOper1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullContext extends ExprContext {
		public TerminalNode Nil() { return getToken(companyParser.Nil, 0); }
		public NullContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Oper2Context extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Op1Context op1() {
			return getRuleContext(Op1Context.class,0);
		}
		public Oper2Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterOper2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitOper2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitOper2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstttContext extends ExprContext {
		public Const_valContext const_val() {
			return getRuleContext(Const_valContext.class,0);
		}
		public ConstttContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterConsttt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitConsttt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitConsttt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Oper3Context extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Op2Context op2() {
			return getRuleContext(Op2Context.class,0);
		}
		public Oper3Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterOper3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitOper3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitOper3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Just_varContext extends ExprContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Just_varContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterJust_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitJust_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitJust_var(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Oper4Context extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Op3Context op3() {
			return getRuleContext(Op3Context.class,0);
		}
		public Oper4Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterOper4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitOper4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitOper4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Oper5Context extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Op4Context op4() {
			return getRuleContext(Op4Context.class,0);
		}
		public Oper5Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterOper5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitOper5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitOper5(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Oper6Context extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BitwiseContext bitwise() {
			return getRuleContext(BitwiseContext.class,0);
		}
		public Oper6Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterOper6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitOper6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitOper6(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Oper7Context extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LogicalContext logical() {
			return getRuleContext(LogicalContext.class,0);
		}
		public Oper7Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterOper7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitOper7(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitOper7(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class List_opContext extends ExprContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public List_opContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterList_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitList_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitList_op(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Functoin_callContext extends ExprContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Functoin_callContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterFunctoin_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitFunctoin_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitFunctoin_call(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AllocContext extends ExprContext {
		public TerminalNode Allocate() { return getToken(companyParser.Allocate, 0); }
		public Handle_callContext handle_call() {
			return getRuleContext(Handle_callContext.class,0);
		}
		public AllocContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterAlloc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitAlloc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitAlloc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				_localctx = new Oper1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(306);
				unary_op();
				setState(307);
				expr(14);
				}
				break;
			case 2:
				{
				_localctx = new ParanthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(309);
				match(T__2);
				setState(310);
				expr(0);
				setState(311);
				match(T__3);
				}
				break;
			case 3:
				{
				_localctx = new ConstttContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(313);
				const_val();
				}
				break;
			case 4:
				{
				_localctx = new AllocContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(314);
				match(Allocate);
				setState(315);
				handle_call();
				}
				break;
			case 5:
				{
				_localctx = new Functoin_callContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(316);
				func_call();
				}
				break;
			case 6:
				{
				_localctx = new Just_varContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(317);
				var();
				}
				break;
			case 7:
				{
				_localctx = new List_opContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(318);
				list();
				}
				break;
			case 8:
				{
				_localctx = new NullContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(319);
				match(Nil);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(346);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new Oper2Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(322);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(323);
						op1();
						setState(324);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new Oper3Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(326);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(327);
						op2();
						setState(328);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new Oper4Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(330);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(331);
						op3();
						setState(332);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new Oper5Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(334);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(335);
						op4();
						setState(336);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new Oper6Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(338);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(339);
						bitwise();
						setState(340);
						expr(10);
						}
						break;
					case 6:
						{
						_localctx = new Oper7Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(342);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(343);
						logical();
						setState(344);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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

	public static class Func_callContext extends ParserRuleContext {
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
	 
		public Func_callContext() { }
		public void copyFrom(Func_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReadContext extends Func_callContext {
		public TerminalNode Read() { return getToken(companyParser.Read, 0); }
		public ReadContext(Func_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Func_clContext extends Func_callContext {
		public Handle_callContext handle_call() {
			return getRuleContext(Handle_callContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Func_clContext(Func_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterFunc_cl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitFunc_cl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitFunc_cl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteContext extends Func_callContext {
		public TerminalNode Write() { return getToken(companyParser.Write, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WriteContext(Func_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_func_call);
		try {
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case This:
			case Super:
			case ID:
				_localctx = new Func_clContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(351);
					var();
					setState(352);
					match(T__10);
					}
					break;
				}
				setState(356);
				handle_call();
				}
				break;
			case Read:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				match(Read);
				setState(358);
				match(T__2);
				setState(359);
				match(T__3);
				}
				break;
			case Write:
				_localctx = new WriteContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				match(Write);
				setState(361);
				match(T__2);
				setState(362);
				expr(0);
				setState(363);
				match(T__3);
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

	public static class ListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(T__6);
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(368);
				expr(0);
				}
				break;
			case 2:
				{
				setState(369);
				list();
				}
				break;
			}
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(372);
				match(T__8);
				setState(375);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(373);
					expr(0);
					}
					break;
				case 2:
					{
					setState(374);
					list();
					}
					break;
				}
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(382);
			match(T__7);
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

	public static class Handle_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(companyParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Handle_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handle_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterHandle_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitHandle_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitHandle_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Handle_callContext handle_call() throws RecognitionException {
		Handle_callContext _localctx = new Handle_callContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_handle_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(ID);
			setState(385);
			match(T__2);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << This) | (1L << Super) | (1L << Read) | (1L << Write) | (1L << Nil) | (1L << Allocate) | (1L << Int_val) | (1L << Float_val) | (1L << String_val) | (1L << Bool_val) | (1L << ID))) != 0)) {
				{
				setState(386);
				params();
				}
			}

			setState(389);
			match(T__3);
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

	public static class ParamsContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_params);
		try {
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				expr(0);
				setState(393);
				match(T__8);
				setState(394);
				params();
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

	public static class Cond_stmtContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(companyParser.If, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode Else() { return getToken(companyParser.Else, 0); }
		public TerminalNode Switch() { return getToken(companyParser.Switch, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Switch_bodyContext switch_body() {
			return getRuleContext(Switch_bodyContext.class,0);
		}
		public Cond_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterCond_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitCond_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitCond_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_stmtContext cond_stmt() throws RecognitionException {
		Cond_stmtContext _localctx = new Cond_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cond_stmt);
		try {
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				match(If);
				setState(399);
				expr(0);
				setState(402);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(400);
					block();
					}
					break;
				case T__2:
				case If:
				case Switch:
				case Break:
				case For:
				case While:
				case Continue:
				case This:
				case Super:
				case Read:
				case Write:
				case Destruct:
				case ID:
					{
					setState(401);
					stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(409);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(404);
					match(Else);
					setState(407);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
						{
						setState(405);
						block();
						}
						break;
					case T__2:
					case If:
					case Switch:
					case Break:
					case For:
					case While:
					case Continue:
					case This:
					case Super:
					case Read:
					case Write:
					case Destruct:
					case ID:
						{
						setState(406);
						stmt();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				match(Switch);
				setState(412);
				var();
				setState(413);
				match(T__0);
				setState(414);
				switch_body();
				setState(415);
				match(T__1);
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

	public static class Switch_bodyContext extends ParserRuleContext {
		public List<TerminalNode> Caseof() { return getTokens(companyParser.Caseof); }
		public TerminalNode Caseof(int i) {
			return getToken(companyParser.Caseof, i);
		}
		public List<TerminalNode> Int_val() { return getTokens(companyParser.Int_val); }
		public TerminalNode Int_val(int i) {
			return getToken(companyParser.Int_val, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode Default() { return getToken(companyParser.Default, 0); }
		public Switch_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterSwitch_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitSwitch_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitSwitch_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_bodyContext switch_body() throws RecognitionException {
		Switch_bodyContext _localctx = new Switch_bodyContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_switch_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(419);
				match(Caseof);
				setState(420);
				match(Int_val);
				setState(421);
				match(T__9);
				setState(422);
				block();
				}
				}
				setState(425); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Caseof );
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Default) {
				{
				setState(427);
				match(Default);
				setState(428);
				match(T__9);
				setState(429);
				block();
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

	public static class Loop_stmtContext extends ParserRuleContext {
		public Loop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_stmt; }
	 
		public Loop_stmtContext() { }
		public void copyFrom(Loop_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForLoopContext extends Loop_stmtContext {
		public TerminalNode For() { return getToken(companyParser.For, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ForLoopContext(Loop_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileLoopContext extends Loop_stmtContext {
		public TerminalNode While() { return getToken(companyParser.While, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileLoopContext(Loop_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_stmtContext loop_stmt() throws RecognitionException {
		Loop_stmtContext _localctx = new Loop_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_loop_stmt);
		int _la;
		try {
			setState(451);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case For:
				_localctx = new ForLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				match(For);
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Int) | (1L << Float) | (1L << Bool) | (1L << String) | (1L << This) | (1L << Super) | (1L << ID))) != 0)) {
					{
					setState(434);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						setState(433);
						type();
						}
						break;
					}
					setState(436);
					assign();
					}
				}

				setState(439);
				match(T__5);
				setState(440);
				expr(0);
				setState(441);
				match(T__5);
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << This) | (1L << Super) | (1L << ID))) != 0)) {
					{
					setState(442);
					assign();
					}
				}

				setState(445);
				block();
				}
				break;
			case While:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				match(While);
				setState(448);
				expr(0);
				setState(449);
				block();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(companyParser.Int, 0); }
		public TerminalNode Float() { return getToken(companyParser.Float, 0); }
		public TerminalNode Bool() { return getToken(companyParser.Bool, 0); }
		public TerminalNode String() { return getToken(companyParser.String, 0); }
		public TerminalNode ID() { return getToken(companyParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Float) | (1L << Bool) | (1L << String) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Const_valContext extends ParserRuleContext {
		public TerminalNode Int_val() { return getToken(companyParser.Int_val, 0); }
		public TerminalNode Float_val() { return getToken(companyParser.Float_val, 0); }
		public TerminalNode String_val() { return getToken(companyParser.String_val, 0); }
		public TerminalNode Bool_val() { return getToken(companyParser.Bool_val, 0); }
		public Const_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterConst_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitConst_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitConst_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_valContext const_val() throws RecognitionException {
		Const_valContext _localctx = new Const_valContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_const_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int_val) | (1L << Float_val) | (1L << String_val) | (1L << Bool_val))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Unary_opContext extends ParserRuleContext {
		public Unary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterUnary_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitUnary_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitUnary_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_opContext unary_op() throws RecognitionException {
		Unary_opContext _localctx = new Unary_opContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_unary_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Op1Context extends ParserRuleContext {
		public Op1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterOp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitOp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitOp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op1Context op1() throws RecognitionException {
		Op1Context _localctx = new Op1Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_op1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Op2Context extends ParserRuleContext {
		public Op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterOp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitOp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitOp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op2Context op2() throws RecognitionException {
		Op2Context _localctx = new Op2Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_op2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__17) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Op3Context extends ParserRuleContext {
		public Op3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterOp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitOp3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitOp3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op3Context op3() throws RecognitionException {
		Op3Context _localctx = new Op3Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_op3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Op4Context extends ParserRuleContext {
		public Op4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterOp4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitOp4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitOp4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op4Context op4() throws RecognitionException {
		Op4Context _localctx = new Op4Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_op4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_la = _input.LA(1);
			if ( !(_la==T__22 || _la==T__23) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class BitwiseContext extends ParserRuleContext {
		public BitwiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterBitwise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitBitwise(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitBitwise(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitwiseContext bitwise() throws RecognitionException {
		BitwiseContext _localctx = new BitwiseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_bitwise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_la = _input.LA(1);
			if ( !(_la==T__24 || _la==T__25) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class LogicalContext extends ParserRuleContext {
		public LogicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).enterLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof companyListener ) ((companyListener)listener).exitLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof companyVisitor ) return ((companyVisitor<? extends T>)visitor).visitLogical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalContext logical() throws RecognitionException {
		LogicalContext _localctx = new LogicalContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_logical);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			_la = _input.LA(1);
			if ( !(_la==T__26 || _la==T__27) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		case 4:
			return args_sempred((ArgsContext)_localctx, predIndex);
		case 5:
			return args_var_sempred((Args_varContext)_localctx, predIndex);
		case 19:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean args_sempred(ArgsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean args_var_sempred(Args_varContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u01da\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\5\2L\n\2\3\2\6\2O\n\2\r\2\16\2P\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\6\4]\n\4\r\4\16\4^\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\5\5h\n\5\3\5\3\5\3\5\3\5\5\5n\n\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\7\6w\n\6\f\6\16\6z\13\6\3\6\3\6\3\6\3\6\3\6\7\6\u0081\n\6\f\6\16"+
		"\6\u0084\13\6\7\6\u0086\n\6\f\6\16\6\u0089\13\6\3\7\3\7\3\7\3\7\7\7\u008f"+
		"\n\7\f\7\16\7\u0092\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u009b\n\7\f\7"+
		"\16\7\u009e\13\7\3\7\3\7\7\7\u00a2\n\7\f\7\16\7\u00a5\13\7\3\b\3\b\3\b"+
		"\3\t\5\t\u00ab\n\t\3\t\3\t\3\t\3\t\7\t\u00b1\n\t\f\t\16\t\u00b4\13\t\3"+
		"\t\3\t\3\n\3\n\3\n\5\n\u00bb\n\n\3\13\3\13\5\13\u00bf\n\13\3\f\3\f\3\f"+
		"\3\f\5\f\u00c5\n\f\3\f\3\f\6\f\u00c9\n\f\r\f\16\f\u00ca\3\f\3\f\3\r\5"+
		"\r\u00d0\n\r\3\r\3\r\5\r\u00d4\n\r\3\r\5\r\u00d7\n\r\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u00e0\n\17\3\17\3\17\3\17\3\17\5\17\u00e6\n\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\7\20\u00ee\n\20\f\20\16\20\u00f1\13\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\7\21\u0104\n\21\f\21\16\21\u0107\13\21\3\21\3\21\5\21"+
		"\u010b\n\21\3\22\3\22\3\22\3\22\3\22\7\22\u0112\n\22\f\22\16\22\u0115"+
		"\13\22\3\22\3\22\5\22\u0119\n\22\3\22\3\22\3\22\3\23\3\23\5\23\u0120\n"+
		"\23\3\23\3\23\3\23\7\23\u0125\n\23\f\23\16\23\u0128\13\23\3\24\3\24\3"+
		"\24\3\24\3\24\7\24\u012f\n\24\f\24\16\24\u0132\13\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0143"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u015d\n\25"+
		"\f\25\16\25\u0160\13\25\3\26\3\26\3\26\5\26\u0165\n\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0170\n\26\3\27\3\27\3\27\5\27\u0175"+
		"\n\27\3\27\3\27\3\27\5\27\u017a\n\27\7\27\u017c\n\27\f\27\16\27\u017f"+
		"\13\27\3\27\3\27\3\30\3\30\3\30\5\30\u0186\n\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\5\31\u018f\n\31\3\32\3\32\3\32\3\32\5\32\u0195\n\32\3\32"+
		"\3\32\3\32\5\32\u019a\n\32\5\32\u019c\n\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\5\32\u01a4\n\32\3\33\3\33\3\33\3\33\6\33\u01aa\n\33\r\33\16\33\u01ab"+
		"\3\33\3\33\3\33\5\33\u01b1\n\33\3\34\3\34\5\34\u01b5\n\34\3\34\5\34\u01b8"+
		"\n\34\3\34\3\34\3\34\3\34\5\34\u01be\n\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u01c6\n\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#"+
		"\3#\3$\3$\3%\3%\3%\2\5\n\f(&\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFH\2\r\3\29;\3\2\60\61\4\2!$@@\3\2<?\3\2\16\20"+
		"\3\2\21\23\4\2\20\20\24\24\3\2\25\30\3\2\31\32\3\2\33\34\3\2\35\36\2\u01fb"+
		"\2K\3\2\2\2\4T\3\2\2\2\6W\3\2\2\2\bg\3\2\2\2\nr\3\2\2\2\f\u008a\3\2\2"+
		"\2\16\u00a6\3\2\2\2\20\u00aa\3\2\2\2\22\u00b7\3\2\2\2\24\u00be\3\2\2\2"+
		"\26\u00c0\3\2\2\2\30\u00d6\3\2\2\2\32\u00d8\3\2\2\2\34\u00df\3\2\2\2\36"+
		"\u00ea\3\2\2\2 \u010a\3\2\2\2\"\u0118\3\2\2\2$\u011f\3\2\2\2&\u0129\3"+
		"\2\2\2(\u0142\3\2\2\2*\u016f\3\2\2\2,\u0171\3\2\2\2.\u0182\3\2\2\2\60"+
		"\u018e\3\2\2\2\62\u01a3\3\2\2\2\64\u01a9\3\2\2\2\66\u01c5\3\2\2\28\u01c7"+
		"\3\2\2\2:\u01c9\3\2\2\2<\u01cb\3\2\2\2>\u01cd\3\2\2\2@\u01cf\3\2\2\2B"+
		"\u01d1\3\2\2\2D\u01d3\3\2\2\2F\u01d5\3\2\2\2H\u01d7\3\2\2\2JL\5\6\4\2"+
		"KJ\3\2\2\2KL\3\2\2\2LN\3\2\2\2MO\5\24\13\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2"+
		"\2PQ\3\2\2\2QR\3\2\2\2RS\7\2\2\3S\3\3\2\2\2TU\5(\25\2UV\7\2\2\3V\5\3\2"+
		"\2\2WX\7\63\2\2X\\\7\3\2\2Y]\5\b\5\2Z]\5\16\b\2[]\5\20\t\2\\Y\3\2\2\2"+
		"\\Z\3\2\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7\4"+
		"\2\2a\7\3\2\2\2bc\7\5\2\2cd\5\n\6\2de\7\6\2\2ef\7\7\2\2fh\3\2\2\2gb\3"+
		"\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7@\2\2jm\7\5\2\2kn\5\n\6\2ln\5\f\7\2mk\3"+
		"\2\2\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2op\7\6\2\2pq\7\b\2\2q\t\3\2\2\2rs"+
		"\b\6\1\2sx\58\35\2tu\7\t\2\2uw\7\n\2\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2x"+
		"y\3\2\2\2y\u0087\3\2\2\2zx\3\2\2\2{|\f\3\2\2|}\7\13\2\2}\u0082\58\35\2"+
		"~\177\7\t\2\2\177\u0081\7\n\2\2\u0080~\3\2\2\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0085{\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\13\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\b\7\1\2\u008b"+
		"\u0090\58\35\2\u008c\u008d\7\t\2\2\u008d\u008f\7\n\2\2\u008e\u008c\3\2"+
		"\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7@\2\2\u0094\u00a3\3\2"+
		"\2\2\u0095\u0096\f\3\2\2\u0096\u0097\7\13\2\2\u0097\u009c\58\35\2\u0098"+
		"\u0099\7\t\2\2\u0099\u009b\7\n\2\2\u009a\u0098\3\2\2\2\u009b\u009e\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009f\u00a0\7@\2\2\u00a0\u00a2\3\2\2\2\u00a1\u0095\3\2"+
		"\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\r\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7@\2\2\u00a7\u00a8\7\b\2\2"+
		"\u00a8\17\3\2\2\2\u00a9\u00ab\7.\2\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3"+
		"\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\58\35\2\u00ad\u00b2\5\22\n\2\u00ae"+
		"\u00af\7\13\2\2\u00af\u00b1\5\22\n\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3"+
		"\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00b6\7\b\2\2\u00b6\21\3\2\2\2\u00b7\u00ba\5&\24"+
		"\2\u00b8\u00b9\7\7\2\2\u00b9\u00bb\5(\25\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\23\3\2\2\2\u00bc\u00bf\5\26\f\2\u00bd\u00bf\5\34\17\2\u00be"+
		"\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\25\3\2\2\2\u00c0\u00c1\7\62\2"+
		"\2\u00c1\u00c4\7@\2\2\u00c2\u00c3\7\f\2\2\u00c3\u00c5\7@\2\2\u00c4\u00c2"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\7\3\2\2\u00c7"+
		"\u00c9\5\30\r\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3"+
		"\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\7\4\2\2\u00cd"+
		"\27\3\2\2\2\u00ce\u00d0\5\32\16\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d7\5\20\t\2\u00d2\u00d4\5\32\16\2\u00d3"+
		"\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\5\34"+
		"\17\2\u00d6\u00cf\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d7\31\3\2\2\2\u00d8\u00d9"+
		"\t\2\2\2\u00d9\33\3\2\2\2\u00da\u00db\7\5\2\2\u00db\u00dc\5\f\7\2\u00dc"+
		"\u00dd\7\6\2\2\u00dd\u00de\7\7\2\2\u00de\u00e0\3\2\2\2\u00df\u00da\3\2"+
		"\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\7%\2\2\u00e2"+
		"\u00e3\7@\2\2\u00e3\u00e5\7\5\2\2\u00e4\u00e6\5\f\7\2\u00e5\u00e4\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\7\6\2\2\u00e8"+
		"\u00e9\5\36\20\2\u00e9\35\3\2\2\2\u00ea\u00ef\7\3\2\2\u00eb\u00ee\5\20"+
		"\t\2\u00ec\u00ee\5 \21\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee"+
		"\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2"+
		"\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7\4\2\2\u00f3\37\3\2\2\2\u00f4\u00f5"+
		"\5\"\22\2\u00f5\u00f6\7\b\2\2\u00f6\u010b\3\2\2\2\u00f7\u00f8\5*\26\2"+
		"\u00f8\u00f9\7\b\2\2\u00f9\u010b\3\2\2\2\u00fa\u010b\5\62\32\2\u00fb\u010b"+
		"\5\66\34\2\u00fc\u00fd\7*\2\2\u00fd\u010b\7\b\2\2\u00fe\u00ff\7-\2\2\u00ff"+
		"\u010b\7\b\2\2\u0100\u0105\7\67\2\2\u0101\u0102\7\t\2\2\u0102\u0104\7"+
		"\n\2\2\u0103\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7@"+
		"\2\2\u0109\u010b\7\b\2\2\u010a\u00f4\3\2\2\2\u010a\u00f7\3\2\2\2\u010a"+
		"\u00fa\3\2\2\2\u010a\u00fb\3\2\2\2\u010a\u00fc\3\2\2\2\u010a\u00fe\3\2"+
		"\2\2\u010a\u0100\3\2\2\2\u010b!\3\2\2\2\u010c\u0119\5$\23\2\u010d\u010e"+
		"\7\5\2\2\u010e\u0113\5$\23\2\u010f\u0110\7\13\2\2\u0110\u0112\5$\23\2"+
		"\u0111\u010f\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114"+
		"\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7\6\2\2\u0117"+
		"\u0119\3\2\2\2\u0118\u010c\3\2\2\2\u0118\u010d\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u011b\7\7\2\2\u011b\u011c\5(\25\2\u011c#\3\2\2\2\u011d\u011e"+
		"\t\3\2\2\u011e\u0120\7\r\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0126\5&\24\2\u0122\u0123\7\r\2\2\u0123\u0125\5&"+
		"\24\2\u0124\u0122\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127%\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u0130\7@\2\2\u012a"+
		"\u012b\7\t\2\2\u012b\u012c\5(\25\2\u012c\u012d\7\n\2\2\u012d\u012f\3\2"+
		"\2\2\u012e\u012a\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\'\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\b\25\1"+
		"\2\u0134\u0135\5<\37\2\u0135\u0136\5(\25\20\u0136\u0143\3\2\2\2\u0137"+
		"\u0138\7\5\2\2\u0138\u0139\5(\25\2\u0139\u013a\7\6\2\2\u013a\u0143\3\2"+
		"\2\2\u013b\u0143\5:\36\2\u013c\u013d\78\2\2\u013d\u0143\5.\30\2\u013e"+
		"\u0143\5*\26\2\u013f\u0143\5$\23\2\u0140\u0143\5,\27\2\u0141\u0143\7\66"+
		"\2\2\u0142\u0133\3\2\2\2\u0142\u0137\3\2\2\2\u0142\u013b\3\2\2\2\u0142"+
		"\u013c\3\2\2\2\u0142\u013e\3\2\2\2\u0142\u013f\3\2\2\2\u0142\u0140\3\2"+
		"\2\2\u0142\u0141\3\2\2\2\u0143\u015e\3\2\2\2\u0144\u0145\f\17\2\2\u0145"+
		"\u0146\5> \2\u0146\u0147\5(\25\20\u0147\u015d\3\2\2\2\u0148\u0149\f\16"+
		"\2\2\u0149\u014a\5@!\2\u014a\u014b\5(\25\17\u014b\u015d\3\2\2\2\u014c"+
		"\u014d\f\r\2\2\u014d\u014e\5B\"\2\u014e\u014f\5(\25\16\u014f\u015d\3\2"+
		"\2\2\u0150\u0151\f\f\2\2\u0151\u0152\5D#\2\u0152\u0153\5(\25\r\u0153\u015d"+
		"\3\2\2\2\u0154\u0155\f\13\2\2\u0155\u0156\5F$\2\u0156\u0157\5(\25\f\u0157"+
		"\u015d\3\2\2\2\u0158\u0159\f\n\2\2\u0159\u015a\5H%\2\u015a\u015b\5(\25"+
		"\13\u015b\u015d\3\2\2\2\u015c\u0144\3\2\2\2\u015c\u0148\3\2\2\2\u015c"+
		"\u014c\3\2\2\2\u015c\u0150\3\2\2\2\u015c\u0154\3\2\2\2\u015c\u0158\3\2"+
		"\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		")\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0162\5$\23\2\u0162\u0163\7\r\2\2"+
		"\u0163\u0165\3\2\2\2\u0164\u0161\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166"+
		"\3\2\2\2\u0166\u0170\5.\30\2\u0167\u0168\7\64\2\2\u0168\u0169\7\5\2\2"+
		"\u0169\u0170\7\6\2\2\u016a\u016b\7\65\2\2\u016b\u016c\7\5\2\2\u016c\u016d"+
		"\5(\25\2\u016d\u016e\7\6\2\2\u016e\u0170\3\2\2\2\u016f\u0164\3\2\2\2\u016f"+
		"\u0167\3\2\2\2\u016f\u016a\3\2\2\2\u0170+\3\2\2\2\u0171\u0174\7\t\2\2"+
		"\u0172\u0175\5(\25\2\u0173\u0175\5,\27\2\u0174\u0172\3\2\2\2\u0174\u0173"+
		"\3\2\2\2\u0175\u017d\3\2\2\2\u0176\u0179\7\13\2\2\u0177\u017a\5(\25\2"+
		"\u0178\u017a\5,\27\2\u0179\u0177\3\2\2\2\u0179\u0178\3\2\2\2\u017a\u017c"+
		"\3\2\2\2\u017b\u0176\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0181\7\n"+
		"\2\2\u0181-\3\2\2\2\u0182\u0183\7@\2\2\u0183\u0185\7\5\2\2\u0184\u0186"+
		"\5\60\31\2\u0185\u0184\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\3\2\2\2"+
		"\u0187\u0188\7\6\2\2\u0188/\3\2\2\2\u0189\u018f\5(\25\2\u018a\u018b\5"+
		"(\25\2\u018b\u018c\7\13\2\2\u018c\u018d\5\60\31\2\u018d\u018f\3\2\2\2"+
		"\u018e\u0189\3\2\2\2\u018e\u018a\3\2\2\2\u018f\61\3\2\2\2\u0190\u0191"+
		"\7&\2\2\u0191\u0194\5(\25\2\u0192\u0195\5\36\20\2\u0193\u0195\5 \21\2"+
		"\u0194\u0192\3\2\2\2\u0194\u0193\3\2\2\2\u0195\u019b\3\2\2\2\u0196\u0199"+
		"\7\'\2\2\u0197\u019a\5\36\20\2\u0198\u019a\5 \21\2\u0199\u0197\3\2\2\2"+
		"\u0199\u0198\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0196\3\2\2\2\u019b\u019c"+
		"\3\2\2\2\u019c\u01a4\3\2\2\2\u019d\u019e\7(\2\2\u019e\u019f\5$\23\2\u019f"+
		"\u01a0\7\3\2\2\u01a0\u01a1\5\64\33\2\u01a1\u01a2\7\4\2\2\u01a2\u01a4\3"+
		"\2\2\2\u01a3\u0190\3\2\2\2\u01a3\u019d\3\2\2\2\u01a4\63\3\2\2\2\u01a5"+
		"\u01a6\7/\2\2\u01a6\u01a7\7<\2\2\u01a7\u01a8\7\f\2\2\u01a8\u01aa\5\36"+
		"\20\2\u01a9\u01a5\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab"+
		"\u01ac\3\2\2\2\u01ac\u01b0\3\2\2\2\u01ad\u01ae\7)\2\2\u01ae\u01af\7\f"+
		"\2\2\u01af\u01b1\5\36\20\2\u01b0\u01ad\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\65\3\2\2\2\u01b2\u01b7\7+\2\2\u01b3\u01b5\58\35\2\u01b4\u01b3\3\2\2\2"+
		"\u01b4\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b8\5\"\22\2\u01b7\u01b4"+
		"\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\7\b\2\2\u01ba"+
		"\u01bb\5(\25\2\u01bb\u01bd\7\b\2\2\u01bc\u01be\5\"\22\2\u01bd\u01bc\3"+
		"\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\5\36\20\2\u01c0"+
		"\u01c6\3\2\2\2\u01c1\u01c2\7,\2\2\u01c2\u01c3\5(\25\2\u01c3\u01c4\5\36"+
		"\20\2\u01c4\u01c6\3\2\2\2\u01c5\u01b2\3\2\2\2\u01c5\u01c1\3\2\2\2\u01c6"+
		"\67\3\2\2\2\u01c7\u01c8\t\4\2\2\u01c89\3\2\2\2\u01c9\u01ca\t\5\2\2\u01ca"+
		";\3\2\2\2\u01cb\u01cc\t\6\2\2\u01cc=\3\2\2\2\u01cd\u01ce\t\7\2\2\u01ce"+
		"?\3\2\2\2\u01cf\u01d0\t\b\2\2\u01d0A\3\2\2\2\u01d1\u01d2\t\t\2\2\u01d2"+
		"C\3\2\2\2\u01d3\u01d4\t\n\2\2\u01d4E\3\2\2\2\u01d5\u01d6\t\13\2\2\u01d6"+
		"G\3\2\2\2\u01d7\u01d8\t\f\2\2\u01d8I\3\2\2\2\66KP\\^gmx\u0082\u0087\u0090"+
		"\u009c\u00a3\u00aa\u00b2\u00ba\u00be\u00c4\u00ca\u00cf\u00d3\u00d6\u00df"+
		"\u00e5\u00ed\u00ef\u0105\u010a\u0113\u0118\u011f\u0126\u0130\u0142\u015c"+
		"\u015e\u0164\u016f\u0174\u0179\u017d\u0185\u018e\u0194\u0199\u019b\u01a3"+
		"\u01ab\u01b0\u01b4\u01b7\u01bd\u01c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}