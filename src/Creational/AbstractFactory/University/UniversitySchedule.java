package Creational.AbstractFactory.University;

import java.time.LocalTime;

public class UniversitySchedule implements Schedule{
    @Override
    public void makeSchedule() {
        System.out.println("University dersleri : "+ LocalTime.of(9,0)+" da başlar");
    }
}
