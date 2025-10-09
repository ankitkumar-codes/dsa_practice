package dsapractice.sorting;

public class OptiizedBubbleSort {
    private static void bubbleSort(int arr[]) {
        int n = arr.length;

        boolean swapped;

        for (int i = 0; i < n-1; i++) {
            swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;

                }
            }
            if (!swapped) break;

        }
    }
    private static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        bubbleSort(arr);
        printArray(arr);
    }
}
