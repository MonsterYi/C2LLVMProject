## C到LLVM编译器简单实现

和杨梁

李天逸

马浩宇

何志辉

### 1. 实验环境

* 系统：`Ubuntu 18.04`
* 语言：`Python`
* 工具：`antlr4`；`antlr4-python3-runtime`；`llvmlite`

### 2. 运行说明

### 3. 代码结构

Generator

> x

Parser

> simpleC.g4 
>
> simpleCItemLexer.g4  C 语言词法分析部分
>
> simple

### 4. 具体实现

#### 4.1 词法语法分析实现

​	词法与语法分析的实现借助了 `antlr4` 工具，同时使用了 `antlr4-python3-runtime` 工具使得生成的词法语法分析代码为 `Python` 代码。

​	词法分析的规则定义在 `SimpleCItemLexer.g4` 中，其中定义了库名 `LIB`、变量名 `ID`，`int` 和 `double`，`char`，`string` 类型的立即数 `INT`，`DOUBLE`，`CHAR`，`STRING`。`OPERATOR` 中定义了运算符 （`+-*/%!`） 与

`== != < > <= >=`，在 `CONJUNCTION` 中定义了逻辑判断的连接符 `&&` 和 `||`。定义了行注释、多行注释以及空格缩进符换行符等字符的跳过操作。

​	语法分析的规则定义在了 `SimpleC.g4` 中，入口开始符号是 `program`，产生式为 `program->(include)* (defineSentence | structDef | functionDef)*`，在 `include` 中定义了调库操作， `defineSentence` 是对各种变量的声明，`structDef` 是对结构体的定义，`functionDef` 则是对函数的定义。`functionDef` 中定义了函数，它包含对函数头 `functionHeaderDef` 和 函数体 `functionBodyDef` 的定义，前者包含了对返回值类型，