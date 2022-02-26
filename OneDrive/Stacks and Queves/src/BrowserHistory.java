import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();

        String input = scanner.nextLine();
        String curr = "";

        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (!stack.isEmpty()) {
                   curr = stack.pop();
                } else {
                    System.out.println("no previous URLs");
                    input = scanner.nextLine();
                    continue;
                }
            } else {
                if (!curr.equals("")){
                stack.push(curr);
                }
                curr = input;

            }
            System.out.println(curr);
            input = scanner.nextLine();
        }


    }
}
