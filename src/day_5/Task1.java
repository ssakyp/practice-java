package day_5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(2012);
        car1.setColor("red");
        car1.setModel("camry");

        System.out.println("Our car is a " + car1.getColor() + " " + car1.getModel() + " manufactured in " + car1.getYear());

        Motorbike moto1 = new Motorbike(2021, "black", "yamaha");
//        moto1.setColor("black");
//        moto1.setModel("Yamaha");
//        moto1.setYear(2021);
        System.out.println("Our motorbike is a " + moto1.getColor() + " " + moto1.getModel() + " manufactured in " + moto1.getYear());
    }
}
