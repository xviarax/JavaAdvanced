package OpinionPoll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Opinion> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            Opinion opinion = new Opinion(name, age);

            if (age > 30){
                people.add(opinion);
            }
        }
        people.sort(Comparator.comparing(opinion -> opinion.getName()));

        for (Opinion person : people) {
            System.out.printf("%s - %d%n", person.getName(),person.getAge());
        }

    }
}
