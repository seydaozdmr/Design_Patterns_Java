package Behavioral.ChainOfResponsibility.Hospital;

public class PractitionerDoctor extends AbstractHandler{
    public PractitionerDoctor(Handler successor, Handler predecessor) {
        super(successor, predecessor);
        prescription=new NormalPrescription();
    }

    @Override
    public Prescription handleRequest(Context context) {
        if(context==Context.NORMAL_PATIENT){
            //eğer normal bir hasta ise normal reçete gönderiyoruz.
            return prescription;
        }else{
            Prescription successorPrescription=successor.handleRequest(context);
            //az önceki reçeteyi de bir sonraki doktorun reçetesine ekledim
            successorPrescription.setOtherPrescription(prescription);
            return successorPrescription;
        }
    }
}
