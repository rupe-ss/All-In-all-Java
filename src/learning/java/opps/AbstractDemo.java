package learning.java.opps;

/*
Abstraction is a process of hiding the implementation details and showing only functionality to the user.
Here, if someone can view this file then we can hide the stuff. For example we can make reference of Abstract class but we need class to make object so Object is hidden and we can hide the implementation of abstract methods.
 */
abstract class Animal{
    public abstract void noise();
    public void walk(){
        System.out.println("All animal make motion.");
    }
}

class Dog extends Animal{ //This is called concrete class whereas learning.java.opps.Animal Class is called Abstract class.
    @Override
    public void noise(){
        System.out.println("Noise: Bark");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        //We can create a reference of Abstract class But we can't create Object of abstract class.
        Animal animal = new Dog();
        animal.noise();
    }
}