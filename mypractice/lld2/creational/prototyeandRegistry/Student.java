package mypractice.lld2.creational.prototyeandRegistry;

//Step 2 implementing the copy method
public class Student implements Prototype<Student> {
    private String name;
    private int age;
    private double psp;
    private String batchname;
    private double avgpspofbatch;

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

    public String getBatchname() {
        return batchname;
    }

    public void setBatchname(String batchname) {
        this.batchname = batchname;
    }

    public double getAvgpspofbatch() {
        return avgpspofbatch;
    }

    public void setAvgpspofbatch(double avgpspofbatch) {
        this.avgpspofbatch = avgpspofbatch;
    }

    //Step 2: creating copy method
    @Override
    public Student copy() {
        Student newstudent = new Student();
        newstudent.setName(this.name);
        newstudent.setAge(this.age);
        newstudent.setPsp(this.psp);
        newstudent.setAvgpspofbatch(this.avgpspofbatch);// this attribute has a same value as above student object
        newstudent.setBatchname(this.batchname);
        return newstudent;
    }
}