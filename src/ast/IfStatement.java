package ast;

public class IfStatement extends Statement {

    Expression condition;
    Statement ifBlock;
    Statement elseBlock;

    public IfStatement(Expression condition, Statement ifBlock, Statement elseBlock) {
        this.condition = condition;
        this.ifBlock = ifBlock;
        this.elseBlock = elseBlock;
    }

    @Override
    public String toJava() {
        StringBuilder jcode =  new StringBuilder("if(")
                .append(this.condition.toJava())
                .append(")")
                .append(this.ifBlock.toJava());

        if(this.elseBlock != null){
            jcode.append("else").append(this.elseBlock.toJava());
        }

        return jcode.toString();
    }
}
