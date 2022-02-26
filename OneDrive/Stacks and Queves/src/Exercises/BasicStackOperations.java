package Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);
        String[] numbers = scanner.nextLine().split(" ");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        boolean isPresent = false;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            stack.push(Integer.parseInt(numbers[i]));
        }
        for (int i = 0; i < s ; i++) {
            stack.pop();
        }

        for (Integer num : stack) {
            if (num == x){
                System.out.println("true");
                isPresent = true;
            }
        }
        if (stack.isEmpty()){
            System.out.println("0");
        }
            if (!isPresent && !stack.isEmpty()){
                for (Integer num : stack) {
                    if (num < min){
                        min = num;
                    }
                }
                System.out.println(min);
            }

    }
}
