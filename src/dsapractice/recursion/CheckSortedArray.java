package dsapractice.recursion;

public class CheckSortedArray {
    private static boolean isArrSorted(int arr[], int index) {
        if (index == arr.length -1) {
            return true;
        }
        if (arr[index] < arr[index+1]) {
            return isArrSorted(arr, index+1);
        }else {
            return false;

        }

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println("Is array sorted: " + isArrSorted(arr, 0));
    }
}
