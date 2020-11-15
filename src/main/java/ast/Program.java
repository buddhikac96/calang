package ast;

import transpiler.astVisitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Program implements AstNode {
    List<Statement> statementList;

    public Program() {
        this.statementList = new ArrayList<>();
    }

    public void addStatement(Statement statement){
        this.statementList.add(statement);
    }

    public String toJava(){
        String start = "public class Main{" +
                "public static void main(String... args){";
        String end = "}}";

        StringBuilder javacode = new StringBuilder(start);
        for(Statement statement: statementList){
            if(statement != null){
            }
            javacode.append(statement.toJava());
        }

        javacode.append(end);

        return javacode.toString();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitProgram(this);
    }
}

