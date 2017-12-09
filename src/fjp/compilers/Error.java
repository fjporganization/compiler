package fjp.compilers;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.ParseCancellationException;

/**
 * Class is for throwing ParseCancellationException to stop parsing.
 */
public class Error {

    /**
     * Indicates that exception was throw.
     */
    private static boolean inError = false;

    /**
     * If variable inError is set to false throw ParseCancellationException and set inError to true.
     * Into message is added Line and column number: "Error(LN, CN): message"
     *
     * @param ctx     Parse rule context
     * @param message which is added to exception
     */
    public static void throwError(ParserRuleContext ctx, String message) {

        if (inError) {
            return;
        }

        inError = true;
        String msg = "Error(" + ctx.getStart().getLine() + ", " + ctx.getStart().getCharPositionInLine() + "): ";
        throw new ParseCancellationException(msg + message);
    }

    /**
     * Set variable inError to false. New exception can be throw.
     */
    public static void resetError() {
        inError = false;
    }

    /**
     * Return true if exception was thrown.
     *
     * @return true if exception was thrown, false otherwise
     */
    public static boolean inError() {
        return inError;
    }
}
