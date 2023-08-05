package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RandomNumbers {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        Random random = new Random();

        Supplier<Integer> randomNumbers = () -> random.nextInt(20);

        for (int i = 0; i < 10; i++) {
            number.add(randomNumbers.get());
        }

        Consumer<Integer> printNumber = n -> System.out.print(n + " ");
        for (Integer integer : number) {
            printNumber.accept(integer);
        }

        Predicate<Integer> filterList = n -> n % 2 == 0;
    }
}
