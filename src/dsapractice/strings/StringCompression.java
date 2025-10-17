package dsapractice.strings;

public class StringCompression {
    private static String compress(String str) {
        char var = str.charAt(0);
        int count = 1;
        StringBuilder compressedStr = new StringBuilder();
        compressedStr.append(str.charAt(0));

        for (int i = 1; i < str.length();i++) {
            //var = str.charAt(i);
            if (var == str.charAt(i)) {
                count++;
            }else {
                if (count > 1) {
                    compressedStr.append(count);
                }
                var = str.charAt(i);
                compressedStr.append(var);
                count = 1;
            }

        }
        if (count > 1) {
            compressedStr.append(count);
        }

        return compressedStr.toString();
    }

    public static void main(String[] args) {
        String str = "abcc";
        System.out.println("Compressed string: " + compress(str));
    }
}
