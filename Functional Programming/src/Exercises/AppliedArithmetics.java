package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();

        Function<List<Integer>,List<Integer>> addOne = list -> list.stream().map(num -> num += 1).collect(Collectors.toList());
        Function<List<Integer>,List<Integer>> multiply = list -> list.stream().map(num -> num * 2).collect(Collectors.toList());
        Function<List<Integer>,List<Integer>> subtr = list -> list.stream().map(num -> num - 1).collect(Collectors.toList());

        Consumer<List<Integer>> print = list -> list.forEach(num -> System.out.print(num + " "));


        while (!input.equals("end")) {
            switch (input){
                case "add":
                 nums = addOne.apply(nums);
                    break;
                case "multiply":
                    nums = multiply.apply(nums);
                    break;
                case "subtract":
                    nums = subtr.apply(nums);
                    break;
                case "print":
                    print.accept(nums);
                    System.out.println();
                    break;
            }


            input = scanner.nextLine();
        }







    }
}
