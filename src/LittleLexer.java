// Generated from Little.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LittleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		KEYWORD=32, INTLITERAL=33, FLOATLITERAL=34, STRINGLITERAL=35, IDENTIFIER=36, 
		COMMENT=37, OPERATORS=38, WS=39;
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
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "KEYWORD", "INTLITERAL", 
			"FLOATLITERAL", "STRINGLITERAL", "IDENTIFIER", "COMMENT", "OPERATORS", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "'BEGIN'", "'END'", "'STRING'", "':='", "';'", "'FLOAT'", 
			"'INT'", "'VOID'", "','", "'FUNCTION'", "'('", "')'", "'READ'", "'WRITE'", 
			"'RETURN'", "'+'", "'-'", "'*'", "'/'", "'IF'", "'ENDIF'", "'ELSE'", 
			"'<'", "'>'", "'='", "'!='", "'<='", "'>='", "'WHILE'", "'ENDWHILE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "KEYWORD", "INTLITERAL", 
			"FLOATLITERAL", "STRINGLITERAL", "IDENTIFIER", "COMMENT", "OPERATORS", 
			"WS"
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


	public LittleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Little.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u017b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\5!\u0131\n!\3\"\6\"\u0134\n\"\r\"\16\"\u0135\3#\7#\u0139\n#\f#\16#\u013c"+
		"\13#\3#\5#\u013f\n#\3#\6#\u0142\n#\r#\16#\u0143\3$\3$\3$\3$\7$\u014a\n"+
		"$\f$\16$\u014d\13$\3$\3$\3%\6%\u0152\n%\r%\16%\u0153\3%\5%\u0157\n%\3"+
		"&\3&\3&\3&\7&\u015d\n&\f&\16&\u0160\13&\3&\5&\u0163\n&\3&\3&\3&\3&\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0173\n\'\3(\6(\u0176\n(\r(\16"+
		"(\u0177\3(\3(\2\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)\3\2\13\3\2\62;\3\2\60\60\n"+
		"\2$$))^^ddhhppttvv\6\2\f\f\17\17$$^^\4\2C\\c|\4\2\f\f\17\17\6\2,-//\61"+
		"\61??\6\2*+..=>@@\5\2\13\f\17\17\"\"\2\u019b\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5Y\3\2\2\2\7_\3\2\2\2\tc\3\2\2\2\13j\3"+
		"\2\2\2\rm\3\2\2\2\17o\3\2\2\2\21u\3\2\2\2\23y\3\2\2\2\25~\3\2\2\2\27\u0080"+
		"\3\2\2\2\31\u0089\3\2\2\2\33\u008b\3\2\2\2\35\u008d\3\2\2\2\37\u0092\3"+
		"\2\2\2!\u0098\3\2\2\2#\u009f\3\2\2\2%\u00a1\3\2\2\2\'\u00a3\3\2\2\2)\u00a5"+
		"\3\2\2\2+\u00a7\3\2\2\2-\u00aa\3\2\2\2/\u00b0\3\2\2\2\61\u00b5\3\2\2\2"+
		"\63\u00b7\3\2\2\2\65\u00b9\3\2\2\2\67\u00bb\3\2\2\29\u00be\3\2\2\2;\u00c1"+
		"\3\2\2\2=\u00c4\3\2\2\2?\u00ca\3\2\2\2A\u0130\3\2\2\2C\u0133\3\2\2\2E"+
		"\u013e\3\2\2\2G\u0145\3\2\2\2I\u0151\3\2\2\2K\u0158\3\2\2\2M\u0172\3\2"+
		"\2\2O\u0175\3\2\2\2QR\7R\2\2RS\7T\2\2ST\7Q\2\2TU\7I\2\2UV\7T\2\2VW\7C"+
		"\2\2WX\7O\2\2X\4\3\2\2\2YZ\7D\2\2Z[\7G\2\2[\\\7I\2\2\\]\7K\2\2]^\7P\2"+
		"\2^\6\3\2\2\2_`\7G\2\2`a\7P\2\2ab\7F\2\2b\b\3\2\2\2cd\7U\2\2de\7V\2\2"+
		"ef\7T\2\2fg\7K\2\2gh\7P\2\2hi\7I\2\2i\n\3\2\2\2jk\7<\2\2kl\7?\2\2l\f\3"+
		"\2\2\2mn\7=\2\2n\16\3\2\2\2op\7H\2\2pq\7N\2\2qr\7Q\2\2rs\7C\2\2st\7V\2"+
		"\2t\20\3\2\2\2uv\7K\2\2vw\7P\2\2wx\7V\2\2x\22\3\2\2\2yz\7X\2\2z{\7Q\2"+
		"\2{|\7K\2\2|}\7F\2\2}\24\3\2\2\2~\177\7.\2\2\177\26\3\2\2\2\u0080\u0081"+
		"\7H\2\2\u0081\u0082\7W\2\2\u0082\u0083\7P\2\2\u0083\u0084\7E\2\2\u0084"+
		"\u0085\7V\2\2\u0085\u0086\7K\2\2\u0086\u0087\7Q\2\2\u0087\u0088\7P\2\2"+
		"\u0088\30\3\2\2\2\u0089\u008a\7*\2\2\u008a\32\3\2\2\2\u008b\u008c\7+\2"+
		"\2\u008c\34\3\2\2\2\u008d\u008e\7T\2\2\u008e\u008f\7G\2\2\u008f\u0090"+
		"\7C\2\2\u0090\u0091\7F\2\2\u0091\36\3\2\2\2\u0092\u0093\7Y\2\2\u0093\u0094"+
		"\7T\2\2\u0094\u0095\7K\2\2\u0095\u0096\7V\2\2\u0096\u0097\7G\2\2\u0097"+
		" \3\2\2\2\u0098\u0099\7T\2\2\u0099\u009a\7G\2\2\u009a\u009b\7V\2\2\u009b"+
		"\u009c\7W\2\2\u009c\u009d\7T\2\2\u009d\u009e\7P\2\2\u009e\"\3\2\2\2\u009f"+
		"\u00a0\7-\2\2\u00a0$\3\2\2\2\u00a1\u00a2\7/\2\2\u00a2&\3\2\2\2\u00a3\u00a4"+
		"\7,\2\2\u00a4(\3\2\2\2\u00a5\u00a6\7\61\2\2\u00a6*\3\2\2\2\u00a7\u00a8"+
		"\7K\2\2\u00a8\u00a9\7H\2\2\u00a9,\3\2\2\2\u00aa\u00ab\7G\2\2\u00ab\u00ac"+
		"\7P\2\2\u00ac\u00ad\7F\2\2\u00ad\u00ae\7K\2\2\u00ae\u00af\7H\2\2\u00af"+
		".\3\2\2\2\u00b0\u00b1\7G\2\2\u00b1\u00b2\7N\2\2\u00b2\u00b3\7U\2\2\u00b3"+
		"\u00b4\7G\2\2\u00b4\60\3\2\2\2\u00b5\u00b6\7>\2\2\u00b6\62\3\2\2\2\u00b7"+
		"\u00b8\7@\2\2\u00b8\64\3\2\2\2\u00b9\u00ba\7?\2\2\u00ba\66\3\2\2\2\u00bb"+
		"\u00bc\7#\2\2\u00bc\u00bd\7?\2\2\u00bd8\3\2\2\2\u00be\u00bf\7>\2\2\u00bf"+
		"\u00c0\7?\2\2\u00c0:\3\2\2\2\u00c1\u00c2\7@\2\2\u00c2\u00c3\7?\2\2\u00c3"+
		"<\3\2\2\2\u00c4\u00c5\7Y\2\2\u00c5\u00c6\7J\2\2\u00c6\u00c7\7K\2\2\u00c7"+
		"\u00c8\7N\2\2\u00c8\u00c9\7G\2\2\u00c9>\3\2\2\2\u00ca\u00cb\7G\2\2\u00cb"+
		"\u00cc\7P\2\2\u00cc\u00cd\7F\2\2\u00cd\u00ce\7Y\2\2\u00ce\u00cf\7J\2\2"+
		"\u00cf\u00d0\7K\2\2\u00d0\u00d1\7N\2\2\u00d1\u00d2\7G\2\2\u00d2@\3\2\2"+
		"\2\u00d3\u00d4\7R\2\2\u00d4\u00d5\7T\2\2\u00d5\u00d6\7Q\2\2\u00d6\u00d7"+
		"\7I\2\2\u00d7\u00d8\7T\2\2\u00d8\u00d9\7C\2\2\u00d9\u0131\7O\2\2\u00da"+
		"\u00db\7D\2\2\u00db\u00dc\7G\2\2\u00dc\u00dd\7I\2\2\u00dd\u00de\7K\2\2"+
		"\u00de\u0131\7P\2\2\u00df\u00e0\7G\2\2\u00e0\u00e1\7P\2\2\u00e1\u0131"+
		"\7F\2\2\u00e2\u00e3\7H\2\2\u00e3\u00e4\7W\2\2\u00e4\u00e5\7P\2\2\u00e5"+
		"\u00e6\7E\2\2\u00e6\u00e7\7V\2\2\u00e7\u00e8\7K\2\2\u00e8\u00e9\7Q\2\2"+
		"\u00e9\u0131\7P\2\2\u00ea\u00eb\7T\2\2\u00eb\u00ec\7G\2\2\u00ec\u00ed"+
		"\7C\2\2\u00ed\u0131\7F\2\2\u00ee\u00ef\7Y\2\2\u00ef\u00f0\7T\2\2\u00f0"+
		"\u00f1\7K\2\2\u00f1\u00f2\7V\2\2\u00f2\u0131\7G\2\2\u00f3\u00f4\7K\2\2"+
		"\u00f4\u0131\7H\2\2\u00f5\u00f6\7G\2\2\u00f6\u00f7\7N\2\2\u00f7\u00f8"+
		"\7U\2\2\u00f8\u0131\7G\2\2\u00f9\u00fa\7G\2\2\u00fa\u00fb\7P\2\2\u00fb"+
		"\u00fc\7F\2\2\u00fc\u00fd\7K\2\2\u00fd\u0131\7H\2\2\u00fe\u00ff\7Y\2\2"+
		"\u00ff\u0100\7J\2\2\u0100\u0101\7K\2\2\u0101\u0102\7N\2\2\u0102\u0131"+
		"\7G\2\2\u0103\u0104\7G\2\2\u0104\u0105\7P\2\2\u0105\u0106\7F\2\2\u0106"+
		"\u0107\7Y\2\2\u0107\u0108\7J\2\2\u0108\u0109\7K\2\2\u0109\u010a\7N\2\2"+
		"\u010a\u0131\7G\2\2\u010b\u010c\7E\2\2\u010c\u010d\7Q\2\2\u010d\u010e"+
		"\7P\2\2\u010e\u010f\7V\2\2\u010f\u0110\7K\2\2\u0110\u0111\7P\2\2\u0111"+
		"\u0112\7W\2\2\u0112\u0131\7G\2\2\u0113\u0114\7D\2\2\u0114\u0115\7T\2\2"+
		"\u0115\u0116\7G\2\2\u0116\u0117\7C\2\2\u0117\u0131\7M\2\2\u0118\u0119"+
		"\7T\2\2\u0119\u011a\7G\2\2\u011a\u011b\7V\2\2\u011b\u011c\7W\2\2\u011c"+
		"\u011d\7T\2\2\u011d\u0131\7P\2\2\u011e\u011f\7K\2\2\u011f\u0120\7P\2\2"+
		"\u0120\u0131\7V\2\2\u0121\u0122\7X\2\2\u0122\u0123\7Q\2\2\u0123\u0124"+
		"\7K\2\2\u0124\u0131\7F\2\2\u0125\u0126\7U\2\2\u0126\u0127\7V\2\2\u0127"+
		"\u0128\7T\2\2\u0128\u0129\7K\2\2\u0129\u012a\7P\2\2\u012a\u0131\7I\2\2"+
		"\u012b\u012c\7H\2\2\u012c\u012d\7N\2\2\u012d\u012e\7Q\2\2\u012e\u012f"+
		"\7C\2\2\u012f\u0131\7V\2\2\u0130\u00d3\3\2\2\2\u0130\u00da\3\2\2\2\u0130"+
		"\u00df\3\2\2\2\u0130\u00e2\3\2\2\2\u0130\u00ea\3\2\2\2\u0130\u00ee\3\2"+
		"\2\2\u0130\u00f3\3\2\2\2\u0130\u00f5\3\2\2\2\u0130\u00f9\3\2\2\2\u0130"+
		"\u00fe\3\2\2\2\u0130\u0103\3\2\2\2\u0130\u010b\3\2\2\2\u0130\u0113\3\2"+
		"\2\2\u0130\u0118\3\2\2\2\u0130\u011e\3\2\2\2\u0130\u0121\3\2\2\2\u0130"+
		"\u0125\3\2\2\2\u0130\u012b\3\2\2\2\u0131B\3\2\2\2\u0132\u0134\t\2\2\2"+
		"\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136"+
		"\3\2\2\2\u0136D\3\2\2\2\u0137\u0139\t\2\2\2\u0138\u0137\3\2\2\2\u0139"+
		"\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2"+
		"\2\2\u013c\u013a\3\2\2\2\u013d\u013f\t\3\2\2\u013e\u013a\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u0142\t\2\2\2\u0141\u0140\3\2"+
		"\2\2\u0142\u0143\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"F\3\2\2\2\u0145\u014b\7$\2\2\u0146\u0147\7^\2\2\u0147\u014a\t\4\2\2\u0148"+
		"\u014a\n\5\2\2\u0149\u0146\3\2\2\2\u0149\u0148\3\2\2\2\u014a\u014d\3\2"+
		"\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014e\u014f\7$\2\2\u014fH\3\2\2\2\u0150\u0152\t\6\2\2\u0151"+
		"\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2"+
		"\2\2\u0154\u0156\3\2\2\2\u0155\u0157\t\2\2\2\u0156\u0155\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157J\3\2\2\2\u0158\u0159\7/\2\2\u0159\u015a\7/\2\2\u015a"+
		"\u015e\3\2\2\2\u015b\u015d\n\7\2\2\u015c\u015b\3\2\2\2\u015d\u0160\3\2"+
		"\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0162\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0161\u0163\7\17\2\2\u0162\u0161\3\2\2\2\u0162\u0163\3"+
		"\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\7\f\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\u0167\b&\2\2\u0167L\3\2\2\2\u0168\u0169\7<\2\2\u0169\u0173\7?\2\2\u016a"+
		"\u0173\t\b\2\2\u016b\u016c\7#\2\2\u016c\u0173\7?\2\2\u016d\u0173\t\t\2"+
		"\2\u016e\u016f\7>\2\2\u016f\u0173\7?\2\2\u0170\u0171\7@\2\2\u0171\u0173"+
		"\7?\2\2\u0172\u0168\3\2\2\2\u0172\u016a\3\2\2\2\u0172\u016b\3\2\2\2\u0172"+
		"\u016d\3\2\2\2\u0172\u016e\3\2\2\2\u0172\u0170\3\2\2\2\u0173N\3\2\2\2"+
		"\u0174\u0176\t\n\2\2\u0175\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0175"+
		"\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\b(\2\2\u017a"+
		"P\3\2\2\2\20\2\u0130\u0135\u013a\u013e\u0143\u0149\u014b\u0153\u0156\u015e"+
		"\u0162\u0172\u0177\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}