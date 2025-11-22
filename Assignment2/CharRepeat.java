import java.util.Scanner;

public class CharRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.next();
        String res =  "";

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            for (int j=0; j <=i; j++) {
                res += ch;
            }
            res += " ";
        }
    System.out.println("Output string: " + res);
    }
}
