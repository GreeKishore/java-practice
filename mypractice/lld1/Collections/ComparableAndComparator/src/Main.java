package mypractice.lld1.Collections.ComparableAndComparator.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(2,"Kishore","8888899999");
        Student s2 = new Student(1,"Vishnu","1111122222");
        Student s3 = new Student(4,"Mano","3333344444");
        Student s4 = new Student(3,"Mani","5555566666");
        Student s5 = new Student(5,"Mekalai","7777700000");

        List<Student> s = new ArrayList<>();
        s.add(s1);s.add(s2);s.add(s3);s.add(s4);s.add(s5);

        Collections.sort(s);
        Collections.sort(s,new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.sName.length()-o2.sName.length();
            }
        });
        s.stream().forEach(student -> System.out.println(student.sId));
    }
}