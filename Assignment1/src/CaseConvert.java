package src;

import java.util.Scanner;

public class CaseConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] = (char) (arr[i] - 32);
            }
            else if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char) (arr[i] + 32);
            }
        }
        str = new String(arr);
        System.out.println(str);
    }
}
