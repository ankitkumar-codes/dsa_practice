public class Butterfly {
    private static void printButterflyPattern(int n) {

        // For first half pyramid
        for (int line = 1; line <= n; line++) {

            //stars
            for (int star = 1; star <= line; star++) {
                System.out.print("*");

            }

            //spaces
            for (int space = 1; space <= (n - line)* 2; space++) {
                System.out.print(" ");

            }

            //stars
            for (int star = 1; star <= line; star++) {
                System.out.print("*");

            }
            System.out.println();

        }

        //For second half pyramid
        for (int line = n; line >= 1; line--) {

            //stars
            for (int star = 1; star <= line; star++) {
                System.out.print("*");

            }

            //spaces
            for (int space = 1; space <= (n - line)* 2; space++) {
                System.out.print(" ");

            }

            //stars
            for (int star = 1; star <= line; star++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        printButterflyPattern(4);
    }
}
