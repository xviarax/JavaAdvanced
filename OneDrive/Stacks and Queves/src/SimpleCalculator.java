import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String[] input = scanner.nextLine().split(" ");
        int number = 0;
        int nextnumber = 0;

        for (int i = 0; i < input.length ; i++) {
            if (i == 0 || i % 2 == 0) {
                number += Integer.parseInt(input[i]);
                stack.push(number);
            } else {
                //2 + 5 + 10 - 2 - 1
                if (input[i].equals("+")){
                    nextnumber = Integer.parseInt(input[i+1]);
                    number += nextnumber;
                    stack.pop();
                    stack.push(number);
                    i += 1;
                } else if (input[i].equals("-")){
                    nextnumber = Integer.parseInt(input[i+1]);
                    number = number-nextnumber;
                    stack.pop();
                    stack.push(number);
                    i += 1;
                }
            }
        }

        System.out.println(stack.peek());
    }
}
