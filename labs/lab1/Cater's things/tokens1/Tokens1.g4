lexer grammar Tokens1; // note lexer only

ID  : [a-zA-Z_][a-zA-Z_0-9]* ;
INT : [0-9]+ ;
NEWLINE : '\r'?'\n' ;
WS  : [ \n\r\t]+ -> skip ; // discard whitespace, including blank
STR : '"' .*? '"' ; // uses non-greedy pattern *?
