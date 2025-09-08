package dsapractice.searching;

public class BinarySearch {
    private static int binarySearch(int arr[], int key) {
        int beg = 0;
        int end = arr.length-1;
        int mid = (beg+end)/2;

        while (beg <= end) {
            if (key == arr[mid]) {
                return mid;
            } else if (key > arr[mid]) {
                beg = mid + 1;
                mid = (beg+end)/2;

            }else {
                end = mid - 1;
                mid = (beg+end)/2;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int no[] = {1,2,3,4,5,6,7,8,9};
        int key = 59;
        int index = binarySearch(no, key);
        if (index == -1) {
            System.out.println("Element not present");
        }else {
            System.out.println(key + " element present at index " + index);
        }

    }
}
