package Creational.Factory.StudentManagement;

public class OnLisans implements Student{
    private int no;
    private String name;
    private boolean isDevam;

    public OnLisans(int no,String name) {
        this.isDevam = true;
        this.no=no;
        this.name=name;
    }

    public void devamsiz(){
        this.isDevam=false;
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
