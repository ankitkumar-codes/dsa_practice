package dsapractice.twodarrays;

public class MaxMinElement {
    private static void findMaxMinElement(int matrix[][]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // accessing element
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                // finding max element
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }

                //finding min element
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }

            }

        }
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }

    public static void main(String[] args) {
        int matrix[][] = {{2,3,5}, {4,7,2}, {8,9,1}};
        findMaxMinElement(matrix);
    }
}
