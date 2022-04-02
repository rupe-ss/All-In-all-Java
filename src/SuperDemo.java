/*
Super Keyword is basic but lets understand more about inheritance.
 */

class Laptop{
    Laptop(){
        System.out.println("Printing from Laptop Default constructor");
    }
    Laptop(String name){
        System.out.println("Displaying the name of laptop: " + name);
    }
}

class Dell extends Laptop{
    Dell(){
        super("Dell");
        //Also, how to call different constructor of parent class other than default constructor.
        System.out.println("Printing from Dell class that extends Laptop class.");
    }
}
public class SuperDemo {
    public static void main(String[] args) {
       /* Now lets create a Object of Dell class, it should call both constructor from subclass and parent class
        Question is why it is calling default constructor from Parent class too.
        It is printing because there is super() keyword inside the default constructor of Dell class.
        */
        Dell dell = new Dell();
    }
}
