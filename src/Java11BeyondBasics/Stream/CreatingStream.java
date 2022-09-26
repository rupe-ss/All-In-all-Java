package Java11BeyondBasics.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Employee{
    private String name;
    private Double salary;
    public Employee(String name, Double salary) {
        super();
        this.name = name;
        this.salary = salary;
    }
}

public class CreatingStream {

    public static void main(String[] args) {

        List<String> nameList = List.of("Coco", "Cincy", "Cool", "Cat");
        // Creating a Stream from a Collection using stream() method
        Stream<String> nameStream = nameList.stream();

        //Creating a Stream from an Array using stream() method.
        Integer[] array = {2,4,6,8,10};
        Stream<Integer> arrayStream = Arrays.stream(array);

        //Creating a Stream directly using of() method
        Stream<Integer> stream = Stream.of(120,140,160);

        //Creating a Stream directly for Objects of User-Defined Classes
        Stream<Employee> employeeStream = Stream.of(new Employee("Shawn", 60000.00),
                                                    new Employee("Jean", 70000.00));
    }
}
