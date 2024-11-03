package Generics.Example;

public class Shape {
    String name;
    Shape(){
        this.name = "Shape";
    }
    Shape(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }
}
