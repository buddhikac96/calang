package ast;

public class FloatLiteral extends Expression {

    float value;

    public FloatLiteral(float value) {
        this.value = value;
    }

    @Override
    public String toJava() {
        return null;
    }
}
