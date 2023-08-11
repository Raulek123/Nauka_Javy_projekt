package strumienie;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {

        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 149, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing"),
                new Course(4L, "Java od podstaw", 249, "Programowanie")
        );
        courses.sorted((c1, c2) -> Double.compare(c1.getPrice(),c2.getPrice()))
                .forEach(System.out::println);
    }
}
