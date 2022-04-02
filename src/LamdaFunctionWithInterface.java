/*
1. Let's say we want to make Functional Interface, meaning interface with only method.
Since, functional Interface only have one method, by mistake someone can declare more abstract method in Interface. To protect that Java give a @FunctionalInterface annotation so that there is no confusion.
2. Now, let's see how we use anonymous class with interface in old ways.
 */

@FunctionalInterface
interface SimpleInterface{
    void display();
}

public class LamdaFunctionWithInterface {
    public static void main(String[] args) {
        //We know with anonymous function we can make a Object of Interface as well
        //Old way of using anonymous class with Interface
        /*SimpleInterface simpleInterface = new SimpleInterface() {
            @Override
            public void display() {
                System.out.println("Single abstract function in Interface.");
            }
        };*/
        //Above we see how we can make object of Functional Interface, with help of anonymous function
        //Java have so many boiler plate code, meaning unwanted code. So, java wanted to update and reduce some of the boiler plate code. They used Scala Language to achieve this.
        //So, that have Lamda function to reduce some boiler plate code, let's see how it is done.
        //Using Lamda Function now
        //How Lamda Function works, we can use Lamda function only with functional interface.
        SimpleInterface simpleInterface = () -> System.out.println("Using lamda function to define abstract methos in functional interface.");
        simpleInterface.display();
        /*
            How above code is working, since Java knows there is only abstract function in functional interface.
            () -> This meaning there is only one function and refer to that function.
         */
    }
}
