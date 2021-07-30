package Creational.AbstractFactory.University;

public class UniversityProfessor implements Professor{
    @Override
    public void makeLesson() {
        System.out.println("University professor ders veriyor");
    }
}
