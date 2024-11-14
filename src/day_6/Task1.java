package day_6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car(2014, "green", "bmw");
        car1.info();
        System.out.println(car1.yearDifference(2024));

        Airplane airplane = new Airplane("Boeng", 2010, 100, 1000);
        airplane.info();
        airplane.fillUp(10);
        airplane.fillUp(432);
        airplane.setLength(121);
        airplane.setYear(2018);
        airplane.info();
    }


}
