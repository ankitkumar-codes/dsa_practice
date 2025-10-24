package dsapractice.arraylists;

import java.util.ArrayList;

public class PairSum {
    private static  boolean pairSum1(ArrayList<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int pairSum = list.get(left) + list.get(right);
            if (pairSum == target) {
                return true;
            } else if (pairSum > target) {
                right--;
            }else {
                left++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("Does pair exists: " + pairSum1(list, 8));
    }
}
