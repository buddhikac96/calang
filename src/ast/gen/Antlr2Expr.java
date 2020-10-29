package ast.gen;

import antlr.CalLangBaseVisitor;
import antlr.CalLangParser;
import ast.*;

public class Antlr2Expr extends CalLangBaseVisitor<Expression> {
    @Override
    public Expression visitSubstraction(CalLangParser.SubstractionContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));

        return new Subtraction(left, right);
    }

    @Override
    public Expression visitMultiplication(CalLangParser.MultiplicationContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));

        return new Subtraction(left, right);
    }

    @Override
    public Expression visitAddition(CalLangParser.AdditionContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));

        return new Subtraction(left, right);
    }

    @Override
    public Expression visitLessThan(CalLangParser.LessThanContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));

        return new Subtraction(left, right);
    }

    @Override
    public Expression visitVariable(CalLangParser.VariableContext ctx) {
        String name = ctx.getChild(0).getText();
        return new Variable(name);
    }

    @Override
    public Expression visitNotEqual(CalLangParser.NotEqualContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));

        return new Subtraction(left, right);
    }

    @Override
    public Expression visitEqual(CalLangParser.EqualContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));

        return new Subtraction(left, right);
    }

    @Override
    public Expression visitGreaterThan(CalLangParser.GreaterThanContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));

        return new Subtraction(left, right);
    }

    @Override
    public Expression visitLiteral(CalLangParser.LiteralContext ctx) {
        String literal = ctx.getChild(0).getText();
        if(literal.contains(".")){
            float value = Float.parseFloat(literal);
            return new FloatLiteral(value);
        }else{
            int value = Integer.parseInt(literal);
            return new IntLiteral(value);
        }
    }

    @Override
    public Expression visitDivision(CalLangParser.DivisionContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));

        return new Subtraction(left, right);
    }
}
