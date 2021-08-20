package Behavioral.Command.ACSwithExample;

public class ACSwitch {
    private AirConditioner airConditioner;

    private Command turnOnCommand;
    private Command turnOffCommand;
    private Command turnOnHeaterCommand;
    private Command turnOnCoolerCommand;

    private Temperature startingTemperature;


    public ACSwitch(AirConditioner airConditioner) {
        this.airConditioner = new AirConditioner(startingTemperature);
        turnOnCommand=new TurnOnCommand(airConditioner);
    }

    public void turnOn(int temparature){
        turnOnCommand.execute(new Temperature(20));
    }

}
