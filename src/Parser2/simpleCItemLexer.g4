lexer grammar simpleCItemLexer;
ID: [a-zA-Z_][0-9A-Za-z_]*;
INT: [0-9]+;
DOUBLE: [0-9]+ '.' [0-9]+;
CHAR: '\'' .'\'';
STRING: '"' .*? '"';
LIB: [a-zA-Z]+ '.h'?;
CONJUNCTION: '&&' | '||';
OPERATOR:
	'!'
	| '+'
	| '-'
	| '*'
	| '/'
	| '=='
	| '!='
	| '<'
	| '<='
	| '>'
	| '>=';

//无效代码跳过
INLINECOMMENT: '//' .*? '\r'? '\n' -> skip;
BLOCKCOMMENT: '/*' .*? '*/' -> skip;
WS: [ \t\r\n]+ -> skip;