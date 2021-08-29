package Behavioral.ChainOfResponsibility.Hospital;

public class App {
    public static void main(String[] args) {
        Handler practitionerDoctor=null;
        Handler specialistDoctor=null;
        Handler professorDoctor=null;

        practitionerDoctor= new ProfessorDoctor(null,specialistDoctor);
        specialistDoctor=new SpecialistDoctor(professorDoctor,practitionerDoctor);
        practitionerDoctor=new PractitionerDoctor(specialistDoctor,null);

        Prescription prescription= practitionerDoctor.handleRequest(Context.SERIOUS_PATIENT);

        prescription.show();
    }
}
