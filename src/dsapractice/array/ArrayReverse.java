package dsapractice.array;

import java.util.Arrays;

public class ArrayReverse {
    private  static int[] reverseArray(int[] arr) {
        int first = 0;
        int last = arr.length-1;
        while (first<last) {
            // swapping elements
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int  arr[] = {5,7,6,8,2};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
