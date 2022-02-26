import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(", ");

      List<Integer> num =  Arrays.stream(arr).map(Integer::parseInt)
                .collect(Collectors.toList());

      int sum = Arrays.stream(arr).mapToInt(Integer::parseInt).sum();

        System.out.println("Count = " + num.size());
        System.out.println("Sum = " + sum);
    }
}
