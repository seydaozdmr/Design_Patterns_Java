package Behavioral.ChainOfResponsibility.Hospital;

public interface Prescription {
    void show();
    void setOtherPrescription(Prescription prescription);

    Prescription getOtherPrescription();

}
