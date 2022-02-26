package Exercises;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        LinkedHashMap<String, LinkedHashSet<String>> mapp = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> lastMap = new LinkedHashMap<>();

        while (!text.equals("JOKER")) {
            String[] parts = text.split(": ");
            String name = parts[0];
            String[] cards = parts[1].split(", ");
            LinkedHashSet<String> sett = new LinkedHashSet<>();

            if (mapp.containsKey(name)) {
                for (String card : cards) {
                    mapp.get(name).add(card);
                }
            } else {
                for (String card : cards) {
                    sett.add(card);
                    mapp.put(name, sett);
                }
            }
                text = scanner.nextLine();
            }
            // calculate the cars
            for (Map.Entry<String, LinkedHashSet<String>> entry : mapp.entrySet()) {
                String namee = entry.getKey();

                int finall = 0;
                for (String s : entry.getValue()) {
                    int sum = 0;
                    int mul = 0;
                    if (s.endsWith("S")) {
                        mul += 4;
                       s =  s.replace("S", " ");
                    } else if (s.endsWith("H")) {
                        mul += 3;
                      s =   s.replace("H", " ");
                    } else if (s.endsWith("D")) {
                        mul += 2;
                      s =  s.replace("D", " ");
                    } else if (s.endsWith("C")) {
                        mul += 1;
                      s = s.replaceAll("C","");
                    }
                    s = s.strip();
                    if (s.startsWith("J")) {
                        sum += 11;
                    } else if (s.startsWith("Q")) {
                        sum += 12;
                    } else if (s.startsWith("K")) {
                        sum += 13;
                    } else if (s.startsWith("A")) {
                        sum += 14;
                    } else {
                        int num = Integer.parseInt(s);
                        sum += num;
                    }
                    finall += mul * sum;
                    lastMap.put(namee, finall);
                }
            }

                for (Map.Entry<String, Integer> stringIntegerEntry : lastMap.entrySet()) {

                    System.out.printf("%s: %d%n", stringIntegerEntry.getKey(), stringIntegerEntry.getValue());
                }


            }

        }



