package Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumberswithaStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] n = scanner.nextLine().split(" ");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n.length; i++) {
            stack.push(Integer.parseInt(n[i]));
        }

        for (Integer num : stack) {
            System.out.print(num + " ");
        }

    }
}
