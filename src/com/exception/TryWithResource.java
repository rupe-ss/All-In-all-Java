package com.exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
If we are only using finally block to close the resource the we can use try with resource syntax with out using finally block
 */
public class TryWithResource {
    public static void main(String[] args) throws Exception{
        int n = 0;
        System.out.println("Enter number: ");

        //Below syntax will automatically close the resource as soon as try block or resource is done.
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            n = Integer.parseInt(br.readLine());
        }

        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            n = Integer.parseInt(br.readLine());
        } */
        /*//Below we are only using finally to close the resources, so we can use try with resources syntax so that we don't need a finally block to close the resource.
        finally {
            br. close();
            System.out.println("Input number is: " + n);
        }*/
    }
}
