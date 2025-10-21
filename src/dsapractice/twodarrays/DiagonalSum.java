package dsapractice.twodarrays;

public class DiagonalSum {
    private static int diagonalSum(int matrix[][]) {
        int diagonalSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j || i + j == matrix.length - 1) {
                    diagonalSum += matrix[i][j];
                }

            }
        }

        return diagonalSum;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        System.out.println("Sum of diagonals is: " + diagonalSum(matrix));
    }
}
