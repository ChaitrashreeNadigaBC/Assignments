package src.src;

import java.util.Scanner;

public class RemoveSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String res = "";

        for(int i =0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch != ' ') {
                res = res + ch;
            }
        }
        System.out.println("String without spaces: " + res);
    }
}
