package Behavioral.ChainOfResponsibility.Hospital;

public class ProfessorDoctor extends AbstractHandler{
    public ProfessorDoctor(Handler successor, Handler predecessor) {
        super(successor, predecessor);
        prescription=new MortalPrescription();
    }

    @Override
    public Prescription handleRequest(Context context) {
        return prescription;
    }
}
