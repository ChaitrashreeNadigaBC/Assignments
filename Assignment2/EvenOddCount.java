import java.util.Arrays;
import java.util.Scanner;

public class EvenOddCount {
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

        int even = 0;
        int odd =0;

        for(int i=0; i<n; i++) {
            if(arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println(("Count of Even Numbers: " + even));
        System.out.println(("Count of Odd Numbers: " + odd));

    }
}
