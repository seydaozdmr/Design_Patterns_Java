package Behavioral.ChainOfResponsibility.Hospital;

public class SpecialistDoctor extends AbstractHandler{
    public SpecialistDoctor(Handler successor, Handler predecessor) {
        super(successor, predecessor);
        prescription=new SeriousPrescription();
    }

    @Override
    public Prescription handleRequest(Context context) {
        if(context==Context.SERIOUS_PATIENT){
            return prescription;
        }else{
            Prescription successorPrescription=successor.handleRequest(context);
            successorPrescription.setOtherPrescription(prescription);
            return successorPrescription;
        }
    }
}
