/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 by Bart Kiers
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 *
 * Project      : sqlite-parser; an ANTLR4 grammar for SQLite
 *                https://github.com/bkiers/sqlite-parser
 * Developed by : Bart Kiers, bart@big-o.nl
 */
grammar Sql;

parse
 : ( sql_stmt_list | java_stmt_list | error )* EOF
 ;

error
 : UNEXPECTED_CHAR
   {
     throw new RuntimeException("UNEXPECTED_CHAR=" + $UNEXPECTED_CHAR.text);
   }
 ;

sql_stmt_list
 : ';'* sql_stmt ( ';'+ sql_stmt )* ';'*
 ;

java_stmt_list
 :  (java_stmt)+
 ;

sql_stmt
    : create_table_stmt
    | create_type_stmt
    | create_Aggregation_function
    ;

java_stmt
  : function_java_rule
  ;

//SQL Role.....................

create_table_stmt
 : K_CREATE K_TABLE table_name '(' column_def ( ',' column_def )* ')' K_TYPE '=' type_file  K_PATH '=' path (';')?
 ;

create_type_stmt
 : K_CREATE K_TYPE type_name '(' column_def ( ',' column_def )* ')' (';')?
 ;

 create_Aggregation_function
 : K_CREATE 'aggregation_function' aggregation_function_name '(' path ',' aggregation_function_className
 ',' aggregation_function_methodName ',' aggregation_function_return_type ',' '[' type_name (',' type_name)* ']' ')' (';')?
 ;

aggregation_function_name
: IDENTIFIER
;

aggregation_function_className
: IDENTIFIER
;

aggregation_function_methodName
: IDENTIFIER
;

aggregation_function_return_type
: any_name_no_keyword
;

select_core
 : K_SELECT (result_column_with_aggregation_function || result_column)
               ( ',' (result_column_with_aggregation_function || result_column ) )*
   K_FROM ( table_or_subquery)
   (inner_join_stmt)*
   (where_stmt)?
   ( K_GROUP K_BY column_name)?
 ;

inner_join_stmt
: K_INNER K_JOIN table_or_subquery (K_ON join_condition) (K_AND join_condition)*
;

where_stmt
: K_WHERE whete_condition (K_AND whete_condition)*
;

whete_condition
:column_name query_condition_operations expr_query
;

query_condition_operations
:ASSIGN
|LT
|GT
|LT_EQ
|GT_EQ
|K_LIKE
|K_IN
;

expr_query
 : literal_value
 | var_name
 | list_literal_value
 ;

join_condition
:column_name ASSIGN column_name
;

 list_literal_value
 : '(' literal_value (',' literal_value)* ')'
 ;

table_name
  : any_name_no_keyword
  ;

type_name
 : any_name_no_keyword
 ;

column_def
 : column_name type_name
 ;

result_column
 : (table_name '.')?'*'
 | column_name
 ;
result_column_with_aggregation_function
: aggregation_function_name '(' result_column ')' any_name
;

table_or_subquery
 : table_name ( K_AS table_alias )?
 ;

column_name
 : (table_name '.')? any_name
 ;

table_alias
 : any_name
 ;


path
 : IDENTIFIER
 ;

type_file
 : '"json"'
 | '"xml"'
 | '"csv"'
 ;


//Java Role......................
declare_var_java_not_assignmen
  :
  K_VAR
  IDENTIFIER (','IDENTIFIER )*
  ';'
  ;

declare_var_java
  :
  K_VAR
  assignment_var_list_java
  ;

assignment_var_list_java
  :
  assignment_var_java (','assignment_var_java )*
  ';'
  ;

assignment_var_java
  :
  IDENTIFIER '=' (expr)
  ;

assignment_var_list_without_declare_java
  :
  assignment_var_without_declare_java (','assignment_var_without_declare_java )*
  ';'
  ;

assignment_var_without_declare_java
  :
  IDENTIFIER '=' (expr)
  ;


