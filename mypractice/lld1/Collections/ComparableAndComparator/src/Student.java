package mypractice.lld1.Collections.ComparableAndComparator.src;

import java.util.Comparator;

public class Student implements Comparable<Student>, Comparator<Student> {
    public int sId;
    public String sName;
    public String mobileNo;

    public Student(int sId, String sName, String mobileNo) {
        this.sId = sId;
        this.sName = sName;
        this.mobileNo = mobileNo;
    }

    @Override
    public int compareTo(Student other) {
        return sId- other.sId;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.sName.length()-o2.sName.length();
    }
}