package dsapractice.backtracking;

public class SubSets {
    private static void printSubset(String str, String newStr, int i) {
        if (i == str.length()) {
            System.out.println(newStr);
            return;
        }

        printSubset(str, newStr + str.charAt(i), i+1);
        printSubset(str, newStr, i+1);
    }

    public static void main(String[] args) {
        String str = "abc";
        printSubset(str, "", 0);
    }
}
