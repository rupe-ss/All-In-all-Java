
/*
Notes to remember
Example of Object and Class
Object:
    Let's say big building is a Object and it does lot of performance like lifting through lift and more. Also, it has properties like pillars and more. Here, building is a Object
Class:
    Now, class is like a blueprint. To build building we need blueprint so class is like the structure where all structure of Object is defined.
 */

class Cal{
    int num1;
    int num2;
    int result;

    public void perform(){
        result = num1 + num2;
    }
}

public class ObjectAndClassDemo {
    public static void main(String[] args){
        Cal cal = new Cal();
        cal.num1 = 2;
        cal.num2 = 3;

        cal.perform(); //After performance result value won't be 0 anymore.

        System.out.println("Value of result: " + cal.result); //This will print 0 because we haven't performed anything and the default value of int is 0 if it is not initialized or any value is assigned to it.

    }
}
