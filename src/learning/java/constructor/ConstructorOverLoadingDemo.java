package learning.java.constructor;

//Practicing and Examples overloading constructor
class CalDemo {
    int a;
    int b;

    CalDemo(int a){
        this.a = a;
        System.out.println(this.a);
    }

    CalDemo(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println(this.a);
        System.out.println(this.b);
    }
}

public class ConstructorOverLoadingDemo {
    public static void main(String[] args) {
        CalDemo calDemo = new CalDemo(2);
        CalDemo calDemo1 = new CalDemo(2,4);
    }
}
