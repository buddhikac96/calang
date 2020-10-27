package ast;

public class FloatLit extends Literal {
    float value;

    public FloatLit(float value) {
        this.value = value;
    }

    @Override
    public String toJava() {
        return new Float(this.value).toString();
    }
}
