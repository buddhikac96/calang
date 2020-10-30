package ast;

import java.util.List;

public class BlockBody extends Statement {

    List<Statement> statements;

    public BlockBody(List<Statement> statements) {
        this.statements = statements;
    }

    @Override
    public String toJava() {
        StringBuilder jcode = new StringBuilder();
        for(Statement statement : this.statements){
            jcode.append(statement.toJava()).append(";");
        }

        return jcode.toString();
    }
}
