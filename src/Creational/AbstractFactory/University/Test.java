package Creational.AbstractFactory.University;

public class Test {
    public static void main(String[] args) {
        UniversityFactory factory=new OpenUniversity();
        Schedule schedule = factory.createSchedule();
        schedule.makeSchedule();
    }
}
