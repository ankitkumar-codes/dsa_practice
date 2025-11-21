package dsapractice.bitmanipulation;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        evenOrOdd(n);

//        if ((n & 1) == 0) {
//            System.out.println(n + " is Even");
//        } else {
//            System.out.println(n + " is Odd");
//        }
    }

    public static void evenOrOdd(int n) {
        String str = Integer.toBinaryString(n);

        if (str.charAt(str.length()-1) == '0') {
            System.out.println("Even");

        }else {
            System.out.println("Odd");
        }
    }
}
