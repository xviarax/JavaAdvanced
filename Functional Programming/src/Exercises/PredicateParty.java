package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toCollection(ArrayList::new));
       String input = scanner.nextLine();

       while (!input.equals("Party!")){
           Predicate<String> predicate = null;

           String criteria = input.split("\\s+")[2];

           if(input.contains("Length")){
               predicate = x -> x.length() == Integer.parseInt(criteria);
           }else if(input.contains("StartsWith")){
               predicate = x -> x.startsWith(criteria);
           }else{
               predicate = x -> x.endsWith(criteria);
           }

           if(input.contains("Remove")){
               ArrayList<String> toRemove = new ArrayList<>();
               for (String guest : names) {
                   if(predicate.test(guest)){
                       toRemove.add(guest);
                   }
               }

               names.removeAll(toRemove);
           }else{
               ArrayList<String> toAdd = new ArrayList<>();
               for (String guest : names) {
                   if(predicate.test(guest)){
                       toAdd.add(guest);
                   }
               }
               names.addAll(toAdd);
           }

           input = scanner.nextLine();
       }

        if(names.isEmpty()){
            System.out.println("Nobody is going to the party!");
        }else{
            System.out.println(names.stream().sorted().collect(Collectors.toCollection(ArrayList::new)).toString().replaceAll("([\\[\\]])", "") + " are going to the party!");
        }
    }
}
