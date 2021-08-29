package Behavioral.ChainOfResponsibility.Hospital;

public class AbstractPrescription implements Prescription{
    protected String description;
    private Prescription prescription;

    public String getDescription(){
        return this.description;
    }


    @Override
    public void show() {
        System.out.println(description);
        if(prescription!=null){
            prescription.show();
            Prescription otherPrescription=prescription.getOtherPrescription();
            if(otherPrescription!=null){
                otherPrescription.show();
            }
        }
    }

    @Override
    public void setOtherPrescription(Prescription prescription) {
        this.prescription=prescription;
    }

    @Override
    public Prescription getOtherPrescription() {
        return this.prescription;
    }
}
