/*
How can we achieve dynamic method dispatch ?
    Achieving two different with same reference, we create reference of Parent class.
Notes:-
1. We can make a reference of parent class and create an object of child class, see example below.
2. Dynamic method dispatch is related to method overwriting as well.
3. We can see below in example how we can achieve different method from same reference by creating two different Object. This process is called Dynamic Method Dispatch
4. Also, this is achieved in runtime, meaning which method to use is decided in runtime. Its is also called runtime polymorphism.
5. What is polymorphism ?
    Doing same thing with different method is called polymorphism.
 */
class Parent{
    public void display(){
        System.out.println("Display method from parent class");
    }
}

class Child1 extends Parent{
    public void display(){
        System.out.println("Display method from child class name Child1");
    }
}

class Child2 extends Parent{
    public void display(){
        System.out.println("Display method from child class name Child2");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        //Let's create a reference of parent class but object of Child1 class, we can do this in Java
        Parent parent = new Child1();
        parent.display(); //Since we have created an Object of Child1, it will call the method in class Child1.

        parent = new Child2();
        parent.display(); //Here, it will call the method in Child2.

    }
}