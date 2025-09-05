public class ZeroOneTriangle {
    private static void printZeroOneTriangle(int n) {
        for (int line = 1; line <= n; line++) {
            for (int no = 1; no <= line; no++) {
                if ((line + no)%2 == 0) {
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        printZeroOneTriangle(5);
    }
}
