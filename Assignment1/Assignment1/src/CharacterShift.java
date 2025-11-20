package src.src;

import java.util.Scanner;

public class CharacterShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();
        char[] newStr = new char[str.length()];

        for (int i=0; i<str.length();i++) {
            char ch = str.charAt(i);
            newStr[i] = (char)(ch + 1);
        }
        System.out.println(new String(newStr));
    }
}
