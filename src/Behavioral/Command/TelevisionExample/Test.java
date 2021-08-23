package Behavioral.Command.TelevisionExample;

public class Test {
    public static void main(String[] args) {
        RemoteController remoteController=new RemoteController();
        Television television=new Television();

        television.printStatus();

        remoteController.pressButton(television::turn);

        television.printStatus();

        remoteController.pressButton(television::changeChanelUp);
        remoteController.pressButton(television::changeVolumeUp);
        television.printStatus();

        remoteController.undoLastPress();
        television.printStatus();
        remoteController.undoLastPress();
        television.printStatus();
        remoteController.redoLastPress();
        television.printStatus();


    }
}
