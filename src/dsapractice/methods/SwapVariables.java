package dsapractice.methods;

public class SwapVariables {
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        int temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println("Value of a: " + a); // after swapping
//        System.out.println("Value of b: " + b); // after swapping
//    }

    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

    }

    // Call by value

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);

        // Values after swapping
        System.out.println("Value of a: " +a);
        System.out.println("Value of b: " +b);

    }
}
