package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

//        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        //PROBLEM 1.  Print each element from list on its own line
//        printAllNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));

        //PROBLEM 2. Print only even numbers from the list
//        printAllEvenNumbersInListFunctional(numbers);

        //Problem 3. Print only odd numbers from the list
//        printAllOddNumbersInListFunctional(numbers);

        //Problem 4. Print all courses individually
//        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
//        printCoursesIndividually(courses);

        //Problem 5. Print courses containing the word "Spring"
//        printCoursesContainingSpring(courses);

        //Problem 6. Print courses whose name has at least 4 letters
//        printCoursesWithAtLeastFourLetters(courses);

        //Problem 7. Print squares of all even numbers
//        numbers.stream()
//                .filter(number -> number % 2 == 0)
//                .map( number -> number * number)
//                .forEach(System.out::println);

        //Problem 8. Print cubes of odd numbers
//        numbers.stream()
//                .filter(number -> number % 2 != 0)
//                .map( number -> number * number * number)
//                .forEach(System.out::println);

        //Problem 9. Print number of characters in each course name
//        courses.stream()
//                .forEach(course -> System.out.println(course+" "+course.length()));


        ////////// OPTIONAL CLASS
        List<String> fruits = Arrays.asList("apple", "banana", "mango");
        //we want to find out the first fruit that starts with b

        Predicate<? super String> predicate = fruit -> fruit.startsWith("b");
        //fruits starting with b might or might NOT exist in this list
//      Optional  A container object which may or may not contain a non-null value.
        Optional<String> optional = fruits.stream().filter(predicate).findFirst();
        System.out.println(optional); //Optional[banana]
        System.out.println(optional.isEmpty()); //false
        System.out.println(optional.isPresent()); //true
        System.out.println(optional.get()); //banana - returns the specific value back
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        // convert list into stream
        // call method reference
        numbers.stream().forEach(System.out::println); // className::methodName, syntax for method reference
    }

    private static void printAllEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }

    private static void printAllOddNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .forEach(System.out::println);
    }

    private static void printCoursesIndividually(List<String> courses) {
        courses.stream().forEach(System.out::println);
    }

    private static void printCoursesContainingSpring(List<String> courses) {
        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);
    }

    private static void printCoursesWithAtLeastFourLetters(List<String> courses) {
        courses.stream()
                .filter(course -> course.length() >= 4)
                .forEach(System.out::println);
    }
}