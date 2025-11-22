import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        //Create an array
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(arr));

        //Reverse the array
        int[] rev = new int[n];
        for(int i = 0; i <n; i++) {
            rev[i] = arr[n-1-i];
        }
        System.out.println("Reversed Array: " + Arrays.toString(rev));
    }
}
