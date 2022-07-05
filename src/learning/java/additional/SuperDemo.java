package learning.java.additional;/*
Super Keyword is basic but lets understand more about inheritance.
 */

class Laptop{
    Laptop(){
        System.out.println("Printing from learning.java.additional.Laptop Default constructor");
    }
    Laptop(String name){
        System.out.println("Displaying the name of laptop: " + name);
    }
}

class Dell extends Laptop{
    Dell(){
        super("learning.java.additional.Dell");
        //Also, how to call different constructor of parent class other than default constructor.
        System.out.println("Printing from learning.java.additional.Dell class that extends learning.java.additional.Laptop class.");
    }
}
public class SuperDemo {
    public static void main(String[] args) {
       /* Now lets create a Object of learning.java.additional.Dell class, it should call both constructor from subclass and parent class
        Question is why it is calling default constructor from Parent class too.
        It is printing because there is super() keyword inside the default constructor of learning.java.additional.Dell class.
        */
        Dell dell = new Dell();
    }
}
