package strumienie;

import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
       IntStream stream = IntStream.of(1, 2, 3, 4, 5);
       stream.filter(n -> n % 2 != 0)
               .forEach(System.out::println);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        Stream<String> stringStream = Stream.of("a", "b", "c");
        stringStream.map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        IntStream iterate = IntStream.iterate(0, x -> x + 1);
        iterate.limit(10)
                .forEach(System.out::println);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        IntStream rangeClosed = IntStream.rangeClosed(0, 9);
        rangeClosed.forEach(System.out::println);
    }
}
