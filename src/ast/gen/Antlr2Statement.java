package ast.gen;

import antlr.CalLangBaseVisitor;
import antlr.CalLangParser;
import ast.*;

import java.util.ArrayList;
import java.util.List;

public class Antlr2Statement extends CalLangBaseVisitor<Statement> {

    Antlr2Expr antlr2Expr;

    public Antlr2Statement() {
        this.antlr2Expr = new Antlr2Expr();
    }

    @Override
    public Statement visitVardeclare(CalLangParser.VardeclareContext ctx) {
        String datatype = ctx.getChild(0).getText();
        String name = ctx.getChild(1).getText();
        Expression value = this.antlr2Expr.visit(ctx.getChild(3));

        return new VarDeclare(datatype, name, value);
    }

    @Override
    public Statement visitVarassign(CalLangParser.VarassignContext ctx) {
        String name = ctx.getChild(0).getText();
        Expression value = this.antlr2Expr.visit(ctx.getChild(2));

        return new VarAssign(name, value);
    }

    @Override
    public Statement visitShow(CalLangParser.ShowContext ctx) {
        Expression expression = this.antlr2Expr.visit(ctx.getChild(2));
        return new Show(expression);
    }

    @Override
    public Statement visitIfStatement(CalLangParser.IfStatementContext ctx) {
        Expression condition = this.antlr2Expr.visit(ctx.getChild(1));
        Statement ifBlock = visit(ctx.getChild(3));
        Statement elseBlock = null;

        if(ctx.getChildCount() > 4){
            elseBlock = visit(ctx.getChild(5));
        }

        return new IfStatement(condition, ifBlock, elseBlock);

    }

    @Override
    public Statement visitBlock(CalLangParser.BlockContext ctx) {
        Statement blockBody = visit(ctx.getChild(1));
        return new Block(blockBody);
    }

    @Override
    public Statement visitBlockbody(CalLangParser.BlockbodyContext ctx) {
        List<Statement> statements = new ArrayList<>();
        for(int i = 0; i < ctx.getChildCount(); i++){
            Statement statement = visit(ctx.getChild(i));
            statements.add(statement);
        }

        return new BlockBody(statements);
    }
}
