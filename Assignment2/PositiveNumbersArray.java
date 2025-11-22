import java.util.Arrays;
import java.util.Scanner;

public class PositiveNumbersArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        //Create an array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(arr));

        // count the positive nos.
        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                count++;
            }
        }

        // Separating pos nos. from an array
        int[] posArr = new int[count];
        for (int i = 0, j = 0; i < n; i++) {
            if (arr[i] > 0) {
                posArr[j] = arr[i];
                j++;
            }
        }

        System.out.println("Array with positive numbers: " + Arrays.toString(posArr));
    }
}

