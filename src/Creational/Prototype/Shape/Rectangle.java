package Creational.Prototype.Shape;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(Rectangle rectangle) {
        this.width=rectangle.width;
        this.height=rectangle.height;
    }

    public Rectangle() {
    }

    @Override
    protected Shape clone() throws CloneNotSupportedException {
        //Rectangle içindeki clone methodu new ile yeni bir nesne oluşturuyor ve aynı nesnenin constructor'ına kendini geçerek kendi
        //değerlerini kopyalıyor.
        return new Rectangle(this);
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
