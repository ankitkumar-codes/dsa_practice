package dsapractice.DivideAndConquer;

public class MergeSort {
    private static void mergeSort(int si, int ei, int arr[]) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si)/2;
        mergeSort(si, mid, arr);
        mergeSort(mid + 1, ei, arr);
        merge(si, mid, ei, arr);

    }

    private static void merge(int si, int mid, int ei, int arr[]) {
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            }else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = si;k < temp.length;k++, i++) {
            arr[i] = temp[k];
        }


    }

    private static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }

    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8,-2};
        mergeSort(0, arr.length-1 , arr);
        printArray(arr);
    }
}
