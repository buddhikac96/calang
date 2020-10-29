package ast;

public class IntLiteral extends Expression{

    int value;

    public IntLiteral(int value) {
        this.value = value;
    }

    @Override
    public String toJava() {
        return null;
    }
}

