import java.util.Arrays;
import java.util.Scanner;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted(
                     (left, right) -> right.compareTo(left)
                ).limit(3)
                .forEach(num -> System.out.printf("%d ", num));

    }
}
