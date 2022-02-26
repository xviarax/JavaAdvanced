package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer :: parseInt).toArray();
        int rows = numbers[0];
        int cols = numbers[1];

        int [][] matrix = new int [rows][rows];
        fillMatrixType1(scanner, matrix, rows, cols);
        int maxSum = Integer.MIN_VALUE;

        int startRow = 0;
        int startCol = 0;
        for (int i = 0; i < rows - 2 ; i++) {
            for (int col = 0; col < cols - 2 ; col++) {
                int sum = matrix[i][col] + matrix[i][col + 1] + matrix[i][col + 2]
                        + matrix[i + 1][col] + matrix[i + 1][col + 1] + matrix[i + 1][col + 2]
                        +  matrix[i + 2][col] + matrix[i + 2][col + 1] + matrix[i + 2][col + 2];

                if(sum > maxSum) {
                    maxSum = sum;
                    startRow = i;
                    startCol = col;
                }
            }

        }

        System.out.println("Sum = " + maxSum);

        for (int row = startRow; row <= startRow + 2; row++) {
            for (int col = startCol; col <= startCol + 2 ; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }




    }

    private static void fillMatrixType1(Scanner scanner, int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
        }
    }
}
