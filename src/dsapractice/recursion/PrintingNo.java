package dsapractice.recursion;

public class PrintingNo {
    private static void printNo(int n) {
        System.out.println(n);

        if (n == 1) {
            return;
        }

        printNo(n-1);
    }

    private static void printIncNO(int n) {
        if (n == 1) {
            System.out.println("No: " + n);
            return;
        }
        printIncNO(n-1);
        System.out.println("No: " + n);
    }

    public static void main(String[] args) {
        printNo(5);
        System.out.println();
        printIncNO(5);
    }
}