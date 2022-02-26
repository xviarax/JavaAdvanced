package Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String[] splittie = command.split(" ");
            if (splittie[0].equals("1")) {
                stack.push(Integer.parseInt(splittie[1]));
            } else if (splittie[0].equals("2")) {
                stack.pop();
            } else {
                for (Integer num : stack) {
                    if (num > max) {
                        max = num;
                    }
                }
                System.out.println(max);

            }
        }
    }
}
