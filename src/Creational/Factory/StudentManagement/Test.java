package Creational.Factory.StudentManagement;

public class Test {
    public static void main(String[] args) {
        StudentFactory factory=new DoktoraStudentFactory();
        try {
            StudentPool.addStudent(factory.create("ali"));
            StudentPool.addStudent(factory.create("hasan"));
            StudentPool.addStudent(factory.create("mahmut"));
            StudentPool.addStudent(factory.create("yasin"));

        } catch (StudentAddFailedException e) {
            e.printStackTrace();
        }
        factory=new OnLisansStudentFactory();
        try {
            StudentPool.addStudent(factory.create("mustafa"));
            StudentPool.addStudent(factory.create("kemal"));
            StudentPool.addStudent(factory.create("davut"));
            StudentPool.addStudent(factory.create("mavut"));

        } catch (StudentAddFailedException e) {
            e.printStackTrace();
        }

        StudentPool.printList();
        System.out.println("***Devamlı Olanlar ***");
        StudentPool.printDevamList(true);
        System.out.println("***Devamsız Olanlar ***");
        StudentPool.printDevamList(false);

    }
}
