package ast;

public class Variable extends Expression {

    String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public String toJava() {
        return this.name;
    }
}
