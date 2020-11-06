package ast;

import transpiler.astVisitor.Visitor;

public interface AstNode {
    String toJava();

    void accept(Visitor visitor);
}
