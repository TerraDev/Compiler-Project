grammar test;

//PARSER:

file : ft_dcl? (ft_def)+;

// ////////////////////ft_dcl (first half)

ft_dcl: 'declare' '{' ((func_dcl | ID ';'| var_def))+ '}';

func_dcl : ('(' args ')' '=')? ID '(' (args | args_var)? ')' ';';

args: type('['']')* (',' type('['']')*)*;

args_var : type('['']')* ID (',' type('['']')* ID)* ;

var_def: 'Const'? type var_val (',' var_val)* ';';

var_val : ref ('='expr)? ;

ref: ID('[' expr ']')* ;


expr :   negxpr | excl_expr  | compl_expr | expr MULT expr | expr DIV expr | expr MOD expr | expr PLUS expr | expr MINUS expr |
       expr LT expr | expr LE expr | expr GT expr | expr GE expr | expr EQ expr | expr NEQ expr |
       expr REL_AND expr | expr REL_OR expr | expr BIT_AND expr | expr BIT_OR expr  |
       '(' expr ')'  | const_val | 'allocate' handle_call | func_call | var | list | 'nil' ;

       negxpr: MINUS ( negxpr | const_val | '(' expr ')'| 'allocate' handle_call | func_call| var | list | 'nil' );
       excl_expr: EXCLAMATION ( excl_expr | const_val | '(' expr ')'| 'allocate' handle_call | func_call| var | list | 'nil' );
       compl_expr: BITWISE_COMPL ( compl_expr | const_val | '(' expr ')'| 'allocate' handle_call | func_call| var | list | 'nil' );


handle_call : ID'('( expr ( ',' expr )* )?')' ;

func_call : (var '.')? handle_call | 'read' '(' ')' | 'write' '(' expr ')' ;

var : ( ( 'this' | 'super' ) '.' )? ref ( '.' ref )* ;

list :'[' ( expr | list ) ( ',' ( expr | list ) )* ']' ;

// ////////////////////ft_def (second half)

ft_def: type_def | fun_def ;

type_def : 'type' ID (':' ID)? '{' (component)+ '}';

component: (ACCESS_MODIFIER)? ( var_def | fun_def);        //changed

fun_def : ('(' args_var ')' '=')? 'function' ID '(' args_var? ')' block;

block: '{'( var_def | stmt )*'}' ;

stmt: assign ';' | func_call ';' | cond_stmt | loop_stmt | 'break' ';' | 'continue'';' | 'destruct' ('['']')* ID ';' ;

assign : ( var | '(' var ( ',' var )* ')' ) '=' expr ;

cond_stmt : 'if' expr( block | stmt ) ( 'else' ( block | stmt ) )? | 'switch' var '{' switch_body '}';

switch_body : ( 'caseof' INT_CONST ':' block )+ ('default' ':' block )? ;

loop_stmt : 'for' ( type? assign )? ';' expr ';' assign? block | 'while' expr block ;


type : 'int' | 'float' | 'string' | 'bool' | ID ;

// START region : CONSTS

const_val: INT_CONST | BOOL_CONST | REAL_CONST  | STRING_CONST ;

INT_CONST: DEC | HEX ;

REAL_CONST :  REAL_CONST1 | REAL_CONST2 | REAL_CONST3 ;

BOOL_CONST : 'false' | 'true' ;

STRING_CONST : '\'' (~'\'')* '\'' ;

//Fragments:
fragment REAL_CONST1 : ( HEX | DEC )'.'( HEX | SPECDEC ) ('^'('+'|'-')? ( HEX | DEC ))? ;

fragment REAL_CONST2 : ( HEX | DEC )'.' ('^'('+'|'-')? ( HEX | DEC ))? ;

fragment REAL_CONST3 : '.' ( HEX | SPECDEC ) ('^'('+'|'-')? ( HEX | DEC ))? ;

fragment SPECDEC: [0-9]* ;

fragment DEC :  '0' | ( [1-9] [0-9]* ) ;

fragment HEX : ('0x' | '0X') ( ([1-9] | [a-f] | [A-F]) ([0-9] | [a-f] | [A-F])* | '0') ;

// END : CONSTS

//LEXER:

ACCESS_MODIFIER: 'public' | 'private' | 'protected' ;

ID : (([a-z]+ | [A-Z]+ | '_' | '@')[0-9]*)+ ;

//UNARY_OP: MINUS | '!' | '~' ;

MULT  : '*' ;
DIV   : '/' ;
MOD : '%' ;
PLUS  : '+' ;
MINUS : '-' ;
EXCLAMATION : '!';
BITWISE_COMPL: '~' ;


REL_AND: '&';
REL_OR: '|' ;

BIT_AND: '&&';
BIT_OR: '||' ;

GT : '>' ;
GE : '>=' ;
LT : '<' ;
LE : '<=' ;
EQ : '==' ;
NEQ: '!=' ;


WhiteSpace : [ \n\r\t] -> skip;

LINE_COMMENT : '#$' ~[\r\n]* -> skip ;

COMMENT : '#(' .*? ')#' -> skip ;