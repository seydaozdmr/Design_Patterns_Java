package Creational.AbstractFactory.University;

public class OpenUniversity implements UniversityFactory{
    @Override
    public Course createCourse() {
        return new OpenCourse();
    }

    @Override
    public Professor createProfessor() {
        return new OpenUniversityProfessor();
    }

    @Override
    public Schedule createSchedule() {
        return new OpenUniversitySchedule();
    }
}
