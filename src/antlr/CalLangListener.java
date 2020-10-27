// Generated from /home/hackerbuddy/dev/opensource/calang/src/CalLang.g4 by ANTLR 4.8

package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalLangParser}.
 */
public interface CalLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CalLangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CalLangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CalLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CalLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalLangParser#vardeclare}.
	 * @param ctx the parse tree
	 */
	void enterVardeclare(CalLangParser.VardeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalLangParser#vardeclare}.
	 * @param ctx the parse tree
	 */
	void exitVardeclare(CalLangParser.VardeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalLangParser#varassign}.
	 * @param ctx the parse tree
	 */
	void enterVarassign(CalLangParser.VarassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalLangParser#varassign}.
	 * @param ctx the parse tree
	 */
	void exitVarassign(CalLangParser.VarassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalLangParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(CalLangParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalLangParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(CalLangParser.ShowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Substraction}
	 * labeled alternative in {@link CalLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubstraction(CalLangParser.SubstractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Substraction}
	 * labeled alternative in {@link CalLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubstraction(CalLangParser.SubstractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link CalLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(CalLangParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link CalLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(CalLangParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link CalLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddition(CalLangParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link CalLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddition(CalLangParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link CalLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(CalLangParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link CalLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(CalLangParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link CalLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CalLangParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link CalLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CalLangParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEqual}
	 * labeled alternative in {@link CalLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotEqual(CalLangParser.NotEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEqual}
	 * labeled alternative in {@link CalLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotEqual(CalLangParser.NotEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link CalLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqual(CalLangParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link CalLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqual(CalLangParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link CalLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(CalLangParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link CalLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(CalLangParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Literal}
	 * labeled alternative in {@link CalLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CalLangParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Literal}
	 * labeled alternative in {@link CalLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CalLangParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Division}
	 * labeled alternative in {@link CalLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivision(CalLangParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link CalLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivision(CalLangParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link CalLangParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(CalLangParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link CalLangParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(CalLangParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalLangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CalLangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalLangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CalLangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalLangParser#blockbody}.
	 * @param ctx the parse tree
	 */
	void enterBlockbody(CalLangParser.BlockbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalLangParser#blockbody}.
	 * @param ctx the parse tree
	 */
	void exitBlockbody(CalLangParser.BlockbodyContext ctx);
}