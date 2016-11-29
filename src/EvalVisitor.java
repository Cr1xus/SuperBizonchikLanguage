/**
 * Created by Cr1xus on 11/27/16.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;


public class EvalVisitor extends SuperBizonchikBaseVisitor<SuperBizonchikValue> {
    private static ReturnValue returnValue = new ReturnValue();
    private Scope scope;
    private Map<String, Function> functions;

    public EvalVisitor(Scope scope, Map<String, Function> functions) {
        this.scope = scope;
        this.functions = functions;
    }

    // functionDecl
    @Override
    public SuperBizonchikValue visitFunctionDecl(SuperBizonchikParser.FunctionDeclContext ctx) {
        return SuperBizonchikValue.VOID;
    }


    // '-' expression                           #unaryMinusExpression
    @Override
    public SuperBizonchikValue visitUnaryMinusExpression(SuperBizonchikParser.UnaryMinusExpressionContext ctx) {
        SuperBizonchikValue v = this.visit(ctx.expression());
        if (!v.isNumber()) {
            throw new EvalException(ctx);
        }
        return new SuperBizonchikValue(-1 * v.asDouble());
    }

    // '!' expression                           #notExpression
    @Override
    public SuperBizonchikValue visitNotExpression(SuperBizonchikParser.NotExpressionContext ctx) {
        SuperBizonchikValue v = this.visit(ctx.expression());
        if(!v.isBoolean()) {
            throw new EvalException(ctx);
        }
        return new SuperBizonchikValue(!v.asBoolean());
    }

    // expression '^' expression                #powerExpression
    @Override
    public SuperBizonchikValue visitPowerExpression(SuperBizonchikParser.PowerExpressionContext ctx) {
        SuperBizonchikValue lhs = this.visit(ctx.expression(0));
        SuperBizonchikValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new SuperBizonchikValue(Math.pow(lhs.asDouble(), rhs.asDouble()));
        }
        throw new EvalException(ctx);
    }

    // expression '*' expression                #multiplyExpression
    @Override
    public SuperBizonchikValue visitMultiplyExpression(SuperBizonchikParser.MultiplyExpressionContext ctx) {
        SuperBizonchikValue lhs = this.visit(ctx.expression(0));
        SuperBizonchikValue rhs = this.visit(ctx.expression(1));
        if(lhs == null || rhs == null) {
            System.err.println("lhs "+ lhs+ " rhs "+rhs);
            throw new EvalException(ctx);
        }

        // number * number
        if(lhs.isNumber() && rhs.isNumber()) {
            return new SuperBizonchikValue(lhs.asDouble() * rhs.asDouble());
        }

        // string * number
        if(lhs.isString() && rhs.isNumber()) {
            StringBuilder str = new StringBuilder();
            int stop = rhs.asDouble().intValue();
            for(int i = 0; i < stop; i++) {
                str.append(lhs.asString());
            }
            return new SuperBizonchikValue(str.toString());
        }

        throw new EvalException(ctx);
    }

    // expression '/' expression                #divideExpression
    @Override
    public SuperBizonchikValue visitDivideExpression(SuperBizonchikParser.DivideExpressionContext ctx) {
        SuperBizonchikValue lhs = this.visit(ctx.expression(0));
        SuperBizonchikValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new SuperBizonchikValue(lhs.asDouble() / rhs.asDouble());
        }
        throw new EvalException(ctx);
    }

    // expression '%' expression                #modulusExpression
    @Override
    public SuperBizonchikValue visitModulusExpression(SuperBizonchikParser.ModulusExpressionContext ctx) {
        SuperBizonchikValue lhs = this.visit(ctx.expression(0));
        SuperBizonchikValue rhs = this.visit(ctx.expression(1));

        if (lhs.isNumber() && rhs.isNumber()) {
            return new SuperBizonchikValue(lhs.asDouble() % rhs.asDouble());
        }
        throw new EvalException(ctx);
    }

    // expression '+' expression                #addExpression
    @Override
    public SuperBizonchikValue visitAddExpression(@NotNull SuperBizonchikParser.AddExpressionContext ctx) {
        SuperBizonchikValue lhs = this.visit(ctx.expression(0));
        SuperBizonchikValue rhs = this.visit(ctx.expression(1));

        if(lhs == null || rhs == null) {
            throw new EvalException(ctx);
        }

        // number + number
        if(lhs.isNumber() && rhs.isNumber()) {
            return new SuperBizonchikValue(lhs.asDouble() + rhs.asDouble());
        }

        // string + any
        if(lhs.isString()) {
            return new SuperBizonchikValue(lhs.asString() + "" + rhs.toString());
        }

        // any + string
        if(rhs.isString()) {
            return new SuperBizonchikValue(lhs.toString() + "" + rhs.asString());
        }

        return new SuperBizonchikValue(lhs.toString() + rhs.toString());
    }

    // expression '-' expression                #subtractExpression
    @Override
    public SuperBizonchikValue visitSubtractExpression(SuperBizonchikParser.SubtractExpressionContext ctx) {
        SuperBizonchikValue lhs = this.visit(ctx.expression(0));
        SuperBizonchikValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new SuperBizonchikValue(lhs.asDouble() - rhs.asDouble());
        }
        throw new EvalException(ctx);
    }

    // expression '>=' expression               #gtEqExpression
    @Override
    public SuperBizonchikValue visitGtEqExpression(SuperBizonchikParser.GtEqExpressionContext ctx) {
        SuperBizonchikValue lhs = this.visit(ctx.expression(0));
        SuperBizonchikValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new SuperBizonchikValue(lhs.asDouble() >= rhs.asDouble());
        }
        if(lhs.isString() && rhs.isString()) {
            return new SuperBizonchikValue(lhs.asString().compareTo(rhs.asString()) >= 0);
        }
        throw new EvalException(ctx);
    }

    // expression '<=' expression               #ltEqExpression
    @Override
    public SuperBizonchikValue visitLtEqExpression(SuperBizonchikParser.LtEqExpressionContext ctx) {
        SuperBizonchikValue lhs = this.visit(ctx.expression(0));
        SuperBizonchikValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new SuperBizonchikValue(lhs.asDouble() <= rhs.asDouble());
        }
        if(lhs.isString() && rhs.isString()) {
            return new SuperBizonchikValue(lhs.asString().compareTo(rhs.asString()) <= 0);
        }
        throw new EvalException(ctx);
    }

    // expression '>' expression                #gtExpression
    @Override
    public SuperBizonchikValue visitGtExpression(SuperBizonchikParser.GtExpressionContext ctx) {
        SuperBizonchikValue lhs = this.visit(ctx.expression(0));
        SuperBizonchikValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new SuperBizonchikValue(lhs.asDouble() > rhs.asDouble());
        }
        if(lhs.isString() && rhs.isString()) {
            return new SuperBizonchikValue(lhs.asString().compareTo(rhs.asString()) > 0);
        }
        throw new EvalException(ctx);
    }

    // expression '<' expression                #ltExpression
    @Override
    public SuperBizonchikValue visitLtExpression(SuperBizonchikParser.LtExpressionContext ctx) {
        SuperBizonchikValue lhs = this.visit(ctx.expression(0));
        SuperBizonchikValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new SuperBizonchikValue(lhs.asDouble() < rhs.asDouble());
        }
        if(lhs.isString() && rhs.isString()) {
            return new SuperBizonchikValue(lhs.asString().compareTo(rhs.asString()) < 0);
        }
        throw new EvalException(ctx);
    }






    // expression '==' expression               #eqExpression
    @Override
    public SuperBizonchikValue visitEqExpression(@NotNull SuperBizonchikParser.EqExpressionContext ctx) {
        SuperBizonchikValue lhs = this.visit(ctx.expression(0));
        SuperBizonchikValue rhs = this.visit(ctx.expression(1));
        if (lhs == null) {
            throw new EvalException(ctx);
        }
        return new SuperBizonchikValue(lhs.equals(rhs));
    }

    // expression '!=' expression               #notEqExpression
    @Override
    public SuperBizonchikValue visitNotEqExpression(@NotNull SuperBizonchikParser.NotEqExpressionContext ctx) {
        SuperBizonchikValue lhs = this.visit(ctx.expression(0));
        SuperBizonchikValue rhs = this.visit(ctx.expression(1));
        return new SuperBizonchikValue(!lhs.equals(rhs));
    }

    // expression '&&' expression               #andExpression
    @Override
    public SuperBizonchikValue visitAndExpression(SuperBizonchikParser.AndExpressionContext ctx) {
        SuperBizonchikValue lhs = this.visit(ctx.expression(0));
        SuperBizonchikValue rhs = this.visit(ctx.expression(1));

        if(!lhs.isBoolean() || !rhs.isBoolean()) {
            throw new EvalException(ctx);
        }
        return new SuperBizonchikValue(lhs.asBoolean() && rhs.asBoolean());
    }

    // expression '||' expression               #orExpression
    @Override
    public SuperBizonchikValue visitOrExpression(SuperBizonchikParser.OrExpressionContext ctx) {
        SuperBizonchikValue lhs = this.visit(ctx.expression(0));
        SuperBizonchikValue rhs = this.visit(ctx.expression(1));

        if(!lhs.isBoolean() || !rhs.isBoolean()) {
            throw new EvalException(ctx);
        }
        return new SuperBizonchikValue(lhs.asBoolean() || rhs.asBoolean());
    }


    // Number                                   #numberExpression
    @Override
    public SuperBizonchikValue visitNumberExpression(@NotNull SuperBizonchikParser.NumberExpressionContext ctx) {
        return new SuperBizonchikValue(Double.valueOf(ctx.getText()));
    }

    // Bool                                     #boolExpression
    @Override
    public SuperBizonchikValue visitBoolExpression(@NotNull SuperBizonchikParser.BoolExpressionContext ctx) {
        return new SuperBizonchikValue(Boolean.valueOf(ctx.getText()));
    }

    // Null                                     #nullExpression
    @Override
    public SuperBizonchikValue visitNullExpression(@NotNull SuperBizonchikParser.NullExpressionContext ctx) {
        return SuperBizonchikValue.NULL;
    }

    // functionCall                    #functionCallExpression
    @Override
    public SuperBizonchikValue visitFunctionCallExpression(SuperBizonchikParser.FunctionCallExpressionContext ctx) {
        SuperBizonchikValue val = this.visit(ctx.functionCall());
        return val;
    }


    // Identifier                     #identifierExpression
    @Override
    public SuperBizonchikValue visitIdentifierExpression(@NotNull SuperBizonchikParser.IdentifierExpressionContext ctx) {
        String id = ctx.Identifier().getText();
        SuperBizonchikValue val = scope.resolve(id);

        return val;
    }

    // String                         #stringExpression
    @Override
    public SuperBizonchikValue visitStringExpression(@NotNull SuperBizonchikParser.StringExpressionContext ctx) {
        String text = ctx.getText();
        text = text.substring(1, text.length() - 1).replaceAll("\\\\(.)", "$1");
        SuperBizonchikValue val = new SuperBizonchikValue(text);
        return val;
    }

    // '(' expression ')'             #expressionExpression
    @Override
    public SuperBizonchikValue visitExpressionExpression(SuperBizonchikParser.ExpressionExpressionContext ctx) {
        SuperBizonchikValue val = this.visit(ctx.expression());
        return val;
    }

    // decrement
    @Override
    public SuperBizonchikValue visitDecrementExpression(SuperBizonchikParser.DecrementExpressionContext ctx){
        return SuperBizonchikValue.DECREMENT;
    }

    //increment
    @Override
    public SuperBizonchikValue visitIncrementExpression(SuperBizonchikParser.IncrementExpressionContext ctx){
        return SuperBizonchikValue.INCREMENT;
    }


    // assignment
    // : Identifier '=' expression
    // ;
    @Override
    public SuperBizonchikValue visitAssignment(@NotNull SuperBizonchikParser.AssignmentContext ctx) {
        SuperBizonchikValue newVal = this.visit(ctx.expression());
        String id = ctx.Identifier().getText();

        scope.assign(id, newVal);
        return SuperBizonchikValue.VOID;
    }

    // Identifier '(' exprList? ')' #identifierFunctionCall
    @Override
    public SuperBizonchikValue visitIdentifierFunctionCall(SuperBizonchikParser.IdentifierFunctionCallContext ctx) {
        List<SuperBizonchikParser.ExpressionContext> params = ctx.exprList() != null ? ctx.exprList().expression() : new ArrayList<SuperBizonchikParser.ExpressionContext>();
        String id = ctx.Identifier().getText() + params.size();
        Function function;
        if ((function = functions.get(id)) != null) {
            return function.invoke(params, functions, scope);
        }
        throw new EvalException(ctx);
    }

    // Println '(' expression? ')'  #printlnFunctionCall
    @Override
    public SuperBizonchikValue visitPrintlnFunctionCall(@NotNull SuperBizonchikParser.PrintlnFunctionCallContext ctx) {
        SuperBizonchikValue val = this.visit(ctx.expression());
        if(val.isNumber()){
            System.out.println(val.asInteger());
        }else{
            System.out.println(val);
        }
        return SuperBizonchikValue.VOID;
    }

    // Print '(' expression ')'     #printFunctionCall
    @Override
    public SuperBizonchikValue visitPrintFunctionCall(@NotNull SuperBizonchikParser.PrintFunctionCallContext ctx) {
        SuperBizonchikValue val = this.visit(ctx.expression());
        if(val.isNumber()){
            System.out.print(val.asInteger());
        }else{
            System.out.print(val);
        }
        return SuperBizonchikValue.VOID;
    }


    // ifStatement
    //  : ifStat elseIfStat* elseStat? End
    //  ;
    //
    // ifStat
    //  : If expression Do block
    //  ;
    //
    // elseIfStat
    //  : Else If expression Do block
    //  ;
    //
    // elseStat
    //  : Else Do block
    //  ;
    @Override
    public SuperBizonchikValue visitIfStatement(@NotNull SuperBizonchikParser.IfStatementContext ctx) {

        // if ...
        if(this.visit(ctx.ifStat().expression()).asBoolean()) {
            return this.visit(ctx.ifStat().block());
        }

        // else if ...
        for(int i = 0; i < ctx.elseIfStat().size(); i++) {
            if(this.visit(ctx.elseIfStat(i).expression()).asBoolean()) {
                return this.visit(ctx.elseIfStat(i).block());
            }
        }

        // else ...
        if(ctx.elseStat() != null) {
            return this.visit(ctx.elseStat().block());
        }

        return SuperBizonchikValue.VOID;
    }

    // block
    // : (statement | functionDecl)* (Return expression)?
    // ;
    @Override
    public SuperBizonchikValue visitBlock(SuperBizonchikParser.BlockContext ctx) {

        scope = new Scope(scope); // create new local scope
        for (SuperBizonchikParser.StatementContext sx: ctx.statement()) {
            this.visit(sx);
        }
        SuperBizonchikParser.ExpressionContext ex;
        if ((ex = ctx.expression()) != null) {
            returnValue.value = this.visit(ex);
            scope = scope.parent();
            throw returnValue;
        }
        scope = scope.parent();
        return SuperBizonchikValue.VOID;
    }


    // whileStatement
    // : While expression OBrace block CBrace
    // ;
    @Override
    public SuperBizonchikValue visitWhileStatement(SuperBizonchikParser.WhileStatementContext ctx) {
        while( this.visit(ctx.expression()).asBoolean() ) {
            SuperBizonchikValue returnValue = this.visit(ctx.block());
            if (returnValue != SuperBizonchikValue.VOID) {
                return returnValue;
            }
        }
        return SuperBizonchikValue.VOID;
    }

}
