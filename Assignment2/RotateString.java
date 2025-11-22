import java.util.Scanner;

public class RotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Enter number of rotations:");
        int k = sc.nextInt();

        //Convert string to array
        char[] arr = s.toCharArray();
        int n = arr.length;

        // Rotate k times
        for (int i=0; i<k; i++) {
            char last = arr[n-1];
            for (int j = n-1; j > 0; j--) {
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }

        String rotated = new String(arr);
        System.out.println(rotated);
    }
}
