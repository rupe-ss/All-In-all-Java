package JavaAbstraction;

abstract class A{
    abstract void run();
}

public class AbstractClassExample extends A{

    @Override
    void run() {
        System.out.println("This method is defined in abstract class.");
    }

    public static void main(String[] args) {
        AbstractClassExample example = new AbstractClassExample();
        example.run();
    }
}
