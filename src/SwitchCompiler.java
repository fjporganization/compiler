import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class SwitchCompiler extends CBaseListener {

    private final CompilerData data;
    private Stack<SwitchObject> switches;

    class SwitchObject {
        Queue<Instruction> insQueue;
        List<Instruction> insList;
        Instruction loadCmpValue;

        SwitchObject(){
            insQueue = new LinkedBlockingQueue<>();
            insList = new ArrayList<>();
            this.loadCmpValue = null;
        }
    }


    public SwitchCompiler(CompilerData data){
        this.data = data;
        switches = new Stack<>();
    }

    @Override
    public void enterSwitchcondition(CParser.SwitchconditionContext ctx) {
        switches.push(new SwitchObject());
    }

    @Override
    public void exitSwitchcondition(CParser.SwitchconditionContext ctx) {
        SwitchObject obj = switches.pop();

        int endAdr = data.getCurrentInstructionAddress() + 1;

        for(Instruction ins : obj.insList){
            ins.setOperand(endAdr);
        }

        for (Instruction ins : obj.insQueue){
            ins.setOperand(endAdr);
        }
    }

    @Override
    public void enterSwitchcase(CParser.SwitchcaseContext ctx) {
        if(switches.peek().loadCmpValue == null) {
            switches.peek().loadCmpValue = data.getOutput().remove(data.getOutput().size() - 1);
        }

        // Get jump from last case block to set address
        Instruction lastJump = switches.peek().insQueue.poll();
        if(lastJump != null){
            lastJump.setOperand(data.getCurrentInstructionAddress() + 1);
        }
    }

    @Override
    public void enterSwitchstatement(CParser.SwitchstatementContext ctx) {
        // Get jump from last case block to set address
        Instruction lastJump = switches.peek().insQueue.poll();

        // Comparison
        data.addInstruction(switches.peek().loadCmpValue);
        data.addInstruction(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.EQUALITY));

        // Jump to next next case
        Instruction jump = new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0, -1);
        data.addInstruction(jump);
        switches.peek().insQueue.offer(jump);
        data.incStackPointer();

        if(lastJump != null){
            lastJump.setOperand(data.getCurrentInstructionAddress() + 1);
        }
    }

    @Override
    public void exitSwitchstatement(CParser.SwitchstatementContext ctx) {
        if(ctx.BREAKKEYWORD() != null) {
            Instruction breakJump = new Instruction(InstructionCodes.JUMP, 0, -1);
            data.addInstruction(breakJump);
            switches.peek().insList.add(breakJump);
        }

        Instruction jump = new Instruction(InstructionCodes.JUMP, 0, -1);
        data.addInstruction(jump);
        switches.peek().insQueue.offer(jump);
    }

    @Override
    public void enterSwitchdefaultstatement(CParser.SwitchdefaultstatementContext ctx) {

        for(int i = 0; i < 2; i ++) {
            // Get jump from last case block to set address
            Instruction lastJump = switches.peek().insQueue.poll();

            if (lastJump != null) {
                lastJump.setOperand(data.getCurrentInstructionAddress() + 1);
            } else {
                break;
            }
        }
    }
}
