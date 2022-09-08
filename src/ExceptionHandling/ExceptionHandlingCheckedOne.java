package ExceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Checked Exception are checked by compiler so it will give you suggestion to handle the exception. Compiler will throw error if these exception are not handled.
Is it possible to use try block without catch and final blocks ? Yes
1. Scenario when Exception is checked by Compiler.
    Below in the code we are creating a Object of BufferedReader, this Object comes from .io packages. So, this object is also the resource.
        With BufferedReader Object(br) we are reading a input from keyboard and we are changing that input to integer but if user does mistake and input is String then it will throw an exception.
        These types of exception are checked by compiler and gives error if it is not handled.
There are two ways of handling these type of Exception
    1. Using throw Exception
        Using this type of handling we don't need a catch block.
    2. With try catch blocks.

2. Java have this io packages where all the Objects from this packages are resources, meaning when you create a Object of these classes. It will open the memory space and separate some space for the resources. So, it is important to close these resources so we can free the space in memory.
    Best place to close the resource is at

 */
public class ExceptionHandlingCheckedOne {
    public static void main(String[] args) throws Exception{
        System.out.println("Enter a number");
        BufferedReader br = new BufferedReader(new InputStreamReader(System. in));
        int n = 0;
        try {
            n = Integer.parseInt(br.readLine()); // 45
        }
        catch(Exception e){
            System.out.println("Invalid input, please try again.");
        }
        //Lets close the resource now in finally block
        finally{
            br.close(); //Here, close itself is throwing an Exception so we will use throws Exception to handle it instead of try catch.
        }
        System.out.println(n);
    }
}
