package java8newfeatures.functionalProgramming;


public class Person {
    public final String name;
    public final Person.Gender gender;

    public enum Gender{
        MALE, FEMALE
    }

    public Person(String name, Person.Gender gender) {
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
