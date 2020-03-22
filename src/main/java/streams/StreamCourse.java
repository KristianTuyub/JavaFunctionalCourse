package streams;

import java.util.List;
import java.util.stream.Collectors;

import static streams.StreamCourse.Gender.*;
//01:23:54
public class StreamCourse {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Katy", FEMALE),
                new Person("Toby", MALE),
                new Person("Kira", FEMALE),
                new Person("Valentina", FEMALE)
        );

/*        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);*/
        System.out.println(people.stream()
                .noneMatch(person -> FEMALE.equals(person.gender)));
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
