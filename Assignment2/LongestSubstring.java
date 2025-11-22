import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        int maxLength = 0;
        String longest = "";

        for (int i=0; i<s.length(); i++) {
            String current = "";
            for (int j=i; j<s.length(); j++) {
                char c = s.charAt(j);

                // If not present → add it
                if (current.indexOf(c) == -1) {
                    current += c;
                } else {
                    break;
                }

                // update longest substring
                if (current.length() > maxLength) {
                    maxLength = current.length();
                    longest = current;
                }
            }
        }
        System.out.println("Longest substring: " + longest);
        System.out.println("Length: " + maxLength);
    }
}
