package Exercises;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int [][] matrix = new int[rows][rows];
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < rows ; i++) {
            int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = nums;
        }

        for (int i = 0; i < rows ; i++) {
           sum1 += matrix[i][i];
        }
        for (int i = 0; i < rows ; i++) {
            sum2 += matrix[rows-1-i][i];
        }

        System.out.println(Math.abs(sum1-sum2));
    }
}
