package dsapractice.recursion;

import java.security.spec.RSAOtherPrimeInfo;

public class BinaryStrings {
    private static void printBinStr(int n, int lastElement, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        printBinStr(n-1, 0, str + "0");

        if (lastElement == 0) {
            printBinStr(n-1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        printBinStr(3, 0, "");
    }
}
