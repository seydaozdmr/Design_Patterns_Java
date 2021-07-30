package Creational.Factory.StudentManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentPool {
    private static final List<Student> students =new ArrayList<>();

    public StudentPool() {
    }

    public static boolean addStudent(Student student) throws StudentAddFailedException {
        if(students.add(student)){
            return true;
        }else{
            throw new StudentAddFailedException("Öğrenci eklerken hata ile kaşılaşıldı.");
        }
    }

    public static int getLastNo(){
        return students.size();
    }

    public static void printList(){
        for(Student s:students){
            System.out.println(s.getNo()+" : "+s.getName());
        }
    }
    public static void printDevamList(boolean devamDurumu){
        List<Student> list= students.stream().filter(e->devamDurumu == e.devam()).collect(Collectors.toList());
        for(Student s:list){
            System.out.println(s.getNo()+" : "+s.getName());
        }
    }
}
