package dsapractice.backtracking;

public class NQueensOneSol {

    public static boolean solveNQueens(char[][] board, int row) {
        int n = board.length;

        // If all queens are placed, print the board and stop
        if (row == n) {
            printBoard(board);
            return true; // Stop after first solution
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';

                // If solution found, return true to stop further recursion
                if (solveNQueens(board, row + 1))
                    return true;

                board[row][col] = 'x'; // backtrack
            }
        }
        return false; // No valid placement in this row
    }

    private static boolean isSafe(char[][] board, int row, int col) {

        // check vertical up
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // check top-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // check top-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    private static void printBoard(char[][] board) {
        System.out.println("---- One Valid Solution ----");
        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 4;  // change this to any N
        char[][] board = new char[n][n];

        // initialize board with empty cells
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = 'x';

        boolean result = solveNQueens(board, 0);

        if (!result) {
            System.out.println("No solution exists for N = " + n);
        }
    }
}
