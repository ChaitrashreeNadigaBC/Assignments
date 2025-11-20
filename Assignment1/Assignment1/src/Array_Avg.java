package src.src;

import java.util.Scanner;

public class Array_Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Add elements into an array: ");
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        double sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum = sum + arr[i];
        }
        double avg = sum / arr.length;

        System.out.println("Array sum: " + sum);
        System.out.println("Array average: " + avg);
    }
}
