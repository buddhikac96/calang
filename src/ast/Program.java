package ast;

import java.util.ArrayList;
import java.util.List;

public class Program {
    List<Statement> statementList;

    public Program() {
        this.statementList = new ArrayList<>();
    }

    public void addStatement(Statement statement){
        this.statementList.add(statement);
    }


}

