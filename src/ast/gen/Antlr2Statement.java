package ast.gen;

import antlr.CalLangBaseVisitor;
import antlr.CalLangParser;
import ast.Statement;

public class Antlr2Statement extends CalLangBaseVisitor<Statement> {
    @Override
    public Statement visitVardeclare(CalLangParser.VardeclareContext ctx) {
        return super.visitVardeclare(ctx);
    }

    @Override
    public Statement visitVarassign(CalLangParser.VarassignContext ctx) {
        return super.visitVarassign(ctx);
    }

    @Override
    public Statement visitShow(CalLangParser.ShowContext ctx) {
        return super.visitShow(ctx);
    }

    @Override
    public Statement visitIfStatement(CalLangParser.IfStatementContext ctx) {
        return super.visitIfStatement(ctx);
    }

    @Override
    public Statement visitBlock(CalLangParser.BlockContext ctx) {
        return super.visitBlock(ctx);
    }

    @Override
    public Statement visitBlockbody(CalLangParser.BlockbodyContext ctx) {
        return super.visitBlockbody(ctx);
    }
}
