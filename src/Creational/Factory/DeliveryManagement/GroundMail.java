package Creational.Factory.DeliveryManagement;

public class GroundMail implements Mail{

    @Override
    public Transport createTransport(String type) {
        if(type.equals("Truck")){
            return new Truck();
        }else if(type.equals("Train")){
            return new Train();
        }
        return null;
    }
}
