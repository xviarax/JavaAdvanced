package Exercises;

import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        String[][] matrix = new String[rows][cols];

        char start = 'a';
        for (int i = 0; i < rows ; i++) {
            for (int col = 0; col < cols ; col++) {
                String palindrome = "" + start + (char)(start + col) + start;
                matrix[i][col] = palindrome;
            }
            start = (char)(start + 1);
        }

        printMatrix(matrix, rows, cols);
    }

    private static void printMatrix(String[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
