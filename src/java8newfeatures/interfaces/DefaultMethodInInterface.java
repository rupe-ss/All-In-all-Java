package java8newfeatures.interfaces;

interface Phone{
    default void showName(String name){
        System.out.println("I have a " + name + " phone.");
    }

    static void printName(String name){
        System.out.println("Printing name inside static method. Name = :" + name);
    }
}

class Andriod implements Phone{
    public String call(String name){
        return name;
    }
}

public class DefaultMethodInInterface implements Phone{
    public static void main(String[] args) {
        Andriod phone = new Andriod();
        phone.showName("Andriod");
        System.out.println(phone.getClass().getSimpleName());
        Phone.printName("Iphone");
    }

}
