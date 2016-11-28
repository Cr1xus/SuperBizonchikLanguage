grammar SuperBizonchik;

parse
 : block EOF
 ;

block
 : (statement | functionDecl)* (Return expression ';')?
 ;

statement
 : assignment ';'
 | functionCall ';'
 | ifStatement
 | whileStatement
 ;

assignment
 : Identifier '=' expression
 ;

functionCall
 : Identifier '(' exprList? ')' #identifierFunctionCall
 | Println '(' expression? ')'  #printlnFunctionCall
 | Print '(' expression ')'     #printFunctionCall
 ;

ifStatement
 : ifStat elseIfStat* elseStat? End
 ;

ifStat
 : If expression Do block
 ;

elseIfStat
 : Else If expression Do block
 ;

elseStat
 : Else Do block
 ;

functionDecl
 : Def Identifier '(' idList? ')' block End
 ;


whileStatement
 : While expression Do block End
 ;

idList
 : Identifier (',' Identifier)*
 ;

exprList
 : expression (',' expression)*
 ;

expression
 : '-' expression                           #unaryMinusExpression
 | '!' expression                           #notExpression
 | expression '^' expression                #powerExpression
 | expression '*' expression                #multiplyExpression
 | expression '/' expression                #divideExpression
 | expression '%' expression                #modulusExpression
 | expression '+' expression                #addExpression
 | expression '-' expression                #subtractExpression
 | expression '>=' expression               #gtEqExpression
 | expression '<=' expression               #ltEqExpression
 | expression '>' expression                #gtExpression
 | expression '<' expression                #ltExpression
 | expression '==' expression               #eqExpression
 | expression '!=' expression               #notEqExpression
 | expression '&&' expression               #andExpression
 | expression '||' expression               #orExpression
 | Number                                   #numberExpression
 | Bool                                     #boolExpression
 | Null                                     #nullExpression
 | functionCall                             #functionCallExpression
 | Identifier                               #identifierExpression
 | String                                   #stringExpression
 | '(' expression ')'                       #expressionExpression
 ;

Println  : 'println';
Print    : 'print';
Def      : 'def';
If       : 'if';
Else     : 'else';
Return   : 'return';
While    : 'while';
To       : 'to';
Do       : 'do';
End      : 'end';
Null     : 'null';

Or       : '||';
And      : '&&';
Equals   : '==';
NEquals  : '!=';
GTEquals : '>=';
LTEquals : '<=';
Pow      : '^';
Excl     : '!';
GT       : '>';
LT       : '<';
Add      : '+';
Subtract : '-';
Multiply : '*';
Divide   : '/';
Modulus  : '%';
OBrace   : '{';
CBrace   : '}';
OParen   : '(';
CParen   : ')';
SColon   : ';';
Assign   : '=';
Comma    : ',';

Bool
 : 'true'
 | 'false'
 ;

Number
 : Int ('.' Digit*)?
 ;

Identifier
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

String
 : ["] (~["\r\n] | '\\\\' | '\\"')* ["]
 | ['] (~['\r\n] | '\\\\' | '\\\'')* [']
 ;

Comment
 : ('//' ~[\r\n]* | '/*' .*? '*/') -> skip
 ;

Space
 : [ \t\r\n\u000C] -> skip
 ;

fragment Int
 : [1-9] Digit*
 | '0'
 ;

fragment Digit
 : [0-9]
 ;