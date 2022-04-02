/*
Static Method in Interface
    Below is the example and how to use it.
Let's learn something quick here. We have been working with method inside Interface now lot but what about variable
    Can we declare variable in Interface ?
        Well, we can declare variable in Interface but it will be automatically final, even though we don't mention final in the beginning of Variable it will be final.
        So, with final variable will be constant.
        And we know final(CONSTANT) should be initialized inside the class or Interface.
 */
interface StaticInf{
    static String NAME = "Static Interface";

    static String displayName(String name){
        System.out.println("Name: " + name);
        return name;
    }
}
public class StaticInterface {
    public static void main(String[] args) {
        //Above interface have static method, so now to use Static method we don't have to make an Object.
        String name = StaticInf.displayName("rupess");
        System.out.println(StaticInf.NAME);
    }
}
