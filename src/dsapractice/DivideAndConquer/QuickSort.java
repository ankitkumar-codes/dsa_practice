package dsapractice.DivideAndConquer;

public class QuickSort {
    private static void quickSort(int arr[],int si, int ei) {
        if (si >= ei) {
            return;
        }

        int pidx = partition(arr, si, ei);
        quickSort(arr, si, pidx -1);
        quickSort(arr, pidx + 1, ei);
    }

    private static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si;j < ei;j++) {
            if (arr[j] < pivot) {
                i++;

                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[++i];
        arr[i] = pivot;
        arr[ei] = temp;

        return i;
    }

    private static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }

    public static void main(String[] args) {
        int arr[] = {6,3,4,8,2,5};
        quickSort(arr, 0, arr.length -1);
        printArray(arr);
    }
}
