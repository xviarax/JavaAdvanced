import java.util.*;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Map<String, Double>> store = new TreeMap<>();

        while (!input.equals("Revision")) {
           String shop = input.split(", ")[0];
           String product = input.split(", ")[1];
           double price = Double.parseDouble(input.split(", ")[2]);

            if (!store.containsKey(shop)) {
                store.put(shop, new LinkedHashMap<>());
                store.get(shop).put(product, price);
            } else {
                store.get(shop).put(product, price);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Map<String, Double>> entry : store.entrySet()) {

            System.out.println(entry.getKey() + "->");
            Map<String, Double> products = entry.getValue();

            for (Map.Entry<String, Double> product : products.entrySet()) {
                System.out.printf(Locale.US, "Product: %s, Price: %.1f%n", product.getKey(), product.getValue());
            }

         }

    }
}
