import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] num = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(num[0]);
        int cols = Integer.parseInt(num[1]);

        int[][] arr = new int[rows][cols];
        int sum = 0;

        for (int i = 0; i < rows ; i++) {
            String[] rowfirst = scanner.nextLine().split(", ");
            for (int j = 0; j < cols; j++) {
                arr[i][j] = Integer.parseInt(rowfirst[j]);
                sum += Integer.parseInt(rowfirst[j]);
            }
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }
}
