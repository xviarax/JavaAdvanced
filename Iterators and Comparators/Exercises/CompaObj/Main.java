package Exercises.CompaObj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList();
        int countAllPeople = 0; //брой на всички хора
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            //"{name} {age} {town}"
            String name = input.split("\\s+")[0];
            int age = Integer.parseInt(input.split("\\s+")[1]);
            String town = input.split("\\s+")[2];
            Person person = new Person(name, age , town);
            people.add(person);
            countAllPeople++;
            input = scanner.nextLine();
        }

        int n = Integer.parseInt(scanner.nextLine());
        //взема n-тия човек в списъка
        //index на достъпване -> n - 1
        int personIndex = n - 1;
        if (personIndex < 0 || personIndex > people.size() - 1) {
            throw new IndexOutOfBoundsException("INVALID INDEX");
        }
        Person searchedPerson = people.get(n - 1);
        people.remove(n - 1);

        int count = 0; //брой на хората еднакви с searchedPerson
        for (Person person : people) {
            //сравнявам searchedPerson и person
            if (searchedPerson.compareTo(person) == 0) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No matches");
        } else {
            System.out.printf("%d %d %d", count + 1, countAllPeople - (count + 1), countAllPeople);
        }

        //compareTo -> Srting
        //Integer.compare -> int
        //Double.compare -> double
    }
}
