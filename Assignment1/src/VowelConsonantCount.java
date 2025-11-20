package src.src;

import java.util.Scanner;

public class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.next();
        s = s.toLowerCase();

        int vowel = 0;
        int consonant = 0;

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }
        System.out.println("Number of vowels: " + vowel);
        System.out.println("Number of consonants: " + consonant);
    }
}
