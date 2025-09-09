package dsapractice.array;

public class ArraySorted {
    private static boolean isArrSorted(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {5,64,947};
        if (isArrSorted(arr)) {
            System.out.println("Yes array is sorted");
        }
        else {
            System.out.println("No array is not sorted");
        }
    }

}
