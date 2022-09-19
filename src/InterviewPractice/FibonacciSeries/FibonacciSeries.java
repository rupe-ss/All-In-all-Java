package InterviewPractice.FibonacciSeries;

public class FibonacciSeries {

    private static void print(int num){

        int num1 = 0;
        int num2 = 1;

        int i = 0;
        //Iteration
        while(i < num){
            System.out.print(num1);
            System.out.print((i == (num-1))?"":", ");

            //Swaping
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            i++;
        }
    }

    //Trying by myself
    public static void main(String[] args) {
        print(10);
    }
}
