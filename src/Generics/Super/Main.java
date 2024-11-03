package Generics.Super;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }

    public static void addCat(List<? super RedCat> catList) { //aby dodawany CzerwonyKot mógł być elementem listy
        catList.add(new RedCat("Red Cat"));
        System.out.println("RedCat Added");
    }

    public static void deleteCat(List<? extends Cat> catList, Cat cat) { //bo element listy jest Kotem, ..., Obiektem
        catList.remove(cat);
        System.out.println("Cat Removed");
    }

    public static void main(String[] args) {
        List<Object> l1 = new ArrayList<>();
        addNumbers(l1);
        List<Integer> l2 = new ArrayList<>();
        addNumbers(l2);
        //List<String> l3 = new ArrayList<>();
        //addNumbers(l3);


        System.out.println("Cat list:");
        List<Cat> catList = new ArrayList<>();

        addCat(catList);
        System.out.println(catList);

        System.out.println("RedCat list:");
        List<RedCat> redCatList = new ArrayList<>();
        RedCat redCat = new RedCat("cat");
        redCatList.add(redCat);

        Cat cat = redCat;
        deleteCat(redCatList, cat);
        System.out.println(redCatList);
    }
}
