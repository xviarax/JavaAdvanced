import java.util.*;
import java.util.stream.Collectors;

public class CitiesbyContinentandCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, LinkedHashMap<String,List<String>>> continents = new LinkedHashMap<>();

        for (int i = 0; i < n ; i++) {
            String[] input = scanner.nextLine().split(" ");
            String continent = input[0];
            String country = input[1];
            String city = input[2];

            continents.putIfAbsent(continent, new LinkedHashMap<>());
            continents.get(continent).putIfAbsent(country, new ArrayList<>());
            continents.get(continent).get(country).add(city);
        }

        for (Map.Entry<String, LinkedHashMap<String,List<String>>> mapEntry : continents.entrySet()) {
            System.out.println(mapEntry.getKey() + ":");
            LinkedHashMap<String,List<String>> printCountry = mapEntry.getValue();

            for (Map.Entry<String, List<String>> printCityAndCountry : printCountry.entrySet()) {
                System.out.printf("  %s -> ", printCityAndCountry.getKey());
                System.out.println(printCityAndCountry.getValue().stream() //принтиране на лист с делиметър
                        .map(Object::toString)
                        .collect(Collectors.joining(", ")));
            }

        }



    }
}
