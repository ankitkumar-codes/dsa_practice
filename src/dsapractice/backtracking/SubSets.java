package dsapractice.backtracking;

public class SubSets {
    public static void printSubsets(String str, String curr, int index) {
        if (index == str.length()) {
            System.out.println(curr);
            return;
        }

        // Option 1: Include the current character
        printSubsets(str, curr + str.charAt(index), index + 1);

        // Option 2: Exclude the current character
        printSubsets(str, curr, index + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        printSubsets(str, "", 0);
    }
}
