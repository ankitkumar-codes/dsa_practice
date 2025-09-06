package dsapractice.methods;

public class Factorial {
    private static long calculateFactoria(int n) {
        long product = 1;
        for (int i = n; i > 1; i--) {
            product *= i;
        }
        return product;
    }

    public static void main(String[] args) {
        System.out.println(calculateFactoria(26));
    }
}
