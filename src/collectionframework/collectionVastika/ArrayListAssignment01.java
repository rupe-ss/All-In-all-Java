package collectionframework.collectionVastika;

import java.util.ArrayList;

class Student{
    private String name;
    private String address;
    private Integer age;
    private String gender;

    public Student(String name, String address, Integer age, String gender) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
public class ArrayListAssignment01 {
    public static void main(String[] args) {
        Student s1 = new Student("Ram", "123 First Street", 23, "male");
        Student s2 = new Student("Sham", "123 First Street", 20, "male");
        Student s3 = new Student("Steven", "123 First Street", 21, "male");
        Student s4 = new Student("Ayusha", "123 First Street", 19, "female");

        ArrayList<Student> studentArrayList = new ArrayList<Student>();
        studentArrayList.add(s1);
        studentArrayList.add(s2);
        studentArrayList.add(s3);
        studentArrayList.add(s4);

        studentArrayList.forEach(student -> System.out.println("Student Name: " + student.getName()));
    }
}
