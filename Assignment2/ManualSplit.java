public class ManualSplit {
    public static void main(String[] args) {
        String input = "Hello world this is me";

        // First, count how many words there are
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

    }
}