parameters_list
  :
  '('
  (
  (K_VAR IDENTIFIER  (','(K_VAR IDENTIFIER) )* (',' default_parameters)*)?
  (default_parameters (',' default_parameters)*)?
  )
  ')'
  ;

default_parameters
  : K_VAR IDENTIFIER '=' expr
  ;

arguments_list
  : '(' (argument (',' argument)*)? ');'
  ;

argument
  : (arrow_function_java | expr);

arrow_function_java
  : K_FUNCTION
  parameters_list
  '{'
  K_RETURN expr ';'
  '}'
  ;

function_java_name
  : any_name_no_keyword
  ;

function_java_rule
 : function_java_header
 '{'
 (java_body)*
 '}'
 ;

function_java_header
  : K_FUNCTION? function_java_name  parameters_list
  ;

function_java_call
  :  function_java_name arguments_list
  ;

print_java
  : K_PRINT '(' expr ')' ';'
  ;

while_java_rule
  : while_java_header
    body_brackets_java
  ;

while_java_header
  : K_WHILE
    condition_java
  ;

do_while_java_rule
  : K_DO //todo cheeck
  body_brackets_java
  while_java_header
  ';'
  ;

for_java_rule
  : for_java_header
  body_brackets_java
  ;

for_java_header
  :K_FOR '('
   (K_VAR assignment_var_list_java | assignment_var_list_without_declare_java)
   condition_java
   ';'
   shorten_operators_java
  ')'
  ;

shorten_operators_java
  : any_name_no_keyword (  ('++' | '--')   |   ('+=' | '-=' | '/=' | '^=' | '%=' | '*=') expr)
  | ('++' | '--') any_name_no_keyword
  ;

if_java_rule
  : K_IF if_basic_java_rule
    (K_ELSE_IF if_basic_java_rule)*
    (K_ELSE body_brackets_java)?
  ;

if_basic_java_rule
  : condition_java body_brackets_java
  ;

body_brackets_java
  : '{'
     (java_body)*
    '}'
  ;

//condition_java
//  : ('(')? expr (')')?
//  ;

condition_java
  :  expr   ( ('&&' || '||') (  expr  ))*
  | '(' expr   ( ('&&' || '||') (  expr  ))*  ')'
  ;

switch_stmt
: K_SWITCH
 '(' IDENTIFIER ')'
 '{'
    (switch_case)*
    (K_DEFAULT':'
     java_body*
     K_BREAK? ';')?

 '}'
 ;

switch_case
 : (
   K_CASE expr ':'
   java_body*
   K_BREAK ';'
   );

java_body
  :(declare_var_java)
  |(declare_var_java_not_assignmen)
  |(assignment_var_list_without_declare_java)
  |(shorten_operators_java ';')
  |(switch_stmt )
  |(function_java_call)
  |(if_java_rule)
  |(for_java_rule)
  |(while_java_rule)
  |(do_while_java_rule)
  |(print_java)
  | K_BREAK ';'
  | return_stmt
  ;

return_stmt
: K_RETURN (expr)? ';'
;

expr
 : '[' (expr (','expr)*)?']'
 | '(' expr ')'
 | expr '?' expr ':' expr
 | select_core
 | literal_value
 | BIND_PARAMETER
 | var_name
// | ( table_name '.' )? column_name
 | unary_operator expr
// | '('expr')' '||' | '&&' '(' expr ')'
 | expr ( '*' | '/' | '%' ) expr
 | expr ( '+' | '-' ) expr
 | expr ( '<<' | '>>') expr
 | expr ( '<' | '<=' | '>' | '>=' ) expr
 | expr ( '=' | '==' | '!=' | '<>') expr
 | function_name '(' ( K_DISTINCT? expr ( ',' expr )* | '*' )? ')'
 ;



