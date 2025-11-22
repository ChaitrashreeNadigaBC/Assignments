import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        //Create an array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: " + Arrays.toString(arr));

        //Sum of all elements in an array
        int sum = 0;
        for (int i=0; i<n; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of all elements in an array:" + sum);
    }
}
