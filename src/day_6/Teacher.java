package day_6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;
    static Random random = new Random();

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        int num = random.nextInt(2, 6);
        String score="";
        switch (num) {
            case 2:
                score = "sufficient";
                break;
            case 3:
                score = "norm";
                break;
            case 4:
                score = "good";
                break;
            case 5:
                score = "excellent";
                break;
        }
        System.out.println("The teacher "+ this.name + " evaluated student " + student.getName() + " on subject "+ this.subject + " got " + score);
    }
}
