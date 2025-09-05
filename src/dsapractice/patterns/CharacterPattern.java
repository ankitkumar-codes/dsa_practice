package dsapractice.patterns;

public class CharacterPattern {

    private static void printCharPattern(int n) {
        char character = 'A';
        for (int line = 0; line < n; line++) {
            for (int ch = 0; ch <= line; ch++) {
                System.out.print(character);
                character++;

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        printCharPattern(4);
    }

}
