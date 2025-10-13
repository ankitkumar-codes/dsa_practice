package dsapractice.recursion;

public class PrintingNo {
    private static void printNo(int n) {
        System.out.println(n);

        if (n == 1) {
            return;
        }

        printNo(n-1);
    }

    public static void main(String[] args) {
        printNo(5);
    }
}