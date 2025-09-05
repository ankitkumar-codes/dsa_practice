package dsapractice.patterns;

public class HollowRhombus {
    private static void printHollowRhombus(int n) {
        for (int line = 1; line <= n; line++) {

            // for leading spaces
            for (int space = 1; space <= n - line; space++) {
                System.out.print("  ");

            }

            //for stars
            for (int stars = 1; stars <= n; stars++) {
                if (line == 1 || line == n || stars == 1 || stars == n) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        printHollowRhombus(5);
    }
}
