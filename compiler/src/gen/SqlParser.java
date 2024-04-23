// Generated from C:/Users/Abd Shammout/Documents/compiler/compilerAbdNew/src\Sql.g4 by ANTLR 4.7.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		SCOL=10, DOT=11, OPEN_PAR=12, CLOSE_PAR=13, OPEN_BRAKET=14, CLOSE_BRAKET=15, 
		COMMA=16, ASSIGN=17, STAR=18, STAR_ASSIGN=19, PLUS=20, PLUS_PLUS=21, PLUS_ASSIGN=22, 
		MINUS=23, MINUS_MINUS=24, MINUS_ASSIGN=25, POWER_ASSIGN=26, TILDE=27, 
		PIPE2=28, DIV=29, DIV_ASSIGN=30, MOD=31, MOD_ASSIGN=32, LT2=33, GT2=34, 
		AMP=35, PIPE=36, LT=37, LT_EQ=38, GT=39, GT_EQ=40, EQ=41, NOT_EQ1=42, 
		NOT=43, NOT_EQ2=44, QUES=45, K_ABORT=46, K_ACTION=47, K_ADD=48, K_AFTER=49, 
		K_ALL=50, K_ALTER=51, K_ANALYZE=52, K_AND=53, K_AS=54, K_ASC=55, K_ATTACH=56, 
		K_AUTOINCREMENT=57, K_BEFORE=58, K_BEGIN=59, K_BETWEEN=60, K_BY=61, K_CASCADE=62, 
		K_CASE=63, K_CAST=64, K_CHECK=65, K_COLLATE=66, K_COLUMN=67, K_COMMIT=68, 
		K_CONFLICT=69, K_CONSTRAINT=70, K_CREATE=71, K_CROSS=72, K_CURRENT_DATE=73, 
		K_CURRENT_TIME=74, K_CURRENT_TIMESTAMP=75, K_DATABASE=76, K_DEFAULT=77, 
		K_DEFERRABLE=78, K_DEFERRED=79, K_DELETE=80, K_DESC=81, K_DETACH=82, K_DISTINCT=83, 
		K_DROP=84, K_EACH=85, K_ELSE=86, K_RETURN=87, K_ELSE_IF=88, K_END=89, 
		K_ENABLE=90, K_ESCAPE=91, K_EXCEPT=92, K_EXCLUSIVE=93, K_EXISTS=94, K_EXPLAIN=95, 
		K_FAIL=96, K_FOR=97, K_FOREIGN=98, K_FROM=99, K_FULL=100, K_GLOB=101, 
		K_GROUP=102, K_HAVING=103, K_IF=104, K_IGNORE=105, K_IMMEDIATE=106, K_IN=107, 
		K_INDEX=108, K_INDEXED=109, K_INITIALLY=110, K_INNER=111, K_INSERT=112, 
		K_INSTEAD=113, K_INTERSECT=114, K_INTO=115, K_IS=116, K_ISNULL=117, K_JOIN=118, 
		K_KEY=119, K_LEFT=120, K_LIKE=121, K_LIMIT=122, K_MATCH=123, K_NATURAL=124, 
		K_NEXTVAL=125, K_NO=126, K_NOT=127, K_NOTNULL=128, K_NULL=129, K_OF=130, 
		K_OFFSET=131, K_ON=132, K_ONLY=133, K_OR=134, K_ORDER=135, K_OUTER=136, 
		K_PATH=137, K_PLAN=138, K_PRAGMA=139, K_PRIMARY=140, K_QUERY=141, K_RAISE=142, 
		K_RECURSIVE=143, K_REFERENCES=144, K_REGEXP=145, K_REINDEX=146, K_RELEASE=147, 
		K_RENAME=148, K_REPLACE=149, K_RESTRICT=150, K_RIGHT=151, K_ROLLBACK=152, 
		K_ROW=153, K_SAVEPOINT=154, K_SELECT=155, K_SET=156, K_TABLE=157, K_TYPE=158, 
		K_TEMP=159, K_TEMPORARY=160, K_THEN=161, K_TO=162, K_TRANSACTION=163, 
		K_TRIGGER=164, K_UNION=165, K_UNIQUE=166, K_UPDATE=167, K_USING=168, K_VACUUM=169, 
		K_VALUES=170, K_VIEW=171, K_VIRTUAL=172, K_WHEN=173, K_DO=174, K_WHILE=175, 
		K_SWITCH=176, K_PRINT=177, K_BREAK=178, K_CONTINUE=179, K_WHERE=180, K_WITH=181, 
		K_WITHOUT=182, K_TRUE=183, K_FALSE=184, K_FUNCTION=185, K_VAR=186, IDENTIFIER=187, 
		NUMERIC_LITERAL=188, BIND_PARAMETER=189, STRING_LITERAL=190, BLOB_LITERAL=191, 
		MULTILINE_COMMENT=192, SPACES=193, UNEXPECTED_CHAR=194;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_java_stmt_list = 3, 
		RULE_sql_stmt = 4, RULE_java_stmt = 5, RULE_create_table_stmt = 6, RULE_create_type_stmt = 7, 
		RULE_create_Aggregation_function = 8, RULE_aggregation_function_name = 9, 
		RULE_aggregation_function_className = 10, RULE_aggregation_function_methodName = 11, 
		RULE_aggregation_function_return_type = 12, RULE_select_core = 13, RULE_inner_join_stmt = 14, 
		RULE_where_stmt = 15, RULE_whete_condition = 16, RULE_query_condition_operations = 17, 
		RULE_join_condition = 18, RULE_expr_query = 19, RULE_list_literal_value = 20, 
		RULE_table_name = 21, RULE_type_name = 22, RULE_column_def = 23, RULE_result_column = 24, 
		RULE_result_column_with_aggregation_function = 25, RULE_table_or_subquery = 26, 
		RULE_column_name = 27, RULE_table_alias = 28, RULE_path = 29, RULE_type_file = 30, 
		RULE_declare_var_java_not_assignmen = 31, RULE_declare_var_java = 32, 
		RULE_assignment_var_list_java = 33, RULE_assignment_var_java = 34, RULE_assignment_var_list_without_declare_java = 35, 
		RULE_assignment_var_without_declare_java = 36, RULE_parameters_list = 37, 
		RULE_default_parameters = 38, RULE_arguments_list = 39, RULE_argument = 40, 
		RULE_arrow_function_java = 41, RULE_function_java_name = 42, RULE_function_java_rule = 43, 
		RULE_function_java_header = 44, RULE_function_java_call = 45, RULE_print_java = 46, 
		RULE_while_java_rule = 47, RULE_while_java_header = 48, RULE_do_while_java_rule = 49, 
		RULE_for_java_rule = 50, RULE_for_java_header = 51, RULE_shorten_operators_java = 52, 
		RULE_if_java_rule = 53, RULE_if_basic_java_rule = 54, RULE_body_brackets_java = 55, 
		RULE_condition_java = 56, RULE_switch_stmt = 57, RULE_switch_case = 58, 
		RULE_java_body = 59, RULE_return_stmt = 60, RULE_expr = 61, RULE_literal_value = 62, 
		RULE_unary_operator = 63, RULE_keyword = 64, RULE_function_name = 65, 
		RULE_any_name = 66, RULE_any_name_no_keyword = 67, RULE_var_name = 68;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "sql_stmt_list", "java_stmt_list", "sql_stmt", "java_stmt", 
			"create_table_stmt", "create_type_stmt", "create_Aggregation_function", 
			"aggregation_function_name", "aggregation_function_className", "aggregation_function_methodName", 
			"aggregation_function_return_type", "select_core", "inner_join_stmt", 
			"where_stmt", "whete_condition", "query_condition_operations", "join_condition", 
			"expr_query", "list_literal_value", "table_name", "type_name", "column_def", 
			"result_column", "result_column_with_aggregation_function", "table_or_subquery", 
			"column_name", "table_alias", "path", "type_file", "declare_var_java_not_assignmen", 
			"declare_var_java", "assignment_var_list_java", "assignment_var_java", 
			"assignment_var_list_without_declare_java", "assignment_var_without_declare_java", 
			"parameters_list", "default_parameters", "arguments_list", "argument", 
			"arrow_function_java", "function_java_name", "function_java_rule", "function_java_header", 
			"function_java_call", "print_java", "while_java_rule", "while_java_header", 
			"do_while_java_rule", "for_java_rule", "for_java_header", "shorten_operators_java", 
			"if_java_rule", "if_basic_java_rule", "body_brackets_java", "condition_java", 
			"switch_stmt", "switch_case", "java_body", "return_stmt", "expr", "literal_value", 
			"unary_operator", "keyword", "function_name", "any_name", "any_name_no_keyword", 
			"var_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'aggregation_function'", "'\"json\"'", "'\"xml\"'", "'\"csv\"'", 
			"');'", "'{'", "'}'", "'&&'", "':'", "';'", "'.'", "'('", "')'", "'['", 
			"']'", "','", "'='", "'*'", "'*='", "'+'", "'++'", "'+='", "'-'", "'--'", 
			"'-='", "'^='", "'~'", "'||'", "'/'", "'/='", "'%'", "'%='", "'<<'", 
			"'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'!'", 
			"'<>'", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "SCOL", "DOT", 
			"OPEN_PAR", "CLOSE_PAR", "OPEN_BRAKET", "CLOSE_BRAKET", "COMMA", "ASSIGN", 
			"STAR", "STAR_ASSIGN", "PLUS", "PLUS_PLUS", "PLUS_ASSIGN", "MINUS", "MINUS_MINUS", 
			"MINUS_ASSIGN", "POWER_ASSIGN", "TILDE", "PIPE2", "DIV", "DIV_ASSIGN", 
			"MOD", "MOD_ASSIGN", "LT2", "GT2", "AMP", "PIPE", "LT", "LT_EQ", "GT", 
			"GT_EQ", "EQ", "NOT_EQ1", "NOT", "NOT_EQ2", "QUES", "K_ABORT", "K_ACTION", 
			"K_ADD", "K_AFTER", "K_ALL", "K_ALTER", "K_ANALYZE", "K_AND", "K_AS", 
			"K_ASC", "K_ATTACH", "K_AUTOINCREMENT", "K_BEFORE", "K_BEGIN", "K_BETWEEN", 
			"K_BY", "K_CASCADE", "K_CASE", "K_CAST", "K_CHECK", "K_COLLATE", "K_COLUMN", 
			"K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", "K_CREATE", "K_CROSS", "K_CURRENT_DATE", 
			"K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", "K_DATABASE", "K_DEFAULT", "K_DEFERRABLE", 
			"K_DEFERRED", "K_DELETE", "K_DESC", "K_DETACH", "K_DISTINCT", "K_DROP", 
			"K_EACH", "K_ELSE", "K_RETURN", "K_ELSE_IF", "K_END", "K_ENABLE", "K_ESCAPE", 
			"K_EXCEPT", "K_EXCLUSIVE", "K_EXISTS", "K_EXPLAIN", "K_FAIL", "K_FOR", 
			"K_FOREIGN", "K_FROM", "K_FULL", "K_GLOB", "K_GROUP", "K_HAVING", "K_IF", 
			"K_IGNORE", "K_IMMEDIATE", "K_IN", "K_INDEX", "K_INDEXED", "K_INITIALLY", 
			"K_INNER", "K_INSERT", "K_INSTEAD", "K_INTERSECT", "K_INTO", "K_IS", 
			"K_ISNULL", "K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", "K_MATCH", 
			"K_NATURAL", "K_NEXTVAL", "K_NO", "K_NOT", "K_NOTNULL", "K_NULL", "K_OF", 
			"K_OFFSET", "K_ON", "K_ONLY", "K_OR", "K_ORDER", "K_OUTER", "K_PATH", 
			"K_PLAN", "K_PRAGMA", "K_PRIMARY", "K_QUERY", "K_RAISE", "K_RECURSIVE", 
			"K_REFERENCES", "K_REGEXP", "K_REINDEX", "K_RELEASE", "K_RENAME", "K_REPLACE", 
			"K_RESTRICT", "K_RIGHT", "K_ROLLBACK", "K_ROW", "K_SAVEPOINT", "K_SELECT", 
			"K_SET", "K_TABLE", "K_TYPE", "K_TEMP", "K_TEMPORARY", "K_THEN", "K_TO", 
			"K_TRANSACTION", "K_TRIGGER", "K_UNION", "K_UNIQUE", "K_UPDATE", "K_USING", 
			"K_VACUUM", "K_VALUES", "K_VIEW", "K_VIRTUAL", "K_WHEN", "K_DO", "K_WHILE", 
			"K_SWITCH", "K_PRINT", "K_BREAK", "K_CONTINUE", "K_WHERE", "K_WITH", 
			"K_WITHOUT", "K_TRUE", "K_FALSE", "K_FUNCTION", "K_VAR", "IDENTIFIER", 
			"NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", "BLOB_LITERAL", 
			"MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR"
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
	public String getGrammarFileName() { return "Sql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SqlParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public List<Java_stmt_listContext> java_stmt_list() {
			return getRuleContexts(Java_stmt_listContext.class);
		}
		public Java_stmt_listContext java_stmt_list(int i) {
			return getRuleContext(Java_stmt_listContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (SCOL - 10)) | (1L << (OPEN_PAR - 10)) | (1L << (K_CREATE - 10)))) != 0) || ((((_la - 185)) & ~0x3f) == 0 && ((1L << (_la - 185)) & ((1L << (K_FUNCTION - 185)) | (1L << (IDENTIFIER - 185)) | (1L << (STRING_LITERAL - 185)) | (1L << (UNEXPECTED_CHAR - 185)))) != 0)) {
				{
				setState(141);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCOL:
				case K_CREATE:
					{
					setState(138);
					sql_stmt_list();
					}
					break;
				case OPEN_PAR:
				case K_FUNCTION:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(139);
					java_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(140);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
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

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(SqlParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);

			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null));
			   
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

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SqlParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SqlParser.SCOL, i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSql_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSql_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(151);
				match(SCOL);
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			sql_stmt();
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(159); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(158);
						match(SCOL);
						}
						}
						setState(161); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(163);
					sql_stmt();
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(169);
					match(SCOL);
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Java_stmt_listContext extends ParserRuleContext {
		public List<Java_stmtContext> java_stmt() {
			return getRuleContexts(Java_stmtContext.class);
		}
		public Java_stmtContext java_stmt(int i) {
			return getRuleContext(Java_stmtContext.class,i);
		}
		public Java_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJava_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJava_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJava_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Java_stmt_listContext java_stmt_list() throws RecognitionException {
		Java_stmt_listContext _localctx = new Java_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_java_stmt_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(175);
					java_stmt();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(178); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Sql_stmtContext extends ParserRuleContext {
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Create_type_stmtContext create_type_stmt() {
			return getRuleContext(Create_type_stmtContext.class,0);
		}
		public Create_Aggregation_functionContext create_Aggregation_function() {
			return getRuleContext(Create_Aggregation_functionContext.class,0);
		}
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sql_stmt);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				create_table_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				create_type_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				create_Aggregation_function();
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

	public static class Java_stmtContext extends ParserRuleContext {
		public Function_java_ruleContext function_java_rule() {
			return getRuleContext(Function_java_ruleContext.class,0);
		}
		public Java_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJava_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJava_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJava_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Java_stmtContext java_stmt() throws RecognitionException {
		Java_stmtContext _localctx = new Java_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_java_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			function_java_rule();
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

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(SqlParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode K_TYPE() { return getToken(SqlParser.K_TYPE, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(SqlParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SqlParser.ASSIGN, i);
		}
		public Type_fileContext type_file() {
			return getRuleContext(Type_fileContext.class,0);
		}
		public TerminalNode K_PATH() { return getToken(SqlParser.K_PATH, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(K_CREATE);
			setState(188);
			match(K_TABLE);
			setState(189);
			table_name();
			setState(190);
			match(OPEN_PAR);
			setState(191);
			column_def();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(192);
				match(COMMA);
				setState(193);
				column_def();
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			match(CLOSE_PAR);
			setState(200);
			match(K_TYPE);
			setState(201);
			match(ASSIGN);
			setState(202);
			type_file();
			setState(203);
			match(K_PATH);
			setState(204);
			match(ASSIGN);
			setState(205);
			path();
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(206);
				match(SCOL);
				}
				break;
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

	public static class Create_type_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_TYPE() { return getToken(SqlParser.K_TYPE, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public Create_type_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_type_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCreate_type_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCreate_type_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCreate_type_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_type_stmtContext create_type_stmt() throws RecognitionException {
		Create_type_stmtContext _localctx = new Create_type_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_create_type_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(K_CREATE);
			setState(210);
			match(K_TYPE);
			setState(211);
			type_name();
			setState(212);
			match(OPEN_PAR);
			setState(213);
			column_def();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(214);
				match(COMMA);
				setState(215);
				column_def();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			match(CLOSE_PAR);
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(222);
				match(SCOL);
				}
				break;
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

	public static class Create_Aggregation_functionContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public Aggregation_function_nameContext aggregation_function_name() {
			return getRuleContext(Aggregation_function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Aggregation_function_classNameContext aggregation_function_className() {
			return getRuleContext(Aggregation_function_classNameContext.class,0);
		}
		public Aggregation_function_methodNameContext aggregation_function_methodName() {
			return getRuleContext(Aggregation_function_methodNameContext.class,0);
		}
		public Aggregation_function_return_typeContext aggregation_function_return_type() {
			return getRuleContext(Aggregation_function_return_typeContext.class,0);
		}
		public TerminalNode OPEN_BRAKET() { return getToken(SqlParser.OPEN_BRAKET, 0); }
		public List<Type_nameContext> type_name() {
			return getRuleContexts(Type_nameContext.class);
		}
		public Type_nameContext type_name(int i) {
			return getRuleContext(Type_nameContext.class,i);
		}
		public TerminalNode CLOSE_BRAKET() { return getToken(SqlParser.CLOSE_BRAKET, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public Create_Aggregation_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_Aggregation_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCreate_Aggregation_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCreate_Aggregation_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCreate_Aggregation_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_Aggregation_functionContext create_Aggregation_function() throws RecognitionException {
		Create_Aggregation_functionContext _localctx = new Create_Aggregation_functionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_create_Aggregation_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(K_CREATE);
			setState(226);
			match(T__0);
			setState(227);
			aggregation_function_name();
			setState(228);
			match(OPEN_PAR);
			setState(229);
			path();
			setState(230);
			match(COMMA);
			setState(231);
			aggregation_function_className();
			setState(232);
			match(COMMA);
			setState(233);
			aggregation_function_methodName();
			setState(234);
			match(COMMA);
			setState(235);
			aggregation_function_return_type();
			setState(236);
			match(COMMA);
			setState(237);
			match(OPEN_BRAKET);
			setState(238);
			type_name();
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(239);
				match(COMMA);
				setState(240);
				type_name();
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246);
			match(CLOSE_BRAKET);
			setState(247);
			match(CLOSE_PAR);
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(248);
				match(SCOL);
				}
				break;
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

	public static class Aggregation_function_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public Aggregation_function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAggregation_function_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAggregation_function_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAggregation_function_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregation_function_nameContext aggregation_function_name() throws RecognitionException {
		Aggregation_function_nameContext _localctx = new Aggregation_function_nameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_aggregation_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(IDENTIFIER);
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

	public static class Aggregation_function_classNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public Aggregation_function_classNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation_function_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAggregation_function_className(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAggregation_function_className(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAggregation_function_className(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregation_function_classNameContext aggregation_function_className() throws RecognitionException {
		Aggregation_function_classNameContext _localctx = new Aggregation_function_classNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_aggregation_function_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(IDENTIFIER);
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

	public static class Aggregation_function_methodNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public Aggregation_function_methodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation_function_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAggregation_function_methodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAggregation_function_methodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAggregation_function_methodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregation_function_methodNameContext aggregation_function_methodName() throws RecognitionException {
		Aggregation_function_methodNameContext _localctx = new Aggregation_function_methodNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_aggregation_function_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(IDENTIFIER);
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

	public static class Aggregation_function_return_typeContext extends ParserRuleContext {
		public Any_name_no_keywordContext any_name_no_keyword() {
			return getRuleContext(Any_name_no_keywordContext.class,0);
		}
		public Aggregation_function_return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation_function_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAggregation_function_return_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAggregation_function_return_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAggregation_function_return_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregation_function_return_typeContext aggregation_function_return_type() throws RecognitionException {
		Aggregation_function_return_typeContext _localctx = new Aggregation_function_return_typeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_aggregation_function_return_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			any_name_no_keyword();
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

	public static class Select_coreContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SqlParser.K_SELECT, 0); }
		public TerminalNode K_FROM() { return getToken(SqlParser.K_FROM, 0); }
		public List<Result_column_with_aggregation_functionContext> result_column_with_aggregation_function() {
			return getRuleContexts(Result_column_with_aggregation_functionContext.class);
		}
		public Result_column_with_aggregation_functionContext result_column_with_aggregation_function(int i) {
			return getRuleContext(Result_column_with_aggregation_functionContext.class,i);
		}
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public Table_or_subqueryContext table_or_subquery() {
			return getRuleContext(Table_or_subqueryContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public List<Inner_join_stmtContext> inner_join_stmt() {
			return getRuleContexts(Inner_join_stmtContext.class);
		}
		public Inner_join_stmtContext inner_join_stmt(int i) {
			return getRuleContext(Inner_join_stmtContext.class,i);
		}
		public Where_stmtContext where_stmt() {
			return getRuleContext(Where_stmtContext.class,0);
		}
		public TerminalNode K_GROUP() { return getToken(SqlParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSelect_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSelect_core(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSelect_core(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_select_core);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(K_SELECT);
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(260);
				result_column_with_aggregation_function();
				}
				break;
			case 2:
				{
				}
				break;
			case 3:
				{
				setState(262);
				result_column();
				}
				break;
			}
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(265);
				match(COMMA);
				setState(269);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(266);
					result_column_with_aggregation_function();
					}
					break;
				case 2:
					{
					}
					break;
				case 3:
					{
					setState(268);
					result_column();
					}
					break;
				}
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
			match(K_FROM);
			{
			setState(277);
			table_or_subquery();
			}
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(278);
					inner_join_stmt();
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(284);
				where_stmt();
				}
				break;
			}
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(287);
				match(K_GROUP);
				setState(288);
				match(K_BY);
				setState(289);
				column_name();
				}
				break;
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

	public static class Inner_join_stmtContext extends ParserRuleContext {
		public TerminalNode K_INNER() { return getToken(SqlParser.K_INNER, 0); }
		public TerminalNode K_JOIN() { return getToken(SqlParser.K_JOIN, 0); }
		public Table_or_subqueryContext table_or_subquery() {
			return getRuleContext(Table_or_subqueryContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(SqlParser.K_ON, 0); }
		public List<Join_conditionContext> join_condition() {
			return getRuleContexts(Join_conditionContext.class);
		}
		public Join_conditionContext join_condition(int i) {
			return getRuleContext(Join_conditionContext.class,i);
		}
		public List<TerminalNode> K_AND() { return getTokens(SqlParser.K_AND); }
		public TerminalNode K_AND(int i) {
			return getToken(SqlParser.K_AND, i);
		}
		public Inner_join_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inner_join_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterInner_join_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitInner_join_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitInner_join_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inner_join_stmtContext inner_join_stmt() throws RecognitionException {
		Inner_join_stmtContext _localctx = new Inner_join_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_inner_join_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(K_INNER);
			setState(293);
			match(K_JOIN);
			setState(294);
			table_or_subquery();
			{
			setState(295);
			match(K_ON);
			setState(296);
			join_condition();
			}
			setState(302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(298);
					match(K_AND);
					setState(299);
					join_condition();
					}
					} 
				}
				setState(304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class Where_stmtContext extends ParserRuleContext {
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public List<Whete_conditionContext> whete_condition() {
			return getRuleContexts(Whete_conditionContext.class);
		}
		public Whete_conditionContext whete_condition(int i) {
			return getRuleContext(Whete_conditionContext.class,i);
		}
		public List<TerminalNode> K_AND() { return getTokens(SqlParser.K_AND); }
		public TerminalNode K_AND(int i) {
			return getToken(SqlParser.K_AND, i);
		}
		public Where_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterWhere_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitWhere_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitWhere_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_stmtContext where_stmt() throws RecognitionException {
		Where_stmtContext _localctx = new Where_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_where_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(K_WHERE);
			setState(306);
			whete_condition();
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(307);
					match(K_AND);
					setState(308);
					whete_condition();
					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class Whete_conditionContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Query_condition_operationsContext query_condition_operations() {
			return getRuleContext(Query_condition_operationsContext.class,0);
		}
		public Expr_queryContext expr_query() {
			return getRuleContext(Expr_queryContext.class,0);
		}
		public Whete_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whete_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterWhete_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitWhete_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitWhete_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Whete_conditionContext whete_condition() throws RecognitionException {
		Whete_conditionContext _localctx = new Whete_conditionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_whete_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			column_name();
			setState(315);
			query_condition_operations();
			setState(316);
			expr_query();
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

	public static class Query_condition_operationsContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public TerminalNode LT() { return getToken(SqlParser.LT, 0); }
		public TerminalNode GT() { return getToken(SqlParser.GT, 0); }
		public TerminalNode LT_EQ() { return getToken(SqlParser.LT_EQ, 0); }
		public TerminalNode GT_EQ() { return getToken(SqlParser.GT_EQ, 0); }
		public TerminalNode K_LIKE() { return getToken(SqlParser.K_LIKE, 0); }
		public TerminalNode K_IN() { return getToken(SqlParser.K_IN, 0); }
		public Query_condition_operationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_condition_operations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterQuery_condition_operations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitQuery_condition_operations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitQuery_condition_operations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_condition_operationsContext query_condition_operations() throws RecognitionException {
		Query_condition_operationsContext _localctx = new Query_condition_operationsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_query_condition_operations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0) || _la==K_IN || _la==K_LIKE) ) {
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

	public static class Join_conditionContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public Join_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJoin_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJoin_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJoin_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_conditionContext join_condition() throws RecognitionException {
		Join_conditionContext _localctx = new Join_conditionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_join_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			column_name();
			setState(321);
			match(ASSIGN);
			setState(322);
			column_name();
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

	public static class Expr_queryContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public List_literal_valueContext list_literal_value() {
			return getRuleContext(List_literal_valueContext.class,0);
		}
		public Expr_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterExpr_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitExpr_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitExpr_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_queryContext expr_query() throws RecognitionException {
		Expr_queryContext _localctx = new Expr_queryContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr_query);
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_NULL:
			case K_TRUE:
			case K_FALSE:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				literal_value();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				var_name();
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				list_literal_value();
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

	public static class List_literal_valueContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Literal_valueContext> literal_value() {
			return getRuleContexts(Literal_valueContext.class);
		}
		public Literal_valueContext literal_value(int i) {
			return getRuleContext(Literal_valueContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public List_literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterList_literal_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitList_literal_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitList_literal_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_literal_valueContext list_literal_value() throws RecognitionException {
		List_literal_valueContext _localctx = new List_literal_valueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_list_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(OPEN_PAR);
			setState(330);
			literal_value();
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(331);
				match(COMMA);
				setState(332);
				literal_value();
				}
				}
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(338);
			match(CLOSE_PAR);
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

	public static class Table_nameContext extends ParserRuleContext {
		public Any_name_no_keywordContext any_name_no_keyword() {
			return getRuleContext(Any_name_no_keywordContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			any_name_no_keyword();
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

	public static class Type_nameContext extends ParserRuleContext {
		public Any_name_no_keywordContext any_name_no_keyword() {
			return getRuleContext(Any_name_no_keywordContext.class,0);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			any_name_no_keyword();
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

	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_column_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			column_name();
			setState(345);
			type_name();
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

	public static class Result_columnContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitResult_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_result_column);
		int _la;
		try {
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(347);
					table_name();
					setState(348);
					match(DOT);
					}
				}

				setState(352);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				column_name();
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

	public static class Result_column_with_aggregation_functionContext extends ParserRuleContext {
		public Aggregation_function_nameContext aggregation_function_name() {
			return getRuleContext(Aggregation_function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Result_columnContext result_column() {
			return getRuleContext(Result_columnContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Result_column_with_aggregation_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column_with_aggregation_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterResult_column_with_aggregation_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitResult_column_with_aggregation_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitResult_column_with_aggregation_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_column_with_aggregation_functionContext result_column_with_aggregation_function() throws RecognitionException {
		Result_column_with_aggregation_functionContext _localctx = new Result_column_with_aggregation_functionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_result_column_with_aggregation_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			aggregation_function_name();
			setState(357);
			match(OPEN_PAR);
			setState(358);
			result_column();
			setState(359);
			match(CLOSE_PAR);
			setState(360);
			any_name();
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

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_or_subquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_or_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_table_or_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			table_name();
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(363);
				match(K_AS);
				setState(364);
				table_alias();
				}
				break;
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

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(367);
				table_name();
				setState(368);
				match(DOT);
				}
				break;
			}
			setState(372);
			any_name();
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

	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			any_name();
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

	public static class PathContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(IDENTIFIER);
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

	public static class Type_fileContext extends ParserRuleContext {
		public Type_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterType_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitType_file(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitType_file(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_fileContext type_file() throws RecognitionException {
		Type_fileContext _localctx = new Type_fileContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_type_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
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

	public static class Declare_var_java_not_assignmenContext extends ParserRuleContext {
		public TerminalNode K_VAR() { return getToken(SqlParser.K_VAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SqlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SqlParser.IDENTIFIER, i);
		}
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Declare_var_java_not_assignmenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_var_java_not_assignmen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDeclare_var_java_not_assignmen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDeclare_var_java_not_assignmen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDeclare_var_java_not_assignmen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_var_java_not_assignmenContext declare_var_java_not_assignmen() throws RecognitionException {
		Declare_var_java_not_assignmenContext _localctx = new Declare_var_java_not_assignmenContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_declare_var_java_not_assignmen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(K_VAR);
			setState(381);
			match(IDENTIFIER);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(382);
				match(COMMA);
				setState(383);
				match(IDENTIFIER);
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(389);
			match(SCOL);
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

	public static class Declare_var_javaContext extends ParserRuleContext {
		public TerminalNode K_VAR() { return getToken(SqlParser.K_VAR, 0); }
		public Assignment_var_list_javaContext assignment_var_list_java() {
			return getRuleContext(Assignment_var_list_javaContext.class,0);
		}
		public Declare_var_javaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_var_java; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDeclare_var_java(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDeclare_var_java(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDeclare_var_java(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_var_javaContext declare_var_java() throws RecognitionException {
		Declare_var_javaContext _localctx = new Declare_var_javaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_declare_var_java);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(K_VAR);
			setState(392);
			assignment_var_list_java();
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

	public static class Assignment_var_list_javaContext extends ParserRuleContext {
		public List<Assignment_var_javaContext> assignment_var_java() {
			return getRuleContexts(Assignment_var_javaContext.class);
		}
		public Assignment_var_javaContext assignment_var_java(int i) {
			return getRuleContext(Assignment_var_javaContext.class,i);
		}
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Assignment_var_list_javaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_var_list_java; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAssignment_var_list_java(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAssignment_var_list_java(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAssignment_var_list_java(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_var_list_javaContext assignment_var_list_java() throws RecognitionException {
		Assignment_var_list_javaContext _localctx = new Assignment_var_list_javaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_assignment_var_list_java);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			assignment_var_java();
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(395);
				match(COMMA);
				setState(396);
				assignment_var_java();
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(402);
			match(SCOL);
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

	public static class Assignment_var_javaContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assignment_var_javaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_var_java; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAssignment_var_java(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAssignment_var_java(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAssignment_var_java(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_var_javaContext assignment_var_java() throws RecognitionException {
		Assignment_var_javaContext _localctx = new Assignment_var_javaContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_assignment_var_java);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(IDENTIFIER);
			setState(405);
			match(ASSIGN);
			{
			setState(406);
			expr(0);
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

	public static class Assignment_var_list_without_declare_javaContext extends ParserRuleContext {
		public List<Assignment_var_without_declare_javaContext> assignment_var_without_declare_java() {
			return getRuleContexts(Assignment_var_without_declare_javaContext.class);
		}
		public Assignment_var_without_declare_javaContext assignment_var_without_declare_java(int i) {
			return getRuleContext(Assignment_var_without_declare_javaContext.class,i);
		}
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Assignment_var_list_without_declare_javaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_var_list_without_declare_java; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAssignment_var_list_without_declare_java(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAssignment_var_list_without_declare_java(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAssignment_var_list_without_declare_java(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_var_list_without_declare_javaContext assignment_var_list_without_declare_java() throws RecognitionException {
		Assignment_var_list_without_declare_javaContext _localctx = new Assignment_var_list_without_declare_javaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_assignment_var_list_without_declare_java);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			assignment_var_without_declare_java();
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(409);
				match(COMMA);
				setState(410);
				assignment_var_without_declare_java();
				}
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(416);
			match(SCOL);
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

	public static class Assignment_var_without_declare_javaContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assignment_var_without_declare_javaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_var_without_declare_java; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAssignment_var_without_declare_java(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAssignment_var_without_declare_java(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAssignment_var_without_declare_java(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_var_without_declare_javaContext assignment_var_without_declare_java() throws RecognitionException {
		Assignment_var_without_declare_javaContext _localctx = new Assignment_var_without_declare_javaContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_assignment_var_without_declare_java);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(IDENTIFIER);
			setState(419);
			match(ASSIGN);
			{
			setState(420);
			expr(0);
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

	public static class Parameters_listContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<TerminalNode> K_VAR() { return getTokens(SqlParser.K_VAR); }
		public TerminalNode K_VAR(int i) {
			return getToken(SqlParser.K_VAR, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(SqlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SqlParser.IDENTIFIER, i);
		}
		public List<Default_parametersContext> default_parameters() {
			return getRuleContexts(Default_parametersContext.class);
		}
		public Default_parametersContext default_parameters(int i) {
			return getRuleContext(Default_parametersContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Parameters_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterParameters_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitParameters_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitParameters_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameters_listContext parameters_list() throws RecognitionException {
		Parameters_listContext _localctx = new Parameters_listContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_parameters_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(OPEN_PAR);
			{
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(423);
				match(K_VAR);
				setState(424);
				match(IDENTIFIER);
				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(425);
						match(COMMA);
						{
						setState(426);
						match(K_VAR);
						setState(427);
						match(IDENTIFIER);
						}
						}
						} 
					}
					setState(432);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(433);
					match(COMMA);
					setState(434);
					default_parameters();
					}
					}
					setState(439);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(442);
				default_parameters();
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(443);
					match(COMMA);
					setState(444);
					default_parameters();
					}
					}
					setState(449);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
			setState(452);
			match(CLOSE_PAR);
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

	public static class Default_parametersContext extends ParserRuleContext {
		public TerminalNode K_VAR() { return getToken(SqlParser.K_VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Default_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDefault_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDefault_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDefault_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_parametersContext default_parameters() throws RecognitionException {
		Default_parametersContext _localctx = new Default_parametersContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_default_parameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(K_VAR);
			setState(455);
			match(IDENTIFIER);
			setState(456);
			match(ASSIGN);
			setState(457);
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

	public static class Arguments_listContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Arguments_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterArguments_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitArguments_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitArguments_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arguments_listContext arguments_list() throws RecognitionException {
		Arguments_listContext _localctx = new Arguments_listContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_arguments_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(OPEN_PAR);
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << OPEN_BRAKET) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_FALSE - 128)) | (1L << (K_FUNCTION - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (BIND_PARAMETER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
				{
				setState(460);
				argument();
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(461);
					match(COMMA);
					setState(462);
					argument();
					}
					}
					setState(467);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(470);
			match(T__4);
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

	public static class ArgumentContext extends ParserRuleContext {
		public Arrow_function_javaContext arrow_function_java() {
			return getRuleContext(Arrow_function_javaContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_FUNCTION:
				{
				setState(472);
				arrow_function_java();
				}
				break;
			case OPEN_PAR:
			case OPEN_BRAKET:
			case PLUS:
			case MINUS:
			case TILDE:
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_ATTACH:
			case K_AUTOINCREMENT:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BY:
			case K_CASCADE:
			case K_CASE:
			case K_CAST:
			case K_CHECK:
			case K_COLLATE:
			case K_COLUMN:
			case K_COMMIT:
			case K_CONFLICT:
			case K_CONSTRAINT:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DELETE:
			case K_DESC:
			case K_DETACH:
			case K_DISTINCT:
			case K_DROP:
			case K_EACH:
			case K_ELSE:
			case K_END:
			case K_ENABLE:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXCLUSIVE:
			case K_EXISTS:
			case K_EXPLAIN:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IMMEDIATE:
			case K_IN:
			case K_INDEX:
			case K_INDEXED:
			case K_INITIALLY:
			case K_INNER:
			case K_INSERT:
			case K_INSTEAD:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NEXTVAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PLAN:
			case K_PRAGMA:
			case K_PRIMARY:
			case K_QUERY:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REFERENCES:
			case K_REGEXP:
			case K_REINDEX:
			case K_RELEASE:
			case K_RENAME:
			case K_REPLACE:
			case K_RESTRICT:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_ROW:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TO:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_VACUUM:
			case K_VALUES:
			case K_VIEW:
			case K_VIRTUAL:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_WITHOUT:
			case K_TRUE:
			case K_FALSE:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case BIND_PARAMETER:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				setState(473);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Arrow_function_javaContext extends ParserRuleContext {
		public TerminalNode K_FUNCTION() { return getToken(SqlParser.K_FUNCTION, 0); }
		public Parameters_listContext parameters_list() {
			return getRuleContext(Parameters_listContext.class,0);
		}
		public TerminalNode K_RETURN() { return getToken(SqlParser.K_RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public Arrow_function_javaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrow_function_java; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterArrow_function_java(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitArrow_function_java(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitArrow_function_java(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arrow_function_javaContext arrow_function_java() throws RecognitionException {
		Arrow_function_javaContext _localctx = new Arrow_function_javaContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_arrow_function_java);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(K_FUNCTION);
			setState(477);
			parameters_list();
			setState(478);
			match(T__5);
			setState(479);
			match(K_RETURN);
			setState(480);
			expr(0);
			setState(481);
			match(SCOL);
			setState(482);
			match(T__6);
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

	public static class Function_java_nameContext extends ParserRuleContext {
		public Any_name_no_keywordContext any_name_no_keyword() {
			return getRuleContext(Any_name_no_keywordContext.class,0);
		}
		public Function_java_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_java_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFunction_java_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFunction_java_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFunction_java_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_java_nameContext function_java_name() throws RecognitionException {
		Function_java_nameContext _localctx = new Function_java_nameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_function_java_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			any_name_no_keyword();
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

	public static class Function_java_ruleContext extends ParserRuleContext {
		public Function_java_headerContext function_java_header() {
			return getRuleContext(Function_java_headerContext.class,0);
		}
		public List<Java_bodyContext> java_body() {
			return getRuleContexts(Java_bodyContext.class);
		}
		public Java_bodyContext java_body(int i) {
			return getRuleContext(Java_bodyContext.class,i);
		}
		public Function_java_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_java_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFunction_java_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFunction_java_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFunction_java_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_java_ruleContext function_java_rule() throws RecognitionException {
		Function_java_ruleContext _localctx = new Function_java_ruleContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_function_java_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			function_java_header();
			setState(487);
			match(T__5);
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (K_RETURN - 87)) | (1L << (K_FOR - 87)) | (1L << (K_IF - 87)))) != 0) || ((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & ((1L << (K_DO - 174)) | (1L << (K_WHILE - 174)) | (1L << (K_SWITCH - 174)) | (1L << (K_PRINT - 174)) | (1L << (K_BREAK - 174)) | (1L << (K_VAR - 174)) | (1L << (IDENTIFIER - 174)) | (1L << (STRING_LITERAL - 174)))) != 0)) {
				{
				{
				setState(488);
				java_body();
				}
				}
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(494);
			match(T__6);
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

	public static class Function_java_headerContext extends ParserRuleContext {
		public Function_java_nameContext function_java_name() {
			return getRuleContext(Function_java_nameContext.class,0);
		}
		public Parameters_listContext parameters_list() {
			return getRuleContext(Parameters_listContext.class,0);
		}
		public TerminalNode K_FUNCTION() { return getToken(SqlParser.K_FUNCTION, 0); }
		public Function_java_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_java_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFunction_java_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFunction_java_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFunction_java_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_java_headerContext function_java_header() throws RecognitionException {
		Function_java_headerContext _localctx = new Function_java_headerContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_function_java_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FUNCTION) {
				{
				setState(496);
				match(K_FUNCTION);
				}
			}

			setState(499);
			function_java_name();
			setState(500);
			parameters_list();
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

	public static class Function_java_callContext extends ParserRuleContext {
		public Function_java_nameContext function_java_name() {
			return getRuleContext(Function_java_nameContext.class,0);
		}
		public Arguments_listContext arguments_list() {
			return getRuleContext(Arguments_listContext.class,0);
		}
		public Function_java_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_java_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFunction_java_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFunction_java_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFunction_java_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_java_callContext function_java_call() throws RecognitionException {
		Function_java_callContext _localctx = new Function_java_callContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_function_java_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			function_java_name();
			setState(503);
			arguments_list();
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

	public static class Print_javaContext extends ParserRuleContext {
		public TerminalNode K_PRINT() { return getToken(SqlParser.K_PRINT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public Print_javaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_java; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterPrint_java(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitPrint_java(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitPrint_java(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_javaContext print_java() throws RecognitionException {
		Print_javaContext _localctx = new Print_javaContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_print_java);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(K_PRINT);
			setState(506);
			match(OPEN_PAR);
			setState(507);
			expr(0);
			setState(508);
			match(CLOSE_PAR);
			setState(509);
			match(SCOL);
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

	public static class While_java_ruleContext extends ParserRuleContext {
		public While_java_headerContext while_java_header() {
			return getRuleContext(While_java_headerContext.class,0);
		}
		public Body_brackets_javaContext body_brackets_java() {
			return getRuleContext(Body_brackets_javaContext.class,0);
		}
		public While_java_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_java_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterWhile_java_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitWhile_java_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitWhile_java_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_java_ruleContext while_java_rule() throws RecognitionException {
		While_java_ruleContext _localctx = new While_java_ruleContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_while_java_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			while_java_header();
			setState(512);
			body_brackets_java();
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

	public static class While_java_headerContext extends ParserRuleContext {
		public TerminalNode K_WHILE() { return getToken(SqlParser.K_WHILE, 0); }
		public Condition_javaContext condition_java() {
			return getRuleContext(Condition_javaContext.class,0);
		}
		public While_java_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_java_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterWhile_java_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitWhile_java_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitWhile_java_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_java_headerContext while_java_header() throws RecognitionException {
		While_java_headerContext _localctx = new While_java_headerContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_while_java_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(K_WHILE);
			setState(515);
			condition_java();
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

	public static class Do_while_java_ruleContext extends ParserRuleContext {
		public TerminalNode K_DO() { return getToken(SqlParser.K_DO, 0); }
		public Body_brackets_javaContext body_brackets_java() {
			return getRuleContext(Body_brackets_javaContext.class,0);
		}
		public While_java_headerContext while_java_header() {
			return getRuleContext(While_java_headerContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public Do_while_java_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_java_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDo_while_java_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDo_while_java_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDo_while_java_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_java_ruleContext do_while_java_rule() throws RecognitionException {
		Do_while_java_ruleContext _localctx = new Do_while_java_ruleContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_do_while_java_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(K_DO);
			setState(518);
			body_brackets_java();
			setState(519);
			while_java_header();
			setState(520);
			match(SCOL);
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

	public static class For_java_ruleContext extends ParserRuleContext {
		public For_java_headerContext for_java_header() {
			return getRuleContext(For_java_headerContext.class,0);
		}
		public Body_brackets_javaContext body_brackets_java() {
			return getRuleContext(Body_brackets_javaContext.class,0);
		}
		public For_java_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_java_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFor_java_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFor_java_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFor_java_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_java_ruleContext for_java_rule() throws RecognitionException {
		For_java_ruleContext _localctx = new For_java_ruleContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_for_java_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			for_java_header();
			setState(523);
			body_brackets_java();
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

	public static class For_java_headerContext extends ParserRuleContext {
		public TerminalNode K_FOR() { return getToken(SqlParser.K_FOR, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Condition_javaContext condition_java() {
			return getRuleContext(Condition_javaContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public Shorten_operators_javaContext shorten_operators_java() {
			return getRuleContext(Shorten_operators_javaContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode K_VAR() { return getToken(SqlParser.K_VAR, 0); }
		public Assignment_var_list_javaContext assignment_var_list_java() {
			return getRuleContext(Assignment_var_list_javaContext.class,0);
		}
		public Assignment_var_list_without_declare_javaContext assignment_var_list_without_declare_java() {
			return getRuleContext(Assignment_var_list_without_declare_javaContext.class,0);
		}
		public For_java_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_java_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFor_java_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFor_java_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFor_java_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_java_headerContext for_java_header() throws RecognitionException {
		For_java_headerContext _localctx = new For_java_headerContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_for_java_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(K_FOR);
			setState(526);
			match(OPEN_PAR);
			setState(530);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_VAR:
				{
				setState(527);
				match(K_VAR);
				setState(528);
				assignment_var_list_java();
				}
				break;
			case IDENTIFIER:
				{
				setState(529);
				assignment_var_list_without_declare_java();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(532);
			condition_java();
			setState(533);
			match(SCOL);
			setState(534);
			shorten_operators_java();
			setState(535);
			match(CLOSE_PAR);
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

	public static class Shorten_operators_javaContext extends ParserRuleContext {
		public Any_name_no_keywordContext any_name_no_keyword() {
			return getRuleContext(Any_name_no_keywordContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PLUS_PLUS() { return getToken(SqlParser.PLUS_PLUS, 0); }
		public TerminalNode MINUS_MINUS() { return getToken(SqlParser.MINUS_MINUS, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(SqlParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(SqlParser.MINUS_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(SqlParser.DIV_ASSIGN, 0); }
		public TerminalNode POWER_ASSIGN() { return getToken(SqlParser.POWER_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(SqlParser.MOD_ASSIGN, 0); }
		public TerminalNode STAR_ASSIGN() { return getToken(SqlParser.STAR_ASSIGN, 0); }
		public Shorten_operators_javaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shorten_operators_java; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterShorten_operators_java(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitShorten_operators_java(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitShorten_operators_java(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shorten_operators_javaContext shorten_operators_java() throws RecognitionException {
		Shorten_operators_javaContext _localctx = new Shorten_operators_javaContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_shorten_operators_java);
		int _la;
		try {
			setState(545);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case IDENTIFIER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				any_name_no_keyword();
				setState(541);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS_PLUS:
				case MINUS_MINUS:
					{
					setState(538);
					_la = _input.LA(1);
					if ( !(_la==PLUS_PLUS || _la==MINUS_MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case STAR_ASSIGN:
				case PLUS_ASSIGN:
				case MINUS_ASSIGN:
				case POWER_ASSIGN:
				case DIV_ASSIGN:
				case MOD_ASSIGN:
					{
					setState(539);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR_ASSIGN) | (1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << POWER_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(540);
					expr(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case PLUS_PLUS:
			case MINUS_MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				_la = _input.LA(1);
				if ( !(_la==PLUS_PLUS || _la==MINUS_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(544);
				any_name_no_keyword();
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

	public static class If_java_ruleContext extends ParserRuleContext {
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public List<If_basic_java_ruleContext> if_basic_java_rule() {
			return getRuleContexts(If_basic_java_ruleContext.class);
		}
		public If_basic_java_ruleContext if_basic_java_rule(int i) {
			return getRuleContext(If_basic_java_ruleContext.class,i);
		}
		public List<TerminalNode> K_ELSE_IF() { return getTokens(SqlParser.K_ELSE_IF); }
		public TerminalNode K_ELSE_IF(int i) {
			return getToken(SqlParser.K_ELSE_IF, i);
		}
		public TerminalNode K_ELSE() { return getToken(SqlParser.K_ELSE, 0); }
		public Body_brackets_javaContext body_brackets_java() {
			return getRuleContext(Body_brackets_javaContext.class,0);
		}
		public If_java_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_java_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterIf_java_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitIf_java_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitIf_java_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_java_ruleContext if_java_rule() throws RecognitionException {
		If_java_ruleContext _localctx = new If_java_ruleContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_if_java_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(K_IF);
			setState(548);
			if_basic_java_rule();
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_ELSE_IF) {
				{
				{
				setState(549);
				match(K_ELSE_IF);
				setState(550);
				if_basic_java_rule();
				}
				}
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ELSE) {
				{
				setState(556);
				match(K_ELSE);
				setState(557);
				body_brackets_java();
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

	public static class If_basic_java_ruleContext extends ParserRuleContext {
		public Condition_javaContext condition_java() {
			return getRuleContext(Condition_javaContext.class,0);
		}
		public Body_brackets_javaContext body_brackets_java() {
			return getRuleContext(Body_brackets_javaContext.class,0);
		}
		public If_basic_java_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_basic_java_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterIf_basic_java_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitIf_basic_java_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitIf_basic_java_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_basic_java_ruleContext if_basic_java_rule() throws RecognitionException {
		If_basic_java_ruleContext _localctx = new If_basic_java_ruleContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_if_basic_java_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			condition_java();
			setState(561);
			body_brackets_java();
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

	public static class Body_brackets_javaContext extends ParserRuleContext {
		public List<Java_bodyContext> java_body() {
			return getRuleContexts(Java_bodyContext.class);
		}
		public Java_bodyContext java_body(int i) {
			return getRuleContext(Java_bodyContext.class,i);
		}
		public Body_brackets_javaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_brackets_java; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterBody_brackets_java(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitBody_brackets_java(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitBody_brackets_java(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body_brackets_javaContext body_brackets_java() throws RecognitionException {
		Body_brackets_javaContext _localctx = new Body_brackets_javaContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_body_brackets_java);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(T__5);
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (K_RETURN - 87)) | (1L << (K_FOR - 87)) | (1L << (K_IF - 87)))) != 0) || ((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & ((1L << (K_DO - 174)) | (1L << (K_WHILE - 174)) | (1L << (K_SWITCH - 174)) | (1L << (K_PRINT - 174)) | (1L << (K_BREAK - 174)) | (1L << (K_VAR - 174)) | (1L << (IDENTIFIER - 174)) | (1L << (STRING_LITERAL - 174)))) != 0)) {
				{
				{
				setState(564);
				java_body();
				}
				}
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(570);
			match(T__6);
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

	public static class Condition_javaContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> PIPE2() { return getTokens(SqlParser.PIPE2); }
		public TerminalNode PIPE2(int i) {
			return getToken(SqlParser.PIPE2, i);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Condition_javaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_java; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCondition_java(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCondition_java(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCondition_java(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_javaContext condition_java() throws RecognitionException {
		Condition_javaContext _localctx = new Condition_javaContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_condition_java);
		int _la;
		try {
			setState(599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(572);
				expr(0);
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << OPEN_PAR) | (1L << OPEN_BRAKET) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << PIPE2) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_FALSE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (BIND_PARAMETER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
					{
					{
					setState(576);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__7:
						{
						setState(573);
						match(T__7);
						}
						break;
					case OPEN_PAR:
					case OPEN_BRAKET:
					case PLUS:
					case MINUS:
					case TILDE:
					case K_ABORT:
					case K_ACTION:
					case K_ADD:
					case K_AFTER:
					case K_ALL:
					case K_ALTER:
					case K_ANALYZE:
					case K_AND:
					case K_AS:
					case K_ASC:
					case K_ATTACH:
					case K_AUTOINCREMENT:
					case K_BEFORE:
					case K_BEGIN:
					case K_BETWEEN:
					case K_BY:
					case K_CASCADE:
					case K_CASE:
					case K_CAST:
					case K_CHECK:
					case K_COLLATE:
					case K_COLUMN:
					case K_COMMIT:
					case K_CONFLICT:
					case K_CONSTRAINT:
					case K_CREATE:
					case K_CROSS:
					case K_CURRENT_DATE:
					case K_CURRENT_TIME:
					case K_CURRENT_TIMESTAMP:
					case K_DATABASE:
					case K_DEFAULT:
					case K_DEFERRABLE:
					case K_DEFERRED:
					case K_DELETE:
					case K_DESC:
					case K_DETACH:
					case K_DISTINCT:
					case K_DROP:
					case K_EACH:
					case K_ELSE:
					case K_END:
					case K_ENABLE:
					case K_ESCAPE:
					case K_EXCEPT:
					case K_EXCLUSIVE:
					case K_EXISTS:
					case K_EXPLAIN:
					case K_FAIL:
					case K_FOR:
					case K_FOREIGN:
					case K_FROM:
					case K_FULL:
					case K_GLOB:
					case K_GROUP:
					case K_HAVING:
					case K_IF:
					case K_IGNORE:
					case K_IMMEDIATE:
					case K_IN:
					case K_INDEX:
					case K_INDEXED:
					case K_INITIALLY:
					case K_INNER:
					case K_INSERT:
					case K_INSTEAD:
					case K_INTERSECT:
					case K_INTO:
					case K_IS:
					case K_ISNULL:
					case K_JOIN:
					case K_KEY:
					case K_LEFT:
					case K_LIKE:
					case K_LIMIT:
					case K_MATCH:
					case K_NATURAL:
					case K_NEXTVAL:
					case K_NO:
					case K_NOT:
					case K_NOTNULL:
					case K_NULL:
					case K_OF:
					case K_OFFSET:
					case K_ON:
					case K_OR:
					case K_ORDER:
					case K_OUTER:
					case K_PLAN:
					case K_PRAGMA:
					case K_PRIMARY:
					case K_QUERY:
					case K_RAISE:
					case K_RECURSIVE:
					case K_REFERENCES:
					case K_REGEXP:
					case K_REINDEX:
					case K_RELEASE:
					case K_RENAME:
					case K_REPLACE:
					case K_RESTRICT:
					case K_RIGHT:
					case K_ROLLBACK:
					case K_ROW:
					case K_SAVEPOINT:
					case K_SELECT:
					case K_SET:
					case K_TABLE:
					case K_TEMP:
					case K_TEMPORARY:
					case K_THEN:
					case K_TO:
					case K_TRANSACTION:
					case K_TRIGGER:
					case K_UNION:
					case K_UNIQUE:
					case K_UPDATE:
					case K_USING:
					case K_VACUUM:
					case K_VALUES:
					case K_VIEW:
					case K_VIRTUAL:
					case K_WHEN:
					case K_WHERE:
					case K_WITH:
					case K_WITHOUT:
					case K_TRUE:
					case K_FALSE:
					case IDENTIFIER:
					case NUMERIC_LITERAL:
					case BIND_PARAMETER:
					case STRING_LITERAL:
					case BLOB_LITERAL:
						{
						}
						break;
					case PIPE2:
						{
						setState(575);
						match(PIPE2);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					{
					setState(578);
					expr(0);
					}
					}
					}
					setState(583);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				match(OPEN_PAR);
				setState(585);
				expr(0);
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << OPEN_PAR) | (1L << OPEN_BRAKET) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << PIPE2) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_FALSE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (BIND_PARAMETER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
					{
					{
					setState(589);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__7:
						{
						setState(586);
						match(T__7);
						}
						break;
					case OPEN_PAR:
					case OPEN_BRAKET:
					case PLUS:
					case MINUS:
					case TILDE:
					case K_ABORT:
					case K_ACTION:
					case K_ADD:
					case K_AFTER:
					case K_ALL:
					case K_ALTER:
					case K_ANALYZE:
					case K_AND:
					case K_AS:
					case K_ASC:
					case K_ATTACH:
					case K_AUTOINCREMENT:
					case K_BEFORE:
					case K_BEGIN:
					case K_BETWEEN:
					case K_BY:
					case K_CASCADE:
					case K_CASE:
					case K_CAST:
					case K_CHECK:
					case K_COLLATE:
					case K_COLUMN:
					case K_COMMIT:
					case K_CONFLICT:
					case K_CONSTRAINT:
					case K_CREATE:
					case K_CROSS:
					case K_CURRENT_DATE:
					case K_CURRENT_TIME:
					case K_CURRENT_TIMESTAMP:
					case K_DATABASE:
					case K_DEFAULT:
					case K_DEFERRABLE:
					case K_DEFERRED:
					case K_DELETE:
					case K_DESC:
					case K_DETACH:
					case K_DISTINCT:
					case K_DROP:
					case K_EACH:
					case K_ELSE:
					case K_END:
					case K_ENABLE:
					case K_ESCAPE:
					case K_EXCEPT:
					case K_EXCLUSIVE:
					case K_EXISTS:
					case K_EXPLAIN:
					case K_FAIL:
					case K_FOR:
					case K_FOREIGN:
					case K_FROM:
					case K_FULL:
					case K_GLOB:
					case K_GROUP:
					case K_HAVING:
					case K_IF:
					case K_IGNORE:
					case K_IMMEDIATE:
					case K_IN:
					case K_INDEX:
					case K_INDEXED:
					case K_INITIALLY:
					case K_INNER:
					case K_INSERT:
					case K_INSTEAD:
					case K_INTERSECT:
					case K_INTO:
					case K_IS:
					case K_ISNULL:
					case K_JOIN:
					case K_KEY:
					case K_LEFT:
					case K_LIKE:
					case K_LIMIT:
					case K_MATCH:
					case K_NATURAL:
					case K_NEXTVAL:
					case K_NO:
					case K_NOT:
					case K_NOTNULL:
					case K_NULL:
					case K_OF:
					case K_OFFSET:
					case K_ON:
					case K_OR:
					case K_ORDER:
					case K_OUTER:
					case K_PLAN:
					case K_PRAGMA:
					case K_PRIMARY:
					case K_QUERY:
					case K_RAISE:
					case K_RECURSIVE:
					case K_REFERENCES:
					case K_REGEXP:
					case K_REINDEX:
					case K_RELEASE:
					case K_RENAME:
					case K_REPLACE:
					case K_RESTRICT:
					case K_RIGHT:
					case K_ROLLBACK:
					case K_ROW:
					case K_SAVEPOINT:
					case K_SELECT:
					case K_SET:
					case K_TABLE:
					case K_TEMP:
					case K_TEMPORARY:
					case K_THEN:
					case K_TO:
					case K_TRANSACTION:
					case K_TRIGGER:
					case K_UNION:
					case K_UNIQUE:
					case K_UPDATE:
					case K_USING:
					case K_VACUUM:
					case K_VALUES:
					case K_VIEW:
					case K_VIRTUAL:
					case K_WHEN:
					case K_WHERE:
					case K_WITH:
					case K_WITHOUT:
					case K_TRUE:
					case K_FALSE:
					case IDENTIFIER:
					case NUMERIC_LITERAL:
					case BIND_PARAMETER:
					case STRING_LITERAL:
					case BLOB_LITERAL:
						{
						}
						break;
					case PIPE2:
						{
						setState(588);
						match(PIPE2);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					{
					setState(591);
					expr(0);
					}
					}
					}
					setState(596);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(597);
				match(CLOSE_PAR);
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

	public static class Switch_stmtContext extends ParserRuleContext {
		public TerminalNode K_SWITCH() { return getToken(SqlParser.K_SWITCH, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<Switch_caseContext> switch_case() {
			return getRuleContexts(Switch_caseContext.class);
		}
		public Switch_caseContext switch_case(int i) {
			return getRuleContext(Switch_caseContext.class,i);
		}
		public TerminalNode K_DEFAULT() { return getToken(SqlParser.K_DEFAULT, 0); }
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public List<Java_bodyContext> java_body() {
			return getRuleContexts(Java_bodyContext.class);
		}
		public Java_bodyContext java_body(int i) {
			return getRuleContext(Java_bodyContext.class,i);
		}
		public TerminalNode K_BREAK() { return getToken(SqlParser.K_BREAK, 0); }
		public Switch_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSwitch_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSwitch_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSwitch_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_stmtContext switch_stmt() throws RecognitionException {
		Switch_stmtContext _localctx = new Switch_stmtContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_switch_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(K_SWITCH);
			setState(602);
			match(OPEN_PAR);
			setState(603);
			match(IDENTIFIER);
			setState(604);
			match(CLOSE_PAR);
			setState(605);
			match(T__5);
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_CASE) {
				{
				{
				setState(606);
				switch_case();
				}
				}
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DEFAULT) {
				{
				setState(612);
				match(K_DEFAULT);
				setState(613);
				match(T__8);
				setState(617);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(614);
						java_body();
						}
						} 
					}
					setState(619);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_BREAK) {
					{
					setState(620);
					match(K_BREAK);
					}
				}

				setState(623);
				match(SCOL);
				}
			}

			setState(626);
			match(T__6);
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

	public static class Switch_caseContext extends ParserRuleContext {
		public TerminalNode K_CASE() { return getToken(SqlParser.K_CASE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_BREAK() { return getToken(SqlParser.K_BREAK, 0); }
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public List<Java_bodyContext> java_body() {
			return getRuleContexts(Java_bodyContext.class);
		}
		public Java_bodyContext java_body(int i) {
			return getRuleContext(Java_bodyContext.class,i);
		}
		public Switch_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSwitch_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSwitch_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSwitch_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_caseContext switch_case() throws RecognitionException {
		Switch_caseContext _localctx = new Switch_caseContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_switch_case);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(628);
			match(K_CASE);
			setState(629);
			expr(0);
			setState(630);
			match(T__8);
			setState(634);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(631);
					java_body();
					}
					} 
				}
				setState(636);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			setState(637);
			match(K_BREAK);
			setState(638);
			match(SCOL);
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

	public static class Java_bodyContext extends ParserRuleContext {
		public Declare_var_javaContext declare_var_java() {
			return getRuleContext(Declare_var_javaContext.class,0);
		}
		public Declare_var_java_not_assignmenContext declare_var_java_not_assignmen() {
			return getRuleContext(Declare_var_java_not_assignmenContext.class,0);
		}
		public Assignment_var_list_without_declare_javaContext assignment_var_list_without_declare_java() {
			return getRuleContext(Assignment_var_list_without_declare_javaContext.class,0);
		}
		public Shorten_operators_javaContext shorten_operators_java() {
			return getRuleContext(Shorten_operators_javaContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public Switch_stmtContext switch_stmt() {
			return getRuleContext(Switch_stmtContext.class,0);
		}
		public Function_java_callContext function_java_call() {
			return getRuleContext(Function_java_callContext.class,0);
		}
		public If_java_ruleContext if_java_rule() {
			return getRuleContext(If_java_ruleContext.class,0);
		}
		public For_java_ruleContext for_java_rule() {
			return getRuleContext(For_java_ruleContext.class,0);
		}
		public While_java_ruleContext while_java_rule() {
			return getRuleContext(While_java_ruleContext.class,0);
		}
		public Do_while_java_ruleContext do_while_java_rule() {
			return getRuleContext(Do_while_java_ruleContext.class,0);
		}
		public Print_javaContext print_java() {
			return getRuleContext(Print_javaContext.class,0);
		}
		public TerminalNode K_BREAK() { return getToken(SqlParser.K_BREAK, 0); }
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Java_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJava_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJava_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJava_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Java_bodyContext java_body() throws RecognitionException {
		Java_bodyContext _localctx = new Java_bodyContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_java_body);
		try {
			setState(656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(640);
				declare_var_java();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(641);
				declare_var_java_not_assignmen();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(642);
				assignment_var_list_without_declare_java();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(643);
				shorten_operators_java();
				setState(644);
				match(SCOL);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(646);
				switch_stmt();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(647);
				function_java_call();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(648);
				if_java_rule();
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(649);
				for_java_rule();
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(650);
				while_java_rule();
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(651);
				do_while_java_rule();
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(652);
				print_java();
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(653);
				match(K_BREAK);
				setState(654);
				match(SCOL);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(655);
				return_stmt();
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

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode K_RETURN() { return getToken(SqlParser.K_RETURN, 0); }
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitReturn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_return_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(K_RETURN);
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << OPEN_BRAKET) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_FALSE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (BIND_PARAMETER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
				{
				setState(659);
				expr(0);
				}
			}

			setState(662);
			match(SCOL);
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
		public TerminalNode OPEN_BRAKET() { return getToken(SqlParser.OPEN_BRAKET, 0); }
		public TerminalNode CLOSE_BRAKET() { return getToken(SqlParser.CLOSE_BRAKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode BIND_PARAMETER() { return getToken(SqlParser.BIND_PARAMETER, 0); }
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SqlParser.K_DISTINCT, 0); }
		public TerminalNode QUES() { return getToken(SqlParser.QUES, 0); }
		public TerminalNode DIV() { return getToken(SqlParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SqlParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public TerminalNode LT2() { return getToken(SqlParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SqlParser.GT2, 0); }
		public TerminalNode LT() { return getToken(SqlParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SqlParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SqlParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SqlParser.GT_EQ, 0); }
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public TerminalNode EQ() { return getToken(SqlParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SqlParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SqlParser.NOT_EQ2, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitExpr(this);
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
		int _startState = 122;
		enterRecursionRule(_localctx, 122, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(665);
				match(OPEN_BRAKET);
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << OPEN_BRAKET) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_FALSE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (BIND_PARAMETER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
					{
					setState(666);
					expr(0);
					setState(671);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(667);
						match(COMMA);
						setState(668);
						expr(0);
						}
						}
						setState(673);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(676);
				match(CLOSE_BRAKET);
				}
				break;
			case 2:
				{
				setState(677);
				match(OPEN_PAR);
				setState(678);
				expr(0);
				setState(679);
				match(CLOSE_PAR);
				}
				break;
			case 3:
				{
				setState(681);
				select_core();
				}
				break;
			case 4:
				{
				setState(682);
				literal_value();
				}
				break;
			case 5:
				{
				setState(683);
				match(BIND_PARAMETER);
				}
				break;
			case 6:
				{
				setState(684);
				var_name();
				}
				break;
			case 7:
				{
				setState(685);
				unary_operator();
				setState(686);
				expr(7);
				}
				break;
			case 8:
				{
				setState(688);
				function_name();
				setState(689);
				match(OPEN_PAR);
				setState(702);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case OPEN_BRAKET:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_ABORT:
				case K_ACTION:
				case K_ADD:
				case K_AFTER:
				case K_ALL:
				case K_ALTER:
				case K_ANALYZE:
				case K_AND:
				case K_AS:
				case K_ASC:
				case K_ATTACH:
				case K_AUTOINCREMENT:
				case K_BEFORE:
				case K_BEGIN:
				case K_BETWEEN:
				case K_BY:
				case K_CASCADE:
				case K_CASE:
				case K_CAST:
				case K_CHECK:
				case K_COLLATE:
				case K_COLUMN:
				case K_COMMIT:
				case K_CONFLICT:
				case K_CONSTRAINT:
				case K_CREATE:
				case K_CROSS:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DATABASE:
				case K_DEFAULT:
				case K_DEFERRABLE:
				case K_DEFERRED:
				case K_DELETE:
				case K_DESC:
				case K_DETACH:
				case K_DISTINCT:
				case K_DROP:
				case K_EACH:
				case K_ELSE:
				case K_END:
				case K_ENABLE:
				case K_ESCAPE:
				case K_EXCEPT:
				case K_EXCLUSIVE:
				case K_EXISTS:
				case K_EXPLAIN:
				case K_FAIL:
				case K_FOR:
				case K_FOREIGN:
				case K_FROM:
				case K_FULL:
				case K_GLOB:
				case K_GROUP:
				case K_HAVING:
				case K_IF:
				case K_IGNORE:
				case K_IMMEDIATE:
				case K_IN:
				case K_INDEX:
				case K_INDEXED:
				case K_INITIALLY:
				case K_INNER:
				case K_INSERT:
				case K_INSTEAD:
				case K_INTERSECT:
				case K_INTO:
				case K_IS:
				case K_ISNULL:
				case K_JOIN:
				case K_KEY:
				case K_LEFT:
				case K_LIKE:
				case K_LIMIT:
				case K_MATCH:
				case K_NATURAL:
				case K_NEXTVAL:
				case K_NO:
				case K_NOT:
				case K_NOTNULL:
				case K_NULL:
				case K_OF:
				case K_OFFSET:
				case K_ON:
				case K_OR:
				case K_ORDER:
				case K_OUTER:
				case K_PLAN:
				case K_PRAGMA:
				case K_PRIMARY:
				case K_QUERY:
				case K_RAISE:
				case K_RECURSIVE:
				case K_REFERENCES:
				case K_REGEXP:
				case K_REINDEX:
				case K_RELEASE:
				case K_RENAME:
				case K_REPLACE:
				case K_RESTRICT:
				case K_RIGHT:
				case K_ROLLBACK:
				case K_ROW:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_SET:
				case K_TABLE:
				case K_TEMP:
				case K_TEMPORARY:
				case K_THEN:
				case K_TO:
				case K_TRANSACTION:
				case K_TRIGGER:
				case K_UNION:
				case K_UNIQUE:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_VIEW:
				case K_VIRTUAL:
				case K_WHEN:
				case K_WHERE:
				case K_WITH:
				case K_WITHOUT:
				case K_TRUE:
				case K_FALSE:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case BIND_PARAMETER:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(691);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						setState(690);
						match(K_DISTINCT);
						}
						break;
					}
					setState(693);
					expr(0);
					setState(698);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(694);
						match(COMMA);
						setState(695);
						expr(0);
						}
						}
						setState(700);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(701);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(704);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(731);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(729);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(708);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(709);
						match(QUES);
						setState(710);
						expr(0);
						setState(711);
						match(T__8);
						setState(712);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(714);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(715);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(716);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(717);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(718);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(719);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(720);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(721);
						_la = _input.LA(1);
						if ( !(_la==LT2 || _la==GT2) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(722);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(723);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(724);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(725);
						expr(4);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(726);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(727);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << EQ) | (1L << NOT_EQ1) | (1L << NOT_EQ2))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(728);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(733);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SqlParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public TerminalNode K_TRUE() { return getToken(SqlParser.K_TRUE, 0); }
		public TerminalNode K_FALSE() { return getToken(SqlParser.K_FALSE, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(SqlParser.BLOB_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(SqlParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SqlParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SqlParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SqlParser.K_CURRENT_TIMESTAMP, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_literal_value);
		int _la;
		try {
			setState(742);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(734);
				match(NUMERIC_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(735);
				match(STRING_LITERAL);
				}
				break;
			case K_TRUE:
			case K_FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(736);
				_la = _input.LA(1);
				if ( !(_la==K_TRUE || _la==K_FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case BLOB_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(737);
				match(BLOB_LITERAL);
				}
				break;
			case K_NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(738);
				match(K_NULL);
				}
				break;
			case K_CURRENT_TIME:
				enterOuterAlt(_localctx, 6);
				{
				setState(739);
				match(K_CURRENT_TIME);
				}
				break;
			case K_CURRENT_DATE:
				enterOuterAlt(_localctx, 7);
				{
				setState(740);
				match(K_CURRENT_DATE);
				}
				break;
			case K_CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 8);
				{
				setState(741);
				match(K_CURRENT_TIMESTAMP);
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SqlParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SqlParser.TILDE, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || _la==K_NOT) ) {
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_ABORT() { return getToken(SqlParser.K_ABORT, 0); }
		public TerminalNode K_ACTION() { return getToken(SqlParser.K_ACTION, 0); }
		public TerminalNode K_ADD() { return getToken(SqlParser.K_ADD, 0); }
		public TerminalNode K_AFTER() { return getToken(SqlParser.K_AFTER, 0); }
		public TerminalNode K_ALL() { return getToken(SqlParser.K_ALL, 0); }
		public TerminalNode K_ALTER() { return getToken(SqlParser.K_ALTER, 0); }
		public TerminalNode K_ANALYZE() { return getToken(SqlParser.K_ANALYZE, 0); }
		public TerminalNode K_AND() { return getToken(SqlParser.K_AND, 0); }
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public TerminalNode K_ASC() { return getToken(SqlParser.K_ASC, 0); }
		public TerminalNode K_ATTACH() { return getToken(SqlParser.K_ATTACH, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SqlParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_BEFORE() { return getToken(SqlParser.K_BEFORE, 0); }
		public TerminalNode K_BEGIN() { return getToken(SqlParser.K_BEGIN, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SqlParser.K_BETWEEN, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public TerminalNode K_CASCADE() { return getToken(SqlParser.K_CASCADE, 0); }
		public TerminalNode K_CASE() { return getToken(SqlParser.K_CASE, 0); }
		public TerminalNode K_CAST() { return getToken(SqlParser.K_CAST, 0); }
		public TerminalNode K_CHECK() { return getToken(SqlParser.K_CHECK, 0); }
		public TerminalNode K_COLLATE() { return getToken(SqlParser.K_COLLATE, 0); }
		public TerminalNode K_COLUMN() { return getToken(SqlParser.K_COLUMN, 0); }
		public TerminalNode K_COMMIT() { return getToken(SqlParser.K_COMMIT, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SqlParser.K_CONFLICT, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SqlParser.K_CONSTRAINT, 0); }
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_CROSS() { return getToken(SqlParser.K_CROSS, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SqlParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SqlParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SqlParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_DATABASE() { return getToken(SqlParser.K_DATABASE, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SqlParser.K_DEFAULT, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SqlParser.K_DEFERRABLE, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SqlParser.K_DEFERRED, 0); }
		public TerminalNode K_DELETE() { return getToken(SqlParser.K_DELETE, 0); }
		public TerminalNode K_DESC() { return getToken(SqlParser.K_DESC, 0); }
		public TerminalNode K_DETACH() { return getToken(SqlParser.K_DETACH, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SqlParser.K_DISTINCT, 0); }
		public TerminalNode K_DROP() { return getToken(SqlParser.K_DROP, 0); }
		public TerminalNode K_EACH() { return getToken(SqlParser.K_EACH, 0); }
		public TerminalNode K_ELSE() { return getToken(SqlParser.K_ELSE, 0); }
		public TerminalNode K_END() { return getToken(SqlParser.K_END, 0); }
		public TerminalNode K_ENABLE() { return getToken(SqlParser.K_ENABLE, 0); }
		public TerminalNode K_ESCAPE() { return getToken(SqlParser.K_ESCAPE, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SqlParser.K_EXCEPT, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SqlParser.K_EXCLUSIVE, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public TerminalNode K_EXPLAIN() { return getToken(SqlParser.K_EXPLAIN, 0); }
		public TerminalNode K_FAIL() { return getToken(SqlParser.K_FAIL, 0); }
		public TerminalNode K_FOR() { return getToken(SqlParser.K_FOR, 0); }
		public TerminalNode K_FOREIGN() { return getToken(SqlParser.K_FOREIGN, 0); }
		public TerminalNode K_FROM() { return getToken(SqlParser.K_FROM, 0); }
		public TerminalNode K_FULL() { return getToken(SqlParser.K_FULL, 0); }
		public TerminalNode K_GLOB() { return getToken(SqlParser.K_GLOB, 0); }
		public TerminalNode K_GROUP() { return getToken(SqlParser.K_GROUP, 0); }
		public TerminalNode K_HAVING() { return getToken(SqlParser.K_HAVING, 0); }
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_IGNORE() { return getToken(SqlParser.K_IGNORE, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SqlParser.K_IMMEDIATE, 0); }
		public TerminalNode K_IN() { return getToken(SqlParser.K_IN, 0); }
		public TerminalNode K_INDEX() { return getToken(SqlParser.K_INDEX, 0); }
		public TerminalNode K_INDEXED() { return getToken(SqlParser.K_INDEXED, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SqlParser.K_INITIALLY, 0); }
		public TerminalNode K_INNER() { return getToken(SqlParser.K_INNER, 0); }
		public TerminalNode K_INSERT() { return getToken(SqlParser.K_INSERT, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SqlParser.K_INSTEAD, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SqlParser.K_INTERSECT, 0); }
		public TerminalNode K_INTO() { return getToken(SqlParser.K_INTO, 0); }
		public TerminalNode K_IS() { return getToken(SqlParser.K_IS, 0); }
		public TerminalNode K_ISNULL() { return getToken(SqlParser.K_ISNULL, 0); }
		public TerminalNode K_JOIN() { return getToken(SqlParser.K_JOIN, 0); }
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public TerminalNode K_LEFT() { return getToken(SqlParser.K_LEFT, 0); }
		public TerminalNode K_LIKE() { return getToken(SqlParser.K_LIKE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public TerminalNode K_MATCH() { return getToken(SqlParser.K_MATCH, 0); }
		public TerminalNode K_NATURAL() { return getToken(SqlParser.K_NATURAL, 0); }
		public TerminalNode K_NO() { return getToken(SqlParser.K_NO, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SqlParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SqlParser.K_NULL, 0); }
		public TerminalNode K_OF() { return getToken(SqlParser.K_OF, 0); }
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public TerminalNode K_ON() { return getToken(SqlParser.K_ON, 0); }
		public TerminalNode K_OR() { return getToken(SqlParser.K_OR, 0); }
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_OUTER() { return getToken(SqlParser.K_OUTER, 0); }
		public TerminalNode K_PLAN() { return getToken(SqlParser.K_PLAN, 0); }
		public TerminalNode K_PRAGMA() { return getToken(SqlParser.K_PRAGMA, 0); }
		public TerminalNode K_PRIMARY() { return getToken(SqlParser.K_PRIMARY, 0); }
		public TerminalNode K_QUERY() { return getToken(SqlParser.K_QUERY, 0); }
		public TerminalNode K_RAISE() { return getToken(SqlParser.K_RAISE, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(SqlParser.K_RECURSIVE, 0); }
		public TerminalNode K_REFERENCES() { return getToken(SqlParser.K_REFERENCES, 0); }
		public TerminalNode K_REGEXP() { return getToken(SqlParser.K_REGEXP, 0); }
		public TerminalNode K_REINDEX() { return getToken(SqlParser.K_REINDEX, 0); }
		public TerminalNode K_RELEASE() { return getToken(SqlParser.K_RELEASE, 0); }
		public TerminalNode K_RENAME() { return getToken(SqlParser.K_RENAME, 0); }
		public TerminalNode K_REPLACE() { return getToken(SqlParser.K_REPLACE, 0); }
		public TerminalNode K_RESTRICT() { return getToken(SqlParser.K_RESTRICT, 0); }
		public TerminalNode K_RIGHT() { return getToken(SqlParser.K_RIGHT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_ROW() { return getToken(SqlParser.K_ROW, 0); }
		public TerminalNode K_SAVEPOINT() { return getToken(SqlParser.K_SAVEPOINT, 0); }
		public TerminalNode K_SELECT() { return getToken(SqlParser.K_SELECT, 0); }
		public TerminalNode K_SET() { return getToken(SqlParser.K_SET, 0); }
		public TerminalNode K_TABLE() { return getToken(SqlParser.K_TABLE, 0); }
		public TerminalNode K_TEMP() { return getToken(SqlParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SqlParser.K_TEMPORARY, 0); }
		public TerminalNode K_THEN() { return getToken(SqlParser.K_THEN, 0); }
		public TerminalNode K_TO() { return getToken(SqlParser.K_TO, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SqlParser.K_TRANSACTION, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SqlParser.K_TRIGGER, 0); }
		public TerminalNode K_UNION() { return getToken(SqlParser.K_UNION, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SqlParser.K_UNIQUE, 0); }
		public TerminalNode K_UPDATE() { return getToken(SqlParser.K_UPDATE, 0); }
		public TerminalNode K_USING() { return getToken(SqlParser.K_USING, 0); }
		public TerminalNode K_VACUUM() { return getToken(SqlParser.K_VACUUM, 0); }
		public TerminalNode K_VALUES() { return getToken(SqlParser.K_VALUES, 0); }
		public TerminalNode K_VIEW() { return getToken(SqlParser.K_VIEW, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SqlParser.K_VIRTUAL, 0); }
		public TerminalNode K_WHEN() { return getToken(SqlParser.K_WHEN, 0); }
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public TerminalNode K_WITH() { return getToken(SqlParser.K_WITH, 0); }
		public TerminalNode K_WITHOUT() { return getToken(SqlParser.K_WITHOUT, 0); }
		public TerminalNode K_NEXTVAL() { return getToken(SqlParser.K_NEXTVAL, 0); }
		public TerminalNode K_TRUE() { return getToken(SqlParser.K_TRUE, 0); }
		public TerminalNode K_FALSE() { return getToken(SqlParser.K_FALSE, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_FALSE - 128)))) != 0)) ) {
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

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			any_name();
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

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_any_name);
		try {
			setState(757);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(750);
				match(IDENTIFIER);
				}
				break;
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_ATTACH:
			case K_AUTOINCREMENT:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BY:
			case K_CASCADE:
			case K_CASE:
			case K_CAST:
			case K_CHECK:
			case K_COLLATE:
			case K_COLUMN:
			case K_COMMIT:
			case K_CONFLICT:
			case K_CONSTRAINT:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DELETE:
			case K_DESC:
			case K_DETACH:
			case K_DISTINCT:
			case K_DROP:
			case K_EACH:
			case K_ELSE:
			case K_END:
			case K_ENABLE:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXCLUSIVE:
			case K_EXISTS:
			case K_EXPLAIN:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IMMEDIATE:
			case K_IN:
			case K_INDEX:
			case K_INDEXED:
			case K_INITIALLY:
			case K_INNER:
			case K_INSERT:
			case K_INSTEAD:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NEXTVAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PLAN:
			case K_PRAGMA:
			case K_PRIMARY:
			case K_QUERY:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REFERENCES:
			case K_REGEXP:
			case K_REINDEX:
			case K_RELEASE:
			case K_RENAME:
			case K_REPLACE:
			case K_RESTRICT:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_ROW:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TO:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_VACUUM:
			case K_VALUES:
			case K_VIEW:
			case K_VIRTUAL:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_WITHOUT:
			case K_TRUE:
			case K_FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(751);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(752);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(753);
				match(OPEN_PAR);
				setState(754);
				any_name();
				setState(755);
				match(CLOSE_PAR);
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

	public static class Any_name_no_keywordContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Any_name_no_keywordContext any_name_no_keyword() {
			return getRuleContext(Any_name_no_keywordContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Any_name_no_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name_no_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAny_name_no_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAny_name_no_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAny_name_no_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_name_no_keywordContext any_name_no_keyword() throws RecognitionException {
		Any_name_no_keywordContext _localctx = new Any_name_no_keywordContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_any_name_no_keyword);
		try {
			setState(765);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(759);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(760);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(761);
				match(OPEN_PAR);
				setState(762);
				any_name_no_keyword();
				setState(763);
				match(CLOSE_PAR);
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

	public static class Var_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public Var_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterVar_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitVar_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitVar_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_nameContext var_name() throws RecognitionException {
		Var_nameContext _localctx = new Var_nameContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_var_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			match(IDENTIFIER);
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
		case 61:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 6);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00c4\u0304\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\2\7\2"+
		"\u0090\n\2\f\2\16\2\u0093\13\2\3\2\3\2\3\3\3\3\3\3\3\4\7\4\u009b\n\4\f"+
		"\4\16\4\u009e\13\4\3\4\3\4\6\4\u00a2\n\4\r\4\16\4\u00a3\3\4\7\4\u00a7"+
		"\n\4\f\4\16\4\u00aa\13\4\3\4\7\4\u00ad\n\4\f\4\16\4\u00b0\13\4\3\5\6\5"+
		"\u00b3\n\5\r\5\16\5\u00b4\3\6\3\6\3\6\5\6\u00ba\n\6\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\7\b\u00c5\n\b\f\b\16\b\u00c8\13\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u00d2\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00db\n\t"+
		"\f\t\16\t\u00de\13\t\3\t\3\t\5\t\u00e2\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00f4\n\n\f\n\16\n\u00f7\13\n"+
		"\3\n\3\n\3\n\5\n\u00fc\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\5\17\u010a\n\17\3\17\3\17\3\17\3\17\5\17\u0110\n\17\7\17"+
		"\u0112\n\17\f\17\16\17\u0115\13\17\3\17\3\17\3\17\7\17\u011a\n\17\f\17"+
		"\16\17\u011d\13\17\3\17\5\17\u0120\n\17\3\17\3\17\3\17\5\17\u0125\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u012f\n\20\f\20\16\20\u0132"+
		"\13\20\3\21\3\21\3\21\3\21\7\21\u0138\n\21\f\21\16\21\u013b\13\21\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u014a"+
		"\n\25\3\26\3\26\3\26\3\26\7\26\u0150\n\26\f\26\16\26\u0153\13\26\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\5\32\u0161\n\32"+
		"\3\32\3\32\5\32\u0165\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\5\34\u0170\n\34\3\35\3\35\3\35\5\35\u0175\n\35\3\35\3\35\3\36\3\36\3"+
		"\37\3\37\3 \3 \3!\3!\3!\3!\7!\u0183\n!\f!\16!\u0186\13!\3!\3!\3\"\3\""+
		"\3\"\3#\3#\3#\7#\u0190\n#\f#\16#\u0193\13#\3#\3#\3$\3$\3$\3$\3%\3%\3%"+
		"\7%\u019e\n%\f%\16%\u01a1\13%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\7\'\u01af\n\'\f\'\16\'\u01b2\13\'\3\'\3\'\7\'\u01b6\n\'\f\'\16\'\u01b9"+
		"\13\'\5\'\u01bb\n\'\3\'\3\'\3\'\7\'\u01c0\n\'\f\'\16\'\u01c3\13\'\5\'"+
		"\u01c5\n\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\7)\u01d2\n)\f)\16)\u01d5"+
		"\13)\5)\u01d7\n)\3)\3)\3*\3*\5*\u01dd\n*\3+\3+\3+\3+\3+\3+\3+\3+\3,\3"+
		",\3-\3-\3-\7-\u01ec\n-\f-\16-\u01ef\13-\3-\3-\3.\5.\u01f4\n.\3.\3.\3."+
		"\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\5\65"+
		"\u0215\n\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\5\66\u0220\n"+
		"\66\3\66\3\66\5\66\u0224\n\66\3\67\3\67\3\67\3\67\7\67\u022a\n\67\f\67"+
		"\16\67\u022d\13\67\3\67\3\67\5\67\u0231\n\67\38\38\38\39\39\79\u0238\n"+
		"9\f9\169\u023b\139\39\39\3:\3:\3:\3:\5:\u0243\n:\3:\7:\u0246\n:\f:\16"+
		":\u0249\13:\3:\3:\3:\3:\3:\5:\u0250\n:\3:\7:\u0253\n:\f:\16:\u0256\13"+
		":\3:\3:\5:\u025a\n:\3;\3;\3;\3;\3;\3;\7;\u0262\n;\f;\16;\u0265\13;\3;"+
		"\3;\3;\7;\u026a\n;\f;\16;\u026d\13;\3;\5;\u0270\n;\3;\5;\u0273\n;\3;\3"+
		";\3<\3<\3<\3<\7<\u027b\n<\f<\16<\u027e\13<\3<\3<\3<\3=\3=\3=\3=\3=\3="+
		"\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0293\n=\3>\3>\5>\u0297\n>\3>\3>\3?"+
		"\3?\3?\3?\3?\7?\u02a0\n?\f?\16?\u02a3\13?\5?\u02a5\n?\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u02b6\n?\3?\3?\3?\7?\u02bb\n?\f?\16?\u02be"+
		"\13?\3?\5?\u02c1\n?\3?\3?\5?\u02c5\n?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\7?\u02dc\n?\f?\16?\u02df\13?\3@\3@\3@"+
		"\3@\3@\3@\3@\3@\5@\u02e9\n@\3A\3A\3B\3B\3C\3C\3D\3D\3D\3D\3D\3D\3D\5D"+
		"\u02f8\nD\3E\3E\3E\3E\3E\3E\5E\u0300\nE\3F\3F\3F\2\3|G\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\2\16\6\2\23\23\'*mm"+
		"{{\3\2\4\6\4\2\27\27\32\32\7\2\25\25\30\30\33\34  \"\"\5\2\24\24\37\37"+
		"!!\4\2\26\26\31\31\3\2#$\3\2\'*\5\2\23\23+,..\3\2\u00b9\u00ba\6\2\26\26"+
		"\31\31\35\35\u0081\u0081\b\2\60X[\u0086\u0088\u008a\u008c\u009f\u00a1"+
		"\u00af\u00b6\u00ba\2\u032a\2\u0091\3\2\2\2\4\u0096\3\2\2\2\6\u009c\3\2"+
		"\2\2\b\u00b2\3\2\2\2\n\u00b9\3\2\2\2\f\u00bb\3\2\2\2\16\u00bd\3\2\2\2"+
		"\20\u00d3\3\2\2\2\22\u00e3\3\2\2\2\24\u00fd\3\2\2\2\26\u00ff\3\2\2\2\30"+
		"\u0101\3\2\2\2\32\u0103\3\2\2\2\34\u0105\3\2\2\2\36\u0126\3\2\2\2 \u0133"+
		"\3\2\2\2\"\u013c\3\2\2\2$\u0140\3\2\2\2&\u0142\3\2\2\2(\u0149\3\2\2\2"+
		"*\u014b\3\2\2\2,\u0156\3\2\2\2.\u0158\3\2\2\2\60\u015a\3\2\2\2\62\u0164"+
		"\3\2\2\2\64\u0166\3\2\2\2\66\u016c\3\2\2\28\u0174\3\2\2\2:\u0178\3\2\2"+
		"\2<\u017a\3\2\2\2>\u017c\3\2\2\2@\u017e\3\2\2\2B\u0189\3\2\2\2D\u018c"+
		"\3\2\2\2F\u0196\3\2\2\2H\u019a\3\2\2\2J\u01a4\3\2\2\2L\u01a8\3\2\2\2N"+
		"\u01c8\3\2\2\2P\u01cd\3\2\2\2R\u01dc\3\2\2\2T\u01de\3\2\2\2V\u01e6\3\2"+
		"\2\2X\u01e8\3\2\2\2Z\u01f3\3\2\2\2\\\u01f8\3\2\2\2^\u01fb\3\2\2\2`\u0201"+
		"\3\2\2\2b\u0204\3\2\2\2d\u0207\3\2\2\2f\u020c\3\2\2\2h\u020f\3\2\2\2j"+
		"\u0223\3\2\2\2l\u0225\3\2\2\2n\u0232\3\2\2\2p\u0235\3\2\2\2r\u0259\3\2"+
		"\2\2t\u025b\3\2\2\2v\u0276\3\2\2\2x\u0292\3\2\2\2z\u0294\3\2\2\2|\u02c4"+
		"\3\2\2\2~\u02e8\3\2\2\2\u0080\u02ea\3\2\2\2\u0082\u02ec\3\2\2\2\u0084"+
		"\u02ee\3\2\2\2\u0086\u02f7\3\2\2\2\u0088\u02ff\3\2\2\2\u008a\u0301\3\2"+
		"\2\2\u008c\u0090\5\6\4\2\u008d\u0090\5\b\5\2\u008e\u0090\5\4\3\2\u008f"+
		"\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2"+
		"\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0094\u0095\7\2\2\3\u0095\3\3\2\2\2\u0096\u0097\7\u00c4"+
		"\2\2\u0097\u0098\b\3\1\2\u0098\5\3\2\2\2\u0099\u009b\7\f\2\2\u009a\u0099"+
		"\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a8\5\n\6\2\u00a0\u00a2\7\f"+
		"\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\5\n\6\2\u00a6\u00a1\3\2"+
		"\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00ae\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ad\7\f\2\2\u00ac\u00ab\3\2"+
		"\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\7\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b3\5\f\7\2\u00b2\u00b1\3\2\2\2"+
		"\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\t\3"+
		"\2\2\2\u00b6\u00ba\5\16\b\2\u00b7\u00ba\5\20\t\2\u00b8\u00ba\5\22\n\2"+
		"\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\13"+
		"\3\2\2\2\u00bb\u00bc\5X-\2\u00bc\r\3\2\2\2\u00bd\u00be\7I\2\2\u00be\u00bf"+
		"\7\u009f\2\2\u00bf\u00c0\5,\27\2\u00c0\u00c1\7\16\2\2\u00c1\u00c6\5\60"+
		"\31\2\u00c2\u00c3\7\22\2\2\u00c3\u00c5\5\60\31\2\u00c4\u00c2\3\2\2\2\u00c5"+
		"\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2"+
		"\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7\17\2\2\u00ca\u00cb\7\u00a0\2\2"+
		"\u00cb\u00cc\7\23\2\2\u00cc\u00cd\5> \2\u00cd\u00ce\7\u008b\2\2\u00ce"+
		"\u00cf\7\23\2\2\u00cf\u00d1\5<\37\2\u00d0\u00d2\7\f\2\2\u00d1\u00d0\3"+
		"\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\17\3\2\2\2\u00d3\u00d4\7I\2\2\u00d4\u00d5"+
		"\7\u00a0\2\2\u00d5\u00d6\5.\30\2\u00d6\u00d7\7\16\2\2\u00d7\u00dc\5\60"+
		"\31\2\u00d8\u00d9\7\22\2\2\u00d9\u00db\5\60\31\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2"+
		"\2\2\u00de\u00dc\3\2\2\2\u00df\u00e1\7\17\2\2\u00e0\u00e2\7\f\2\2\u00e1"+
		"\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\21\3\2\2\2\u00e3\u00e4\7I\2\2"+
		"\u00e4\u00e5\7\3\2\2\u00e5\u00e6\5\24\13\2\u00e6\u00e7\7\16\2\2\u00e7"+
		"\u00e8\5<\37\2\u00e8\u00e9\7\22\2\2\u00e9\u00ea\5\26\f\2\u00ea\u00eb\7"+
		"\22\2\2\u00eb\u00ec\5\30\r\2\u00ec\u00ed\7\22\2\2\u00ed\u00ee\5\32\16"+
		"\2\u00ee\u00ef\7\22\2\2\u00ef\u00f0\7\20\2\2\u00f0\u00f5\5.\30\2\u00f1"+
		"\u00f2\7\22\2\2\u00f2\u00f4\5.\30\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\3"+
		"\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f8\u00f9\7\21\2\2\u00f9\u00fb\7\17\2\2\u00fa\u00fc\7"+
		"\f\2\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\23\3\2\2\2\u00fd"+
		"\u00fe\7\u00bd\2\2\u00fe\25\3\2\2\2\u00ff\u0100\7\u00bd\2\2\u0100\27\3"+
		"\2\2\2\u0101\u0102\7\u00bd\2\2\u0102\31\3\2\2\2\u0103\u0104\5\u0088E\2"+
		"\u0104\33\3\2\2\2\u0105\u0109\7\u009d\2\2\u0106\u010a\5\64\33\2\u0107"+
		"\u010a\3\2\2\2\u0108\u010a\5\62\32\2\u0109\u0106\3\2\2\2\u0109\u0107\3"+
		"\2\2\2\u0109\u0108\3\2\2\2\u010a\u0113\3\2\2\2\u010b\u010f\7\22\2\2\u010c"+
		"\u0110\5\64\33\2\u010d\u0110\3\2\2\2\u010e\u0110\5\62\32\2\u010f\u010c"+
		"\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110\u0112\3\2\2\2\u0111"+
		"\u010b\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7e\2\2\u0117"+
		"\u011b\5\66\34\2\u0118\u011a\5\36\20\2\u0119\u0118\3\2\2\2\u011a\u011d"+
		"\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011f\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011e\u0120\5 \21\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120\u0124\3\2\2\2\u0121\u0122\7h\2\2\u0122\u0123\7?\2\2\u0123\u0125"+
		"\58\35\2\u0124\u0121\3\2\2\2\u0124\u0125\3\2\2\2\u0125\35\3\2\2\2\u0126"+
		"\u0127\7q\2\2\u0127\u0128\7x\2\2\u0128\u0129\5\66\34\2\u0129\u012a\7\u0086"+
		"\2\2\u012a\u012b\5&\24\2\u012b\u0130\3\2\2\2\u012c\u012d\7\67\2\2\u012d"+
		"\u012f\5&\24\2\u012e\u012c\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2"+
		"\2\2\u0130\u0131\3\2\2\2\u0131\37\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134"+
		"\7\u00b6\2\2\u0134\u0139\5\"\22\2\u0135\u0136\7\67\2\2\u0136\u0138\5\""+
		"\22\2\u0137\u0135\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a!\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\58\35\2"+
		"\u013d\u013e\5$\23\2\u013e\u013f\5(\25\2\u013f#\3\2\2\2\u0140\u0141\t"+
		"\2\2\2\u0141%\3\2\2\2\u0142\u0143\58\35\2\u0143\u0144\7\23\2\2\u0144\u0145"+
		"\58\35\2\u0145\'\3\2\2\2\u0146\u014a\5~@\2\u0147\u014a\5\u008aF\2\u0148"+
		"\u014a\5*\26\2\u0149\u0146\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u0148\3\2"+
		"\2\2\u014a)\3\2\2\2\u014b\u014c\7\16\2\2\u014c\u0151\5~@\2\u014d\u014e"+
		"\7\22\2\2\u014e\u0150\5~@\2\u014f\u014d\3\2\2\2\u0150\u0153\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2"+
		"\2\2\u0154\u0155\7\17\2\2\u0155+\3\2\2\2\u0156\u0157\5\u0088E\2\u0157"+
		"-\3\2\2\2\u0158\u0159\5\u0088E\2\u0159/\3\2\2\2\u015a\u015b\58\35\2\u015b"+
		"\u015c\5.\30\2\u015c\61\3\2\2\2\u015d\u015e\5,\27\2\u015e\u015f\7\r\2"+
		"\2\u015f\u0161\3\2\2\2\u0160\u015d\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162"+
		"\3\2\2\2\u0162\u0165\7\24\2\2\u0163\u0165\58\35\2\u0164\u0160\3\2\2\2"+
		"\u0164\u0163\3\2\2\2\u0165\63\3\2\2\2\u0166\u0167\5\24\13\2\u0167\u0168"+
		"\7\16\2\2\u0168\u0169\5\62\32\2\u0169\u016a\7\17\2\2\u016a\u016b\5\u0086"+
		"D\2\u016b\65\3\2\2\2\u016c\u016f\5,\27\2\u016d\u016e\78\2\2\u016e\u0170"+
		"\5:\36\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\67\3\2\2\2\u0171"+
		"\u0172\5,\27\2\u0172\u0173\7\r\2\2\u0173\u0175\3\2\2\2\u0174\u0171\3\2"+
		"\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\5\u0086D\2\u0177"+
		"9\3\2\2\2\u0178\u0179\5\u0086D\2\u0179;\3\2\2\2\u017a\u017b\7\u00bd\2"+
		"\2\u017b=\3\2\2\2\u017c\u017d\t\3\2\2\u017d?\3\2\2\2\u017e\u017f\7\u00bc"+
		"\2\2\u017f\u0184\7\u00bd\2\2\u0180\u0181\7\22\2\2\u0181\u0183\7\u00bd"+
		"\2\2\u0182\u0180\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0188\7\f"+
		"\2\2\u0188A\3\2\2\2\u0189\u018a\7\u00bc\2\2\u018a\u018b\5D#\2\u018bC\3"+
		"\2\2\2\u018c\u0191\5F$\2\u018d\u018e\7\22\2\2\u018e\u0190\5F$\2\u018f"+
		"\u018d\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2"+
		"\2\2\u0192\u0194\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0195\7\f\2\2\u0195"+
		"E\3\2\2\2\u0196\u0197\7\u00bd\2\2\u0197\u0198\7\23\2\2\u0198\u0199\5|"+
		"?\2\u0199G\3\2\2\2\u019a\u019f\5J&\2\u019b\u019c\7\22\2\2\u019c\u019e"+
		"\5J&\2\u019d\u019b\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a3\7\f"+
		"\2\2\u01a3I\3\2\2\2\u01a4\u01a5\7\u00bd\2\2\u01a5\u01a6\7\23\2\2\u01a6"+
		"\u01a7\5|?\2\u01a7K\3\2\2\2\u01a8\u01ba\7\16\2\2\u01a9\u01aa\7\u00bc\2"+
		"\2\u01aa\u01b0\7\u00bd\2\2\u01ab\u01ac\7\22\2\2\u01ac\u01ad\7\u00bc\2"+
		"\2\u01ad\u01af\7\u00bd\2\2\u01ae\u01ab\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0"+
		"\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b7\3\2\2\2\u01b2\u01b0\3\2"+
		"\2\2\u01b3\u01b4\7\22\2\2\u01b4\u01b6\5N(\2\u01b5\u01b3\3\2\2\2\u01b6"+
		"\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01bb\3\2"+
		"\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01a9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb"+
		"\u01c4\3\2\2\2\u01bc\u01c1\5N(\2\u01bd\u01be\7\22\2\2\u01be\u01c0\5N("+
		"\2\u01bf\u01bd\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2"+
		"\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01bc\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\7\17\2\2\u01c7M\3\2\2\2"+
		"\u01c8\u01c9\7\u00bc\2\2\u01c9\u01ca\7\u00bd\2\2\u01ca\u01cb\7\23\2\2"+
		"\u01cb\u01cc\5|?\2\u01ccO\3\2\2\2\u01cd\u01d6\7\16\2\2\u01ce\u01d3\5R"+
		"*\2\u01cf\u01d0\7\22\2\2\u01d0\u01d2\5R*\2\u01d1\u01cf\3\2\2\2\u01d2\u01d5"+
		"\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5"+
		"\u01d3\3\2\2\2\u01d6\u01ce\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\3\2"+
		"\2\2\u01d8\u01d9\7\7\2\2\u01d9Q\3\2\2\2\u01da\u01dd\5T+\2\u01db\u01dd"+
		"\5|?\2\u01dc\u01da\3\2\2\2\u01dc\u01db\3\2\2\2\u01ddS\3\2\2\2\u01de\u01df"+
		"\7\u00bb\2\2\u01df\u01e0\5L\'\2\u01e0\u01e1\7\b\2\2\u01e1\u01e2\7Y\2\2"+
		"\u01e2\u01e3\5|?\2\u01e3\u01e4\7\f\2\2\u01e4\u01e5\7\t\2\2\u01e5U\3\2"+
		"\2\2\u01e6\u01e7\5\u0088E\2\u01e7W\3\2\2\2\u01e8\u01e9\5Z.\2\u01e9\u01ed"+
		"\7\b\2\2\u01ea\u01ec\5x=\2\u01eb\u01ea\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed"+
		"\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f0\3\2\2\2\u01ef\u01ed\3\2"+
		"\2\2\u01f0\u01f1\7\t\2\2\u01f1Y\3\2\2\2\u01f2\u01f4\7\u00bb\2\2\u01f3"+
		"\u01f2\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\5V"+
		",\2\u01f6\u01f7\5L\'\2\u01f7[\3\2\2\2\u01f8\u01f9\5V,\2\u01f9\u01fa\5"+
		"P)\2\u01fa]\3\2\2\2\u01fb\u01fc\7\u00b3\2\2\u01fc\u01fd\7\16\2\2\u01fd"+
		"\u01fe\5|?\2\u01fe\u01ff\7\17\2\2\u01ff\u0200\7\f\2\2\u0200_\3\2\2\2\u0201"+
		"\u0202\5b\62\2\u0202\u0203\5p9\2\u0203a\3\2\2\2\u0204\u0205\7\u00b1\2"+
		"\2\u0205\u0206\5r:\2\u0206c\3\2\2\2\u0207\u0208\7\u00b0\2\2\u0208\u0209"+
		"\5p9\2\u0209\u020a\5b\62\2\u020a\u020b\7\f\2\2\u020be\3\2\2\2\u020c\u020d"+
		"\5h\65\2\u020d\u020e\5p9\2\u020eg\3\2\2\2\u020f\u0210\7c\2\2\u0210\u0214"+
		"\7\16\2\2\u0211\u0212\7\u00bc\2\2\u0212\u0215\5D#\2\u0213\u0215\5H%\2"+
		"\u0214\u0211\3\2\2\2\u0214\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217"+
		"\5r:\2\u0217\u0218\7\f\2\2\u0218\u0219\5j\66\2\u0219\u021a\7\17\2\2\u021a"+
		"i\3\2\2\2\u021b\u021f\5\u0088E\2\u021c\u0220\t\4\2\2\u021d\u021e\t\5\2"+
		"\2\u021e\u0220\5|?\2\u021f\u021c\3\2\2\2\u021f\u021d\3\2\2\2\u0220\u0224"+
		"\3\2\2\2\u0221\u0222\t\4\2\2\u0222\u0224\5\u0088E\2\u0223\u021b\3\2\2"+
		"\2\u0223\u0221\3\2\2\2\u0224k\3\2\2\2\u0225\u0226\7j\2\2\u0226\u022b\5"+
		"n8\2\u0227\u0228\7Z\2\2\u0228\u022a\5n8\2\u0229\u0227\3\2\2\2\u022a\u022d"+
		"\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u0230\3\2\2\2\u022d"+
		"\u022b\3\2\2\2\u022e\u022f\7X\2\2\u022f\u0231\5p9\2\u0230\u022e\3\2\2"+
		"\2\u0230\u0231\3\2\2\2\u0231m\3\2\2\2\u0232\u0233\5r:\2\u0233\u0234\5"+
		"p9\2\u0234o\3\2\2\2\u0235\u0239\7\b\2\2\u0236\u0238\5x=\2\u0237\u0236"+
		"\3\2\2\2\u0238\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a"+
		"\u023c\3\2\2\2\u023b\u0239\3\2\2\2\u023c\u023d\7\t\2\2\u023dq\3\2\2\2"+
		"\u023e\u0247\5|?\2\u023f\u0243\7\n\2\2\u0240\u0243\3\2\2\2\u0241\u0243"+
		"\7\36\2\2\u0242\u023f\3\2\2\2\u0242\u0240\3\2\2\2\u0242\u0241\3\2\2\2"+
		"\u0243\u0244\3\2\2\2\u0244\u0246\5|?\2\u0245\u0242\3\2\2\2\u0246\u0249"+
		"\3\2\2\2\u0247\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u025a\3\2\2\2\u0249"+
		"\u0247\3\2\2\2\u024a\u024b\7\16\2\2\u024b\u0254\5|?\2\u024c\u0250\7\n"+
		"\2\2\u024d\u0250\3\2\2\2\u024e\u0250\7\36\2\2\u024f\u024c\3\2\2\2\u024f"+
		"\u024d\3\2\2\2\u024f\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0253\5|"+
		"?\2\u0252\u024f\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0254"+
		"\u0255\3\2\2\2\u0255\u0257\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u0258\7\17"+
		"\2\2\u0258\u025a\3\2\2\2\u0259\u023e\3\2\2\2\u0259\u024a\3\2\2\2\u025a"+
		"s\3\2\2\2\u025b\u025c\7\u00b2\2\2\u025c\u025d\7\16\2\2\u025d\u025e\7\u00bd"+
		"\2\2\u025e\u025f\7\17\2\2\u025f\u0263\7\b\2\2\u0260\u0262\5v<\2\u0261"+
		"\u0260\3\2\2\2\u0262\u0265\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2"+
		"\2\2\u0264\u0272\3\2\2\2\u0265\u0263\3\2\2\2\u0266\u0267\7O\2\2\u0267"+
		"\u026b\7\13\2\2\u0268\u026a\5x=\2\u0269\u0268\3\2\2\2\u026a\u026d\3\2"+
		"\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026f\3\2\2\2\u026d"+
		"\u026b\3\2\2\2\u026e\u0270\7\u00b4\2\2\u026f\u026e\3\2\2\2\u026f\u0270"+
		"\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0273\7\f\2\2\u0272\u0266\3\2\2\2\u0272"+
		"\u0273\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\7\t\2\2\u0275u\3\2\2\2"+
		"\u0276\u0277\7A\2\2\u0277\u0278\5|?\2\u0278\u027c\7\13\2\2\u0279\u027b"+
		"\5x=\2\u027a\u0279\3\2\2\2\u027b\u027e\3\2\2\2\u027c\u027a\3\2\2\2\u027c"+
		"\u027d\3\2\2\2\u027d\u027f\3\2\2\2\u027e\u027c\3\2\2\2\u027f\u0280\7\u00b4"+
		"\2\2\u0280\u0281\7\f\2\2\u0281w\3\2\2\2\u0282\u0293\5B\"\2\u0283\u0293"+
		"\5@!\2\u0284\u0293\5H%\2\u0285\u0286\5j\66\2\u0286\u0287\7\f\2\2\u0287"+
		"\u0293\3\2\2\2\u0288\u0293\5t;\2\u0289\u0293\5\\/\2\u028a\u0293\5l\67"+
		"\2\u028b\u0293\5f\64\2\u028c\u0293\5`\61\2\u028d\u0293\5d\63\2\u028e\u0293"+
		"\5^\60\2\u028f\u0290\7\u00b4\2\2\u0290\u0293\7\f\2\2\u0291\u0293\5z>\2"+
		"\u0292\u0282\3\2\2\2\u0292\u0283\3\2\2\2\u0292\u0284\3\2\2\2\u0292\u0285"+
		"\3\2\2\2\u0292\u0288\3\2\2\2\u0292\u0289\3\2\2\2\u0292\u028a\3\2\2\2\u0292"+
		"\u028b\3\2\2\2\u0292\u028c\3\2\2\2\u0292\u028d\3\2\2\2\u0292\u028e\3\2"+
		"\2\2\u0292\u028f\3\2\2\2\u0292\u0291\3\2\2\2\u0293y\3\2\2\2\u0294\u0296"+
		"\7Y\2\2\u0295\u0297\5|?\2\u0296\u0295\3\2\2\2\u0296\u0297\3\2\2\2\u0297"+
		"\u0298\3\2\2\2\u0298\u0299\7\f\2\2\u0299{\3\2\2\2\u029a\u029b\b?\1\2\u029b"+
		"\u02a4\7\20\2\2\u029c\u02a1\5|?\2\u029d\u029e\7\22\2\2\u029e\u02a0\5|"+
		"?\2\u029f\u029d\3\2\2\2\u02a0\u02a3\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1"+
		"\u02a2\3\2\2\2\u02a2\u02a5\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a4\u029c\3\2"+
		"\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02c5\7\21\2\2\u02a7"+
		"\u02a8\7\16\2\2\u02a8\u02a9\5|?\2\u02a9\u02aa\7\17\2\2\u02aa\u02c5\3\2"+
		"\2\2\u02ab\u02c5\5\34\17\2\u02ac\u02c5\5~@\2\u02ad\u02c5\7\u00bf\2\2\u02ae"+
		"\u02c5\5\u008aF\2\u02af\u02b0\5\u0080A\2\u02b0\u02b1\5|?\t\u02b1\u02c5"+
		"\3\2\2\2\u02b2\u02b3\5\u0084C\2\u02b3\u02c0\7\16\2\2\u02b4\u02b6\7U\2"+
		"\2\u02b5\u02b4\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02bc"+
		"\5|?\2\u02b8\u02b9\7\22\2\2\u02b9\u02bb\5|?\2\u02ba\u02b8\3\2\2\2\u02bb"+
		"\u02be\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02c1\3\2"+
		"\2\2\u02be\u02bc\3\2\2\2\u02bf\u02c1\7\24\2\2\u02c0\u02b5\3\2\2\2\u02c0"+
		"\u02bf\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c3\7\17"+
		"\2\2\u02c3\u02c5\3\2\2\2\u02c4\u029a\3\2\2\2\u02c4\u02a7\3\2\2\2\u02c4"+
		"\u02ab\3\2\2\2\u02c4\u02ac\3\2\2\2\u02c4\u02ad\3\2\2\2\u02c4\u02ae\3\2"+
		"\2\2\u02c4\u02af\3\2\2\2\u02c4\u02b2\3\2\2\2\u02c5\u02dd\3\2\2\2\u02c6"+
		"\u02c7\f\16\2\2\u02c7\u02c8\7/\2\2\u02c8\u02c9\5|?\2\u02c9\u02ca\7\13"+
		"\2\2\u02ca\u02cb\5|?\17\u02cb\u02dc\3\2\2\2\u02cc\u02cd\f\b\2\2\u02cd"+
		"\u02ce\t\6\2\2\u02ce\u02dc\5|?\t\u02cf\u02d0\f\7\2\2\u02d0\u02d1\t\7\2"+
		"\2\u02d1\u02dc\5|?\b\u02d2\u02d3\f\6\2\2\u02d3\u02d4\t\b\2\2\u02d4\u02dc"+
		"\5|?\7\u02d5\u02d6\f\5\2\2\u02d6\u02d7\t\t\2\2\u02d7\u02dc\5|?\6\u02d8"+
		"\u02d9\f\4\2\2\u02d9\u02da\t\n\2\2\u02da\u02dc\5|?\5\u02db\u02c6\3\2\2"+
		"\2\u02db\u02cc\3\2\2\2\u02db\u02cf\3\2\2\2\u02db\u02d2\3\2\2\2\u02db\u02d5"+
		"\3\2\2\2\u02db\u02d8\3\2\2\2\u02dc\u02df\3\2\2\2\u02dd\u02db\3\2\2\2\u02dd"+
		"\u02de\3\2\2\2\u02de}\3\2\2\2\u02df\u02dd\3\2\2\2\u02e0\u02e9\7\u00be"+
		"\2\2\u02e1\u02e9\7\u00c0\2\2\u02e2\u02e9\t\13\2\2\u02e3\u02e9\7\u00c1"+
		"\2\2\u02e4\u02e9\7\u0083\2\2\u02e5\u02e9\7L\2\2\u02e6\u02e9\7K\2\2\u02e7"+
		"\u02e9\7M\2\2\u02e8\u02e0\3\2\2\2\u02e8\u02e1\3\2\2\2\u02e8\u02e2\3\2"+
		"\2\2\u02e8\u02e3\3\2\2\2\u02e8\u02e4\3\2\2\2\u02e8\u02e5\3\2\2\2\u02e8"+
		"\u02e6\3\2\2\2\u02e8\u02e7\3\2\2\2\u02e9\177\3\2\2\2\u02ea\u02eb\t\f\2"+
		"\2\u02eb\u0081\3\2\2\2\u02ec\u02ed\t\r\2\2\u02ed\u0083\3\2\2\2\u02ee\u02ef"+
		"\5\u0086D\2\u02ef\u0085\3\2\2\2\u02f0\u02f8\7\u00bd\2\2\u02f1\u02f8\5"+
		"\u0082B\2\u02f2\u02f8\7\u00c0\2\2\u02f3\u02f4\7\16\2\2\u02f4\u02f5\5\u0086"+
		"D\2\u02f5\u02f6\7\17\2\2\u02f6\u02f8\3\2\2\2\u02f7\u02f0\3\2\2\2\u02f7"+
		"\u02f1\3\2\2\2\u02f7\u02f2\3\2\2\2\u02f7\u02f3\3\2\2\2\u02f8\u0087\3\2"+
		"\2\2\u02f9\u0300\7\u00bd\2\2\u02fa\u0300\7\u00c0\2\2\u02fb\u02fc\7\16"+
		"\2\2\u02fc\u02fd\5\u0088E\2\u02fd\u02fe\7\17\2\2\u02fe\u0300\3\2\2\2\u02ff"+
		"\u02f9\3\2\2\2\u02ff\u02fa\3\2\2\2\u02ff\u02fb\3\2\2\2\u0300\u0089\3\2"+
		"\2\2\u0301\u0302\7\u00bd\2\2\u0302\u008b\3\2\2\2H\u008f\u0091\u009c\u00a3"+
		"\u00a8\u00ae\u00b4\u00b9\u00c6\u00d1\u00dc\u00e1\u00f5\u00fb\u0109\u010f"+
		"\u0113\u011b\u011f\u0124\u0130\u0139\u0149\u0151\u0160\u0164\u016f\u0174"+
		"\u0184\u0191\u019f\u01b0\u01b7\u01ba\u01c1\u01c4\u01d3\u01d6\u01dc\u01ed"+
		"\u01f3\u0214\u021f\u0223\u022b\u0230\u0239\u0242\u0247\u024f\u0254\u0259"+
		"\u0263\u026b\u026f\u0272\u027c\u0292\u0296\u02a1\u02a4\u02b5\u02bc\u02c0"+
		"\u02c4\u02db\u02dd\u02e8\u02f7\u02ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}