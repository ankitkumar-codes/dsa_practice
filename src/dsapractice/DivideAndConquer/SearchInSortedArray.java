package dsapractice.DivideAndConquer;

public class SearchInSortedArray {
    private static int search(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        if (arr[mid] == tar) {
            return mid;
        }

        // on line l1
        if (arr[si] <= arr[mid]) {
            // case 1
            if (arr[mid] >= tar && tar >= arr[si]) {
               return search(arr, tar, si, mid - 1);
            } else { // case 2
                return search(arr, tar, mid + 1, ei);
            }
        } else {
            //case 1
            if (tar >= arr[mid] && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else { // case 2
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    private static int searchArr(int arr[], int tar, int si, int ei) {
        while (si <= ei) {
            int mid = si + (ei - si)/2;
            if (arr[mid] == tar) {
                return mid;
            }

            if (arr[si] < arr[mid]) {
                if (tar < arr[mid] && tar >= arr[si]) {
                    ei = mid -1;
                }else {
                    si = mid + 1;
                }
            }else {
                if (tar <= arr[ei] && tar > arr[mid]) {
                    si = mid + 1;
                }else {
                    ei = mid -1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        System.out.println(search(arr, 1, 0, arr.length-1));
        System.out.println(searchArr(arr, 4, 0, arr.length - 1));
    }
}
