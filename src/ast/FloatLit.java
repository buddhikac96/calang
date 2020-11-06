package ast;

import transpiler.astVisitor.Visitor;

public class FloatLit extends Expression {
    float value;

    public FloatLit(float value) {
        this.value = value;
    }

    @Override
    public String toJava() {
        return Float.toString(this.value);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitFloatLit(this);
    }
}
