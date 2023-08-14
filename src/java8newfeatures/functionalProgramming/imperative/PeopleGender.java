package java8newfeatures.functionalProgramming.imperative;

import java8newfeatures.functionalProgramming.Person;

import java.util.ArrayList;
import java.util.List;

import static java8newfeatures.functionalProgramming.Person.Gender.FEMALE;
import static java8newfeatures.functionalProgramming.Person.Gender.MALE;

public class PeopleGender {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Jack", MALE),
                new Person("Abbie", FEMALE),
                new Person("Robert", MALE),
                new Person("Alec", FEMALE));

        List<Person> females = new ArrayList<>();

        for (Person p : people){
            if(p.gender.equals(FEMALE)){
                females.add(p);
            }
        }

        for (Person p : females){
            System.out.println(p);
        }

    }
}


