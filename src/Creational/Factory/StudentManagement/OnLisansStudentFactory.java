package Creational.Factory.StudentManagement;

import java.util.Random;

public class OnLisansStudentFactory implements StudentFactory{
    @Override
    public Student create(String name) {
        OnLisans onLisans= new OnLisans(StudentPool.getLastNo()+1,name);
        double rastgele=Math.random();
        if(rastgele<0.5){
            onLisans.devamsiz();
        }
        return onLisans;
    }
}
