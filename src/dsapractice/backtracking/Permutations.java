package dsapractice.backtracking;

public class Permutations {
    private static void printPermutations(String str, String newStr) {
        if (str.length() == 0) {
            System.out.println(newStr);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);

            String string = str.substring(0,i) + str.substring(i+1);
            printPermutations(string, newStr+curr);

        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printPermutations(str, "");
    }
}
