package mypractice.lld2.creational.builderpattern;

//import mypractice.lld2.BuilderPattern.Builder;


public class Student {
    private String name;
    private int age;
    private double psp;
    private String universityName;
    private String email;
    private String phoneNumber;
    private int graduationYear;

    /*
    Step 1: this is a problem becoz we need to carefully give the values while creating object
    and also the same order needs to be followed if missed then it will show an error. So as a next
    step we are passing hashmap with all the values

    public Student(String name, int age, double psp, String universityName, String email, String phoneNumber, int graduationYear) {
        this.name=name;
        this.age=age;
        this.email=email;
        this.psp=psp;
        this.universityName=universityName;
        this.phoneNumber=phoneNumber;
        this.graduationYear=graduationYear;
    }
    */

    /*
    Step 2: this is also a problem because we might pass a value with a type error (typo possible rt). so there might
    be a problem in validation. So we are using creating a helper(Builder class)

    public Student(HashMap<String , Object> hm) {
        this.name=(String)hm.get("name");
        this.age=(Integer) hm.get("age");
        this.email=(String) hm.get("email");
        this.psp=(Double)hm.get("psp");
        this.universityName=(String)hm.get("universityName");
        this.phoneNumber=(String)hm.get("phoneNumber");
        this.graduationYear=(Integer)hm.get("gradyear");
    }
    */

    /*Step 3: Class Builder is created with all the attributes which are in this class and we are passing this as
    a parameter to the student class
     */
    private Student(Builder builder) { //last step: making constructor private and moving the entire builder class here
        /*
        Validations can be done here. but the role of builder is to build something rt.
        so we are giving this part to builder

        if(builder.getGraduationYear()>2023){
            throw new RuntimeException("Validation failed");
        }
        */
        this.name = builder.getName();
        this.age = builder.getAge();
        this.email = builder.getEmail();
        this.psp = builder.getPsp();
        this.universityName = builder.getUniversityName();
        this.phoneNumber = builder.getPhoneNumber();
        this.graduationYear = builder.getGraduationYear();
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }


    /*
    Entire builder class is moved here becoz when build method is executed we are returning student object atlast
    since our student constructor is private we will not be able to create the object. so we are just moving the builder
    class here to this class itself.
     */
    public static class Builder {
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

    /*
    Student student3 = Student.getBuilder()
            .setName("Kishore")
            .build();
    This part is much redable rt so we are modifying all the set method of builder class to return
    current buidlder object
    */

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

        public Student build() {
            if (this.getGraduationYear() > 2023) {
                throw new RuntimeException("Validation failed");
            }
            return new Student(this);//Passing the current builder object
        }
    }
}