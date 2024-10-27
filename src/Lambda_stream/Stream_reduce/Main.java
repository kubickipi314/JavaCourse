package Lambda_stream.Stream_reduce;


import Lambda_stream.Stream_collect.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Max", 18),
                new Person("Peter", 23),
                new Person("Pamela", 23),
                new Person("David", 12),
                new Person("Pamela", 5)
        );

        System.out.println("\nREDUCTION TO ONE STRING:");
        Optional<String> reduced =
                Stream.of("ddd2", "aaa2", "bbb1", "aaa1", "bbb3", "ccc", "bbb2", "ddd1")
                        .sorted()
                        .reduce((s1, s2) -> s1 + " # " + s2);
        reduced.ifPresent(System.out::println);

//        System.out.println("\nREDUCTION TO ONE SUM:");
//        Integer ageSum = people
//                .stream()
//                .reduce(0, (sum, p) -> sum + p.age); //not working, reduce expects Person object
//        System.out.println(ageSum);

        System.out.println("\nREDUCTION TO ONE SUM:");
        Integer ageSum2 = people
                .stream()
                .reduce(0, (sum, p) -> sum + p.age, (int1, int2) -> int1 + int2);
        System.out.println(ageSum2);
    }
}