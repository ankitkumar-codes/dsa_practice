package dsapractice.methods;

public class ConversionBinarytoDecimal {
    private static int convertBinToDecimal(int n) {
        int decimal = 0;
        int pow = 0;
        while (n > 0) {
            int lastTerm = n % 10;
            decimal += lastTerm * Math.pow(2, pow);
            n /= 10;
            pow++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        System.out.println(convertBinToDecimal(1010));
    }
}
