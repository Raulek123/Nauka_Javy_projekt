package strumienie;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntermediateOperations {
    public static void main(String[] args) {
        List<Integer> collect = IntStream.rangeClosed(0, 10)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
