package day_1;

public class Main {
    public static void main(String[] args) {
            multiply(9);
    }

    static void print(int count) {
        while (count > 0) {
            if (count != 1)
                System.out.print("JAVA ");
            else
                System.out.print("JAVA");
            count--;
        }
    }

    static void forPrint(int count) {
        for (int i = 0; i < count; i++) {
            if (count != 9)
                System.out.print("JAVA ");
            else
                System.out.print("JAVA");
        }
    }

    static void printLn(int count) {
        while (count > 0) {
            System.out.println("JAVA");
            count--;
        }
    }

    static void olympiadFor(int currentYear){
        for(int i = 1984; i <= currentYear; i+=4){
            System.out.println("Olympiad of " + i + " year.");
        }
    }

    static void olympiadWhile(int currentYear) {
        while (currentYear <= 2024) {
            System.out.println("Olympiad of " + currentYear + " year.");
            currentYear += 4;
        }
    }

    static void multiply(int k) {
        int sum;
        for(int i = 1; i < 10; i++) {
            sum = i * k;
            System.out.println(i + " x " + k + " = " + sum);
        }

    }
}

