
import java.util.*;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Set<String> guestList = new TreeSet<>();

        while (!input.equals("PARTY")) {
            guestList.add(input);
            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("END")) {
                guestList.remove(input);
            input = scanner.nextLine();
        }

        System.out.println(guestList.size());


        for (String s : guestList) {
            System.out.println(s);
        }

    }

}

