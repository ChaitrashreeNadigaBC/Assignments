import java.util.Scanner;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        String res = "";

        for(int i=0; i<s.length()-1; i++) {
            if(s.charAt(i) != s.charAt(i+1)) {
                res += s.charAt(i);
            }
        }
        res += s.charAt(s.length() - 1);
        System.out.println(res);
    }
}
