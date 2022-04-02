abstract class Animal1{
    public abstract void noise();
    public void walk(){
        System.out.println("All animal make motion.");
    }
}

class Dog1 extends Animal1{ //This is called concrete class whereas Animal Class is called Abstract class.
    @Override
    public void noise(){
        System.out.println("Noise: Bark");
    }
}

class Cat extends Animal1{
    //So, when we extends abstract class and if abstract class have abstract method then we have to define abstract class in the concrete class
    //Here, we have to define noise() method since it is abstract method in abstract class.
    @Override
    public void noise() {
        System.out.println("Noise: Meow");
    }
}

abstract class Writer{
    public abstract void doSomething();
}

class Pen extends Writer{
    String write = "Pen is permanent writer.";
    @Override
    public void doSomething(){
        System.out.println(write);
    }
}

class Pencil extends Writer{
    String write = "Pencil is temporary writer.";
    @Override
    public void doSomething(){
        System.out.println(write);
    }
}

class Calculation{
    public void calculate(Number i){ //Since Number class is abstract of all sub-class like Integer, Double and Float we can pass any Object of these kind.
        System.out.println(i);
    }

    public void writing(Writer w){
        w.doSomething();
    }
}

public class MoreAbstractDemo {
    public static void main(String[] args) {
        //We can create a reference of Abstract class But we can't create Object of abstract class.
        Animal1 animal = new Dog1();
        animal.noise();

        animal = new Cat();
        animal.noise();

        Calculation calculation = new Calculation();
        calculation.calculate(5);
        calculation.calculate(5.5);
        calculation.calculate(57.7f);

        calculation.writing(new Pen());
        calculation.writing(new Pencil());

    }
}