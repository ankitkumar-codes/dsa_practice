package dsapractice.recursion;

public class FirstOccurrence {
    private static int firstOccurrence(int arr[],int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (key == arr[i]) {
            return i;
        }

        return firstOccurrence(arr, key, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {8,3,9,6,5,10,2,5,3};
        System.out.println("First occurrence of no is: " + firstOccurrence(arr, 15, 0));
    }
}
