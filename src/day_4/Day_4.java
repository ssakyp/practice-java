package day_4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day_4 {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        task4();
    }

    public static void task1(){
        int n = scanner.nextInt();
        int [] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = random.nextInt(0, 10);
        }
        System.out.println(Arrays.toString(array));
    }

    public static void task2(){
        int [] array = new int[100];
        int nMax = 0;
        int nMin = 0;
        int zeroCount = 0;
        int sumZeroNums = 0;
        for (int i = 0; i < 100; i++)
            array[i] = random.nextInt(0, 10000);

        for(int num : array){
            if (num > nMax) {
                nMax = num;
            }

            if (num < nMin) {
                nMin = num;
            }

            if (num % 10 == 0) {
                zeroCount++;
                sumZeroNums += num;
                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Max number is " + nMax);
        System.out.println("Min number is " + nMin);
        System.out.println("Numbers which can be divided by 10: " + zeroCount);
        System.out.println("Sum of those numbers which ban be divided by 10: " + sumZeroNums);
    }

    public static void task3() {
        int[][] arr = new int[12][8];
        for(int i = 0; i < 12; i++) {
            for (int j = 0; j < 8; j++) {
                arr[i][j] = random.nextInt(0, 10);
            }
        }

        int index = 0;
        int sum = 0;
        int currentSum = 0;
        int maxSum = 0;
        int j = 0;
        int maxIndex = 0;
        for(int[] a : arr){

            for (int i = 0; i < a.length; i++) {
                sum += a[i];
            }
            currentSum = sum;

            if (currentSum > maxSum) {
                maxSum = currentSum;
                maxIndex = j;
            }

            System.out.println(Arrays.toString(a) + " sum: " + currentSum);
            j++;
        }
        System.out.println("Max sum is " + maxSum + " and index is " + maxIndex);

    }

    public static void task4(){
        int[] arr = {1, 456, 1025, 65, 954, 5789, 4, 8742, 1040, 3254};
        int initialIndex = 0;
        int sum = 0;
        int count = 0;
        int currentSum = 0;
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = random.nextInt(0, 10000);
//        }

        for (int i = 0; i < arr.length; i++) {
            if (i < (arr.length-2)) {
                currentSum = arr[i] + arr[i+1] + arr[i+2];
                System.out.println("sum is " + currentSum + " at i is: " + i + ", ");
                if (currentSum > sum) {
                    sum = currentSum;
                    initialIndex = i;
                    currentSum = 0;
                }
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
        System.out.println("sum is " + sum + " at index: " + initialIndex);
    }

}
