package com.designpatterns.command;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl(int numSlots) {
        onCommands = new Command[numSlots];
        offCommands = new Command[numSlots];
        for (int i = 0; i < numSlots; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
        undoCommand = new NoCommand();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoLastAction() {
        System.out.println("Undoing last action...");
        undoCommand.undo();
        System.out.println("Undoing completed.");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            String onCommandName = onCommands[i].getClass().getName().split("\\.")[3];
            String offCommandName = offCommands[i].getClass().getName().split("\\.")[3];
            sb.append("[slot " + i + "] " + onCommandName
                    + " " + offCommandName + "\n");
        }
        return sb.toString();
    }
}
