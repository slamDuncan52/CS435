grammar Liza;

program : block;
block : LBRACE decls stmts RBRACE;
decls : decls decl 
      | 
      ;
decl : type ID SEMI;
type : type LBRACK INTEGER RBRACK
     | INT
     | FLOAT
     | CHAR
     | BOOL ;
stmts : stmts stmt
      | 
      ;
stmt : loc ASSIGN bool SEMI
     | IF LPAREN bool RPAREN stmt
     | IF LPAREN bool RPAREN stmt ELSE stmt
     | WHILE LPAREN bool RPAREN stmt
     | DO stmt WHILE LPAREN bool RPAREN
     | BREAK SEMI
     | block
     | SEMI;
loc : loc LBRACK bool RBRACK 
    | ID;
bool : bool OR join
     | join;
join : join AND equality
     | equality;
equality : equality EQ rel
         | equality NE rel
         | rel;
rel : expr LT expr
    | expr LE expr
    | expr GE expr
    | expr GT expr
    | expr;
expr : expr PLUS term
     | expr MINUS term
     | term;
term : term MUL unary
     | term DIV unary
     | unary;
unary : NOT unary
      | MINUS unary
      | factor;
factor : LPAREN bool RPAREN
       | loc
       | INTEGER
       | FLOATING
       | TRUE
       | FALSE;

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
MUL : '*' ;
DIV : '/' ;

ID : [a-z|A-Z|_][a-z|A-Z|0-9|_]* ;
INTEGER : [0-9]+ ;
FLOATING : [0-9]+'.'[0-9]+ ;
STRING : '"' ( '\\"' | ~[\\"])* '"' ;
COMMENT : '//'.*?'\n' ;
