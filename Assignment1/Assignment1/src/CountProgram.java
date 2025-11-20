package src.src;

import java.util.Scanner;

public class CountProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.next();
        s = s.toLowerCase();

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int specialChar = 0;

        for (int i =0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else if (ch == '@' || ch == '!' || ch == '#' || ch == '$' || ch == '^' || ch == '.') {
                specialChar++;
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        System.out.println("Number of digits: " + digits);
        System.out.println("Number of specialChar: " + specialChar);
    }
}
