/*
Final Keyword
NOtes:-
1. If you make variable final it will be CONSTANT and it has to be initialized. Final variable can't be assigned, it can only be assigned in Constructor.
2. If you make class final then no class can extends the final class.
3. If you make method final then you can use the method in different packages or class but you can't override the final method.
 */
class Example{
    final double PI;

    Example(){
        PI = 3.14;
    }

    final public void display(){
        System.out.println("Displaying from Example class.");
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        Example example = new Example();
        example.display();
    }
}
