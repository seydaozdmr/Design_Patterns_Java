package Behavioral.Mediator.Traffic;

import java.util.ArrayList;
import java.util.List;

public class TrafficPolice implements TrafficMediator{
    private String name;
    private Junction junction;
    private List<Vehicle> vehicles;

    public TrafficPolice(String name, Junction junction) {
        this.name = name;
        this.junction = junction;
        vehicles=new ArrayList<>();
        System.out.println("Traffic police :"+name+ " is created..");
    }

    @Override
    public void receive(Vehicle vehicle) {
        //bilgiyi alınca önce durduruyor ve sıraya ekliyor
        vehicle.stopp();
        vehicles.add(vehicle);
    }

    @Override
    public void askPermitToPass(Vehicle vehicle) {
        if(!junction.isBusy()){
            junction.setBusy(true);
            vehicle.proceed();
        }else {
            vehicle.waitForAWhile();
        }
    }

    @Override
    public void done(Vehicle vehicle) {
        vehicles.remove(vehicle);
        junction.setBusy(false);
    }
}
