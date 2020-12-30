grammar simpleC;
import simpleCItemLexer;

//-------------语法规则----------------------------------------------
myID: ID;
myINT: INT;
myDOUBLE: DOUBLE;
myCHAR: CHAR;
mySTRING: STRING;
myLIB: LIB;
myTYPE: 'int' | 'double' | 'char' | 'string';
myARRAY: myID '[' myINT ']';
myARRAYITEM: myID '[' expr ']';
myVOID: 'void';

program: (include)* ( initialBlock | mFunction)*;
include: '#include' '<' myLIB '>';

//函数定义
mFunction: (myTYPE | myVOID) myID '(' params ')' '{' funcBody '}';

//函数参数
params: param (',' param)* |;
param: myTYPE myID;

//函数体
funcBody: body returnBlock;

//语句块/函数快
body: (block | func ';')*;

//语句块
block:
	initialBlock
	| assignBlock
	| ifBlocks
	| whileBlock
	| forBlock
	| returnBlock;

//初始化语句
initialBlock: baseInitialBlock | arrayInitialBlock;
baseInitialBlock: (myTYPE) myID ('=' expr)? (
		',' myID ('=' expr)?
	)* ';';
arrayInitialBlock: myTYPE myID '[' myINT ']' ';';

//赋值语句
assignBlock: ((myID | myARRAYITEM) '=')+ expr ';';

//if 语句
ifBlocks: ifBlock (elifBlock)* (elseBlock)?;
ifBlock: 'if' '(' condition ')' '{' body '}';
elifBlock: 'else' 'if' '(' condition ')' '{' body '}';
elseBlock: 'else' '{' body '}';

condition: expr;

//while 语句
whileBlock: 'while' '(' condition ')' '{' body '}';

//for 语句
forBlock:
	'for' '(' forDefineBlock ';' condition ';' forIteratorBlock ')' (
		'{' body '}'
		| ';'
	);
forDefineBlock: ID '=' expr (',' forDefineBlock)? |;
forIteratorBlock: ID '=' expr (',' forIteratorBlock)? |;

//return 语句
returnBlock: 'return' (INT | ID)? ';';

expr:
	'(' expr ')'												# expr_parens
	| op = '!' expr												# expr_neg
	| expr op = ('*' | '/' | '%') expr							# expr_mul
	| expr op = ('+' | '-') expr								# expr_add
	| expr op = ('==' | '!=' | '<' | '<=' | '>' | '>=') expr	# expr_judge
	| expr '&&' expr											# expr_and
	| expr '||' expr											# expr_or
	| myARRAYITEM												# expr_arrayitem
	| (op = '-')? myINT											# int
	| (op = '-')? myDOUBLE										# double
	| myCHAR													# char
	| mySTRING													# string
	| myID														# identifier
	| func														# function;

//函数调用
func: (printfFunction | scanfFunction | selfDefinedFunction);

//printf
printfFunction: 'printf' '(' STRING (',' expr)* ')';

//scanf
scanfFunction: 'scanf' '(' STRING (',' ('&')? (ID))* ')';

//Selfdefined
selfDefinedFunction:
	ID '(' ((argument | ID) (',' (argument | ID))*)? ')';

argument: INT | DOUBLE | CHAR | STRING;
