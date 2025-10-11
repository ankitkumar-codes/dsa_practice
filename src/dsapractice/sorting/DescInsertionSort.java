package dsapractice.sorting;

import jdk.jshell.spi.SPIResolutionException;

public class DescInsertionSort {
    private static void descInsertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int previous = i-1;
            while(previous >= 0 && arr[previous] < temp) {
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
        descInsertionSort(arr);
        printArray(arr);
    }
}
