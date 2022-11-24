package com.designpatterns.command;

public class StereoOnCommand implements Command {
    private Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.setCd();
        stereo.on();
    }

    @Override
    public void undo() {
        stereo.setRadio();
        stereo.off();
    }
}
