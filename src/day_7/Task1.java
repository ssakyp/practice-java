package day_7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeng", 2014, 190, 122);
        Airplane airplane2 = new Airplane("Boeng", 2015, 192, 124);
        Airplane.compareAirplanes(airplane1, airplane2);
    }

}
