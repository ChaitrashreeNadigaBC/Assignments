import java.util.Scanner;

public class Anagrams {

    // Manually sorting using bubble sort
    public static void sort(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings:");
        String s1 = sc.next();
        String s2 = sc.next();

        // If lengths differ, they cannot be anagrams
        if(s1.length() != s2.length()) {
            System.out.println("Not Anagrams.");
            return;
        }

        // Convert both strings to character arrays
        char[] a = s1.toLowerCase().toCharArray();
        char[] b = s2.toLowerCase().toCharArray();

        // Sort both arrays
        sort(a);
        sort(b);

        // Compare sorted arrays
        boolean isAnagram = true;
        for(int i=0; i<a.length; i++) {
            if (a[i] != b[i]) {
                isAnagram = false;
                break;
            }
        }
        System.out.println(isAnagram);
    }
}
