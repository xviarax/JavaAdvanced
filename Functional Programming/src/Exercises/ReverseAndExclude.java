package Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());
        Collections.reverse(nums);
        Predicate<Integer> dividBy2 = num -> num % n ==0;

        nums.removeIf(dividBy2::test);
        Consumer<Integer> printer = e -> System.out.print(e + " ");
       nums.forEach(printer);

    }
}
