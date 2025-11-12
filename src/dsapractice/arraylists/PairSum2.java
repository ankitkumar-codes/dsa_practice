package dsapractice.arraylists;

import java.util.ArrayList;

public class PairSum2 {
    private static boolean pairSum2(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();

        for (int i = 0; i < n; i++) {
            if (list.get(i) > list.get(i+1)) {
                bp = i+1;
                break;
            }

        }

        int lp = bp;
        int rp = bp - 1;
        while (lp != rp) {
            int currSum = list.get(lp) + list.get(rp);
            if (currSum == target) {
                return true;
            }
            else if (currSum < target) {
                lp = (lp+1) % n;
            }else {
                rp = (rp+n-1) % n;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println(pairSum2(list, 19));
    }
}
