package Creational.Factory.StudentManagement;

public class DoktoraStudentFactory implements StudentFactory{
    @Override
    public Student create(String name) {
        return new Doktora(StudentPool.getLastNo()+1,name);
    }
}
