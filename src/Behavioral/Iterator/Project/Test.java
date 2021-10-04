package Behavioral.Iterator.Project;

public class Test {
    public static void main(String[] args) {
        Project project=new Project("Ab Projesi",16500);
        System.out.println(project.calculateRisk());
        Task task = new Task("Fransa hareketlilik",project,1500);
        System.out.println(project.calculateRisk());
        Issue issue= new Issue("matbaa",project,500);
        System.out.println(project.calculateRisk());

        //project.list();

        Iterator<Item> iterator=new ItemIterator(project);
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
