package dsapractice.patterns;

public class HollowRectangle {
    private static void printHollowRectangle(int rows, int col) {
        for (int totalRow = 1; totalRow <= rows; totalRow++) {
            for (int totalCol = 1; totalCol <= col; totalCol++) {
                if (totalRow == 1 || totalRow == rows || totalCol == 1 || totalCol == col) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        printHollowRectangle(4, 5);
    }
}
