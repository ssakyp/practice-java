package day_2;

import java.util.Scanner;

public class Day_2 {
    public static void main(String[] args) {
        problem2();
    }

    public static void building() {
        Scanner scanner = new Scanner(System.in);
        int story = scanner.nextInt();
        if (story > 0 && story < 5)
            System.out.println("Малоэтажный дом");
        else if(story>4 && story < 9)
            System.out.println("Среднеэтажный дом");
        else if (story > 8)
            System.out.println("Многоэтажный дом");
        else
            System.out.println("Некорректный ввод");
        scanner.close();
    }

    public static void numbers(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print("Вывод: ");
        for(int i = a; i <= b; i++){
            if(i%5 == 0 && i%10 != 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }

    public static void numbersWhile(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print("Вывод: ");
        while(b>=a){
            if(a%5 == 0 && a%10 != 0) {
                System.out.print(a + " ");
            }
            a++;
        }

        scanner.close();
    }

    public static void problem2(){
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y;
        if(x >= 5)
            y=(Math.pow(x, 2)-10)/(x+7);
        else if (x > -3 && x < 5)
            y=(x+3)*(Math.pow(x, 2)-2);
        else
            y=420;
        System.out.println(y);

    }
}
