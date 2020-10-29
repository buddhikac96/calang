package ast;

import java.util.List;

public class IfStatement extends Statement {

    Expression condition;
    Statement ifBlock;
    Statement elseBlock;

    public IfStatement(Expression condition, Statement ifBlock, Statement elseBlock) {
        this.condition = condition;
        this.ifBlock = ifBlock;
        this.elseBlock = elseBlock;
    }

    @Override
    public String toJava() {
        return null;
    }
}
