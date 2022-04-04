package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
We need to implements Comparable interface to sort List of Objects
 */
class Student implements Comparable<Student>{
    int rollNo, marks;
    String name;

    public Student(int rollNo, int marks, String name) {
        this.rollNo = rollNo;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return marks > o.marks?1:-1;
    }
}

public class ListWithComparableInterface {
    public static void main(String[] args) {
        //Let's say we have our own List with our own defined class Student
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, 80, "Brian"));
        students.add(new Student(2, 75, "John"));
        students.add(new Student(3, 90, "Pap"));
        students.add(new Student(4, 87, "Jack"));
        students.add(new Student(5, 68, "Kira"));

        //Now I want to sort list based on marks property how do I do it.
        //We need to implements the Comparable interface to the Object class.
        //Now, we need to pass the List
        //If we want to change the logic of sort then we can pass the Object of Comparable Object directly while calling sort() method.
//        Collections.sort(students);
        Collections.sort(students, (i,j)-> i.name.length()>j.name.length()?1:-1);
        //Above logic will override the CompareTo method and use this line logic to sort the List.
        for(Student s: students){
            System.out.println(s);
        }
    }
}
