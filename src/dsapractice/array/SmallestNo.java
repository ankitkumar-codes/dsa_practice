package dsapractice.array;

public class SmallestNo {
    private static int findLargestNo(int arr[]) {
        int smallestNo = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallestNo) {
                smallestNo = arr[i];
            }

        }
        return smallestNo;

    }

    public static void main(String[] args) {
        int numbers[] = {1,9,6,8,15};
        int smallestNo = findLargestNo(numbers);
        System.out.println("Largest No in the given array is :" + smallestNo);
    }
}
