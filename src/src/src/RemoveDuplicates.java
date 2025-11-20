package src.src;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String res = "";

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean found = false;

            for(int j = 0; j < res.length(); j++) {
                if(res.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }

            if(!found) {
                res = res + ch;
            }
        }

        System.out.println("String without duplicates: " + res);
    }
}
