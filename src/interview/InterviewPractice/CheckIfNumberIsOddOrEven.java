package interview.InterviewPractice;

public class CheckIfNumberIsOddOrEven {
    private static String check(int number){
        if((number & 1) == 0){
            return "Even";
        }
        return "Odd";
    }

    private static String checkNumber(int number){
        if((number % 2) == 0){
            return "Even";
        }
        return "Odd";
    }

    public static void main(String[] args) {
        System.out.println(check(0));
        System.out.println(checkNumber(17));
    }
}
