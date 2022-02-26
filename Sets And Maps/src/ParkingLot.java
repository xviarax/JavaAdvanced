import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> plateNum = new LinkedHashSet<>();
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] parts = input.split(", ");
            switch (parts[0]) {
                case "IN":
                    plateNum.add(parts[1]);
                    break;
                case "OUT":
                    plateNum.remove(parts[1]);
                    break;
            }
            input = scanner.nextLine();
        }

        if (plateNum.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String s : plateNum) {
                System.out.println(s);
            }
        }

        }

    }

