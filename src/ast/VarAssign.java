package ast;

import transpiler.astVisitor.Visitor;

public class VarAssign extends Statement {

    String name;
    Expression expression;

    public VarAssign(String name, Expression expression) {
        this.name = name;
        this.expression = expression;
    }

    @Override
    public String toJava() {
        return new StringBuilder(this.name)
                .append(" = ")
                .append(this.expression.toJava())
                .toString();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitVarAssign(this);
    }
}


