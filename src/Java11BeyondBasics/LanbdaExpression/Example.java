package Java11BeyondBasics.LanbdaExpression;

public class Example {

    public static void main(String[] args) {
        MyInterface myInterface = (num1,num2)-> num1 + num2;

        int result = myInterface.add(4, 5);

        int defaultResult = myInterface.addition(2.5, 2.3);

        System.out.println(result + " " + defaultResult);
    }
}
