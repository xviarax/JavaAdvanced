import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class FilterbyAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> people = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(", ");
            people.put(input[0], Integer.parseInt(input[1]));
        }

        String comparison = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String[] format = scanner.nextLine().split(" ");

        BiPredicate<Integer, Integer> predicates ;
        if (comparison.equals("younger")) {
            predicates = (personAge, agee) -> personAge <= agee;
        } else {
            predicates = (personAge, agee) -> personAge >= agee;
        }

        Consumer<Map.Entry<String, Integer>> printer = null;
        if (format[0].equals("age")) {
            printer = person -> System.out.println(person.getValue());
        } else {
            if (format.length == 2){
                printer = person -> System.out.println(person.getKey() + " - " + person.getValue());
            } else {
                printer = person -> System.out.println(person.getKey());
            }
        }



        people.entrySet().stream()
                .filter(person -> predicates.test(person.getValue(), age))
                .forEach(printer);

    }
}
