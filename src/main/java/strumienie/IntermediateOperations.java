package strumienie;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {

        Course[] cheapCourses = {
                new Course(1L, "Java", 49, "Programowanie"),
                new Course(2L, "Sztuka pisania", 79, "Rozwój osobisty"),
        };
        Course[] expensiveCourses = {
                new Course(3L, "Tajniki Google", 299, "Marketing"),
                new Course(4L, "Python od podstaw", 169, "Programowanie")
        };
        Stream.of(cheapCourses, expensiveCourses)
                .flatMap(Arrays::stream)
                .forEach(System.out::println);
    }
}
