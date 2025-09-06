package dsapractice.methods;

public class Product {
    private  static int multiply(int a, int b) {
        return a*b;
    }

    public static void main(String[] args) {
        System.out.println("Product of given nos: " + multiply(2, 7));
    }
}
