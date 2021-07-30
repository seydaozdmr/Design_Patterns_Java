package Creational.AbstractFactory.University;

public interface UniversityFactory {
    Course createCourse();
    Professor createProfessor();
    Schedule createSchedule();
}
