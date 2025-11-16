package dsapractice.backtracking;

public class NQueens {
    private static void nQueens(char board[][], int row) {
        if (row == board.length) {
            printBoard(board);
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = 'Q';
                nQueens(board, row + 1);
                board[row][i] = 'x';
            }

        }
    }

    private static boolean isSafe(char board[][], int row, int col) {
        // vertical up
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }

        }

        // top left
        for (int i = row-1,j = col-1; i >= 0 && j >= 0; i--,j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // top right
        for (int i = row-1,j = col+1; i >= 0 && j < board.length; i--,j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    private static void printBoard(char board[][]) {
        int n = board.length;;
        System.out.println(" -------- Board -------- ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';

            }

        }

        nQueens(board, 0);
    }
}