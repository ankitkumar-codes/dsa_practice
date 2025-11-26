package dsapractice.bitmanipulation;

import java.util.Scanner;

public class Operations {

    // Function to get ith bit
    public static int getIthBit(int n, int i) {
        return (n >> i) & 1;   // Right shift then AND with 1
    }

    // Function to set ith bit
    public static int setIthBit(int n, int i) {
        int mask = 1 << i;
        return n | mask;

    }
    public static int clearIthBit(int n, int i) {
        int mask = ~(1 << i);
        return n & mask;
    }

    public static int updateIthBit(int n, int i, int bit) {
        if (bit == 0) {
            int mask = ~(1 << i);
            return n & mask;
        }else {
            int mask = 1 << i;
            return n | mask;
        }
    }

    private static int clearIBits(int n, int i) {
        int bitMask = (-1) << i;
        return n & bitMask;
    }

    private static int clearBitsInRange(int n, int i, int j) {
        int bitMask = -1;
        for (int k = i;k < j+1;k++) {
            bitMask = clearIthBit(bitMask, k);
        }

        return n & bitMask;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.print("Enter bit position (i): ");
        int i = sc.nextInt();

        int bit = getIthBit(n, i);
        int setBit = setIthBit(n, i);
        int clearedBit = clearIthBit(n, i);
        int updatedBit = updateIthBit(n, i, 0);
        int clearRangeBits = clearBitsInRange(n, 2, 4);

//        System.out.println("The " + i + "th bit of " + n + " is: " + bit);
//        System.out.println("No after setting: " + setBit);
//        System.out.println("Cleared bit: " + clearedBit);
//        System.out.println("Bit after updation: " + updatedBit);
//        System.out.println("After clearing i bits: " + clearIBits(n, i));
        System.out.println("After clearing bits in range: " + clearRangeBits);
    }
}
