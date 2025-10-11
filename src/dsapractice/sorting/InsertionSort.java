package dsapractice.sorting;

public class InsertionSort {
    private static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int previous = i-1;
            while(previous >= 0 && arr[previous] > temp) {
                arr[previous+1] = arr[previous];
                previous--;
            }
            arr[previous+1] = temp;

        }

    }


    private static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        insertionSort(arr);
        printArray(arr);
    }
}
