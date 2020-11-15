package ast.gen;

import antlr.CalLangBaseVisitor;
import antlr.CalLangParser;
import ast.Program;

public class Antlr2Program extends CalLangBaseVisitor<Program> {

    Antlr2Statement antlr2Statement;

    public Antlr2Program() {
        this.antlr2Statement = new Antlr2Statement();
    }

    @Override
    public Program visitProg(CalLangParser.ProgContext ctx) {
        Program program = new Program();

        for(int i = 0; i < ctx.getChildCount() - 1; i++){
            program.addStatement(antlr2Statement.visit(ctx.getChild(i)));
        }

        return program;
    }
}
