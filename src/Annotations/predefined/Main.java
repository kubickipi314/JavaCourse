package Annotations.predefined;

import org.checkerframework.checker.nullness.qual.NonNull;

public class Main {
    private static IntWrap getIntWrap(){
        return null;
    }
    public static void main(String[] args){

        IntWrap myNumber;

        myNumber = getIntWrap();

        System.out.println(myNumber == null);
    }
}
