import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstmatrix = new char[rows][cols];

        for (int i = 0; i < rows ; i++) {
            String[] roColumm = scanner.nextLine().split(" ");
            for (int j = 0; j < cols ; j++) {
                firstmatrix[i][j] = roColumm[j].charAt(0);
            }
        }
        char[][] secmatrix = new char[rows][cols];

        for (int i = 0; i < rows ; i++) {
            String[] roColumm = scanner.nextLine().split(" ");
            for (int j = 0; j < cols ; j++) {
                secmatrix[i][j] = roColumm[j].charAt(0);
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols ; j++) {
                if (firstmatrix[i][j] == secmatrix[i][j]) {
                    System.out.print(firstmatrix[i][j] + " ");
                } else {
                    System.out.print("*" + " ");
                }
            }
            System.out.println();
        }



    }
}
