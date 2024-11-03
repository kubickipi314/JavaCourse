package Generics.Example;

import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static <T extends Shape> void draw(T shape) {
        System.out.println(shape.getName());

        if (shape instanceof Circle circle) {
            System.out.println("Radius: " + circle.getRadius());
        }

        if (shape instanceof Square square) {
            System.out.println("Side: " + square.getSide());
        }

    }

    public static void main(String[] args) {

        //KOLEKCJE
        Integer i;
        List rowList = new ArrayList<Integer>();
        rowList.add(5);                             //niesprawdzone wywołanie
        i = (Integer) rowList.get(0);               //potrzebne kastowanie

        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        i = integerList.get(0);


        //GENERIC METHOD
        Shape sh = new Shape();
        Circle ci = new Circle(4);
        Square sq = new Square(5);

        draw(sh);
        draw(ci);
        draw(sq);

    }
}
