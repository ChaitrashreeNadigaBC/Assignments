import java.util.Scanner;

public class ManualTrim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "  Hello World  ";
        String output = Trim(input);
        System.out.println("\"" + output + "\"");
    }

    public static String Trim(String str) {
        int start = 0;
        int end = str.length()-1;

        // Find first non-space character
        for(int i=0; i< str.length(); i++) {
            if (str.charAt(i) != ' ') {
                start = i;
                break;
            }
        }

        // Find last non-space character
        for (int i = str.length()-1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                end = i;
                break;
            }
        }

        // Build the trimmed string
        String res = "";
        for (int i=start; i<= end; i++) {
            res += str.charAt(i);
        }
        return res;
    }
}
