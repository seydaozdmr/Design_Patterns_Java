package Creational.AbstractFactory.University;

public class NormalCourse implements Course{
    @Override
    public void makeCourse() {
        System.out.println("Örgün Öğretim Dersi");
    }
}
