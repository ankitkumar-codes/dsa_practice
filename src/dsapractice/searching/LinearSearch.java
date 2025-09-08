package dsapractice.searching;

public class LinearSearch {
    private static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,5,6,89,6};
        int key = 5;
        int result = linearSearch(arr, key);
        if (result == -1) {
            System.out.println("Element not present in the array");
        }else {
            System.out.println(key + " present at index " + result);
        }
    }
}
