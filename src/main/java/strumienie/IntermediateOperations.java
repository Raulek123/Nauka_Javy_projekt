package strumienie;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {

        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 249, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(1L, "Java", 249, "Programowanie"),
                new Course(3L, "Tajniki Google", 299, "Marketing"),
                new Course(1L, "Java", 249, "Programowanie")
        );
        courses.map(Course::getName)
                .filter(name -> name.equals("Java"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
