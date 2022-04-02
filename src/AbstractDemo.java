abstract class Animal{
    public abstract void noise();
    public void walk(){
        System.out.println("All animal make motion.");
    }
}

class Dog extends Animal{ //This is called concrete class whereas Animal Class is called Abstract class.
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