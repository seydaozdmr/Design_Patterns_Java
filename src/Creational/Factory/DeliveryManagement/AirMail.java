package Creational.Factory.DeliveryManagement;

public class AirMail implements Mail{

    @Override
    public Transport createTransport(String type) {
        if(type.equals("Plane")){
            return new Plane();
        }
        return null;
    }
}
