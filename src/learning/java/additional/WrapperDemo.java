package learning.java.additional;

public class WrapperDemo {
    public static void main(String[] args) {
        int num = 50;
        Integer integer = new Integer(num); //This is called wrapping or boxing because we are wrapping primitive data type into Object
        System.out.println(integer);

        //Since wrapping is common we don't have to mention new while wrapping compiler will do it for us.
        Integer integer1 = 60; //Also, this is called auto wrapping or auto boxing.
        System.out.println(integer1);

        //What is unboxing ?
        int j = integer;
        int k = integer1; // This is called unboxing or unwrapping

        //Also, one more thing to learn here
        String str = "500";
        //If we want to change string to integer than we can use static method in class Integer
        int num1 = Integer.parseInt(str);
        System.out.println("Printing integer that is parsed from string to int: " + num1);
    }
}
