package mypractice.lld1.streams.realworldproblems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
    private int id;
    private String name;
    private String department;
    private int age;

    public Employee(int id, String name, String department, int age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
    }

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Kishore", "ECE", 25));
        employeeList.add(new Employee(2, "Mano", "IT", 55));
        employeeList.add(new Employee(3, "Mani", "CSE", 50));
        employeeList.add(new Employee(4, "Vishnu", "ECE", 20));

        //group by department and give count
        Map<String, Long> employeeMap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(employeeMap);

        //Average age in each department
        Map<String, Double> employeeMap2 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingLong(Employee::getAge)));
        System.out.println(employeeMap2);

        //Distinct department
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

        //sort employees based on age
        employeeList.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).forEach(System.out::println);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                '}';
    }
}