package Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "";
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < n ; i++) {
            String[] command = scanner.nextLine().split(" ");
            switch (command[0]) {
                case "1":
                    stack.push(text);
                    text = text + command[1];
                    break;
                case "2":
                    stack.push(text);
                    int textL = text.length();
                    int count = Integer.parseInt(command[1]);

                    text = text.substring(0, textL-count);
                    break;
                case "3":
                    int index = Integer.parseInt(command[1]);
                    int charo = index-1;
                    if (charo == 0) {
                        char currCh = text.charAt(0);
                        System.out.println(currCh);
                    } else {
                     char currCh =  text.charAt(charo);
                    System.out.println(currCh);}
                    break;
                case "4":
                    String curr = stack.pop();
                        text = curr;
                    break;
            }




        }
    }
}
