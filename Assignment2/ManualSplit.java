public class ManualSplit {
    public static void main(String[] args) {
        String input = "Hello world this is me";

        // count the numbers of words in a string
        int wordCount = 1; // at least 1 word if string is not empty
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        String word = "";
        int index = 0;

        // Loop through the string to build words
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == ' ') {
                if (!word.equals("")) {
                    words[index] = word; // save word to array
                    index++;
                    word = "";           // reset word
                }
            } else {
                word += ch;              // build word
            }
        }
        words[index] = word;

        System.out.print("[");
        for (int i = 0; i < words.length; i++) {
            System.out.print("\"" + words[i] + "\"");
            if (i < words.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
