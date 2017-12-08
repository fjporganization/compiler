package fjp.compilers;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class Error {

    private static boolean inError = false;

    public static void throwError(ParserRuleContext ctx, String message){

        if(inError){
            return;
        }

        inError = true;
        String msg = "Error(" + ctx.getStart().getLine() + ", " + ctx.getStart().getCharPositionInLine() + "): ";
        throw new ParseCancellationException(msg + message);
    }

    public static void resetError(){
        inError = false;
    }

    public static boolean inError(){
        return inError;
    }
}
