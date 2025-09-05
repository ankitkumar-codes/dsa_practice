public class FloydTriangle {
    private static void printFloydTriangle(int n) {
        int number = 1;
        for (int line = 1; line <= n; line++) {
            for (int no = 1; no <= line; no++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        printFloydTriangle(5);
    }
}
