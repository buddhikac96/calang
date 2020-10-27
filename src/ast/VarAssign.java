package ast;

public class VarAssign extends Statement {

    String name;
    Literal literal;

    public VarAssign(String name, Literal literal) {
        this.name = name;
        this.literal = literal;
    }

    @Override
    public String toJava() {
        return new StringBuilder(this.name)
                .append(" = ")
                .append(this.literal.toJava())
                .toString();
    }
}


