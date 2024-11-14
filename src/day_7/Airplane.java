package day_7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane2.getLength() > airplane1.getLength())
            System.out.println("First airplane is longer.");
        else if(airplane1.getLength() > airplane2.getLength())
            System.out.println("Second airplane is longer.");
        else
            System.out.println("Both airplanes have the same length");
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void fillUp(int amount) {
        fuel += amount;
    }

    public void info(){
        System.out.println("Manufacturer: " + producer + ", year manufactured: " + year + ", weight: " + weight +
                ", length: " + length + ", fuel tank amount: " + fuel);
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
