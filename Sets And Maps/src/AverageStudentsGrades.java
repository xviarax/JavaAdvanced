import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> students = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
                students.putIfAbsent(input[0], new ArrayList<>());
                List<Double> grades = students.get(input[0]);
                grades.add(Double.parseDouble(input[1]));
            }

                students.forEach((student, grade) -> {
                    System.out.printf("%s -> ", student);
                    grade.forEach(grades -> System.out.printf(Locale.US, "%.2f ", grades));
                    double average = 0;
                    for (double grades : grade) {
                        average += grades;
                    }
                    average /= grade.size();
                    System.out.printf(Locale.US, "(avg: %.2f)%n", average);
                });



        }
    }

