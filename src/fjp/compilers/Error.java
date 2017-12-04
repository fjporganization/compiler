package fjp.compilers;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class Error {
    public static void throwError(ParserRuleContext ctx, String message){
        String msg = "Error(" + ctx.getStart().getLine() + ", " + ctx.getStart().getCharPositionInLine() + "): ";
        throw new ParseCancellationException(msg + message);
    }
}
