package Lambda_stream.Stream_collect;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Max", 18),
                new Person("Peter", 23),
                new Person("Pamela", 23),
                new Person("David", 12),
                new Person("Pamela", 5)
        );

        System.out.println("\nTO LIST:");
        List<Person> filtered = people
                .stream()
                .filter(p -> p.getName().startsWith("P"))
                .collect(Collectors.toList());
        System.out.println(filtered);

        System.out.println("\nGROUPING BY:");
        Map<Integer, List<Person>> peopleByAge = people
                .stream()
                .collect(Collectors.groupingBy(p -> p.age));
        peopleByAge
                .forEach((age, p) -> System.out.format("age%s:%s\n", age, p));

        System.out.println("\nAVERAGAGING INT:");
        Double averageAge = people
                .stream()
                .collect(Collectors.averagingInt(p -> p.age));
        System.out.println(averageAge);

        System.out.println("\nSUMMARIZING INT:");
        IntSummaryStatistics ageSummary = people
                .stream()
                .collect(Collectors.summarizingInt(p -> p.age));
        System.out.println(ageSummary);

        System.out.println("\nJOINING");
        String phase = people
                .stream()
                .filter(p -> p.getAge() >= 18)
                .map(Person::getName)
                .collect(Collectors.joining(" and ", " In Poland ", " are of legal age."));
        System.out.println(phase);

        System.out.println("\nTO MAP");
        Map<Integer, String> map = people
                .stream()
                .collect(Collectors.toMap(
                        p -> p.age,
                        p -> p.name,
                        (name1, name2) -> name1 + " and " + name2));
        System.out.println(map);

        System.out.println("\nMaking Collector");
        Collector<Person,StringJoiner,String> personNameCollector =
                Collector.of(
                        () -> new StringJoiner(" | "),// supplier
                        (j, p) -> j.add(p.name.toUpperCase()), // accumulator
                        StringJoiner::merge,// combiner
                        StringJoiner::toString);// finisher

        String names = people
                .stream()
                .collect(personNameCollector);

        System.out.println(names);
    }
}