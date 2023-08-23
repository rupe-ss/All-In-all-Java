package java8newfeatures.functionalProgramming.callbacks;

public class CallBackRunnableFunction {
    public static void main(String[] args) {
        callBackMethod("Mark Manson", 17, () -> System.out.println("Under age"));
    }

    static void callBackMethod(String name, int age, Runnable runnable){
        System.out.println(name);
        if(age >= 18) System.out.println(age);
        else runnable.run();
    }
}
