package Generics.Inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //List<? extends Integer> jest podtypem List<? extends Number>
        List<? extends Integer> intList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 5, 8, 13));
        List<? extends Number> numList = intList;
        System.out.println(numList);


        List<?> list;
        list = new ArrayList<Object>(List.of(new Object()));
        System.out.println(list);
        list = new ArrayList<String>(List.of("Raz", "Dwa", "Trzy"));
        System.out.println(list);
        list = new ArrayList<Integer>(List.of(1,2,3));
        System.out.println(list);


    }
}
