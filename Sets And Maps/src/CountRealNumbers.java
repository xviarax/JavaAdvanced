import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Double, Integer> input = new LinkedHashMap<>();
        double[] arr = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToDouble(Double::parseDouble)
                    .toArray();

        for (double i : arr) {
            if (!input.containsKey(i)){
                input.put(i, 1);
            } else {
                input.put(i, input.get(i) + 1);
            }
        }

        for (Double num : input.keySet()) {
            System.out.printf(Locale.US,"%.1f -> %d", num, input.get(num));
            System.out.println();
        }



    }
}
