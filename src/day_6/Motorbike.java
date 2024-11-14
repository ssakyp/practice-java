package day_6;

public class Motorbike {
    private int year;
    private String model;
    private String color;
public Motorbike(int year, String color, String model) {
    this.color = color;
    this.year = year;
    this.model = model;
}

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
