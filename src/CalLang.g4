grammar CalLang;

@header{
package antlr;
}

prog: statement* EOF;

statement: vardeclare
    | varassign
    | show
    ;

vardeclare: dtype ID '=' expr ';'
    ;

varassign: ID '=' expr ';'
    ;

dtype: INT
    | FLOAT
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

LIT: INTLIT
    | FLOATLIT
    ;

INTLIT: [1-9][0-9]*;

FLOATLIT: INTLIT* '.' [0-9]+
    ;

INT: 'int';

FLOAT: 'float';

ID: [a-zA-Z]+
    ;

WS: [ \n\t] -> skip;