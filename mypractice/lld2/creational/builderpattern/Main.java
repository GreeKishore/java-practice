package mypractice.lld2.creational.builderpattern;

//import Builder.Student;
//import mypractice.lld2.BuilderPattern.Builder;

public class Main {
    public static void main(String[] args) {
        /*
        The below way creating object has few disadvantages
        1. We need to go to the constructor and see the variable and fill in the information
        2. Prone to errors
        3. code is also not feeling that great:)

        Student student = new Student("Kishore",25,90.0,"PEC","kishore@gmail.com","8248718747",2019);
        */

        /*
        So, We can use a map like below to store all the values and pass a single value for creating the object
        Code looks neat for passing single value to the constructor but Even here there are problems
          1. We can make mistakes in spelling
          2. one main thing see the constructor, we are passing the object in the hm.
        That means tyecasting is required and run time error is possible

        HashMap<String,Object> hm = new HashMap<>();
        hm.put("name","kishore");
        hm.put("age",25);
        hm.put("psp",90.0);
        hm.put("universityName","PEC");
        hm.put("email","kishore@gmail.com");
        hm.put("phonenumber","8248718747");
        hm.put("gradyear",2019);
        Student student_using_hashmap = new Student(hm);
        System.out.println(student_using_hashmap.getAge());
        */


        /*
        So the best thing we can use is class to store all the values and pass class object as a parameter to
        Student class.

        Builder builder = new Builder();

        //use setters to set the values

        builder.setName("Kishore");
        builder.setAge(25);
        builder.setPsp(90.0);
        builder.setUniversityName("PEC");
        builder.setEmail("Kishore@gmail.com");
        builder.setGraduationYear(2019);
        builder.setPhoneNumber("8248718747");
        Student student_with_builder = new Student(builder);
        */

        /*
        From client perspective, client needs to create a object of student class
        so inorder to do that we will see the student class constructor normally
        but if u see in student class be can not understand the constructor technically. that is we
        do not know about the builder parameter passed. (normally what we do is when we need to create a object
        we will go to that particular class constructor and check. but now in this case constructor is taking builder
        as a parameter we will not know about it since it might be in different package).check previous version

        so, we are creating a method in Student class named getBuilder to know what builder is passed in
        constructor parameter. here student class itself saying what builder is passed

        Builder builder1 = Student.getBuilder();
        builder1.setName("Kishore");
        builder1.setAge(25);
        builder1.setPsp(90.0);
        builder1.setUniversityName("PEC");
        builder1.setEmail("Kishore@gmail.com");
        builder1.setGraduationYear(2019);
        builder1.setPhoneNumber("8248718747");
        Student student_with_builder = new Student(builder1);
        */

        /*
        Ideally builder class is used to build something right now builder class is not building anything now
        and also student object is build in student class. so creating a method named build in builder class
        and its function is to build student object
        the validation part in student class can be moved to builder class rt

        Builder builder2 = Student.getBuilder();
        builder2.setName("Kishore");
        builder2.setAge(25);
        builder2.setPsp(90.0);
        builder2.setUniversityName("PEC");
        builder2.setEmail("Kishore@gmail.com");
        builder2.setGraduationYear(2019);
        builder2.setPhoneNumber("8248718747");
        Student student2 = builder2.build(); //here validation takes place and it is building
        */

        /*
        The above code can be written like this in the cleaner way
        */

        Student student3 = Student.getBuilder()
                .setName("Kishore")
                .setGraduationYear(2024)
                .build();
    }
}