package src.src;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings: ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if(str1.length() != str2.length()) {
            System.out.println("Strings are not equal.");
            return ;
        }

        boolean isEqual = true;
        for (int i=0; i<str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                isEqual = false;
                break;
            }
        }

        if (isEqual) {
            System.out.println("Strings are Equal.");
        } else {
            System.out.println("Strings are Not Equal.");
        }
    }
}
