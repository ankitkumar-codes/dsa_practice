package dsapractice.methods;

import java.util.Scanner;

public class AddingNo {
    private static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no: ");
        int no1 = sc.nextInt();
        System.out.println("Enter 2nd no: ");
        int no2 = sc.nextInt();
        System.out.println(calculateSum(no1, no2));
    }
}
