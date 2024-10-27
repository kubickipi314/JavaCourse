package Lambda_stream.Stream_example;

import java.util.stream.Stream;

public class Order {
    public static void main(String[] agrs) {
        Stream.of("d1", "a1", "b1", "b2", "a2")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("A");
                })
                .forEach(s -> System.out.println("forEach: " + s));
    }
}
