package Creational.Factory.StudentManagement;

public class LisansStudentFactory implements StudentFactory{
    @Override
    public Student create(String name) {
        return new Lisans(StudentPool.getLastNo()+1,name);
    }
}
