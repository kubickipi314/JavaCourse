package Generics.Example;

public class Circle extends Shape{
    private final int radius;

    public Circle(int radius){
        super("Circle");
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}
