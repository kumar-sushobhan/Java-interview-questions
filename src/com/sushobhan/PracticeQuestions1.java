package com.sushobhan;

import java.util.*;
import java.util.stream.Collectors;

public class PracticeQuestions1 {
    public static void main(String[] args) {
        // 1. Sum of the all the numbers in an array
        List<Integer> numbers = Arrays.asList(2, 5, 7, 9, 23, 12, 13, 19);
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

        // 2. find max element
        //.mapToInt(Integer::intValue)
        Optional<Integer> maxNumber = numbers
                .stream()
                .max(Comparator.naturalOrder());
        System.out.println(maxNumber.get());

        // 3. count the number of strings that starts with b
        List<String> fruits = Arrays.asList("cheery", "banana", "coconut", "berry", "apple");
        long c = fruits.stream()
                .filter(f -> f.startsWith("c"))
                .count();
        System.out.println("Number of fruits starts with c is : " + c);

        // 4. Convert a list of strings to upper case
        List<String> upperCaseFruits = fruits.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("Fruits in upper case : " + upperCaseFruits);
        // 5. given a list of integers, count the number of odd numbers and satisfy and specific condition
        List<Integer> oddList = numbers.stream()
                .filter(m -> m / 2 != 0)
                .filter(f1 -> f1 > 20)
                .toList();
        System.out.println(oddList);

        // 6. find out the average of floating numbers
        List<Double> floatNumbers = Arrays.asList(1.1, 1.2, 1.3, 1.4, 1.5);
        double average = floatNumbers.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .getAsDouble();
        System.out.println(average);

        // 7. Given a list of strings, write a program to concatenate all the strings
        String concatenatedFruits = fruits.stream()
                .collect(Collectors.joining(","));
        System.out.println(concatenatedFruits);

        // 8. Remove duplicates
        List<Integer> numbersList = Arrays.asList(2, 5, 7, 9, 23, 12, 13, 19, 7, 23, 19);
        List<Integer> distintList = numbersList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distintList);

        // 9. Sort the object based on specific attribute
        List<Person> people = Arrays.asList(
                new Person("Alice", 21),
                new Person("Ana", 29),
                new Person("Bob", 30),
                new Person("Charlie", 56),
                new Person("Amy", 20),
                new Person("Bill", 16)
        );

        List<Person> sortAge = people.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .collect(Collectors.toList());
        System.out.println(sortAge);

        // 10. Write a program to check if all the elements satisfy a condition
        List<Integer> numbers2 = Arrays.asList(2, 4, 6, 8, 10, 11);
        boolean isEven = numbers2.stream()
                .allMatch(element -> element % 2 == 0);
        System.out.println(isEven);
    }
}
