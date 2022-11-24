package com.designpatterns.command;

public class CommandTestDrive {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(4);
        Light kitchenLight = new Light("Kitchen");
        Light livingRoomLight = new Light("Living Room");
        Stereo mainStereo = new Stereo("Main Room");
        CeilingFan kitchenFan = new CeilingFan("Kitchen");

        remoteControl.setCommand(0, new LightOnCommand(kitchenLight), new LightOffCommand(kitchenLight));
        remoteControl.setCommand(1, new LightOnCommand(livingRoomLight), new LightOffCommand(livingRoomLight));
        remoteControl.setCommand(2, new StereoOnCommand(mainStereo), new StereoOffCommand(mainStereo));
        remoteControl.setCommand(3, new CeilingFanOnCommand(kitchenFan), new CeilingFanOffCommand(kitchenFan));

        System.out.println(remoteControl);

        remoteControl.onButtonPushed(0);
        remoteControl.onButtonPushed(1);
        remoteControl.onButtonPushed(2);
        remoteControl.onButtonPushed(3);
        System.out.println("*********");
        remoteControl.offButtonPushed(0);
        remoteControl.offButtonPushed(1);
        remoteControl.offButtonPushed(2);
        remoteControl.offButtonPushed(3);
        System.out.println("*********");
        remoteControl.onButtonPushed(2);
        remoteControl.undoLastAction();
    }
}
