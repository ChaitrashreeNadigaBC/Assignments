package src.src;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        System.out.println("Enter number of steps: ");
        int step = sc.nextInt();

        for (int i=0; i<step; i++) {
            int last = arr[n-1];  //store last element
            //shift elements to right
            for(int j=n-1; j>0; j--) {
                arr[j] = arr[j-1];
            }
            arr[0] = last;  //place last element at first position
        }

        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + ", ");
        }


    }
}
