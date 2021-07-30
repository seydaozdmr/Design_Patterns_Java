package Creational.Factory.StudentManagement;

public class Doktora implements Student{
    private int no;
    private String name;
    private boolean isDevam;

    public Doktora(int no,String name) {
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
