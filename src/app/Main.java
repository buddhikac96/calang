package app;

import antlr.CalLangLexer;
import antlr.CalLangParser;
import ast.Program;
import ast.err.SyntaxErrorListener;
import ast.gen.Antlr2Program;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import transpiler.Antlr2Java;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String fileName = "/home/hackerbuddy/dev/opensource/calang/samples/sample.cal";
        CalLangParser parser = getParser(fileName);

        parser.removeErrorListeners();
        parser.addErrorListener(new SyntaxErrorListener());

        ParseTree antlrParseTree = parser.prog();

        /*Antlr2Java a2j = new Antlr2Java();
        String jcode = a2j.visit(antlrParseTree);*/

        Antlr2Program antlr2Program = new Antlr2Program();
        Program program = antlr2Program.visit(antlrParseTree);

        String jcode = program.toJava();

        System.out.println(jcode);
    }

    private static CalLangParser getParser(String fileName){
        CalLangParser parser = null;

        try {
            CharStream input = CharStreams.fromFileName(fileName);
            CalLangLexer lexer = new CalLangLexer(input);
            CommonTokenStream token = new CommonTokenStream(lexer);
            parser = new CalLangParser(token);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return parser;
    }
}
