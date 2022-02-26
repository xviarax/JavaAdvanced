import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String[] firstmatrix = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(firstmatrix[0]);
        int cols = Integer.parseInt(firstmatrix[1]);

        int[][] firstMa = new int[rows][cols];

        for (int i = 0; i < rows ; i++) {
           int[] roColum = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            firstMa[i] = roColum;
        }
        String[] secmatrix = scanner.nextLine().split(" ");
        int rowsss = Integer.parseInt(secmatrix[0]);
        int colssss = Integer.parseInt(secmatrix[1]);



        if (rows != rowsss || cols != colssss) {
            System.out.println("not equal");
            return;
        }

        int[][] secMa = new int[rowsss][colssss];

        for (int i = 0; i < rows ; i++) {
            String[] roColumm = scanner.nextLine().split(" ");
            for (int j = 0; j < colssss ; j++) {
                secMa[i][j] = Integer.parseInt(roColumm[j]);
            }
        }


        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < cols ; j++) {
                if (firstMa[i][j] != secMa[i][j]) {
                    System.out.println("not equal");
                    return;
                }
            }
        }
        System.out.println("equal");


    }
}
