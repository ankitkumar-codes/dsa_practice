public class InvertedHalfNoPyramid {
    private static void printInvertedHalfNoPyrami(int n) {
        for (int line = 0; line < n; line++) {
            for (int no = 1; no <= n-line; no++) {
                System.out.print(no);

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        printInvertedHalfNoPyrami(5);
    }
}
