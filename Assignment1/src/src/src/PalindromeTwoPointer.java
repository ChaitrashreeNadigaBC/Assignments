package src.src;

import java.util.Scanner;

public class PalindromeTwoPointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.next();
        s = s.toLowerCase();

        int left = 0;
        int right = s.length()-1;

        boolean isPalindrome = true;
        while(left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("Given string is a Palindrome");
        } else {
            System.out.println("Given string is Not a Palindrome");
        }
    }
}
