package dsapractice.methods;

public class BinomialCoefficient {
    private  static long calculateBinomial(int n, int r) {
        long n_factorial = Factorial.calculateFactorial(n);
        long r_factorial = Factorial.calculateFactorial(r);
        long nr_factorial = Factorial.calculateFactorial(n-r);
        long binomialCoeff = n_factorial/(r_factorial*nr_factorial);
        return binomialCoeff;
    }
    public static void main(String[] args) {
        System.out.println(calculateBinomial(3, 3));

    }
}
