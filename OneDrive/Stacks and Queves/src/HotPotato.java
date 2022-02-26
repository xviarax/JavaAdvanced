import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] people = scanner.nextLine().split(" ");
        ArrayDeque<String> players = new ArrayDeque<>();
        for (int i = 0; i < people.length ; i++) {
            players.offer(people[i]);
        }
        int i = 1;
        int n = Integer.parseInt(scanner.nextLine());

        while (players.size() > 1) {
            String onePlayer = players.poll();

            if (i == n){
                System.out.println("Removed " + onePlayer );
                i = 1;
            } else {
                players.offer(onePlayer);
                i += 1;
            }
        }
        System.out.println("Last is " + players.pop());


    }
}
