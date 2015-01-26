lexer grammar Liza;

WS  : [ \n\r\t]+ -> skip ;

IF: 'if' ;
ELSE : 'else' ;
WHILE : 'while' ;
DO : 'do' ;
BREAK : 'break' ;
INT : 'int' ;
FLOAT : 'float' ;
CHAR : 'char' ;
BOOL : 'bool' ;
TRUE : 'true' ;
FALSE : 'false' ;

AND : '&&' ;
OR : '||' ;
ASSIGN : '=' ;
EQ : '==' ;
NOT : '!' ;
NE : '!=' ;
LT : '<' ;
LE : '<=' ;
GT : '>' ;
GE : '>=' ;
LBRACE : '{' ;
RBRACE : '}' ;
LBRACK : '[' ;
RBRACK : ']' ;
LPAREN : '(' ;
RPAREN : ')' ;
SEMI : ';' ;
PLUS : '+' ;
MINUS : '-' ;
MULT : '*' ;
DIV : '/' ;

ID : [a-z|A-Z|_][a-z|A-Z|0-9|_]* ;
INTEGER : [0-9]+ ;
FLOATING : [0-9]+'.'[0-9]+ ;
STRING : '"' ( '\\"' | ~[\\"])* '"' ;
COMMENT : '//'.*?'\n' ;
