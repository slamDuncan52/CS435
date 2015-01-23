lexer grammar Liza;

WS  : [ \n\r\t]+ -> skip ;
RESERVED : 'if'|'else'|'while'|'do'|'break'|'int'|'float'|'char'|'bool'|'true'|'false' ;
SINGLES : '&&'|'||'|'='|'=='|'!'|'!='|'<'|'<='|'>'|'>='|'{'|'}'|'['|']'|'('|')'|';'|'+'|'-'|'*'|'/' ;
ID : [a-z|A-Z|_][a-z|A-Z|0-9|_]* ;
INTEGER : [0-9]+ ;
FLOATING : [0-9]*'.'[0-9]+ ;
STRING : '"'[.*?'\"'?.*?]*?'"' ;
COMMENT : '//'.*?'\n' ;
