package Generics.Example;

public class Square extends Shape{
    private final int side;

    public Square(int side){
        super("Square");
        this.side = side;
    }

    public int getSide(){
        return side;
    }
}
