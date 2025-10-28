package dsapractice.recursion;

public class CheckSortedArray {
    private static boolean isArrSorted(int arr[], int index) {
        // Base case: if we reach the last element, it's sorted
        if (index == arr.length - 1) {
            return true;
        }

        // If current element is greater than next one, array is not sorted
        if (arr[index] > arr[index + 1]) {
            return false;
        }

        // Recursive call for the rest of the array
        return isArrSorted(arr, index + 1);

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println("Is array sorted: " + isArrSorted(arr, 0));
    }
}
