// Generated from F:/Behdad/University/Books/Term 5/Compilers/Proj/Phase 2/newP/src/com/company\company.g4 by ANTLR 4.7.2
package com.company.LULU;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class companyLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "Ws", "Comment", "Int", "Float", "Bool", "String", 
			"Function", "If", "Else", "Switch", "Default", "Break", "For", "While", 
			"Continue", "Const", "Caseof", "This", "Super", "Type", "Declare", "Read", 
			"Write", "Nil", "Destruct", "Allocate", "Public", "Private", "Protected", 
			"Int_val", "Float_val", "String_val", "Bool_val", "ID", "EXP", "ESC_CODE", 
			"EXC_BS", "INT_DEC", "INT_HEX", "DIGIT", "LETTER"
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


	public companyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "company.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2@\u01ee\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\6"+
		"\36\u00cd\n\36\r\36\16\36\u00ce\3\36\3\36\3\37\3\37\3\37\3\37\7\37\u00d7"+
		"\n\37\f\37\16\37\u00da\13\37\3\37\3\37\3\37\3\37\3\37\7\37\u00e1\n\37"+
		"\f\37\16\37\u00e4\13\37\3\37\3\37\5\37\u00e8\n\37\3\37\3\37\3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+"+
		"\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3."+
		"\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\3"+
		"8\38\38\38\38\38\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3"+
		":\3;\3;\5;\u019c\n;\3<\5<\u019f\n<\3<\3<\3<\3<\3<\5<\u01a6\n<\3<\5<\u01a9"+
		"\n<\3=\3=\3=\7=\u01ae\n=\f=\16=\u01b1\13=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3"+
		">\3>\5>\u01be\n>\3?\3?\5?\u01c2\n?\3?\3?\3?\7?\u01c7\n?\f?\16?\u01ca\13"+
		"?\3@\3@\5@\u01ce\n@\3@\3@\3A\3A\3A\3A\3A\5A\u01d7\nA\3B\3B\3C\6C\u01dc"+
		"\nC\rC\16C\u01dd\3D\3D\3D\3D\5D\u01e4\nD\3D\6D\u01e7\nD\rD\16D\u01e8\3"+
		"E\3E\3F\3F\5\u00d8\u00e2\u01af\2G\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177\2\u0081\2\u0083\2\u0085"+
		"\2\u0087\2\u0089\2\u008b\2\3\2\f\5\2\13\f\17\17\"\"\3\2))\4\2BBaa\4\2"+
		"--//\b\2))\62\62^^ppttvv\4\2ZZzz\5\2\62;CHch\3\2^^\3\2\62;\4\2C\\c|\2"+
		"\u01fa\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3"+
		"\2\2\2\2{\3\2\2\2\2}\3\2\2\2\3\u008d\3\2\2\2\5\u008f\3\2\2\2\7\u0091\3"+
		"\2\2\2\t\u0093\3\2\2\2\13\u0095\3\2\2\2\r\u0097\3\2\2\2\17\u0099\3\2\2"+
		"\2\21\u009b\3\2\2\2\23\u009d\3\2\2\2\25\u009f\3\2\2\2\27\u00a1\3\2\2\2"+
		"\31\u00a3\3\2\2\2\33\u00a5\3\2\2\2\35\u00a7\3\2\2\2\37\u00a9\3\2\2\2!"+
		"\u00ab\3\2\2\2#\u00ad\3\2\2\2%\u00af\3\2\2\2\'\u00b1\3\2\2\2)\u00b4\3"+
		"\2\2\2+\u00b7\3\2\2\2-\u00b9\3\2\2\2/\u00bb\3\2\2\2\61\u00be\3\2\2\2\63"+
		"\u00c1\3\2\2\2\65\u00c3\3\2\2\2\67\u00c5\3\2\2\29\u00c8\3\2\2\2;\u00cc"+
		"\3\2\2\2=\u00e7\3\2\2\2?\u00eb\3\2\2\2A\u00ef\3\2\2\2C\u00f5\3\2\2\2E"+
		"\u00fa\3\2\2\2G\u0101\3\2\2\2I\u010a\3\2\2\2K\u010d\3\2\2\2M\u0112\3\2"+
		"\2\2O\u0119\3\2\2\2Q\u0121\3\2\2\2S\u0127\3\2\2\2U\u012b\3\2\2\2W\u0131"+
		"\3\2\2\2Y\u013a\3\2\2\2[\u0140\3\2\2\2]\u0147\3\2\2\2_\u014c\3\2\2\2a"+
		"\u0152\3\2\2\2c\u0157\3\2\2\2e\u015f\3\2\2\2g\u0164\3\2\2\2i\u016a\3\2"+
		"\2\2k\u016e\3\2\2\2m\u0177\3\2\2\2o\u0180\3\2\2\2q\u0187\3\2\2\2s\u018f"+
		"\3\2\2\2u\u019b\3\2\2\2w\u01a5\3\2\2\2y\u01aa\3\2\2\2{\u01bd\3\2\2\2}"+
		"\u01c1\3\2\2\2\177\u01cb\3\2\2\2\u0081\u01d1\3\2\2\2\u0083\u01d8\3\2\2"+
		"\2\u0085\u01db\3\2\2\2\u0087\u01e3\3\2\2\2\u0089\u01ea\3\2\2\2\u008b\u01ec"+
		"\3\2\2\2\u008d\u008e\7}\2\2\u008e\4\3\2\2\2\u008f\u0090\7\177\2\2\u0090"+
		"\6\3\2\2\2\u0091\u0092\7*\2\2\u0092\b\3\2\2\2\u0093\u0094\7+\2\2\u0094"+
		"\n\3\2\2\2\u0095\u0096\7?\2\2\u0096\f\3\2\2\2\u0097\u0098\7=\2\2\u0098"+
		"\16\3\2\2\2\u0099\u009a\7]\2\2\u009a\20\3\2\2\2\u009b\u009c\7_\2\2\u009c"+
		"\22\3\2\2\2\u009d\u009e\7.\2\2\u009e\24\3\2\2\2\u009f\u00a0\7<\2\2\u00a0"+
		"\26\3\2\2\2\u00a1\u00a2\7\60\2\2\u00a2\30\3\2\2\2\u00a3\u00a4\7#\2\2\u00a4"+
		"\32\3\2\2\2\u00a5\u00a6\7\u0080\2\2\u00a6\34\3\2\2\2\u00a7\u00a8\7/\2"+
		"\2\u00a8\36\3\2\2\2\u00a9\u00aa\7,\2\2\u00aa \3\2\2\2\u00ab\u00ac\7\61"+
		"\2\2\u00ac\"\3\2\2\2\u00ad\u00ae\7\'\2\2\u00ae$\3\2\2\2\u00af\u00b0\7"+
		"-\2\2\u00b0&\3\2\2\2\u00b1\u00b2\7>\2\2\u00b2\u00b3\7?\2\2\u00b3(\3\2"+
		"\2\2\u00b4\u00b5\7@\2\2\u00b5\u00b6\7?\2\2\u00b6*\3\2\2\2\u00b7\u00b8"+
		"\7>\2\2\u00b8,\3\2\2\2\u00b9\u00ba\7@\2\2\u00ba.\3\2\2\2\u00bb\u00bc\7"+
		"?\2\2\u00bc\u00bd\7?\2\2\u00bd\60\3\2\2\2\u00be\u00bf\7#\2\2\u00bf\u00c0"+
		"\7?\2\2\u00c0\62\3\2\2\2\u00c1\u00c2\7(\2\2\u00c2\64\3\2\2\2\u00c3\u00c4"+
		"\7~\2\2\u00c4\66\3\2\2\2\u00c5\u00c6\7~\2\2\u00c6\u00c7\7~\2\2\u00c78"+
		"\3\2\2\2\u00c8\u00c9\7(\2\2\u00c9\u00ca\7(\2\2\u00ca:\3\2\2\2\u00cb\u00cd"+
		"\t\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\b\36\2\2\u00d1<\3\2\2\2"+
		"\u00d2\u00d3\7%\2\2\u00d3\u00d4\7&\2\2\u00d4\u00d8\3\2\2\2\u00d5\u00d7"+
		"\13\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d9\3\2\2\2"+
		"\u00d8\u00d6\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00e8"+
		"\7\f\2\2\u00dc\u00dd\7%\2\2\u00dd\u00de\7*\2\2\u00de\u00e2\3\2\2\2\u00df"+
		"\u00e1\13\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e3\3"+
		"\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\u00e6\7+\2\2\u00e6\u00e8\7%\2\2\u00e7\u00d2\3\2\2\2\u00e7\u00dc\3\2\2"+
		"\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\b\37\2\2\u00ea>\3\2\2\2\u00eb\u00ec"+
		"\7k\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee\7v\2\2\u00ee@\3\2\2\2\u00ef\u00f0"+
		"\7h\2\2\u00f0\u00f1\7n\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3\7c\2\2\u00f3"+
		"\u00f4\7v\2\2\u00f4B\3\2\2\2\u00f5\u00f6\7d\2\2\u00f6\u00f7\7q\2\2\u00f7"+
		"\u00f8\7q\2\2\u00f8\u00f9\7n\2\2\u00f9D\3\2\2\2\u00fa\u00fb\7u\2\2\u00fb"+
		"\u00fc\7v\2\2\u00fc\u00fd\7t\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7p\2\2"+
		"\u00ff\u0100\7i\2\2\u0100F\3\2\2\2\u0101\u0102\7h\2\2\u0102\u0103\7w\2"+
		"\2\u0103\u0104\7p\2\2\u0104\u0105\7e\2\2\u0105\u0106\7v\2\2\u0106\u0107"+
		"\7k\2\2\u0107\u0108\7q\2\2\u0108\u0109\7p\2\2\u0109H\3\2\2\2\u010a\u010b"+
		"\7k\2\2\u010b\u010c\7h\2\2\u010cJ\3\2\2\2\u010d\u010e\7g\2\2\u010e\u010f"+
		"\7n\2\2\u010f\u0110\7u\2\2\u0110\u0111\7g\2\2\u0111L\3\2\2\2\u0112\u0113"+
		"\7u\2\2\u0113\u0114\7y\2\2\u0114\u0115\7k\2\2\u0115\u0116\7v\2\2\u0116"+
		"\u0117\7e\2\2\u0117\u0118\7j\2\2\u0118N\3\2\2\2\u0119\u011a\7f\2\2\u011a"+
		"\u011b\7g\2\2\u011b\u011c\7h\2\2\u011c\u011d\7c\2\2\u011d\u011e\7w\2\2"+
		"\u011e\u011f\7n\2\2\u011f\u0120\7v\2\2\u0120P\3\2\2\2\u0121\u0122\7d\2"+
		"\2\u0122\u0123\7t\2\2\u0123\u0124\7g\2\2\u0124\u0125\7c\2\2\u0125\u0126"+
		"\7m\2\2\u0126R\3\2\2\2\u0127\u0128\7h\2\2\u0128\u0129\7q\2\2\u0129\u012a"+
		"\7t\2\2\u012aT\3\2\2\2\u012b\u012c\7y\2\2\u012c\u012d\7j\2\2\u012d\u012e"+
		"\7k\2\2\u012e\u012f\7n\2\2\u012f\u0130\7g\2\2\u0130V\3\2\2\2\u0131\u0132"+
		"\7e\2\2\u0132\u0133\7q\2\2\u0133\u0134\7p\2\2\u0134\u0135\7v\2\2\u0135"+
		"\u0136\7k\2\2\u0136\u0137\7p\2\2\u0137\u0138\7w\2\2\u0138\u0139\7g\2\2"+
		"\u0139X\3\2\2\2\u013a\u013b\7e\2\2\u013b\u013c\7q\2\2\u013c\u013d\7p\2"+
		"\2\u013d\u013e\7u\2\2\u013e\u013f\7v\2\2\u013fZ\3\2\2\2\u0140\u0141\7"+
		"e\2\2\u0141\u0142\7c\2\2\u0142\u0143\7u\2\2\u0143\u0144\7g\2\2\u0144\u0145"+
		"\7q\2\2\u0145\u0146\7h\2\2\u0146\\\3\2\2\2\u0147\u0148\7v\2\2\u0148\u0149"+
		"\7j\2\2\u0149\u014a\7k\2\2\u014a\u014b\7u\2\2\u014b^\3\2\2\2\u014c\u014d"+
		"\7u\2\2\u014d\u014e\7w\2\2\u014e\u014f\7r\2\2\u014f\u0150\7g\2\2\u0150"+
		"\u0151\7t\2\2\u0151`\3\2\2\2\u0152\u0153\7v\2\2\u0153\u0154\7{\2\2\u0154"+
		"\u0155\7r\2\2\u0155\u0156\7g\2\2\u0156b\3\2\2\2\u0157\u0158\7f\2\2\u0158"+
		"\u0159\7g\2\2\u0159\u015a\7e\2\2\u015a\u015b\7n\2\2\u015b\u015c\7c\2\2"+
		"\u015c\u015d\7t\2\2\u015d\u015e\7g\2\2\u015ed\3\2\2\2\u015f\u0160\7t\2"+
		"\2\u0160\u0161\7g\2\2\u0161\u0162\7c\2\2\u0162\u0163\7f\2\2\u0163f\3\2"+
		"\2\2\u0164\u0165\7y\2\2\u0165\u0166\7t\2\2\u0166\u0167\7k\2\2\u0167\u0168"+
		"\7v\2\2\u0168\u0169\7g\2\2\u0169h\3\2\2\2\u016a\u016b\7p\2\2\u016b\u016c"+
		"\7k\2\2\u016c\u016d\7n\2\2\u016dj\3\2\2\2\u016e\u016f\7f\2\2\u016f\u0170"+
		"\7g\2\2\u0170\u0171\7u\2\2\u0171\u0172\7v\2\2\u0172\u0173\7t\2\2\u0173"+
		"\u0174\7w\2\2\u0174\u0175\7e\2\2\u0175\u0176\7v\2\2\u0176l\3\2\2\2\u0177"+
		"\u0178\7c\2\2\u0178\u0179\7n\2\2\u0179\u017a\7n\2\2\u017a\u017b\7q\2\2"+
		"\u017b\u017c\7e\2\2\u017c\u017d\7c\2\2\u017d\u017e\7v\2\2\u017e\u017f"+
		"\7g\2\2\u017fn\3\2\2\2\u0180\u0181\7r\2\2\u0181\u0182\7w\2\2\u0182\u0183"+
		"\7d\2\2\u0183\u0184\7n\2\2\u0184\u0185\7k\2\2\u0185\u0186\7e\2\2\u0186"+
		"p\3\2\2\2\u0187\u0188\7r\2\2\u0188\u0189\7t\2\2\u0189\u018a\7k\2\2\u018a"+
		"\u018b\7x\2\2\u018b\u018c\7c\2\2\u018c\u018d\7v\2\2\u018d\u018e\7g\2\2"+
		"\u018er\3\2\2\2\u018f\u0190\7r\2\2\u0190\u0191\7t\2\2\u0191\u0192\7q\2"+
		"\2\u0192\u0193\7v\2\2\u0193\u0194\7g\2\2\u0194\u0195\7e\2\2\u0195\u0196"+
		"\7v\2\2\u0196\u0197\7g\2\2\u0197\u0198\7f\2\2\u0198t\3\2\2\2\u0199\u019c"+
		"\5\u0085C\2\u019a\u019c\5\u0087D\2\u019b\u0199\3\2\2\2\u019b\u019a\3\2"+
		"\2\2\u019cv\3\2\2\2\u019d\u019f\5u;\2\u019e\u019d\3\2\2\2\u019e\u019f"+
		"\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\7\60\2\2\u01a1\u01a6\5u;\2\u01a2"+
		"\u01a3\5u;\2\u01a3\u01a4\7\60\2\2\u01a4\u01a6\3\2\2\2\u01a5\u019e\3\2"+
		"\2\2\u01a5\u01a2\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a9\5\177@\2\u01a8"+
		"\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9x\3\2\2\2\u01aa\u01af\t\3\2\2"+
		"\u01ab\u01ae\5\u0083B\2\u01ac\u01ae\5\u0081A\2\u01ad\u01ab\3\2\2\2\u01ad"+
		"\u01ac\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01b0\3\2\2\2\u01af\u01ad\3\2"+
		"\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b3\t\3\2\2\u01b3"+
		"z\3\2\2\2\u01b4\u01b5\7v\2\2\u01b5\u01b6\7t\2\2\u01b6\u01b7\7w\2\2\u01b7"+
		"\u01be\7g\2\2\u01b8\u01b9\7h\2\2\u01b9\u01ba\7c\2\2\u01ba\u01bb\7n\2\2"+
		"\u01bb\u01bc\7u\2\2\u01bc\u01be\7g\2\2\u01bd\u01b4\3\2\2\2\u01bd\u01b8"+
		"\3\2\2\2\u01be|\3\2\2\2\u01bf\u01c2\t\4\2\2\u01c0\u01c2\5\u008bF\2\u01c1"+
		"\u01bf\3\2\2\2\u01c1\u01c0\3\2\2\2\u01c2\u01c8\3\2\2\2\u01c3\u01c7\t\4"+
		"\2\2\u01c4\u01c7\5\u008bF\2\u01c5\u01c7\5\u0089E\2\u01c6\u01c3\3\2\2\2"+
		"\u01c6\u01c4\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6"+
		"\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9~\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb"+
		"\u01cd\7`\2\2\u01cc\u01ce\t\5\2\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2"+
		"\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\5u;\2\u01d0\u0080\3\2\2\2\u01d1\u01d6"+
		"\7^\2\2\u01d2\u01d7\t\6\2\2\u01d3\u01d4\t\7\2\2\u01d4\u01d5\t\b\2\2\u01d5"+
		"\u01d7\t\b\2\2\u01d6\u01d2\3\2\2\2\u01d6\u01d3\3\2\2\2\u01d7\u0082\3\2"+
		"\2\2\u01d8\u01d9\n\t\2\2\u01d9\u0084\3\2\2\2\u01da\u01dc\5\u0089E\2\u01db"+
		"\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2"+
		"\2\2\u01de\u0086\3\2\2\2\u01df\u01e0\7\62\2\2\u01e0\u01e4\7z\2\2\u01e1"+
		"\u01e2\7\62\2\2\u01e2\u01e4\7Z\2\2\u01e3\u01df\3\2\2\2\u01e3\u01e1\3\2"+
		"\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01e7\t\b\2\2\u01e6\u01e5\3\2\2\2\u01e7"+
		"\u01e8\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u0088\3\2"+
		"\2\2\u01ea\u01eb\t\n\2\2\u01eb\u008a\3\2\2\2\u01ec\u01ed\t\13\2\2\u01ed"+
		"\u008c\3\2\2\2\26\2\u00ce\u00d8\u00e2\u00e7\u019b\u019e\u01a5\u01a8\u01ad"+
		"\u01af\u01bd\u01c1\u01c6\u01c8\u01cd\u01d6\u01dd\u01e3\u01e8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}