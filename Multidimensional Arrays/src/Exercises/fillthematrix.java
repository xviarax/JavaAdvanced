package Exercises;

import java.util.Scanner;

public class fillthematrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        String pattern = input[1];
        int[][] matrix = new int[rows][rows];


        if (pattern.equals("A")){
            fillA(matrix,rows);
        } else if (pattern.equals("B")){
            fillB(matrix,rows);
        }
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix.length ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    private static void fillB(int[][] matrix, int rows) {
        int count = 1;
            for (int j = 0; j < rows; j++) { // koloni
                if (j % 2 == 0){
                    for (int i = 0; i < rows ; i++) { // redove
                        matrix[i][j] = count;
                        count++;
                    }
                } else {
                        for (int i = rows-1; i >= 0 ; i--) { // redove
                            matrix[i][j] = count;
                            count++;
                }

            }
        }
    }

    private static void fillA(int[][] matrix, int cols) {
        int count = 1;
        for (int i = 0; i < cols ; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[j][i] = count;
                count++;
            }
        }
    }
}
