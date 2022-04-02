/*
1. Lets create 2 interfaces
2. Define same methods in both interface.
3. Now, Baby wants to use same method but it will run into ambiguity issue. Meaning which Interface method to use ?
4. Way to solve this issue is,
    a. Defining same method in baby class.
    b. Overriding method and mentioning which interface method to use.
 */
interface Father{
    default void occupation(){
        System.out.println("I want you to be Engineer.");
    }
}
interface Mother{
    default void occupation(){
        System.out.println("I want you to be Doctor.");
    }
}

class Baby implements Father, Mother{
    /*//Here, to solve the diamond problem we can define our own method rather than using Interface method.
    public void occupation(){
        System.out.println("I want to be Programmer.");
    }*/
    //Another way of solving this problem is Overriding the method.
    @Override
    public void occupation() {
        //Here we are mentioning, I want to use the Father class method.
        Father.super.occupation();
    }
}

public class MutipleInheritanceSolvedInInterface {
    public static void main(String[] args) {
        Baby baby = new Baby();
        baby.occupation();
    }
}
