package learning.java.interfacedemo;

/*
Now, with default method added there is more than one method, but it will still considered functional interface because there is only one abstract method.
 */
@FunctionalInterface
interface Default{
    void show();
    default void displayName(String name){
        System.out.println("Given name is: " + name);
    };
}

class DefaultImp implements Default{
    public void show(){
        System.out.println("Defining method declared in interface.");
    }
    //We can override the default method as well.
    @Override
    public void displayName(String name) {
        Default.super.displayName(name);
    }
}

public class InterfaceDefaultMethod {
    public static void main(String[] args) {
        DefaultImp defaultImp = new DefaultImp();
        defaultImp.show();
        defaultImp.displayName("learning.java.interfacedemo.Default Method");
    }
}
