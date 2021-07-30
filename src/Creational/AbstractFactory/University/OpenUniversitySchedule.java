package Creational.AbstractFactory.University;

import java.time.LocalTime;

public class OpenUniversitySchedule implements Schedule{
    @Override
    public void makeSchedule() {
        System.out.println("Açık Öğretim dersleri : "+ LocalTime.of(18,30).toString()+ " da başlar.");
    }
}
