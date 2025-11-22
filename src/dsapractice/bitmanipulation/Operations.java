package dsapractice.bitmanipulation;

import java.util.Scanner;

public class Operations {

    // Function to get ith bit
    public static int getIthBit(int n, int i) {
        return (n >> i) & 1;   // Right shift then AND with 1
    }

    // Function to set ith bit
    public static int setIthBit(int n, int i) {
//        int mask = 1 << i;
//        return n | mask;
        String no = Integer.toBinaryString(n);

    }
    public static int clearIthBit(int n, int i) {
        int mask = ~(1 << i);
        return n & mask;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.print("Enter bit position (i): ");
        int i = sc.nextInt();

        int bit = getIthBit(n, i);
        int nbit = setIthBit(n, i);
        int cbit = clearIthBit(n, i);

        System.out.println("The " + i + "th bit of " + n + " is: " + bit);
        System.out.println(nbit);
        System.out.println(cbit);
    }
}
