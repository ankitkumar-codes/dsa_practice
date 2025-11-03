package dsapractice.recursion;

import java.util.Arrays;

public class PowerFunc {
    private static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }

        return x * power(x, n-1);
    }

    private static int optimisePower(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int halfPow = optimisePower(x, n/2);
        int halfPowSq = halfPow * halfPow;

        if (n%2 != 0) {
            halfPowSq = x * halfPowSq;
        }

        return halfPowSq;
    }

    public static void main(String[] args) {
        System.out.println(power(2,4));
        System.out.println("Result through optimised power function: " + optimisePower(2,6));
    }
}
