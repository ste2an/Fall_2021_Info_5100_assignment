package assignment2.question1;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(){

    }

    public Rectangle(int side){
        this.height = side;
        this.width = side;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String name, String color, int width, int height) {
        super(name, color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    public int getPerimeter() {
        return (width + height) * 2;
    }

}
