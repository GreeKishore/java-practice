package mypractice.lld2.creational.prototyeandRegistry;

public class Client {
    private static final StudentRegistry studentRegistry = new StudentRegistry();
    private static void fillRegistry(){
        Student student = new Student();
        student.setName("Kishore");
        student.setAge(25);
        student.setPsp(92.00);
        student.setAvgpspofbatch(80.00);
        student.setBatchname("June 2023");
        studentRegistry.setPrototype("June 2023",student);

        IntelligentStudent student4 = new IntelligentStudent();
        student4.setName("Greesan");
        student4.setAge(25);
        student4.setPsp(100.00);
        student4.setAvgpspofbatch(90.00);
        student4.setBatchname("July 2023");
        studentRegistry.setPrototype("July 2023",student4);

    }
    public static void main(String[] args) {
        /*
        Step 1: When we need to create a copy of this object(old_student) we will have a code like below

        Student old_student = new Student();
        old_student.setName("Kishore");
        old_student.setAge(25);
        old_student.setPsp(92.00);
        old_student.setAvgpspofbatch(80.00);
        old_student.setBatchname("June 2023");

        Copying old_student to new_student
        Student new_student = new Student();
        new_Student.setName(old_student.getName());
        new_Student.setAge(old_student.getAge());
        new_Student.setPsp(old_student.getPsp());
        new_Student.setAvgpspofbatch(old_student.getAvgpspofbatch());
        new_Student.setBatchname(old_student.getBatchname());

        the problem of copying like this is - "Student new_student = new Student();" in this line if student is the parent
        class of intelligent student then that class can also be provided. which in our case should not be copied. --> this can
        be solved using if else in client class like if(this is an object){copy this}else{copy that} -> but this breaks ocp principle

        Another problem is client class needs to know all the attributes and implementation details which makes it as tightly
        coupled.
        */
        /*
        Ideal solution for the above problem should be object which needs to be copied should have a COPY method in
        that class itself.
        Advantages is
        No tight coupling is there and also client does not need to know all the attributes

        Step 2 : Refer Student class.

        This also has some issues consider student has copy method and intelligent student does not have copy method
        then if we do this Student s = new Intelligentstudent(); since it is inheriting the properties of parent class
        it will also have a copy method -> this is a problem.
        if we use an interface with copy method and force all classes to implement it. what if the class dont want to create
        copy of it? -> this is also a problem
        Abstract class also has problem if we did not implement the method then the class become abstract and we will not be
        able to create object of it.
        SO, ONLY THING IS WE NEED TO BE CAUTIOUS WHEN WE NEED COPY METHOD WE NEED TO MAKE SURE WE HAVE THAT METHOD IN THE CLASS
        AND ALL CHILD CLASS NEED TO OVERRIDE THE COPY METHOD TO AVOID SURPRISE
        Student copystudent = old_student.copy();
        */


        /*
        This part is just to tell us why we need prototype design pattern -> we have some common attributes which
        are not gonna change. so we create a prototype and when needed we get the prototype and then make the required
        changes

        Student student1 = new Student();
        student1.setName("vishnu");
        student1.setAge(19);
        student1.setPsp(95.00);
        student1.setAvgpspofbatch(80.00);// this attribute has a same value as above student object
        student1.setBatchname("June 2023");// this attribute has a same value as above student object

        Student student3 = (Student)student1.copy();
        student3.setName("Vishnu");
        */

        /*
        final Version: Created a prototype interface which has copy method and created a registry interface which has
        set and get method -> to set the prototype and get the prototype from map

        OVERVIEW
        first thing is to set the prototype
        Second is to get the prototype from registry and creating a copy of that prototype
        and at last making the changes which are required
        */

        Client.fillRegistry();
        Student mani = (Student)studentRegistry.getPrototype("June 2023").copy();
        //change can be done using set methods
        Student akhil = (Student)studentRegistry.getPrototype("July 2023").copy();
        //change can be done using set methods
        System.out.println("Debug");
    }


}