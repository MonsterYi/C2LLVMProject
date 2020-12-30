lexer grammar simpleCItemLexer;
// <lib>.h 变量声明
LIB: (.)*? '.h';
// 变量声明
ID: [a-zA-Z_][a-zA-Z0-9]*;
// int
INT: [0-9]+;
// double
DOUBLE: [0-9]+ '.' [0-9]+;
// char
CHAR: '\'' .'\'';
// string
STRING: '"' (.)*? '"';
// 运算符
OPERATOR:
	'+'
	| '-'
	| '*'
	| '/'
	| '%'
	| '!'
	| '=='
	| '!='
	| '<'
	| '>'
	| '<='
	| '>=';
// 连词
CONJUNCTION: '&&' | '||';
// 需要跳过的 注释、空格、缩进、换行
INLINECOMMENT: '//' (.)*? '\n' -> skip;
BLOCKCOMMENT: '/*' (.)*? '*/' -> skip;
SPACE: [ \t\r\n]+ -> skip;