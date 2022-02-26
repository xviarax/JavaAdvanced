import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<Integer> firstplayerCards = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        LinkedHashSet<Integer> secplayerCards = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        for (int i = 0; i < 50 ; i++) {
            if (firstplayerCards.isEmpty()) {
                System.out.println("Second player win!");
                return;
            }
            if (secplayerCards.isEmpty()) {
                System.out.println("First player win!");
                return;
            }

            int firstplCard = firstplayerCards.iterator().next();
            int secplCard = secplayerCards.iterator().next();

            firstplayerCards.remove(firstplCard);
            secplayerCards.remove(secplCard);

            if (firstplCard > secplCard) {
                firstplayerCards.add(firstplCard);
                firstplayerCards.add(secplCard);
            } else if (secplCard > firstplCard){
                secplayerCards.add(firstplCard);
                secplayerCards.add(secplCard);
            }
        }

        if (firstplayerCards.size() > secplayerCards.size()) {
            System.out.println("First player win!");
        } else if (secplayerCards.size() > firstplayerCards.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }





    }
}
