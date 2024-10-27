package Lambda_stream.Stream_example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList(
                "aaa", "aba", "bab", "aca", "cbc", "cac", "ccc", "bcb"
        );

        myList
                . stream ()
                . filter ( s -> s . startsWith ( "c" ) )
                . map ( String :: toUpperCase )
                . sorted ()
                . forEach ( System . out :: println ) ;

        System.out.print("\n");

        Stream.of("aaa", "aba", "bab", "aca", "cbc", "cac", "ccc", "bcb")
                . filter ( s -> s . startsWith ( "c" ) )
                . map ( String :: toUpperCase )
                . sorted ()
                . forEach ( System . out :: println ) ;
    }
}