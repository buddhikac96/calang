package ast;

public class Block extends Statement {

    Statement blockBody;

    public Block(Statement blockBody) {
        this.blockBody = blockBody;
    }

    @Override
    public String toJava() {
        return null;
    }
}
