package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nums = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(nums[0]);
        int cols = Integer.parseInt(nums[1]);

        String[][] matrix = new String[rows][cols];
        for (int i = 0; i < rows ; i++) {
            matrix[i] = scanner.nextLine().split(" ");
        }

            String command = scanner.nextLine();
            while (!command.equals("END")) {
                String[] array = command.split(" ");
                if (array[0].equals("swap")) {
                        if (array.length != 5 ){
                            System.out.println("Invalid input!");
                        } else {
                           int firstRow = Integer.parseInt(array[1]);
                           int firstCols = Integer.parseInt(array[2]);
                           int secRow = Integer.parseInt(array[3]);
                           int secCols = Integer.parseInt(array[4]);

                            if (firstRow < 0 || firstRow >= rows || secRow < 0 || secRow >= rows || firstCols < 0 || firstCols >= cols || secCols < 0 || secCols >= cols) {
                                System.out.println("Invalid input!");
                            } else {
                            String num1 = matrix[firstRow][firstCols];
                            String num2 = matrix[secRow][secCols];
                            matrix[firstRow][firstCols] = num2;
                            matrix[secRow][secCols] = num1;
                            printmatrix(matrix,rows,cols);
                        }
                 }
                } else {
                    System.out.println("Invalid input!");
                }

                command = scanner.nextLine();
            }
        }

    private static void printmatrix(String[][] matrix, int rows, int cols) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < cols ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}

