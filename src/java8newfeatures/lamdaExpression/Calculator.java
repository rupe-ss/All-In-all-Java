package java8newfeatures.lamdaExpression;

public class Calculator {

    public static void main(String[] args) {
        Operation add = (double x, double y)-> x+y;
        Operation sub = (double x, double y)-> x-y;
        Operation mul = (double x, double y)-> x*y;
        Operation div = (double x, double y)-> x/y;

        System.out.println(add.calculations(2, 5));
        System.out.println(sub.calculations(23, 4));
        System.out.println(mul.calculations(3, 4));
        System.out.println(div.calculations(12, 4));
    }
}
