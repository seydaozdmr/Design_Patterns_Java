package Behavioral.Command.ACSwithExample;

public class TurnOnCommand implements Command{
    private AirConditioner airConditioner;

    public TurnOnCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute(Temperature temperature) {
        airConditioner.setTemperature(temperature);
    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }
}
