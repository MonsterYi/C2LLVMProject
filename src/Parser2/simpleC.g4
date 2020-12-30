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

program: (include)* ( defineBlock | myFunction)*;
include: '#include' '<' myLIB '>';

//函数定义
myFunction: (myTYPE | myVOID) myID '(' defineParams ')' '{' functionBody '}';

//函数参数
defineParams: defineParam (',' defineParam)* |;
defineParam: myTYPE myID;

//函数体
functionBody: body returnBlock;

//语句块/函数快
body: (block | func ';')*;

//语句块
block:
	defineBlock
	| assignBlock
	| ifBlocks
	| whileBlock
	| forBlock
	| returnBlock;

//初始化语句
defineBlock: baseInitialBlock | arrayInitialBlock;
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
forDefineBlock: myID '=' expr (',' forDefineBlock)? |;
forIteratorBlock: myID '=' expr (',' forIteratorBlock)? |;

//return 语句
returnBlock: 'return' (myINT | myID)? ';';

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
printfFunction: 'printf' '(' mySTRING (',' expr)* ')';
scanfFunction: 'scanf' '(' mySTRING (',' ('&')? (myID))* ')';
//自定义函数调用
selfDefinedFunction:
	myID '(' ((argument | myID) (',' (argument | myID))*)? ')';

argument: myINT | myDOUBLE | myCHAR | mySTRING;
