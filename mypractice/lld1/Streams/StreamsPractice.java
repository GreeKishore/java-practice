package mypractice.lld1.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsPractice {
    public static void main(String[] args) {

        // Separate odd and even numbers
        var evenlist = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9).stream()
                .filter(num -> (num % 2 == 0))
                .collect(Collectors.toList());
        System.out.println(evenlist);

        // Remove duplicate element from the list
        var result = Arrays.asList(2, 3, 4, 3, 6, 7, 9, 9).stream().distinct().toList();
        System.out.println(result);

        // Frequency of each character in string
        String to_find_frequency = "december"; //d>1,e->3,b->1,c->1,m->1,r->1
        Map<Character, Long> freqChar = to_find_frequency.chars().mapToObj(e -> (char) e)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(freqChar);

        // Frequency of each element in the array
        Map<Integer, Long> freqNum = Arrays.asList(2, 3, 4, 3, 6, 7, 9, 9).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(freqNum);

        // Sort the list in reverse order
        Arrays.asList(2, 3, 4, 3, 6, 7, 9, 9).stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        // Extra
        Collections.sort(Arrays.asList(2, 3, 4, 3, 6, 7, 9, 9));

        // Print multiples of 5 from the list
        Arrays.asList(2, 25, 4, 5, 6, 7, 10, 9)
                .stream()
                .filter(e -> (e % 5) == 0)
                .forEach(System.out::println);

        // Merge two unsorted array into one sorted array
        int[] a = {2, 5, 4, 1, 3};
        int[] b = {6, 3, 4, 6, 8, 9};
        int[] concatenatedArray = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println(concatenatedArray);

        // Palindrome program in java 8
        String check_palindrome = "mada";
        boolean ans = IntStream.range(0, check_palindrome.length() / 2)
                .noneMatch(e -> check_palindrome.charAt(e) != check_palindrome.charAt(check_palindrome.length() - 1 - e));
        System.out.println(ans);

        // Reverse each word of a string
        Arrays.asList("Kishore", "is", "a", "good", "boy").stream()
                .map(word -> new StringBuffer(word).reverse())
                .forEach(System.out::println);

        // Given a list of integers, find out all the even numbers that exist in the list using Stream functions
        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)
                .stream()
                .filter(num -> (num % 2) == 0)
                .forEach(System.out::println);

        // Write a Java 8 program to sort an array and then convert the sorted array into Stream
        int[] integerNumbers = {3, 2, 6, 1, 8};
        Arrays.sort(integerNumbers);
        Arrays.stream(integerNumbers).forEach(System.out::println);

        // Given a list of integers, find out all the numbers starting with 1 using Stream functions
        Arrays.asList(10, 15, 8, 49, 25, 98, 32)
                .stream()
                .map(String::valueOf)
                .filter(e -> e.charAt(0) == '1')
                .forEach(System.out::println);
//        update: what i wrote is absolutely correct. But to note here is we have to convert int to string i used String.valueOf but just a concatenation
//        with "" (empty string) gives a string. And also i used charAt to find the 0 index is equal to one we have a method named startsWith for this

        // How to find the max number in the given list
        Integer max = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15)
                .stream()
                .max(Integer::compare)
                .get();
        System.out.println(max);

        // Count the list of strings whose value is greater than 4
        Arrays.asList("Hello", "Interview", "Questions", "Answers", "Ram", "for")
                .stream()
                .filter(i -> i.length() > 4)
                .forEach(System.out::println);

        // second largest
        Optional<Integer> secondLargest = Arrays.asList(12, 35, 1, 10, 34, 1, 35).stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        // anyMatch example
        boolean answer = Arrays.asList(1, 3, 5, 7).stream().anyMatch(n -> n % 2 == 0);
        System.out.println(answer);  // Output: false (no even numbers)

        //noneMatch example
        boolean check = Arrays.asList(1, 3, 5, 7).stream().noneMatch(n -> n % 2 == 0);
        System.out.println(check);  // Output: true (no even numbers)
    }
}