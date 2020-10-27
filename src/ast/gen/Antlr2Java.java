package ast.gen;

import antlr.CalLangBaseVisitor;
import antlr.CalLangParser;

import java.util.ArrayList;
import java.util.List;

public class Antlr2Java extends CalLangBaseVisitor<String> {
    @Override
    public String visitProg(CalLangParser.ProgContext ctx) {
        List<String> statements = new ArrayList<>();

        for(int i = 0; i < ctx.getChildCount() - 1; i++){
            statements.add(visit(ctx.getChild(i)));
        }

        StringBuilder code = new StringBuilder();
        code.append("public class Main{\n\tpublic static void main(String... args){\n");

        for(String statement: statements){
            code.append("\t\t" + statement)
                    .append("\n");
        }

        code.append("\t}\n}");

        return code.toString();
    }

    @Override
    public String visitVardeclare(CalLangParser.VardeclareContext ctx) {
        String datatype = ctx.getChild(0).getText();
        String ID = ctx.getChild(1).getText();
        String value = visit(ctx.getChild(3));

        return new StringBuilder(datatype)
                .append(" " + ID + " = ")
                .append(value + ";")
                .toString();
    }

    @Override
    public String visitVarassign(CalLangParser.VarassignContext ctx) {
        String ID = ctx.getChild(0).getText();
        String value = visit(ctx.getChild(2));

        return new StringBuilder(ID)
                .append(" = ")
                .append(value)
                .toString();
    }

    @Override
    public String visitShow(CalLangParser.ShowContext ctx) {
        String start = "System.out.println(";
        String end = ");";

        String context = visit(ctx.getChild(2));

        return new StringBuilder(start)
                .append(context)
                .append(end)
                .toString();
    }

    @Override
    public String visitSubstraction(CalLangParser.SubstractionContext ctx) {
        String left = visit(ctx.getChild(0));
        String right = visit(ctx.getChild(2));

        StringBuilder subtraction = new StringBuilder(left)
                .append(" + ")
                .append(right);

        return subtraction.toString();
    }

    @Override
    public String visitMultiplication(CalLangParser.MultiplicationContext ctx) {
        String left = visit(ctx.getChild(0));
        String right = visit(ctx.getChild(2));

        StringBuilder multiplication = new StringBuilder('(')
                .append(left + '*')
                .append(right + ')');

        return multiplication.toString();
    }

    @Override
    public String visitAddition(CalLangParser.AdditionContext ctx) {
        String left = visit(ctx.getChild(0));
        String right = visit(ctx.getChild(2));

        StringBuilder addition = new StringBuilder(left)
                .append(" + ")
                .append(right);

        return addition.toString();
    }

    @Override
    public String visitVariable(CalLangParser.VariableContext ctx) {
        String variable = ctx.getChild(0).getText();
        return variable;
    }

    @Override
    public String visitLiteral(CalLangParser.LiteralContext ctx) {
        String literal = ctx.getChild(0).getText();
        return literal;
    }

    @Override
    public String visitDivision(CalLangParser.DivisionContext ctx) {
        String left = visit(ctx.getChild(0));
        String right = visit(ctx.getChild(2));

        StringBuilder division = new StringBuilder('(')
                .append(left + '/')
                .append(right + ')');

        return division.toString();
    }
}
