package ast.gen;

import antlr.CalLangBaseVisitor;
import antlr.CalLangParser;
import ast.Statement;
import org.antlr.v4.runtime.tree.ParseTree;

public class AntlrToStatement extends CalLangBaseVisitor<Statement> {

    @Override
    public Statement visitVardeclare(CalLangParser.VardeclareContext ctx) {
        String datatype = ctx.getChild(0).getText();
        String name = ctx.getChild(1).getText();
        ParseTree expr = ctx.getChild(3);

        return null;
    }

    @Override
    public Statement visitVarassign(CalLangParser.VarassignContext ctx) {
        return super.visitVarassign(ctx);
    }

    @Override
    public Statement visitShow(CalLangParser.ShowContext ctx) {
        return super.visitShow(ctx);
    }
}
