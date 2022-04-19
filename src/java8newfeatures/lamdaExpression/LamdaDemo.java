package java8newfeatures.lamdaExpression;
interface Lamda{
    /*
    In Interface, even if you don't mention type method will be "public" and "abstract" by default.
     */
    void display();
}

public class LamdaDemo {
    public static void main(String[] args) {
        /*Lamda lamda = new Lamda() { //This is an anonymous class, we can define this using Lamda expression.
            @Override
            public void display() {
                System.out.println("Display anything.");
            }
        };
        lamda.display();*/

        Lamda lamda = () -> System.out.println("Displaying anything.");
        lamda.display();
    }
}
