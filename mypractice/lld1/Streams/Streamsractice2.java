package mypractice.lld1.streams;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Streamsractice2 {


    public static void main(String[] args) {

        // Given the list of integers, find the first element of the list using Stream functions
        Arrays.asList(10,15,8,49,25,98,98,32,15).stream().sorted().findFirst().ifPresent(System.out::println);

        // Given a String, find the first non-repeated character in it using Stream functions
        String input = "Java articles are Awesome";
        Character result = input.chars() // Stream of String
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
        System.out.println(result);

        // Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        Set<Integer> set = new HashSet<>();
        myList.stream().forEach(set::add);
        if(set.size() == myList.size()){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        // Write a Java 8 program to concatenate two Streams?
        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");
        Stream.concat(list1.stream(),list2.stream());

        // How to use map to convert object into Uppercase in Java 8?
        List<String> nameList = List.of("Kishore", "vishnu", "mani", "haran").stream()
                                    .map(String::toUpperCase)
                                    .collect(Collectors.toList());
        System.out.println(nameList);

        // How to find only duplicate elements with its count from the String ArrayList in Java8
        // Note here frequency is calculated using frequency method
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String,Long> namesCount = names
                .stream()
                .filter(x->Collections.frequency(names, x)>1)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(namesCount);

        /*
        How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object?

        Optional.ofNullable(noteLst)
            .orElseGet(Collections::emptyList) // creates empty immutable list: [] in case noteLst is null
            .stream().filter(Objects::nonNull) //loop throgh each object and consider non null objects
            .map(note -> Notes::getTagName) // method reference, consider only tag name
            .forEach(System.out::println); // it will print tag names
         */

        /*
        Write a Program to find the Maximum element in an array?

        Arrays.stream(arr).max().getAsInt();
         */

        /*
        Write a program to print the count of each character in a String?

        Map<String, Long> map = Arrays.stream(s.split(""))
                              .map(String::toLowerCase)
                              .collect(Collectors
                              .groupingBy(str -> str,
                                LinkedHashMap::new, Collectors.counting()));
         */

        /*
        Question 1:
You are given a list of Employee objects, where each Employee has an id, name, department, and salary. Write a method
that takes this list and returns the average salary of employees in each department, sorted by department name.

Question 2:
Given a list of Transaction objects, where each Transaction has a transactionId, amount, and date,
write a method that finds the top 5 highest transactions in the last 30 days. Assume the current date is provided.

Question 3:
You are given a list of strings representing logs of a chat application. Each log entry is in the format "timestamp: user: message".
Write a method to find the user who sent the maximum number of messages and return the user's name along with the count of messages they sent. If multiple users have the same maximum count, return any one of them.
         */




//        List<String> list = Arrays.asList("abc", "aab", "aa", "abcd", "a", "bca", "aaa");
//
//        list
//                .stream()
//                .filter(e -> {return e.charAt(0)=='a' && e.length()==3;})
//                .forEach(System.out::println);

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        int a = numbers.stream().filter(e->e%2==0).collect(Collectors.summingInt(Integer::intValue));
//        System.out.println(a);



    }
}