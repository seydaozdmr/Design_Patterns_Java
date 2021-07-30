package Creational.Factory.StudentManagement;

public class YuksekLisansStudentFactory implements StudentFactory{
    @Override
    public Student create(String name) {
        return new YuksekLisans(StudentPool.getLastNo()+1,name);
    }
}
