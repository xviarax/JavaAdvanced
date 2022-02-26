package Exercises;

import java.util.*;

public class SetsofElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int first = Integer.parseInt(input.split("\\s+")[0]);
        int sec = Integer.parseInt(input.split("\\s+")[1]);

        Set<Integer> firstt = new LinkedHashSet<>();
        Set<Integer> secc = new LinkedHashSet<>();

        LinkedHashSet<Integer> nums = new LinkedHashSet<>();

        for (int i = 0; i < first; i++) {
            int curr = Integer.parseInt(scanner.nextLine());
            firstt.add(curr);
        }

        for (int i = 0; i < sec; i++) {
            int curr = Integer.parseInt(scanner.nextLine());
            secc.add(curr);
        }
        // compare

        firstt.retainAll(secc);
        firstt.forEach(el -> System.out.print(el + " "));

//       II начин         for (Integer integer : firstt) {
//                    if (secc.contains(integer)) {
//                        nums.add(integer);
//                    }
//                }
//
//            for (Integer num : nums) {
//                System.out.print(num + " ");
//            }


        }
    }


