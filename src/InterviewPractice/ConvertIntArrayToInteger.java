package InterviewPractice;

public class ConvertIntArrayToInteger {
    private static int convert(int[] array){
        StringBuilder string = new StringBuilder();
        for(int i: array){
            string.append(i);
        }
        int number = Integer.parseInt(string.toString());
        return number;
    }

    public static void main(String[] args) {
        int[] numbers = {2,3,4};
        System.out.println(convert(numbers));
    }
}
