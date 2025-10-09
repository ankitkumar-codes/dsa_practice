package dsapractice.sorting;

public class SelectionSort {
    private static void selectionSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int minPos = i;

            //finding minimum element
            for (int j = i+1; j < n; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }

            }

            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
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
        selectionSort(arr);
        printArray(arr);
    }
}
