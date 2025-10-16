package dsapractice.strings;

import java.util.Arrays;

public class ToUpperCase {
    private static String toUpperCase(String str) {
        // splitting string into array of words
        String words[] = str.split(" ");
        StringBuilder capStr = new StringBuilder();

        for (String word: words) {
            capStr.append(Character.toUpperCase(word.charAt(0)));
            for (int i = 1; i < word.length(); i++) {
                capStr.append(word.charAt(i));

            }
            capStr.append(" ");
        }

        return capStr.toString().trim();


    }

    public static void main(String[] args) {
        String str = "hi, i am Ankit";
        System.out.println(toUpperCase(str));
    }
}
