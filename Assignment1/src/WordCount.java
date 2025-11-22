package src;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int count = 1;

        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Number of words in a string is: " + count);
    }
}
