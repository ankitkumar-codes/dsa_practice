package dsapractice.twodarrays;

public class SearchInSortedMatrix {
    private static boolean stairCaseSearch(int matrix[][], int key) {
        int i = matrix.length-1;
        int j = 0;
        while (i >= 0 && j <= matrix[0].length-1) {
            if (key == matrix[i][j]) {
                System.out.println("Element found at: " + i + "," + j);
                return true;
            } else if (key > matrix[i][j]) {
                j++;

            }else {
                i++;
            }
        }

        System.out.println("Element didn't found.");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40}, {15,25,35,45}, {27,29,37,48}, {32,33,39,50}};
        stairCaseSearch(matrix, 100);
    }
}
