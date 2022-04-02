/*
What is interface ?
    Interface is same as abstract class with some difference. You can't make object of interface as well just like abstract class.
What is difference of Abstract class with Interface ?
1. Every method in Interface is public and abstract.
2. You can implements multiple Interface in class while we can't extends multiple abstract classes in a class.
 */
interface InterfaceA{
    String displayName(String name);
}

interface InterfaceB{
    int Id(int Id);
}

class InterfaceAB implements InterfaceA, InterfaceB{
    @Override
    public String displayName(String name) {
        System.out.println("Name is : " + name);
        return name;
    }

    @Override
    public int Id(int Id) {
        System.out.println("Id : " + Id);
        return Id;
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        InterfaceAB interfaceAB = new InterfaceAB();
        interfaceAB.displayName("rupess");
        interfaceAB.Id(20);
    }
}
