package dsapractice.bitmanipulation;

import java.util.Scanner;

public class CountSetBits {

    // Function to count set bits
    public static int countSetBits(int n) {
        int count = 0;

        while (n > 0) {
            n = n & (n - 1);  // remove rightmost set bit
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Number of set bits = " + countSetBits(n));
    }
}
