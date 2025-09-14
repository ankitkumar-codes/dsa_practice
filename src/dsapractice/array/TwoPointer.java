package dsapractice.array;

import java.util.Arrays;

public class TwoPointer {
    private static int[] pairSum(int nums[], int target) {
        for(int i = 0;i<nums.length;i++) {
            for (int j = i+1;j<nums.length;j++) {
                if (nums[i]+nums[j]==target) {
                    return new int[] {i,j};
                }
            }
        }
        return  new int[] {};
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(pairSum(arr, 5)));
    }
}
