/*
    This package compiles the calang code directly into Java code.
    Here compiling happen in parsing tier.
    Building the AST and AST translation will be added later.
    After creating AST, we can add semantic analysis.
    Mostly consider un-initialize variables(symbol table) and scoping.
    Currently, the Java code manually written.
    Using StringTemplate will improve the process.
*/

package transpiler;

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
                .append(";")
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
                .append(" - ")
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

    @Override
    public String visitLessThan(CalLangParser.LessThanContext ctx) {
        String left = visit(ctx.getChild(0));
        String right = visit(ctx.getChild(2));

        return new StringBuilder(left)
                .append(" < ")
                .append(right)
                .toString();
    }

    @Override
    public String visitNotEqual(CalLangParser.NotEqualContext ctx) {
        String left = visit(ctx.getChild(0));
        String right = visit(ctx.getChild(2));

        return new StringBuilder(left)
                .append(" != ")
                .append(right)
                .toString();
    }

    @Override
    public String visitEqual(CalLangParser.EqualContext ctx) {
        String left = visit(ctx.getChild(0));
        String right = visit(ctx.getChild(2));

        return new StringBuilder(left)
                .append(" == ")
                .append(right)
                .toString();
    }

    @Override
    public String visitGreaterThan(CalLangParser.GreaterThanContext ctx) {
        String left = visit(ctx.getChild(0));
        String right = visit(ctx.getChild(2));

        return new StringBuilder(left)
                .append(" > ")
                .append(right)
                .toString();
    }

    @Override
    public String visitIfStatement(CalLangParser.IfStatementContext ctx) {
        String condition = visit(ctx.getChild(1));

        String ifBlock = visit(ctx.getChild(3));
        String elseBlock = "";

        if(ctx.getChildCount() > 4){
            elseBlock = visit(ctx.getChild(5));
        }

        return new StringBuilder("if(")
                .append(condition + ")")
                .append(ifBlock)
                .append("else")
                .append(elseBlock)
                .toString();
    }

    @Override
    public String visitBlock(CalLangParser.BlockContext ctx) {
        String stmts = visit(ctx.getChild(1));

        return new StringBuilder("{")
                .append(stmts + "\n")
                .append("}")
                .toString();
    }

    @Override
    public String visitBlockbody(CalLangParser.BlockbodyContext ctx) {
        List<String> stmts = new ArrayList<>();
        for(int i = 0; i < ctx.getChildCount(); i++){
            String stmt = visit(ctx.getChild(i));
            stmts.add(stmt);
        }

        StringBuilder javaCode = new StringBuilder();

        for(String stmt : stmts){
            javaCode.append("\n\t")
                    .append(stmt)
                    .append(";");
        }

        return javaCode.toString();
    }
}
