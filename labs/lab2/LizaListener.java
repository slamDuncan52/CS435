// Generated from Liza.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LizaParser}.
 */
public interface LizaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LizaParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(@NotNull LizaParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizaParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(@NotNull LizaParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LizaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(@NotNull LizaParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(@NotNull LizaParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LizaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull LizaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull LizaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LizaParser#loc}.
	 * @param ctx the parse tree
	 */
	void enterLoc(@NotNull LizaParser.LocContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizaParser#loc}.
	 * @param ctx the parse tree
	 */
	void exitLoc(@NotNull LizaParser.LocContext ctx);
	/**
	 * Enter a parse tree produced by {@link LizaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull LizaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull LizaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LizaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull LizaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull LizaParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LizaParser#join}.
	 * @param ctx the parse tree
	 */
	void enterJoin(@NotNull LizaParser.JoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizaParser#join}.
	 * @param ctx the parse tree
	 */
	void exitJoin(@NotNull LizaParser.JoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link LizaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull LizaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull LizaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LizaParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(@NotNull LizaParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizaParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(@NotNull LizaParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link LizaParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(@NotNull LizaParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizaParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(@NotNull LizaParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link LizaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull LizaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull LizaParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link LizaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull LizaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull LizaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LizaParser#decls}.
	 * @param ctx the parse tree
	 */
	void enterDecls(@NotNull LizaParser.DeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizaParser#decls}.
	 * @param ctx the parse tree
	 */
	void exitDecls(@NotNull LizaParser.DeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LizaParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(@NotNull LizaParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizaParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(@NotNull LizaParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link LizaParser#rel}.
	 * @param ctx the parse tree
	 */
	void enterRel(@NotNull LizaParser.RelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizaParser#rel}.
	 * @param ctx the parse tree
	 */
	void exitRel(@NotNull LizaParser.RelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LizaParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(@NotNull LizaParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizaParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(@NotNull LizaParser.DeclContext ctx);
}