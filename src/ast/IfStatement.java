package ast;

import java.util.List;

public class IfStatement extends Statement {

    Expression condition;
    List<Statement> ifContext;
    List<Statement> elseContext;

    @Override
    public String toJava() {
        return null;
    }
}
