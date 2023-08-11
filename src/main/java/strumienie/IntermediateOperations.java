package strumienie;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntermediateOperations {
    public static void main(String[] args) {
        IntStream.rangeClosed(0, 10)
                .boxed()
                .collect(Collectors.toList());
    }
}
