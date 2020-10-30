package ast;

public class IntegerLit extends Expression {
    int value;

    public IntegerLit(int value) {
        this.value = value;
    }

    @Override
    public String toJava() {
        return Integer.toString(this.value);
    }
}

