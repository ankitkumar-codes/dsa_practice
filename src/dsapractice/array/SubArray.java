package dsapractice.array;

public class SubArray {
    private static void printSubArray(int arr[]) {
        int totalSubArrays = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            totalSubArrays++;
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print(arr[i] + " ");
                totalSubArrays++;
                for (int k = i + 1; k <= j; k++) {
                    System.out.print(arr[k] + " ");

                }
                System.out.println();

            }
            System.out.println();

        }
        System.out.println("Total sub arrays: " + totalSubArrays);

    }

    public static void main(String[] args) {
        int no[] = {2,4,6,8,10};
        printSubArray(no);
    }
}
