package dsapractice.recursion;

public class SumOfNo {
    private static int calcSum(int n) {
        if (n == 1) {
            return 1;
        }

        int sum = n + calcSum(n-1);

        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum of first n natural no is: " + calcSum(n));
    }
}
