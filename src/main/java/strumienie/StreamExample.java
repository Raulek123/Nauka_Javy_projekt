package strumienie;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class StreamExample {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/data.csv"));
        bufferedReader.lines().forEach(System.out::println);
    }
}
