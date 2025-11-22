import java.util.Scanner;

public class StringSeparate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.next();
        String letters = "";
        String digits = "";

        for(int i=0; i<s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                letters += s.charAt(i);
            } else if (s.charAt(i) >=0 && s.charAt(i) <= '9') {
                digits += s.charAt(i);
            }
        }

        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
    }
}
