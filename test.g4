grammar test;

//PARSER:

file : ft_dcl? (ft_def)+;

// ////////////////////ft_dcl (first half)

ft_dcl: 'declare' '{' ((func_dcl | ID ';'| var_def))+ '}';

func_dcl : ('(' args ')' '=')? ID '(' (args | args_var) ')' ';';

args: type('['']')* (',' type('['']')*)*;

args_var : type('['']')* ID (',' type('['']')* ID)* ;

var_def: 'Const'? type var_val (',' var_val)* ';';

var_val : ref ('='expr)? ;

ref: ID('[' expr ']')* ;

expr: expr binary_op expr | '(' expr ')' | UNARY_OP expr | const_val | 'allocate' handle_call | func_call | var | list | 'nil' ;


binary_op : ARITHMETIC | RELATIONAL | BITWISE | LOGICAL ;

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

switch_body : ( 'caseof' int_const ':' block )+ ('default' ':' block )? ;

loop_stmt : 'for' ( type? assign )? ';' expr ';' assign? block | 'while' expr block ;


type : 'int' | 'float' | 'string' | 'bool' | ID ;

// START region : CONSTS

const_val: int_const | bool_const | real_const  | string_const ;
bool_const : BOOL_CONST ;

string_const: STRING_CONST;

int_const: DEC | HEX ;

real_const :  real_const2 | real_const1;

real_const1 : ( HEX | DEC )?'.'( HEX | SPECDEC ) ('^' ( HEX | ('+'|'-')? DEC ))? ;

real_const2 : ( HEX | DEC )'.'( HEX | SPECDEC )? ('^' ( HEX | ('+'|'-')? DEC ))? ;

STRING_CONST : '\'' (~'\'')* '\'' ;

BOOL_CONST : 'false' | 'true' ;

SPECDEC: [0-9]* ;

DEC : ( '-'? [1-9] [0-9]* | '0' )  ;

HEX : ('0x' | '0X') ( ([1-9] | [a-f] | [A-F]) ([0-9] | [a-f] | [A-F])* | '0') ;

// END : CONSTS

//LEXER:

ACCESS_MODIFIER: 'public' | 'private' | 'protected' ;

ID : (([a-z]+ | [A-Z]+ | '_' | '@')[0-9]*)+ ;

UNARY_OP: '-' | '!' | '~' ;

ARITHMETIC: '+' | '-' | '*' | '/' | '%';
RELATIONAL: '&' | '|';
BITWISE: '&&' | '||';
LOGICAL: '==' | '!=' | '<=' | '>=' | '<' | '>' ;

WhiteSpace : [ \n\r\t] -> skip;

LINE_COMMENT : '#$' ~[\r\n]* -> skip ;

COMMENT : '#(' .*? ')#' -> skip ;