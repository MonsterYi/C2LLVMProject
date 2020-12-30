grammar simpleC;
// import lexer
import simpleCItemLexer;
// 程序格式
program: (include)* (defineSentence | functionDef)+;
// ------------------------定义语句------------------------- include 语句
include: '#include' '<' lib '>';
// define function
functionDef: functionHeaderDef functionBodyDef;
functionHeaderDef:
	(myType | myVoid) myID '(' functionParamsDef ')';
functionParamsDef: (functionParamDef (',' functionParamDef)*)*
	|;
functionParamDef: myType myID;
functionBodyDef: '{' block '}';

// 代码块定义 
block: (sentence)*;
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
		| function
	);
// 声明语句
defineSentence: baseDefineSentence | arrayDefineSentence;
baseDefineSentence:
	myType myID ('=' expr)? (',' myID ('=' expr)?)* ';';
arrayDefineSentence: myType myID '[' myInt ']' ';';
// 赋值语句
assignSentence: ((arrayItem | myID) '=')+ expr ';';
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
	'(' expr ')'										# expr_parens
	| op = '!' expr										# expr_neg
	| expr '&&' expr									# expr_and
	| expr '||' expr									# expr_or
	| expr op = ('*' | '/' | '%') expr					# expr_mul
	| expr op = ('+' | '-') expr						# expr_add
	| expr op = ('==' | '!=' | '<' | '>' | '<=' | '>=')	# expr_judge
	| myID												# expr_identifier
	| arrayItem											# expr_arrayitem
	| (op = '-')? myInt									# expr_int
	| (op = '-')? myDouble								# expr_double
	| myChar											# expr_char
	| myString											# expr_string
	| function											# expr_function;

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
myType: 'int' | 'double' | 'char' | 'string';
array: myID '[' myInt ']';
arrayItem: myID '[' expr ']';
myVoid: 'void';
argument: myInt | myDouble | myChar | myString;

//-----------------------定义函数调用-------------------------------------
// 定义函数（调用）
function: ( printFunc | scanfFunc | selfDefinedFunc);
// 自定义函数（名称）
selfDefinedFunc:
	myID '(' ((argument | myID) (',' (argument | myID))*)? ')' ';';
// 其他的系统函数（名称）
printFunc: 'printf' '(' (myString | myID) (',' expr)* ')' ';';
scanfFunc:
	'scanf' '(' myString (',' ('&')? (myID | arrayItem)) ';';
