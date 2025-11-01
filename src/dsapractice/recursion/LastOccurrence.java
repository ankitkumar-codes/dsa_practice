package dsapractice.recursion;

public class LastOccurrence {
    private static int lastOccurrence(int arr[], int key, int index) {
        if (index == -1 || arr[index] == key) {
            return index;
        }

        return lastOccurrence(arr, key, index-1);
    }

    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int n = arr.length-1;
        System.out.println("Last index is: " + lastOccurrence(arr, 5, n));
    }
}
