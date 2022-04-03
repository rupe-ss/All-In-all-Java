package com.after5hours;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Entered number is: " + n);
    }
}
