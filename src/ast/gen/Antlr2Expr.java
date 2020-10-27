package ast.gen;

import antlr.CalLangBaseVisitor;
import antlr.CalLangParser;
import ast.Expression;

public class Antlr2Expr extends CalLangBaseVisitor<Expression> {
    @Override
    public Expression visitSubstraction(CalLangParser.SubstractionContext ctx) {
        return super.visitSubstraction(ctx);
    }

    @Override
    public Expression visitMultiplication(CalLangParser.MultiplicationContext ctx) {
        return super.visitMultiplication(ctx);
    }

    @Override
    public Expression visitAddition(CalLangParser.AdditionContext ctx) {
        return super.visitAddition(ctx);
    }

    @Override
    public Expression visitLessThan(CalLangParser.LessThanContext ctx) {
        return super.visitLessThan(ctx);
    }

    @Override
    public Expression visitVariable(CalLangParser.VariableContext ctx) {
        return super.visitVariable(ctx);
    }

    @Override
    public Expression visitNotEqual(CalLangParser.NotEqualContext ctx) {
        return super.visitNotEqual(ctx);
    }

    @Override
    public Expression visitEqual(CalLangParser.EqualContext ctx) {
        return super.visitEqual(ctx);
    }

    @Override
    public Expression visitGreaterThan(CalLangParser.GreaterThanContext ctx) {
        return super.visitGreaterThan(ctx);
    }

    @Override
    public Expression visitLiteral(CalLangParser.LiteralContext ctx) {
        return super.visitLiteral(ctx);
    }

    @Override
    public Expression visitDivision(CalLangParser.DivisionContext ctx) {
        return super.visitDivision(ctx);
    }
}
