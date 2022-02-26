import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque();
        String input  = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char currCh = input.charAt(i);
            if (currCh == '(') {
                stack.push(i);
            } else if (currCh == ')') {
                int begin = stack.pop();
                System.out.println(input.substring(begin,i) + ')');
            }

        }



    }
}
