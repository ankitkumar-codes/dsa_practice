package dsapractice.array;

public class FindMinMax {
    public static void find(int[] arr){
        int min = arr[0];
        int max = arr[0];

        for (int i=0; i< arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(" min  : " + min);
        System.out.println("max : "+ max);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        find(arr);
    }
}
