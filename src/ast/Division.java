package ast;

public class Division extends Expression {

    Expression left;
    Expression right;

    public Division(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toJava() {
        return new StringBuilder(this.left.toJava())
                .append(" / ")
                .append(this.right.toJava())
                .toString();
    }
}