literal_value
 : NUMERIC_LITERAL
 | STRING_LITERAL
 | (K_TRUE | K_FALSE)
 | BLOB_LITERAL
 | K_NULL
 | K_CURRENT_TIME
 | K_CURRENT_DATE
 | K_CURRENT_TIMESTAMP
 ;

unary_operator
 : '-'
 | '+'
 | '~'
 | K_NOT
 ;

keyword
 : K_ABORT
 | K_ACTION
 | K_ADD
 | K_AFTER
 | K_ALL
 | K_ALTER
 | K_ANALYZE
 | K_AND
 | K_AS
 | K_ASC
 | K_ATTACH
 | K_AUTOINCREMENT
 | K_BEFORE
 | K_BEGIN
 | K_BETWEEN
 | K_BY
 | K_CASCADE
 | K_CASE
 | K_CAST
 | K_CHECK
 | K_COLLATE
 | K_COLUMN
 | K_COMMIT
 | K_CONFLICT
 | K_CONSTRAINT
 | K_CREATE
 | K_CROSS
 | K_CURRENT_DATE
 | K_CURRENT_TIME
 | K_CURRENT_TIMESTAMP
 | K_DATABASE
 | K_DEFAULT
 | K_DEFERRABLE
 | K_DEFERRED
 | K_DELETE
 | K_DESC
 | K_DETACH
 | K_DISTINCT
 | K_DROP
 | K_EACH
 | K_ELSE
 | K_END
 | K_ENABLE
 | K_ESCAPE
 | K_EXCEPT
 | K_EXCLUSIVE
 | K_EXISTS
 | K_EXPLAIN
 | K_FAIL
 | K_FOR
 | K_FOREIGN
 | K_FROM
 | K_FULL
 | K_GLOB
 | K_GROUP
 | K_HAVING
 | K_IF
 | K_IGNORE
 | K_IMMEDIATE
 | K_IN
 | K_INDEX
 | K_INDEXED
 | K_INITIALLY
 | K_INNER
 | K_INSERT
 | K_INSTEAD
 | K_INTERSECT
 | K_INTO
 | K_IS
 | K_ISNULL
 | K_JOIN
 | K_KEY
 | K_LEFT
 | K_LIKE
 | K_LIMIT
 | K_MATCH
 | K_NATURAL
 | K_NO
 | K_NOT
 | K_NOTNULL
 | K_NULL
 | K_OF
 | K_OFFSET
 | K_ON
 | K_OR
 | K_ORDER
 | K_OUTER
 | K_PLAN
 | K_PRAGMA
 | K_PRIMARY
 | K_QUERY
 | K_RAISE
 | K_RECURSIVE
 | K_REFERENCES
 | K_REGEXP
 | K_REINDEX
 | K_RELEASE
 | K_RENAME
 | K_REPLACE
 | K_RESTRICT
 | K_RIGHT
 | K_ROLLBACK
 | K_ROW
 | K_SAVEPOINT
 | K_SELECT
 | K_SET
 | K_TABLE
 | K_TEMP
 | K_TEMPORARY
 | K_THEN
 | K_TO
 | K_TRANSACTION
 | K_TRIGGER
 | K_UNION
 | K_UNIQUE
 | K_UPDATE
 | K_USING
 | K_VACUUM
 | K_VALUES
 | K_VIEW
 | K_VIRTUAL
 | K_WHEN
 | K_WHERE
 | K_WITH
 | K_WITHOUT
 | K_NEXTVAL
 | K_TRUE
 | K_FALSE
 ;

// TODO check all names below

//[a-zA-Z_0-9\t \-\[\]\=]+

//unknown
// : .+
// ;

function_name
 : any_name
 ;

any_name
 : IDENTIFIER
 | keyword
 | STRING_LITERAL
 | '(' any_name ')'
 ;

any_name_no_keyword
 : IDENTIFIER
 | STRING_LITERAL
 | '(' any_name_no_keyword ')'
 ;

var_name
: IDENTIFIER
;

