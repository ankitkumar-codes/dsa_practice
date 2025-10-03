package dsapractice.strings;

public class LargestString {
    private static String findLargestString(String arr[]) {
        String largestString = "";
        for (String str: arr) {
            if (str.compareTo(largestString) > 0) {
                largestString = str;
            }
        }
        return largestString;

    }

    public static void main(String[] args) {
        String arr[] = {"apple", "mango", "banana"};
        System.out.println("Largest element is: " + findLargestString(arr));
    }
}