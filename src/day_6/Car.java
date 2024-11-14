package day_6;

public class Car {
    private int year;
    private String color;
    private String model;

    public void info(){
        System.out.println("This car is a " + color + " " + model + " manufactured in " + year);
    }

    public int yearDifference(int inputYear) {
        return inputYear - year;
    }
    public Car(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear(){
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
