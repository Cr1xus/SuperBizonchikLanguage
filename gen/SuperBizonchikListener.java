// Generated from /Users/Cr1xus/Documents/git_projects/SuperBizonchikLanguage/src/SuperBizonchik.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SuperBizonchikParser}.
 */
public interface SuperBizonchikListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SuperBizonchikParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(SuperBizonchikParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuperBizonchikParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(SuperBizonchikParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuperBizonchikParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SuperBizonchikParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuperBizonchikParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SuperBizonchikParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuperBizonchikParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SuperBizonchikParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuperBizonchikParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SuperBizonchikParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuperBizonchikParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SuperBizonchikParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuperBizonchikParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SuperBizonchikParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierFunctionCall}
	 * labeled alternative in {@link SuperBizonchikParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierFunctionCall(SuperBizonchikParser.IdentifierFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierFunctionCall}
	 * labeled alternative in {@link SuperBizonchikParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierFunctionCall(SuperBizonchikParser.IdentifierFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printlnFunctionCall}
	 * labeled alternative in {@link SuperBizonchikParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterPrintlnFunctionCall(SuperBizonchikParser.PrintlnFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printlnFunctionCall}
	 * labeled alternative in {@link SuperBizonchikParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitPrintlnFunctionCall(SuperBizonchikParser.PrintlnFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printFunctionCall}
	 * labeled alternative in {@link SuperBizonchikParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterPrintFunctionCall(SuperBizonchikParser.PrintFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printFunctionCall}
	 * labeled alternative in {@link SuperBizonchikParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitPrintFunctionCall(SuperBizonchikParser.PrintFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuperBizonchikParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(SuperBizonchikParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuperBizonchikParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(SuperBizonchikParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuperBizonchikParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(SuperBizonchikParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuperBizonchikParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(SuperBizonchikParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuperBizonchikParser#elseIfStat}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStat(SuperBizonchikParser.ElseIfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuperBizonchikParser#elseIfStat}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStat(SuperBizonchikParser.ElseIfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuperBizonchikParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void enterElseStat(SuperBizonchikParser.ElseStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuperBizonchikParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void exitElseStat(SuperBizonchikParser.ElseStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuperBizonchikParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(SuperBizonchikParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuperBizonchikParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(SuperBizonchikParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuperBizonchikParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(SuperBizonchikParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuperBizonchikParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(SuperBizonchikParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuperBizonchikParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(SuperBizonchikParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuperBizonchikParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(SuperBizonchikParser.IdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuperBizonchikParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(SuperBizonchikParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuperBizonchikParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(SuperBizonchikParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLtExpression(SuperBizonchikParser.LtExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLtExpression(SuperBizonchikParser.LtExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gtExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGtExpression(SuperBizonchikParser.GtExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gtExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGtExpression(SuperBizonchikParser.GtExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(SuperBizonchikParser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(SuperBizonchikParser.BoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notEqExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotEqExpression(SuperBizonchikParser.NotEqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notEqExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotEqExpression(SuperBizonchikParser.NotEqExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpression(SuperBizonchikParser.NumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpression(SuperBizonchikParser.NumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(SuperBizonchikParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(SuperBizonchikParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modulusExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterModulusExpression(SuperBizonchikParser.ModulusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modulusExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitModulusExpression(SuperBizonchikParser.ModulusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(SuperBizonchikParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(SuperBizonchikParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplyExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpression(SuperBizonchikParser.MultiplyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplyExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpression(SuperBizonchikParser.MultiplyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gtEqExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGtEqExpression(SuperBizonchikParser.GtEqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gtEqExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGtEqExpression(SuperBizonchikParser.GtEqExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divideExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivideExpression(SuperBizonchikParser.DivideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divideExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivideExpression(SuperBizonchikParser.DivideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(SuperBizonchikParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(SuperBizonchikParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpression(SuperBizonchikParser.UnaryMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpression(SuperBizonchikParser.UnaryMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpression(SuperBizonchikParser.PowerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpression(SuperBizonchikParser.PowerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqExpression(SuperBizonchikParser.EqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqExpression(SuperBizonchikParser.EqExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(SuperBizonchikParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(SuperBizonchikParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(SuperBizonchikParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(SuperBizonchikParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionExpression(SuperBizonchikParser.ExpressionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionExpression(SuperBizonchikParser.ExpressionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(SuperBizonchikParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(SuperBizonchikParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtractExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubtractExpression(SuperBizonchikParser.SubtractExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtractExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubtractExpression(SuperBizonchikParser.SubtractExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNullExpression(SuperBizonchikParser.NullExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNullExpression(SuperBizonchikParser.NullExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(SuperBizonchikParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(SuperBizonchikParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltEqExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLtEqExpression(SuperBizonchikParser.LtEqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltEqExpression}
	 * labeled alternative in {@link SuperBizonchikParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLtEqExpression(SuperBizonchikParser.LtEqExpressionContext ctx);
}