package day_9;

public class Student extends Human{
    private String subjectGroup;

    public Student(String name, String subjectGroup) {
        super(name);
        this.subjectGroup = subjectGroup;
    }

    public String getSubjectGroup() {
        return subjectGroup;
    }

    public void setSubjectGroup(String subjectGroup) {
        this.subjectGroup = subjectGroup;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("This student's name is "+getName());
    }
}
