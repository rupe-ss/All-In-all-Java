package learning.java.basic;

public class VariableDemo {
    public static void main(String args[]){

        //byte, short, int, float, double, long

        byte b = 5; // 1 byte => 8 bits => -128 to 127
        short s = 5; // 2 bytes => 16 bits => -32768 to 32767
        int i = 5; // 4 bytes => 32 bits => -2,147,483,648 to 2,147,483,647
        float f = 5.5f; // 4 bytes => 32 bits
        double d = 5.5; // 8 bytes => 64 bits
        long l = 5l; // 8 bytes => 64 bits =>

        char c = 'A';
        c = 66; //ASCII => American Standard Code for Information Interchange

        System.out.println("It will print 'B'. Why ? \n" + c + "\nBecause 66 is ASCII number of 'B'");

        double d1 = 5; // implicit conversion

        int k = (int) 5.6; // explicit conversion or type casting

        System.out.println(d1 + "  It will store 5.5 \n" + k);
    }
}
