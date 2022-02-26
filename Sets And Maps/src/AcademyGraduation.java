import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {
        Locale usLocale = new Locale("en","US");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        TreeMap<String, Double[]> map = new TreeMap<>();

        for (int i = 0; i < n ; i++) {
            String name = scanner.nextLine();
            String[] grades = scanner.nextLine().split(" ");
            Double[] scores = new Double[grades.length];

            for (int j = 0; j < grades.length ; j++) {
                scores[j] = Double.parseDouble(grades[j]);
            }
            map.put(name, scores);
        }


        for (Map.Entry<String, Double[]> entry : map.entrySet()) {
            System.out.printf("%s is graduated with ", entry.getKey());
            double average = 0;
            for (Double grade : map.get(entry.getKey())) {
                average += grade;
            }
            average /= map.get(entry.getKey()).length;
            DecimalFormat currentValue = new DecimalFormat("0.####################");
            System.out.printf(Locale.US, currentValue.format(average
            ) +"%n");

        }

    }
}
