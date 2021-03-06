/**
 * Created by Cr1xus on 11/27/16.
 */
import org.antlr.v4.runtime.ParserRuleContext;

public class EvalException extends RuntimeException {
    public EvalException(ParserRuleContext ctx) {
        this("Illegal expression: "+ctx.getText(), ctx);
    }

    public EvalException(String msg, ParserRuleContext ctx) {
        super(msg+" line:"+ctx.start.getLine());
    }
}
