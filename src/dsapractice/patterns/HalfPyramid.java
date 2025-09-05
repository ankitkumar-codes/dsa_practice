package dsapractice.patterns;

public class HalfPyramid {

    private static void printHalfPyramid(int n) {
        for (int line = 1; line <= n; line++) {
            for (int no = 1; no <= line ; no++) {
                System.out.print(no);

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        printHalfPyramid(4);
    }
}
