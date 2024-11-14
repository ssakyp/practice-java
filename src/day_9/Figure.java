package day_9;

public abstract class Figure {
    public abstract double area();
    public abstract double perimeter();
    String color;

    public Figure(String color) {
        this.color = color;
    }
}