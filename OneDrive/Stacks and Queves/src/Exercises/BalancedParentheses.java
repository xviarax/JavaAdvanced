package Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Character> stack = new ArrayDeque();
        String scobi  = scanner.nextLine();

        if (scobi.length() % 2 == 1) {
            System.out.println("NO");
        } else {
            for (int i = 0; i < scobi.length(); i++) {
                char currCh = scobi.charAt(i);
                if (currCh == '(' || currCh == '[' || currCh == '{') {
                    stack.push(currCh);
                } else if (currCh == ')' || currCh == '}' || currCh == ']') {
                    int oldCh = stack.peek();
                    if (currCh == ')' && oldCh == '(') {
                        stack.pop();
                    } else if (currCh == '}' && oldCh == '{') {
                        stack.pop();
                    } else if (currCh == ']' && oldCh == '[') {
                        stack.pop();
                    } else {
                        System.out.println("NO");
                        break;
                    }
                }
            }
            if (stack.isEmpty()) {
                System.out.println("YES");
            }
        }




    }
}
