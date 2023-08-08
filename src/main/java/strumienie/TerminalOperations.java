package strumienie;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {
        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing")
        );

        Double sumPrice = courses.map(Course::getPrice)
                .reduce(0.0, (result, next) -> result + next);
        System.out.println(sumPrice);

        Stream<String> names = Stream.of("Ania", "Kasia", "Basia");
        String allNames = names.reduce("", (result, next) -> result + next + " ");
        System.out.println(allNames);
    }
}
