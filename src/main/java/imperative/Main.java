package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static imperative.Main.Gender.*;
// 22:57
public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Katy", FEMALE),
            new Person("Toby", MALE),
            new Person("Kira", FEMALE),
            new Person("Valentina", FEMALE)
        );

        System.out.println("// Imperative Approach");

        List<Person> females = new ArrayList<>();

        for (Person person: people) {
            if (FEMALE.equals(person.gender))
                females.add(person);
        }

        for (Person person: females) {
            System.out.println(person);
        }

        System.out.println("// Declarative Approach");

        people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
