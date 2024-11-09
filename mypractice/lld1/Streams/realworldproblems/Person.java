package mypractice.lld1.streams.realworldproblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private int age;

    // Constructor, getters, and setters

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 30),
                new Person("David", 25),
                new Person("Eve", 35)
        );

        /*Given a list of Person objects,
        write a Java method that returns a map where the keys are the ages and the values are lists of names of people who are that age
         */
        people.stream()
                .collect(Collectors.groupingBy(Person::getAge,
                        Collectors.mapping(Person::getName, Collectors.toList())))
                .entrySet().forEach(System.out::println);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}