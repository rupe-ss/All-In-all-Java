package java8newfeatures.streamapi;

import java.util.List;
import java.util.stream.Collectors;

import static java8newfeatures.streamapi.PersonExample.GENDER.FEMALE;
import static java8newfeatures.streamapi.PersonExample.GENDER.MALE;

public class PersonExample {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Ramsel", MALE),
        new Person("Andrian", FEMALE),
        new Person("Anmol", MALE),
        new Person("Ash", FEMALE),
        new Person("Ramsel", MALE)
        );

        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

    }

    static class Person{
        private final String name;

        private final GENDER gender;

        public Person(String name, GENDER gender) {
            this.name = name;
            this.gender = gender;
        }
    }

     enum GENDER{
        MALE, FEMALE
    }
}
