package dsapractice.methods;

public class ConversionDecimalToBinary {
    private static void convertDecToBin(int dec) {
        int bin = 0;
        int pow = 0;
        while (dec > 0) {
            int rem = dec % 2;
            bin = bin + (rem *  (int)  Math.pow(10,pow));
            dec /= 2;
            pow++;
        }

        System.out.println("Binary Converion of the given no is : " + bin);
    }

    public static void main(String[] args) {
        convertDecToBin(4);
    }
}
