package carInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Cars> carsCollection = new ArrayList<>();

        for (int i = 0; i < n; i++) {
                String [] carInfoo = scanner.nextLine().split(" ");
                Cars car;
                if (carInfoo.length == 1){
                    car = new Cars(carInfoo[0]);
                } else {
                    car = new Cars(carInfoo[0],carInfoo[1],Integer.parseInt(carInfoo[2]));
                }


        carsCollection.add(car);
        }

        for (Cars cars : carsCollection) {
            System.out.println(cars.Car());
        }


    }
}
