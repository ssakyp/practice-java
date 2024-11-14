package day_6;

public class Test2 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Sally", "math");
        Student student = new Student("Tom");
        teacher.evaluate(student);
    }
}
