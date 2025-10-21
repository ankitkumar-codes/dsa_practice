package dsapractice.twodarrays;

public class OptimizedDiagonalSum {
    private static int findDiagonalSum(int matrix[][]) {
        int diagonalSum = 0;
        int n = matrix.length;

        //calculating sum
        for (int i = 0; i < n; i++) {
            diagonalSum += matrix[i][i];
            if (i != n - i -1) {
                diagonalSum += matrix[i][n -1 - i];
            }

        }

        return diagonalSum;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        System.out.println("Sum of diagonals is: " + findDiagonalSum(matrix));
    }
}
