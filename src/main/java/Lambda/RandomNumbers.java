package Lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RandomNumbers {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        Random random = new Random();

        suppList(number, 10, () -> random.nextInt(20));
        consumeList(number, n -> System.out.print(n + " "));
        predList(number, n -> n % 2 == 0);
        System.out.println();
        consumeList(number, n -> System.out.print(n + " "));

    }
    private static <T> void consumeList(List<T> list, Consumer<T> consumer){
        for (T t : list) {
            consumer.accept(t);
        }
    }

    private static <T> void suppList(List<T> list, int toGenerate, Supplier<T> supplier){
        for (int i = 0; i < toGenerate; i++) {
            list.add(supplier.get());
        }
    }

    private static <T> void predList(List<T> list, Predicate<T> predicate) {
        Iterator<T> iterator = list.iterator();
        while(iterator.hasNext()) {
            T next = iterator.next();
            if(predicate.test(next)){
                iterator.remove();
            }
        }
    }
}
