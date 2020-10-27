grammar CalLang;

@header{
package antlr;
}

prog: statement* EOF;

statement: vardeclare
    | varassign
    | show
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
    | LIT               # Literal
    | ID                # Variable
    ;

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