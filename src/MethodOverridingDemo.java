class Fruit{
    public void type(String type){
        System.out.println("Displaying type of fruit: " + type);
    }
}

class Apple extends Fruit{
    @Override
    public void type(String type) {
        super.type(type);
        System.out.println("We can add more feature here.");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.type("Amilo");
    }
}
