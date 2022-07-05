package learning.java.anonymousclass;

interface AnonymousInterface{
    void show();
}

public class AnonymousClassWithInterfaceDemo {
    public static void main(String[] args) {
        AnonymousInterface anonymousInterface = new AnonymousInterface() {
            @Override
            public void show() {
                System.out.println("Using show method defined in Interface without creating Object.");
            }
        };
        anonymousInterface.show();
    }
}