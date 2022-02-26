package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class ListofPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        BiFunction<Integer, List<Integer>, Boolean> divisible = ((num, list) -> {
            for (Integer integer : list) {
                if (num % integer != 0) {
                    return false;
                }
            }
            return true;

        });


        for (int i = 1; i <= n; i++) {
            if (divisible.apply(i, nums)) {
                System.out.print(i + " ");
            }
        }


    }
}
