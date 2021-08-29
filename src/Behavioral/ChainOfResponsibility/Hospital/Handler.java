package Behavioral.ChainOfResponsibility.Hospital;

public interface Handler {
    Prescription handleRequest(Context context);
}
