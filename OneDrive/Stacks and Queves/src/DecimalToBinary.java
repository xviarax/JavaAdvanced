import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        if (n == 0) {
            System.out.println("0");
        }
        while (n != 0) {
            stack.push(n % 2);
            n /= 2;
        }
            for (Integer integer : stack) {
                System.out.print(stack.peek());
                stack.pop();
            }



    }
}
