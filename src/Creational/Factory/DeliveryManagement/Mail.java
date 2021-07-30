package Creational.Factory.DeliveryManagement;

public interface Mail {
    Transport createTransport(String type);
}
