public class SelectionDemo {
    public static void main(String[] args) {
        char c = 'Z';

        switch (c) {
            case 'B':
                System.out.println("This is char 'B'.");
            case 'C':
                System.out.println("This is char 'C'.");
                break;
            case 'H':
                System.out.println("This is char 'H'.");
                break;

            default:
                System.out.println("This is a default case. If nothing matches this will be executed.");
                break;
        }

        int a = 5, b = 10;

        String str = b > a ? "b is greater than a" : "a is either equal or greater than b";
        System.out.println(str);
    }
}
