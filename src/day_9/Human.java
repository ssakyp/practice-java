package day_9;

public class Human {
    private String name;

    public String getName() {
        return name;
    }

    public Human(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo(){
        System.out.println("This person's name is: " + name);
    }
}
