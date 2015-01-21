grammar Hello;
r : 'hello' token ;
token : ID | NUM ;
ID : [a-z]+ ;
NUM : [0-9]+ ;
WS : [ \t\r\n]+ -> skip ;
