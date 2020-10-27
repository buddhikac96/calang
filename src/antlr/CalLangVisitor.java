// Generated from /home/hackerbuddy/dev/opensource/calang/src/CalLang.g4 by ANTLR 4.8

package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalLangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CalLangParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CalLangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalLangParser#vardeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardeclare(CalLangParser.VardeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalLangParser#varassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarassign(CalLangParser.VarassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalLangParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(CalLangParser.ShowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Substraction}
	 * labeled alternative in {@link CalLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstraction(CalLangParser.SubstractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link CalLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(CalLangParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link CalLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(CalLangParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link CalLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(CalLangParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Literal}
	 * labeled alternative in {@link CalLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(CalLangParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link CalLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(CalLangParser.DivisionContext ctx);
}