package Creational.Prototype.Shape;

public class Circle extends Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle() {
    }


    @Override
    public Shape clone(){
        //Circle shape methodu kendi kopyasını üst sınıftan aldığı Clonable interface'inin clone methodunu kullanarak kendinden bir kopya oluşturuyor
        Circle circle=null;
        try{
            circle=(Circle) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return circle;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
