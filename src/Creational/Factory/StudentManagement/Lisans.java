package Creational.Factory.StudentManagement;

public class Lisans implements Student{
    private int no;
    private String name;
    private boolean isDevam;

    public Lisans(int no, String name) {
        this.isDevam = true;
        this.no=no;
        this.name=name;
    }

    @Override
    public boolean devam() {
        return isDevam;
    }

    @Override
    public int getNo() {
        return no;
    }

    @Override
    public String getName() {
        return name;
    }
}
