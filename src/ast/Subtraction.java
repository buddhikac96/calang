package ast;

import transpiler.astVisitor.Visitor;

public class Subtraction extends Expression {

    Expression left;
    Expression right;

    public Subtraction(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }


    @Override
    public String toJava() {
        return new StringBuilder(this.left.toJava())
                .append(" - ")
                .append(this.right.toJava())
                .toString();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSubtraction(this);
    }
}

