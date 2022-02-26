import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rowCols = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = rowCols[0];
        int cols = rowCols[1];

        int[][] matr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] arr = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matr[i][j] = Integer.parseInt(arr[j]);
//                if (Integer.parseInt(arr[j]) == num){
//                    System.out.println(i + " " + j);
//                }
            }
        }
        int num = Integer.parseInt(scanner.nextLine());
        boolean found = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matr[i][j] == num){
                    System.out.println(i + " " + j);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("not found");
        }



    }
}
