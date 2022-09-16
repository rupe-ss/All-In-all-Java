package InterviewPractice.AMCATPattern;

import java.util.Scanner;

public class IncreasingNumberOfDigitInRow {

    private static void print(int noRow){
        for(int i = 1; i <= noRow; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter no of row:- ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        print(num);
    }
}
