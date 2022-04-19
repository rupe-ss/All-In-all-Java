package java8newfeatures.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        List<Person> peopleWeAreHiring = new ArrayList<>();
        peopleWeAreHiring.add(new Person("One", "1", "1"));
        peopleWeAreHiring.add(new Person("Two", "2", "2"));
        peopleWeAreHiring.add(new Person("Three", "3", "3"));

        List<Employee> newEmp = new ArrayList<>();
        /*for(Person person: peopleWeAreHiring) {
            Employee employee = new Employee(person.firstName, person.lastName, person.firstName + "-" + person.lastName);
            newEmp.add(employee);
        }*/

        newEmp.addAll(peopleWeAreHiring.stream().map((Person p) -> new Employee(p.firstName, p.lastName, p.firstName + "-" + p.lastName)).collect(Collectors.toList()));
        System.out.println(newEmp);
    }
}

class Person {
    String firstName;
    String lastName;
    String age;

    public Person(String firstName, String lastName, String age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}

class Employee {
    String firstName;
    String lastName;
    String empId;

    public Employee(String firstName, String lastName, String empId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.empId = empId;
    }

}