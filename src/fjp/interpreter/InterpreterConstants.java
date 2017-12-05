package fjp.interpreter;

/**
 * Contains basic interpreter constants and settings for showing debugging informations
 *
 */
public class InterpreterConstants {
	
	/** maximum stack size */
	public static final int STACK_SIZE = 1000;
	
	/** indicates if stored value when processing STO instruction will be shown */
	public static final boolean SHOW_STORE = true;
	
	/** indicates if debug informations (stack pointer and program counter will be shown during processing every instruction */
	public static final boolean SHOW_DEBUG = false;
	
	/** indicates if current stack status will be shown during processing every instruction */
	public static final boolean SHOW_STACK = false;

	/**
	* getter for stackSize
	* @return the showStore
	*/
	public static int getStackSize() {
		return STACK_SIZE;
	}

	/**
	* getter for showStore
	* @return the showStore
	*/
	public static boolean isShowStore() {
		return SHOW_STORE;
	}

	/**
	* getter for showDebug
	* @return the showStore
	*/
	public static boolean isShowDebug() {
		return SHOW_DEBUG;
	}

	/**
	* getter for showStack
	* @return the showStore
	*/
	public static boolean isShowStack() {
		return SHOW_STACK;
	}

	
}
