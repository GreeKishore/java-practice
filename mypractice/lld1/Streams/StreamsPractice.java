package mypractice.lld1.Streams;//import java.util.Arrays;
//import java.util.Collection;

import java.util.*;

public class StreamsPractice {
    public static void main(String[] args) {
        //seperate odd and even numbers

        /*List<Integer> numbers = Arrays.asList(2,3,4,5,6,7,8,9);
        List<Integer> oddList = new ArrayList<>();
        List<Integer> evenlist = new ArrayList<>();
        numbers.stream().forEach(e->{
            if(e%2==0)
            {
                evenlist.add(e);
            }
            else{
                oddList.add(e);
            }
        });
        System.out.println(oddList.toString());
        System.out.println(evenlist.toString());*/

        //Remove duplicate element from the list
//        List<Integer> numbers = Arrays.asList(2,3,4,3,6,7,9,9);
//        List<Integer> result = numbers.stream().distinct().toList();
//        System.out.println(result.toString());

        //frequency of each character in string
//        String to_find_frequency = "december"; //d>1,e->3,b->1,c->1,m->1,r->1
//        Map<Character, Long> result = to_find_frequency.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        System.out.println(result.toString());

        //frequency of each element in the array
        List<Integer> numbers = Arrays.asList(2,3,4,3,6,7,9,9);
//        Map<Integer, Long> result= numbers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        System.out.println(result.toString());

        //Sort the list in reverse order
//        List<Integer> numbers = Arrays.asList(2,3,4,3,6,7,9,9);
//        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//        Collections.sort(numbers);
//        System.out.println(numbers.toString());

        //print multiples of 5 from the list
//        List<Integer> numbers = Arrays.asList(2,25,4,5,6,7,10,9);
//        numbers.stream().filter(e->(e%5)==0).forEach(System.out::println);

        //merge two unsorted array into one sorted array
//        int[] a  = {2,5,4,1,3}; int[] b  = {6,3,4,6,8,9};
//        //IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
//        int[] result = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
//        System.out.println(result);

        //palindrome program in java 8

//        String check_palindrome = "mada";
//        boolean ans = IntStream.range(0,check_palindrome.length()/2).noneMatch(e->check_palindrome.charAt(e)!=check_palindrome.charAt(check_palindrome.length()-1-e));
//        System.out.println(ans);

        //reverse each word of a string

//        List<String> words = Arrays.asList("Kishore", "is", "a","good","boy");
//        words.stream().map(word->new StringBuffer().reverse()).forEach(System.out::println);

        //Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
//        List<Integer> integernumbers = Arrays.asList(1,2,3,4,5,6,7,8);
//        integernumbers.stream().filter(num->(num%2)==0).forEach(System.out::println);

        //Write a Java 8 program to sort an array and then convert the sorted array into Stream?
//        int[] integernumbers = {3,2,6,1,8};
//        Arrays.sort(integernumbers);
//        Arrays.stream(integernumbers).forEach(System.out::println);

        //Given a list of integers, find out all the numbers starting with 1 using Stream functions?
//        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
//        myList.stream().map(String::valueOf).filter(e->e.charAt(0)=='1').forEach(System.out::println);

        //How to find the duplicate number in the given list
//        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
//        Integer res= myList.stream().max(Integer::compare).get();
        //Reverse an integer array

//        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
//        int[] result = IntStream.range(0,myList.size()).map(i->myList.set(myList.size()-1-i,i)).toArray();
//        System.out.println(Arrays.toString(result));
//
//        int resul = myList.stream().max(Comparator.naturalOrder()).get();
//        System.out.println(resul);
//count the list of strings whose value is greater than 4
        List<String> stringList = Arrays.asList("Hello","Interview","Questions","Answers","Ram","for");
        stringList.stream().filter(i->i.length()>4).forEach(System.out::println);
    }
}