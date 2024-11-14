package day_3;

import java.util.Scanner;

public class Day_3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        divideWhile();
    }

    public static void country(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
           String city = scanner.nextLine();

           if (city.equals("Stop"))
               break;

           switch (city) {
               case "Moscow":
               case "Rostov":
               case "Vladivostok":
                   System.out.println("Russia");
                   break;
               case "Rome":
               case "Milan":
               case "Turin":
                   System.out.println("Italy");
                   break;
               case "Liverpool":
               case "Manchester":
               case "London":
                   System.out.println("England");
                   break;
               case "Berlin":
               case "Munich":
               case "Keln":
                   System.out.println("Germany");
                   break;
               default:
                   System.out.println("Unknown country");
           }
        }
    }

    public static void divide(){


        while (true) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            if (b == 0)
                break;
            System.out.println(a/b);
        }
    }

    public static void divideWhile(){
        int count = 4;
        while (count>=0) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            if (b == 0) {
                count--;
                continue;
            }

            System.out.println(a/b);
            count--;
        }
    }
}
