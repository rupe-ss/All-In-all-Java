package com.exception;
/*
1. In the below code we are creating Exception with some logic.
2. So, even if there is no Java build exception then we can create new Exception.
3. We can create our own Exception and we can catch our won exception.
 */

public class ExceptionHandlingUserDefined {
    public static void main(String[] args) {
        int i = 9;
        int j = 10;

        try {
            int r = i / j;
            //Using our own exception
            //Send the message as well so catch block and print it.
            //But it will show error because we don't have constructor that takes String in our own defined Exception class. So, create a constructor that takes string.
            if(r == 0) throw new OwnException("This is not possible and k can't be zero.");

        }
        //Catching our own exception
        catch(OwnException e){
            /*//This will work and give Object of OwnException when there is exception.
            System.out.println("Error " + e);*/
            //Now, we want to print the message as well, how we do it. This will give null because we don't haven't send any message while using our own exception.
            System.out.println("Error " + e.getMessage());
        }

    }
}
