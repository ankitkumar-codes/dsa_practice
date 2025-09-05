package dsapractice.patterns;

public class Diamond {
    private static void printDiamond(int n) {

        // for first half
        for (int line = 1; line <= n; line++) {

            // for spaces
            for (int space = 1; space <= n - line; space++) {
                System.out.print(" ");

            }

            // for stars
            for (int stars = 1; stars <= (2 * line) - 1; stars++) {
                System.out.print("*");

            }
            System.out.println();

        }

        // for second half
        for (int line = n; line >= 1; line--) {

            // for spaces
            for (int space = 1; space <= n - line; space++) {
                System.out.print(" ");

            }

            // for stars
            for (int stars = 1; stars <= (2 * line) - 1; stars++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        printDiamond(4);
    }
}
