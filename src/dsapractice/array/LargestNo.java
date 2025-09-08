package dsapractice.array;

public class LargestNo {
    private static int findLargestNo(int arr[]) {
        int largestNo = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestNo) {
                largestNo = arr[i];
            }

        }
        return largestNo;

    }

    public static void main(String[] args) {
        int numbers[] = {176,9,6,8,15};
        int largestNo = findLargestNo(numbers);
        System.out.println("Largest No in the given array is :" + largestNo);
    }
}
