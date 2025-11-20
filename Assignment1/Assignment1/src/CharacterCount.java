package src.src;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.next();
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        int count = 0;

        for(int i=0; i < s.length(); i++) {
            if(s.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println(("Count of " + ch + " is: " + count));
    }
}
