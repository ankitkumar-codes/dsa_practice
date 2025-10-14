package dsapractice.twodarrays;

import java.util.Scanner;

public class SearchElement {
    private static void search(int matrix[][], int key) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Element found at (" + i + "," + j +")");
                    return;
                }

            }

        }

        System.out.println("Element not found.");
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        // taking elements for user
        System.out.println("Enter elements: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();

            }

        }

        // printing elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();

        }
        search(matrix, 5);
    }
}
