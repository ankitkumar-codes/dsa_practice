public class FirstOccurence {
    private static int firstOccurence(int arr[],int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (key == arr[i]) {
            return i;
        }
        return firstOccurence(arr, key, i+1);


        //return -1;
    }

    public static void main(String[] args) {
        int arr[] = {8,3,9,6,5,10,2,5,3};
        System.out.println("First occurence of no is: " + firstOccurence(arr, 15, 0));
    }
}
