import java.util.Scanner;

public class AlternateCharUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        String output = alternateUppercase(input);
        System.out.println("Output string: " + output);
    }

    public static String alternateUppercase(String str) {
        String res = "";
        int count = 0;  // Count only non-space characters

        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ' ') {
                res += ch;  // Keep spaces as-it-is
            } else {
                if (count % 2 == 0) {
                    res += Character.toUpperCase(ch);   // Uppercase for even count
                } else {
                    res += Character.toLowerCase(ch);   // Lowercase for odd count
                }
                count++;
            }
        }
        return res;
    }
}
