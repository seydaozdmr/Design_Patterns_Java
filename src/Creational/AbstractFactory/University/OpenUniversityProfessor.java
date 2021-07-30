package Creational.AbstractFactory.University;

public class OpenUniversityProfessor implements Professor{
    @Override
    public void makeLesson() {
        System.out.println("Uzaktan eğitim dersi veriyorum.");
    }
}
