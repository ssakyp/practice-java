package day_9;

public class Circle extends Figure{
   private double radii;

    public Circle(String color, double radii) {
        super(color);
        this.radii = radii;
    }

    public double getRadii() {
        return radii;
    }

    public void setRadii(double radii) {
        this.radii = radii;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
