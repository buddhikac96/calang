package ast;

import transpiler.astVisitor.Visitor;

public class VarDeclare extends Statement {
    String datatype;
    String name;
    Expression value;

    public VarDeclare(String datatype, String name, Expression value) {
        this.datatype = datatype;
        this.name = name;
        this.value = value;
    }

    @Override
    public String toJava() {
        return new StringBuilder(this.datatype)
                .append(" " + this.name + " = ")
                .append(this.value.toJava())
                .append(";")
                .toString();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitVarDeclare(this);
    }
}

