package dsapractice.bitmanipulation;

import java.util.Scanner;

public class FastExponentiation {

    // Fast Exponentiation: computes a^b
    public static long power(long a, long b) {
        long result = 1;

        while (b > 0) {
            // If b is odd → multiply result by a
            if ((b & 1) == 1) {
                result *= a;
            }

            // Square the base
            a *= a;

            // Divide exponent by 2
            b >>= 1;  // same as b = b / 2
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (a): ");
        long a = sc.nextLong();

        System.out.print("Enter exponent (b): ");
        long b = sc.nextLong();

        long ans = power(a, b);

        System.out.println(a + "^" + b + " = " + ans);
    }
}
