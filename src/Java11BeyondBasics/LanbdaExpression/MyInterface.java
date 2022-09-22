package Java11BeyondBasics.LanbdaExpression;

@FunctionalInterface
public interface MyInterface {

    int add(int num1, int num2);

    default int addition(double num1, double num2){
        return (int) (num1 + num2);
    }
}
