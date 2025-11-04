package dsapractice.recursion;

public class RemoveDuplicates {
    private static void removeDuplicates(String str, int index, StringBuilder newStr, boolean map[]) {
        if (index == str.length()) {
            System.out.println("String after removing duplicates: " + newStr);
            return;
        }

        char currChar = str.charAt(index);

        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, index + 1, newStr, map);
        }else {
            map[currChar - 'a'] = true;
            newStr.append(currChar);
            removeDuplicates(str, index++, newStr, map);
        }
    }

    public static void main(String[] args) {
        String str = "apnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
