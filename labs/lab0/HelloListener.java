// Generated from Hello.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#token}.
	 * @param ctx the parse tree
	 */
	void enterToken(@NotNull HelloParser.TokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#token}.
	 * @param ctx the parse tree
	 */
	void exitToken(@NotNull HelloParser.TokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(@NotNull HelloParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(@NotNull HelloParser.RContext ctx);
}