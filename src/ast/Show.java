package ast;

public class Show extends Statement {

    Expression expression;

    public Show(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toJava() {
        return new StringBuilder("System.out.println(")
                .append(this.expression.toJava())
                .append(");")
                .toString();
    }
}
