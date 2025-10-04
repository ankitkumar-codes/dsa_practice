package dsapractice.array;

import java.lang.invoke.SwitchPoint;
import java.util.Arrays;

public class PrefixSum {
    private static void maxSubArraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int n = arr.length;
        int prefixSumArr[] = new int[n];

        //calculate prefix array
        prefixSumArr[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSumArr[i] = prefixSumArr[i-1] + arr[i];

        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
              if (i == 0) {
                  currentSum = prefixSumArr[j];
              }else {
                  currentSum = prefixSumArr[j] - prefixSumArr[i - 1];
                  if (currentSum > maxSum) {
                      maxSum = currentSum;
                  }
              }
                System.out.println(currentSum);

            }

        }


        System.out.println("Max sub array sum id: " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        maxSubArraySum(arr);
    }
}
