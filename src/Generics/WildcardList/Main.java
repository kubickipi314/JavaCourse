package Generics.WildcardList;

import java.util.ArrayList;
import java.util.List;

public class Main {

//    public static void addNumbers(List<?> list) {
//        for (int i = 1; i <= 10; i++) {
//            list.add(i);
//        }
//    }

//    public static List<?> concat(List<?> list1, List<?> list2){
//        List<?> list3 = list1.add(list2);
//        return list1;
//    }
//    public static void printList(List<?> list) {
//        for (Object elem : list)
//            System.out.print(elem + " ");
//        System.out.println();
//    }

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>(List.of(1,2,3));
        List<? super Integer> list;

        list = new ArrayList<Integer>();
        list.add(1);

        list = intList;
        System.out.println(list);

        //addNumbers(list);

    }
}
