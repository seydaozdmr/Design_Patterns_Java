package Behavioral.Command.ACSwithExample;

public class AirConditioner {
    private Temperature temperature;

    public AirConditioner(Temperature temperature) {
        this.temperature = temperature;
    }

    public void setTemperature(Temperature temperature){
        this.temperature=temperature;
    }


}
