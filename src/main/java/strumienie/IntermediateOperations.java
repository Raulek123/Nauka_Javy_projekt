package strumienie;

import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing"),
                new Course(4L, "Zarządzanie zespołem", 159, "Biznes"),
                new Course(5L, "Python od podstaw", 169, "Programowanie")
        );


    }
}
