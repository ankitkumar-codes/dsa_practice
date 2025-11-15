package dsapractice.backtracking;

import java.util.*;

public class NQueens {

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize board with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        boolean[] cols = new boolean[n];          // Column attacks
        boolean[] diag1 = new boolean[2 * n];     // Row + Col
        boolean[] diag2 = new boolean[2 * n];     // Row - Col + n

        placeQueen(0, n, board, cols, diag1, diag2, result);

        return result;
    }

    private static void placeQueen(int row, int n, char[][] board,
                                   boolean[] cols, boolean[] diag1, boolean[] diag2,
                                   List<List<String>> result) {

        if (row == n) {
            result.add(construct(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (cols[col] || diag1[row + col] || diag2[row - col + n]) continue;

            // Place queen
            board[row][col] = 'Q';
            cols[col] = diag1[row + col] = diag2[row - col + n] = true;

            placeQueen(row + 1, n, board, cols, diag1, diag2, result);

            // Backtrack
            board[row][col] = '.';
            cols[col] = diag1[row + col] = diag2[row - col + n] = false;
        }
    }

    private static List<String> construct(char[][] board) {
        List<String> list = new ArrayList<>();
        for (char[] row : board) {
            list.add(new String(row));
        }
        return list;
    }

    // ✅ MAIN FUNCTION
    public static void main(String[] args) {
        int n = 4; // you can change N here

        List<List<String>> solutions = solveNQueens(n);

        System.out.println("Total solutions for " + n + " queens: " + solutions.size());
        System.out.println();

        for (List<String> board : solutions) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
