package Callback;

public class SimbleTask extends Task{

    @Override
    public void execute() {
        System.out.println("Bir işlem gerçekleştirilecek ve daha sonra callback'in call methodu çağrılacak.");
    }
}
