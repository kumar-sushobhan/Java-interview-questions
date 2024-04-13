package com.sushobhan;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PracticeQuestions2 {
    public static void main(String[] args) {
        // 1. Given a sentence, find the frequency of each word
        String sentence = "Java is a programming language. Java is versatile";
        String[] words = sentence.split(" ");
        LinkedHashMap<String, Long> wordsFrequency = Arrays.stream(words)
                //.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
                .collect(Collectors.groupingBy(String::new, LinkedHashMap::new, Collectors.counting()));
        System.out.println(wordsFrequency);

        // 2. Find all the numbers starting with 1
        List<Integer> integers = Arrays.asList(12, 13, 18, 21, 90, 11);
        System.out.println(integers.stream()
                .filter(s -> String.valueOf(s).startsWith("1"))
                .toList());

        // 3. Given a list of names, group them by their first letter, and then count the number of names in each group
        String[] names = {"Alice", "Bob", "Charlie", "Amy", "Bill", "Anna"};
        LinkedHashMap<Character, Long> namesMapCount = Arrays.stream(names)
                .collect(Collectors.groupingBy(s -> s.charAt(0),
                        LinkedHashMap::new,
                        Collectors.counting()));
        System.out.println(namesMapCount);

        // 4. Find and print duplicates numbers in an array if it contains multiple duplicates
        int[] arr = {2, 4, 2, 3, 1, 78, 3, 1};
        Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

        // 5. Remove the duplicates from array and print it
        List<Integer> uniqueElements = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> !(entry.getValue() > 1))
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(uniqueElements);

        // another way
        int[] distinctArray = Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(distinctArray));

        // 6. Given a list of words, filter and print the palindromes
        List<String> wordsPalindrome = Arrays.asList("level", "hello", "radar", "world", "deed");
        List<String> listOfWordsWhichArePalindrome = wordsPalindrome.stream()
                .filter(s -> s.equals(new StringBuilder(s).reverse().toString()))
                .collect(Collectors.toList());
        System.out.println(listOfWordsWhichArePalindrome);

        // 7. Merge 2 sorted arrays into a single sorted array
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {2, 4, 6, 8, 10};
        int[] finalArray = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2))
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(finalArray));

        // 8. Given two list of Strings, concatenate them and remove duplicates
        List<String> list1 = Arrays.asList("apple", "banana", "orange");
        List<String> list2 = Arrays.asList("banana", "kiwi", "grape");
        List<String> distinctList = Stream.concat(list1.stream(), list2.stream())
                .distinct()
                .toList();
        System.out.println(distinctList);

        // 9. Student grade classification - 70 and above pass
        List<Student> students = List.of(
                new Student("Alice", 85),
                new Student("Bob", 60),
                new Student("Charlie", 75),
                new Student("David", 90)
        );
        Map<String, List<Student>> studentMap = students.stream()
                .collect(Collectors.groupingBy(student -> student.grade() > 70 ? "Pass" : "Fail"));
        System.out.println(studentMap);

        // 10. Given a list of strings, sort them according to increasing order of their length
        List<String> fruits = Arrays.asList("Mango", "Apple", "Banana", "Kiwi");
        List<String> sortedFruitsList = fruits.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .toList();
        System.out.println(sortedFruitsList);

        // 11. How do you find the intersection of two arrays of integers
        int[] a = { 1, 2, 5, 6, 2, 3, 5 };
        int[] b = { 2, 4, 5, 6, 8, 9, 4, 6, 5 };
        int[] unionArrays = IntStream.concat(Arrays.stream(a), Arrays.stream(b))
                .distinct()
                .toArray();
        System.out.println(Arrays.toString(unionArrays));
    }
}
