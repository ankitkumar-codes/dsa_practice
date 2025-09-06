package dsapractice.methods;

public class PrintingPrimeNoInRange {
    private static void printPrimeNoInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (PrimeNO.isPrime(i)) {
                System.out.println(i);
            }

        }
    }

    public static void main(String[] args) {
        printPrimeNoInRange(10);
    }
}
