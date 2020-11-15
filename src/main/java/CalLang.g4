grammar CalLang;

@header{
package antlr;
}

prog: statement* EOF;

statement: vardeclare
    | varassign
    | show
    | ifstmt
    ;

vardeclare: DTYPE ID '=' expr ';'
    ;

varassign: ID '=' expr ';'
    ;

show: 'show' '(' expr ')' ';'
    ;

expr: expr '*' expr     # Multiplication
    | expr '/' expr     # Division
    | expr '-' expr     # Substraction
    | expr '+' expr     # Addition
    | expr '==' expr    # Equal
    | expr '!=' expr    # NotEqual
    | expr '>' expr     # GreaterThan
    | expr '<' expr     # LessThan
    | LIT               # Literal
    | ID                # Variable
    ;

ifstmt: 'check('  expr  ')' block ('otherwise' block)?      # IfStatement
    ;

block: '{' blockbody '}'
    ;

blockbody: varassign*;

DTYPE: 'float' | 'int';

LIT: INTLIT
    | FLOATLIT
    ;

INTLIT: [1-9][0-9]*;

FLOATLIT: INTLIT* '.' [0-9]+
    ;

ID: [a-zA-Z]+
    ;

WS: [ \n\t] -> skip;