SCOL : ';';
DOT : '.';
OPEN_PAR : '(';
CLOSE_PAR : ')';
OPEN_BRAKET : '[';
CLOSE_BRAKET : ']';
COMMA : ',';
ASSIGN : '=';
STAR : '*';
STAR_ASSIGN : '*=';
PLUS : '+';
PLUS_PLUS : '++';
PLUS_ASSIGN : '+=';
MINUS : '-';
MINUS_MINUS : '--';
MINUS_ASSIGN : '-=';
POWER_ASSIGN : '^=';
TILDE : '~';
PIPE2 : '||';
DIV : '/';
DIV_ASSIGN : '/=';
MOD : '%';
MOD_ASSIGN : '%=';
LT2 : '<<';
GT2 : '>>';
AMP : '&';
PIPE : '|';
LT : '<';
LT_EQ : '<=';
GT : '>';
GT_EQ : '>=';
EQ : '==';
NOT_EQ1 : '!=';
NOT : '!';
NOT_EQ2 : '<>';
QUES : '?';

// http://www.sqlite.org/lang_keywords.html
K_ABORT : A B O R T;
K_ACTION : A C T I O N;
K_ADD : A D D;
K_AFTER : A F T E R;
K_ALL : A L L;
K_ALTER : A L T E R;
K_ANALYZE : A N A L Y Z E;
K_AND : A N D;
K_AS : A S;
K_ASC : A S C;
K_ATTACH : A T T A C H;
K_AUTOINCREMENT : A U T O I N C R E M E N T;
K_BEFORE : B E F O R E;
K_BEGIN : B E G I N;
K_BETWEEN : B E T W E E N;
K_BY : B Y;
K_CASCADE : C A S C A D E;
K_CASE : C A S E;
K_CAST : C A S T;
K_CHECK : C H E C K;
K_COLLATE : C O L L A T E;
K_COLUMN : C O L U M N;
K_COMMIT : C O M M I T;
K_CONFLICT : C O N F L I C T;
K_CONSTRAINT : C O N S T R A I N T;
K_CREATE : C R E A T E;
K_CROSS : C R O S S;
K_CURRENT_DATE : C U R R E N T '_' D A T E;
K_CURRENT_TIME : C U R R E N T '_' T I M E;
K_CURRENT_TIMESTAMP : C U R R E N T '_' T I M E S T A M P;
K_DATABASE : D A T A B A S E;
K_DEFAULT : D E F A U L T;
K_DEFERRABLE : D E F E R R A B L E;
K_DEFERRED : D E F E R R E D;
K_DELETE : D E L E T E;
K_DESC : D E S C;
K_DETACH : D E T A C H;
K_DISTINCT : D I S T I N C T;
K_DROP : D R O P;
K_EACH : E A C H;
K_ELSE : E L S E;
K_RETURN: R E T U R N;
K_ELSE_IF : E L S E SPACES I F;
K_END : E N D;
K_ENABLE : E N A B L E;
K_ESCAPE : E S C A P E;
K_EXCEPT : E X C E P T;
K_EXCLUSIVE : E X C L U S I V E;
K_EXISTS : E X I S T S;
K_EXPLAIN : E X P L A I N;
K_FAIL : F A I L;
K_FOR : F O R;
K_FOREIGN : F O R E I G N;
K_FROM : F R O M;
K_FULL : F U L L;
K_GLOB : G L O B;
K_GROUP : G R O U P;
K_HAVING : H A V I N G;
K_IF : I F;
K_IGNORE : I G N O R E;
K_IMMEDIATE : I M M E D I A T E;
K_IN : I N;
K_INDEX : I N D E X;
K_INDEXED : I N D E X E D;
K_INITIALLY : I N I T I A L L Y;
K_INNER : I N N E R;
K_INSERT : I N S E R T;
K_INSTEAD : I N S T E A D;
K_INTERSECT : I N T E R S E C T;
K_INTO : I N T O;
K_IS : I S;
K_ISNULL : I S N U L L;
K_JOIN : J O I N;
K_KEY : K E Y;
K_LEFT : L E F T;
K_LIKE : L I K E;
K_LIMIT : L I M I T;
K_MATCH : M A T C H;
K_NATURAL : N A T U R A L;
K_NEXTVAL : N E X T V A L;
K_NO : N O;
K_NOT : N O T;
K_NOTNULL : N O T N U L L;
K_NULL : N U L L;
K_OF : O F;
K_OFFSET : O F F S E T;
K_ON : O N;
K_ONLY : O N L Y;
K_OR : O R;
K_ORDER : O R D E R;
K_OUTER : O U T E R;
K_PATH : P A T H;
K_PLAN : P L A N;
K_PRAGMA : P R A G M A;
K_PRIMARY : P R I M A R Y;
K_QUERY : Q U E R Y;
K_RAISE : R A I S E;
K_RECURSIVE : R E C U R S I V E;
K_REFERENCES : R E F E R E N C E S;
K_REGEXP : R E G E X P;
K_REINDEX : R E I N D E X;
K_RELEASE : R E L E A S E;
K_RENAME : R E N A M E;
K_REPLACE : R E P L A C E;
K_RESTRICT : R E S T R I C T;
K_RIGHT : R I G H T;
K_ROLLBACK : R O L L B A C K;
K_ROW : R O W;
K_SAVEPOINT : S A V E P O I N T;
K_SELECT : S E L E C T;
K_SET : S E T;
K_TABLE : T A B L E;
K_TYPE : T Y P E;
K_TEMP : T E M P;
K_TEMPORARY : T E M P O R A R Y;
K_THEN : T H E N;
K_TO : T O;
K_TRANSACTION : T R A N S A C T I O N;
K_TRIGGER : T R I G G E R;
K_UNION : U N I O N;
K_UNIQUE : U N I Q U E;
K_UPDATE : U P D A T E;
K_USING : U S I N G;
K_VACUUM : V A C U U M;
K_VALUES : V A L U E S;
K_VIEW : V I E W;
K_VIRTUAL : V I R T U A L;
K_WHEN : W H E N;
K_DO: D O;
K_WHILE : W H I L E;
K_SWITCH: S W I T C H;
K_PRINT: P R I N T;
K_BREAK: B R E A K;
K_CONTINUE: C O N T I N U E;
K_WHERE : W H E R E;
K_WITH : W I T H;
K_WITHOUT : W I T H O U T;
K_TRUE : T R U E;
K_FALSE : F A L S E;
K_FUNCTION: F U N C T I O N;
K_VAR: V A R;

IDENTIFIER
 : '"' (~'"' | '""')* '"'
 | '`' (~'`' | '``')* '`'
// | '[' ~']'* ']'
 | [a-zA-Z_] [a-zA-Z_0-9]* // TODO check: needs more chars in set
 ;


//NUMBER
// : DIGIT+ ( '.' DIGIT* )?
// ;

NUMERIC_LITERAL
 : DIGIT+ ( '.' DIGIT* )? ( E [-+]? DIGIT+ )?
 | '.' DIGIT+ ( E [-+]? DIGIT+ )?
 ;



BIND_PARAMETER
 : '?' DIGIT*
// | [:@$] IDENTIFIER todo don't forget
 ;

STRING_LITERAL
 : '\'' ( ~'\'' | '\'\'' )* '\''
 ;

BLOB_LITERAL
 : X STRING_LITERAL
 ;



MULTILINE_COMMENT
 : '/*' .*? ( '*/' | EOF ) -> channel(HIDDEN)
 ;

SPACES
 : [ \u000B\t\r\n] -> channel(HIDDEN)
 ;

UNEXPECTED_CHAR
 : .
 ;

fragment DIGIT : [0-9];

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];
