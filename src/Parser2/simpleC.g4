grammar simpleC;
// import lexer
import simpleCItemLexer;
// 程序格式
program: (include)* (defineSentence | structDef | functionDef);
// ------------------------定义语句------------------------- include 语句
include: 'include' '<' lib '>';
// define struct
structDef: struct '{' (structBodyDef)+ '};';
structBodyDef: (myType | struct) (
		structItemDef (',' (structItemDef))*
	)? ';';
structItemDef: (myID | array) (
		'=' ('[]' | myInt | myDouble | myString | myChar)
	)?;
// define function
functionDef: functionHeaderDef functionBodyDef;
functionHeaderDef:
	'*'? (myType | myVoid | struct) myID '(' functionParamsDef ')';
functionParamsDef: functionParamDef (',' functionParamDef)* |;
functionParamDef: '*'? (myType | struct) myID;
functionBodyDef: '{' block '}';

// 代码块定义 
block: (sentence)+;
// 语句
sentence:
	(
		defineSentence
		| assignSentence
		| ifSentenceBlock
		| whileSentence
		| forSentence
		| returnSentence
		| continueSentence
		| breakSentence
	);
// 声明语句
defineSentence:
	baseDefineSentence
	| arrayDefineSentence
	| structDefineSentence;
baseDefineSentence:
	myType myID ('=' expr)? (',' myID ('=' expr)?)* ';';
arrayDefineSentence: myType myID '[' myInt ']' ';';
structDefineSentence: struct (myID | array);
// 赋值语句
assignSentence: ((arrayItem | myID | structItem) '=')+ expr ';';
// 条件语句
ifSentenceBlock: ifSentence (elifSentence)* (elseSentence)?;
ifSentence: 'if' '(' condition ')' '{' block '}';
elifSentence: 'else' 'if' '(' condition ')' '{' block '}';
elseSentence: 'else' '{' block '}';
condition: expr;
// while 语句
whileSentence: 'while' '(' condition ')' '{' block '}';
// for 语句
forSentence:
	'for' '(' forDefineSentence ';' condition ';' forIteratorSentence ')' (
		'{' block '}'
		| ';'
	);
forDefineSentence: (myType)? myID '=' expr (
		',' forDefineSentence
	)?
	|;
forIteratorSentence: myID '=' expr (',' forIteratorSentence)? |;

// return 语句
returnSentence: 'return' (myInt | myID | myDouble)? ';';
// continue 语句
continueSentence: 'continue;';
breakSentence: 'break;';
//-------------------------定义运算-------------------------
expr:
	'(' expr ')'
	| op = '!' expr
	| expr '&&' expr
	| expr '||' expr
	| expr op = ('*' | '/' | '%') expr
	| expr op = ('+' | '-') expr
	| expr op = ('==' | '!=' | '<' | '>' | '<=' | '>=')
	| myID
	| structItem
	| arrayItem
	| (op = '-')? myInt
	| (op = '-')? myDouble
	| myChar
	| myString
	| function;

// -----------------------导入词素--------------------
lib: LIB;
myID: ID;
myInt: INT;
myDouble: DOUBLE;
myChar: CHAR;
myString: STRING;
operator: OPERATOR;
conjunction: CONJUNCTION;
inLineComment: INLINECOMMENT;
blockComment: BLOCKCOMMENT;
space: SPACE;
// 定义其他元素
struct: 'struct' ID;
myType: 'int' | 'double' | 'char' | 'string';
array: myID '[' myInt ']';
arrayItem: myID '[' expr ']';
myVoid: 'void';
structItem: (myID | arrayItem) '.' (myID | arrayItem);
argument: myInt | myDouble | myChar | myString;

//-----------------------定义函数调用-------------------------------------
// 定义函数（调用）
function: (
		printFunc
		| scanfFunc
		| getsFunc
		| strlenFunc
		| atoiFunc
		| selfDefinedFunc
	);
// 自定义函数（名称）
selfDefinedFunc:
	myID '(' ((argument | myID) (',' (argument | myID))*)? ')';
// 其他的系统函数（名称）
printFunc: 'printf' '(' (myString | myID) (',' expr)* ')';
scanfFunc:
	'scanf' '(' myString (
		',' ('&')? (myID | arrayItem | structItem)
	);
getsFunc: 'gets' '(' (myID | structItem) ')';
strlenFunc: 'strlen' '(' myID ')';
atoiFunc: 'atoi' '(' myID ')';
