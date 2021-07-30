package Creational.AbstractFactory.University;

public class OpenCourse implements Course{
    @Override
    public void makeCourse() {
        System.out.println("Açık Öğretim Dersi");
    }
}
