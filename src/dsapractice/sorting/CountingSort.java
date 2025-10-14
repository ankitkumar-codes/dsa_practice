package dsapractice.sorting;

public class CountingSort {
    private static void countingSort(int arr[]) {
        int n = arr.length;

        // finding maximum value
        int maxVal = arr[0];
        for (int i = 1; i < n; i++) {
            maxVal = Math.max(maxVal, arr[i]);

        }

        // new array
        int frequencyArr[] = new int[maxVal+1];

        for (int i = 0; i < n; i++) {
            frequencyArr[arr[i]]++;

        }

        //sorting
        int index = 0;
        for (int i = 0; i < n; i++) {
            while (frequencyArr[i] > 0) {
                arr[index] = i;
                index++;
                frequencyArr[i]--;

            }

        }

    }

    private static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }

    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
        countingSort(arr);
        printArray(arr);
    }
}
