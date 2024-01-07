package mypractice.lld2.creational.builderpattern;
/*
public class Builder {
    private String name;
    private int age;
    private double psp;
    private String universityName;
    private String email;
    private String phoneNumber;
    private int graduationYear;

//    public Builder(String name, int age, double psp, String universityName, String email, String phoneNumber, int graduationYear) {
//        this.name=name;
//        this.age=age;
//        this.email=email;
//        this.psp=psp;
//        this.universityName=universityName;
//        this.phoneNumber=phoneNumber;
//        this.graduationYear=graduationYear;
//    }

    public String getName() {
        return name;
    }


    Student student3 = Student.getBuilder()
            .setName("Kishore")
            .build();
    This part is much redable rt so we are modifying all the set method of builder class to return
    current buidlder object


    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public double getPsp() {
        return psp;
    }

    public Builder setPsp(double psp) {
        this.psp = psp;
        return this;
    }

    public String getUniversityName() {
        return universityName;
    }

    public Builder setUniversityName(String universityName) {
        this.universityName = universityName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Builder setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Builder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public Builder setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
        return this;
    }

    public Student build(){
        if(this.getGraduationYear()>2023){
            throw new RuntimeException("Validation failed");
        }
        return new Student(this);//Passing the current builder object
    }
}
*/