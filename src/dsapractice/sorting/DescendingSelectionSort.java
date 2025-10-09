package dsapractice.sorting;

public class DescendingSelectionSort {
    private static void descSelectionSort(int arr[]) {
        int n = arr.length;

        for (int i = 0;i < n-1;i++) {
            int maxPos = i;
            for (int j = i+1; j < n; j++) {
                if (arr[maxPos] < arr[j]) {
                    maxPos = j;
                }
            }
            //swap
            int temp = arr[maxPos];
            arr[maxPos] = arr[i];
            arr[i] = temp;

        }

    }

    private static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        descSelectionSort(arr);
        printArray(arr);
    }
}

