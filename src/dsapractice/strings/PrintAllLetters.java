package dsapractice.strings;

public class PrintAllLetters {

    public static void main(String[] args) {

        String name = "Ankit Kumar";
        printLetter(name);

    }

    private static void printLetter(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
}
