package interview.InterviewPractice;

public class CountDigitInNumber {

    private static int countDigit(int number){
        if(number < 0){
            number = -1 * number;
        }

        if(number >=0 && number <= 9){
            return 1;
        }

        int count = 0;
        while(number != 0){
            count ++;
            number = number/10;
        }

        return count;
    }

    private static int sumOfDigit(int number){
        if(number < 0){
            number = -1 * number;
        }

        int sum = 0;
        while(number != 0){
            sum = sum + (number % 10);
            number = number/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(countDigit(34567));
        System.out.println(sumOfDigit(115));
    }
}
