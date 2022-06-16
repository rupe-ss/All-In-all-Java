package learning.java.innerclass;

/*
Notes:
1. We can make a member class inside a class just like making member variable and member method.
2. To make a object of inner class we need a reference of parent class.
 */
class Outer{
    int a;
    public void show(){
        System.out.println("This is a outer class");
    }

    class Inner{
        public void display(){
            System.out.println("Displaying from inner class.");
        }
    }
}

public class InnerDemo {
    public static void main(String[] args) {
        //This is how we create a object for regular class.
        Outer outer = new Outer();
        //In order to create a Object of inner class we need a object of main class then only we can create a object of inner class.
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}
