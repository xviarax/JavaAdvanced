import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(", ");

       List<String> listt =  Arrays.stream(arr)
                .map(Integer::parseInt)
                .filter(e -> e % 2 == 0)
                .map(e -> e.toString())
                .collect(Collectors.toList());

        System.out.println(String.join(", ", listt));

        listt = listt.stream()
                .map(e -> Integer.parseInt(e))
                .sorted((left,right) -> left.compareTo(right))
                .map(e -> e.toString())
                .collect(Collectors.toList());
        System.out.println(String.join(", ", listt));

    }
}
