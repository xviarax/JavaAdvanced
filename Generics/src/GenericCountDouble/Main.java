package GenericCountDouble;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
                //задача 6
        GenCountDouble<Double> box = new GenCountDouble();
        for (int i = 0; i < n; i++) {
            double doubleNumber = Double.parseDouble(scanner.nextLine());
            box.add(doubleNumber);
        }

        double element = Double.parseDouble(scanner.nextLine()); //елемент, за който търся колко от елементите в списъка са по-големи
        System.out.println(box.countGreaterThan(element));




    }
}
