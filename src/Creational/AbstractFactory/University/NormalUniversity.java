package Creational.AbstractFactory.University;

public class NormalUniversity implements UniversityFactory{
    @Override
    public Course createCourse() {
        return new NormalCourse();
    }

    @Override
    public Professor createProfessor() {
        return new UniversityProfessor();
    }

    @Override
    public Schedule createSchedule() {
        return new UniversitySchedule();
    }
}
