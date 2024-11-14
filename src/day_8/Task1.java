package day_8;

public class Task1 {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        str();
        long after = System.currentTimeMillis();
        System.out.println(after-before);
        Airplane airplane = new Airplane("Boeng", 2021, 122, 133);
        System.out.println(airplane);

    }

    public static void str(){
        String result = "";
        for(int i = 0; i <= 20000; i++) {
            result += String.valueOf(i) + " ";
        }
        System.out.println(result);
    }

    public static void strBuilder(){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            result.append(String.valueOf(i) + " ");
        }
        System.out.println(result);
    }
}
