package ast;

import transpiler.astVisitor.Visitor;

public class Block extends Statement {

    Statement blockBody;

    public Block(Statement blockBody) {
        this.blockBody = blockBody;
    }

    @Override
    public String toJava() {
        return new StringBuilder("{")
                .append(blockBody.toJava())
                .append("}")
                .toString();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBlock(this);
    }
}
