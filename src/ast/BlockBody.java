package ast;

import java.util.List;

public class BlockBody extends Statement {

    List<Statement> statements;

    public BlockBody(List<Statement> statements) {
        this.statements = statements;
    }

    @Override
    public String toJava() {
        return null;
    }
}
