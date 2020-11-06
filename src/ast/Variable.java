package ast;

import transpiler.astVisitor.Visitor;

public class Variable extends Expression {

    String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public String toJava() {
        return this.name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitVariable(this);
    }
}
