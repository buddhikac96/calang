package ast;

public class Multiplication extends Expression {

    Expression left;
    Expression right;

    public Multiplication(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toJava() {
        return new StringBuilder(this.left.toJava())
                .append(" * ")
                .append(this.right.toJava())
                .toString();
    }
}

