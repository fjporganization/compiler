

public class Compiler extends CBaseListener{
	
	@Override 
	public void exitVariabledeclaration(CParser.VariabledeclarationContext ctx) { 
		System.out.println("Variabledeclaration");
	}
	
	@Override 
	public void exitConstantdeclaration(CParser.ConstantdeclarationContext ctx) { 
		System.out.println("Constantdeclaration");
	}
	
	@Override 
	public void exitAssignment(CParser.AssignmentContext ctx) { 
		System.out.println("Assignment");
	}
	
	@Override 
	public void exitFunctiondeclaration(CParser.FunctiondeclarationContext ctx) {
		System.out.println("Functiondeclaration");
	}
	
	@Override 
	public void exitForloop(CParser.ForloopContext ctx) { 
		System.out.println("Forloop");
	}
	
	@Override 
	public void exitCondition(CParser.ConditionContext ctx) { 
		System.out.println("Condition");
	}
	
	@Override 
	public void enterWhileloop(CParser.WhileloopContext ctx) { 
		System.out.println("Whileloop");
	}
	
	@Override 
	public void enterDowhileloop(CParser.DowhileloopContext ctx) { 
		System.out.println("Dowhileloop");
	}
	
	@Override 
	public void exitFunctioncall(CParser.FunctioncallContext ctx) { 
		System.out.println("Functioncall");
	}
	
	@Override 
	public void exitSwitchcondition(CParser.SwitchconditionContext ctx) { 
		System.out.println("Switchcondition");
	}
	
	@Override 
	public void exitParallelassignment(CParser.ParallelassignmentContext ctx) {
		System.out.println("Parallelassignment");
	}
	
}
