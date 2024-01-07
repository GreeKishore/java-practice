package mypractice.lld2.creational.prototyeandRegistry;

public class IntelligentStudent extends Student{
    private int iq;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public IntelligentStudent copy(){
        IntelligentStudent newIntelligentStudent = new IntelligentStudent();
        newIntelligentStudent.setName(this.getName());
        newIntelligentStudent.setAge(this.getAge());
        newIntelligentStudent.setPsp(this.getPsp());
        newIntelligentStudent.setAvgpspofbatch(this.getAvgpspofbatch());
        newIntelligentStudent.setBatchname(this.getBatchname());
        newIntelligentStudent.setIq(this.getIq());
        return newIntelligentStudent;
    }
}