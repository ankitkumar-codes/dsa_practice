package dsapractice.array;

public class SubArraySum {
    private static void subArraySum(int[] arr) {
        int max_sum = Integer.MIN_VALUE;
        int min_sum = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    //System.out.print(arr[k]);

                }
                System.out.println("Sum of the sub array: " + sum);
                if (sum > max_sum) {
                    max_sum = sum;
                }
                if (sum < min_sum){
                    min_sum = sum;
                }
                sum = 0;
                //System.out.println();

            }

        }
        System.out.println("Max sub array sum is: " + max_sum);
        System.out.println("Min sub array sum is: " + min_sum);

    }

    public static void main(String[] args) {
        int arr[] = {-2,-3,4};
        subArraySum(arr);
    }
}
