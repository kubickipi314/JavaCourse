package Generics.WildcardList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void printList(List<?> list) {
        for (Object elem : list)
            System.out.print(elem + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        printList(l1);

        List<String> l2 = new ArrayList<>(Arrays.asList("1", "2", "3", "4"));
        printList(l2);
    }
}
