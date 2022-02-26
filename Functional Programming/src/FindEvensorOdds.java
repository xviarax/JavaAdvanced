import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class FindEvensorOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nums = scanner.nextLine().split("\\s+");
        int first = Integer.parseInt(nums[0]);
        int sec = Integer.parseInt(nums[1]);
        String everOrOdd = scanner.nextLine();
        List<Integer> arr = new ArrayList<>();

        for (int i = first; i <= sec ; i++) {
            arr.add(i);
        }

        Predicate<Integer> even = e -> e % 2 == 0 ;
        Predicate<Integer> odd = e -> e % 2 == 1 || e % 2 == -1; // МОЖЕ ДА ИМА ОТРИЦАТЕЛНИ НЕЧЕТНИ
        if (everOrOdd.equals("even")) {
            for (Integer integer : arr) {
               if (even.test(integer)) {
                   System.out.print(integer + " ");
               }
            }
        } else if (everOrOdd.equals("odd")){
            for (Integer integer : arr) {
                if (odd.test(integer)) {
                    System.out.print(integer + " ");
                }
            }
        }



    }
}
