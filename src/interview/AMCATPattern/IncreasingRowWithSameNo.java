package interview.AMCATPattern;

import java.util.Scanner;

public class IncreasingRowWithSameNo {

    //This code will print the number of row inserted but with same number no changing.
    private static void print(int noRow){
        for(int i = 1; i <= noRow; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter no of row: ");
        Scanner scanner = new Scanner(System.in);
        print(scanner.nextInt());
    }
}
