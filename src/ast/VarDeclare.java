package ast;

public class VarDeclare extends Statement {
    String datatype;
    String name;
    Literal literal;

    public VarDeclare(String datatype, String name, Literal literal) {
        this.datatype = datatype;
        this.name = name;
        this.literal = literal;
    }

    @Override
    public String toJava() {
        return new StringBuilder(this.datatype)
                .append(" " + this.name + " = ")
                .append(this.literal.toJava())
                .append(";")
                .toString();
    }
}

