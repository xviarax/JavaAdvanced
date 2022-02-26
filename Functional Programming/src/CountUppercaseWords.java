import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Predicate<String> myPredicate = word -> Character.isUpperCase(word.charAt(0));
        Consumer<String> printer = word -> System.out.println(word);

        List<String> arr = Arrays.stream(scanner.nextLine().split(" "))
                .filter(myPredicate)
                .collect(Collectors.toList());

        System.out.println(arr.size());

        arr.forEach(printer);


    }
}
