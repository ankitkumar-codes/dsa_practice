package dsapractice.array;

public class KadanesAlgo {
    private static void maxSubArraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum < 0) {
                currentSum = 0;
            }

            maxSum = Math.max(currentSum, maxSum);

        }

        System.out.println("Max Sub array sum is: " + maxSum);

    }

    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        maxSubArraySum(arr);
    }
}
