package transpiler.astVisitor;

import ast.*;

public interface Visitor {
    void visitProgram(AstNode node);
    void visitAddition(Addition node);
    void visitBlock(AstNode node);
    void visitBlockBody(BlockBody node);
    void visitDivision(Division node);
    void visitFloatLit(FloatLit node);
    void visitIfStatement(IfStatement node);
    void visitIntegerLit(IntegerLit node);
    void visitMultiplication(Multiplication node);
    void visitShow(Show node);
    void visitSubtraction(Subtraction node);
    void visitVarAssign(VarAssign node);
    void visitVarDeclare(VarDeclare node);
    void visitVariable(Variable node);
}
