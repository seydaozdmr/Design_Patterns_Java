package Creational.Factory.DeliveryManagement;

public class Test {


    public static void main(String[] args) {
        Mail mail=new AirMail();
        Transport transport = mail.createTransport("Plane");
        transport.makeDelivery();
    }
}
