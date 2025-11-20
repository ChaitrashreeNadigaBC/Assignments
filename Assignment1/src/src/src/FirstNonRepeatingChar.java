package src.src;

import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            int count =0;

            for (int j=0; j<str.length(); j++) {
                if(str.charAt(j) == ch) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("First non-repeating character is: " + ch);
                return;
            }
        }
        System.out.println("Non-repeating characters not found!");
    }
}
