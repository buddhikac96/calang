package ast.gen;

import antlr.CalLangBaseVisitor;
import antlr.CalLangParser;
import ast.Program;

public class Antlr2Program extends CalLangBaseVisitor<Program> {
    @Override
    public Program visitProg(CalLangParser.ProgContext ctx) {
        return super.visitProg(ctx);
    }
}
