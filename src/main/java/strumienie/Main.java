package strumienie;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
       IntStream stream = IntStream.of(1, 2, 3, 4, 5);
       stream.filter(n -> n % 2 == 0)
               .forEach(System.out::println);
    }
}
