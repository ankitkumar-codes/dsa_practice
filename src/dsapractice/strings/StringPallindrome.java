package dsapractice.strings;

public class StringPallindrome {
//        private static boolean isPallindrome(String str) {
//        String reverseStr = "";
//
//        for (int i = str.length()-1; i >= 0; i--) {
//            reverseStr += String.valueOf(str.charAt(i));
//
//        }
//
//        if (str.equals(reverseStr)) {
//            return true;
//        }else {
//            return false;
//        }
//    }

    private static  boolean isPallindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n/2; i++) {
            if (str.charAt(i) != str.charAt(n-(i+1))) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String name = "NAMAN";
        System.out.println(name.subSequence(1,5));
        System.out.println("Is " + name + " pallindrome?:- " + isPallindrome(name));
    }
}
