package dsapractice.patterns;

public class SolidRhombus {
    private static void printSolidRhombus(int n) {
        for (int line = 1; line <= n; line++) {

            // for spaces
            for (int space = 1; space <= n - line; space++) {
                System.out.print(" ");

            }

            //for stars
            for (int stars = 1; stars <= n; stars++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        printSolidRhombus(5);
    }
}
