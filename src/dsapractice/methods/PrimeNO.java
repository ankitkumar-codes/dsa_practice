package dsapractice.methods;

public class PrimeNO {
    protected static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int n = 4;
        if (isPrime(n)) {
            System.out.println("Given no is prime ");
        }else {
            System.out.println("Given no is not prime ");
        }
    }
}
