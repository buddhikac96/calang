package ast;

import transpiler.astVisitor.Visitor;

public class IntegerLit extends Expression {
    int value;

    public IntegerLit(int value) {
        this.value = value;
    }

    @Override
    public String toJava() {
        return Integer.toString(this.value);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitIntegerLit(this);
    }
}

