package mypractice.lld1.streams;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsDailyPractice {
    public static void main(String[] args) {
        // sum of elements in the stream
        System.out.println(List.of(1, 2, 3, 4, 5, 6).stream().reduce(0, Integer::sum));
        System.out.println(List.of(1, 2, 3, 4, 5, 6).stream().mapToInt(Integer::intValue).sum());

        // Given a stream of integers, filter out the even numbers and return a new stream containing only the odd numbers.
        List.of(1, 2, 3, 4, 5, 6).stream().filter(e -> e % 2 != 0).forEach(System.out::println);

        //find maximum in the stream
        System.out.println(List.of(1, 2, 3, 4, 5, 6).stream().max(Comparator.comparing(e->e)));
        // NOTE: mapToInt and then max can also be done

        // count elements in the stream
        System.out.println(List.of(1, 2, 3, 4, 5, 6).stream().count());

        // calculate average of numbers
        System.out.println(List.of(1, 2, 3, 4, 5, 6).stream().mapToInt(Integer::intValue).average());

        // find the first unique element
        HashSet<Integer> hs = new HashSet();
        System.out.println(List.of(1, 2, 3, 2, 3, 4, 5, 6).stream().filter(e->!hs.add(e)).findFirst());

        List.of(1, 2, 3, 2, 3, 4, 5, 6).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e->e.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst();

        // convert stream to list
        List.of(1, 2, 3, 2, 3, 4, 5, 6).stream().collect(Collectors.toList());

        // find the longest word
        System.out.println(List.of("Kishore", "vishnu", "mani", "haran")
                .stream()
                .max(Comparator.comparing(String::length)));

        // group elements by length
        System.out.println(List.of("Kishore", "vishnu", "mani", "haran", "mano").stream().collect(Collectors.groupingBy(String::length)));

        // flatten the stream of lists
        // use flat map

    }
}