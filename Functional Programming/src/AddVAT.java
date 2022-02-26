import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function<String, Double> parseDouble = Double::parseDouble;
        Function<Double, Double> multiply = e -> e * 1.2;
        Consumer<Double> printer = e -> System.out.printf(Locale.US,"%.2f%n", e);

        List<Double> arr = Arrays.stream(scanner.nextLine().split(", "))
                .map(parseDouble)
                .map(multiply)
                .collect(Collectors.toList());


        System.out.println("Prices with VAT:");
        arr.forEach(printer);



    }
}
