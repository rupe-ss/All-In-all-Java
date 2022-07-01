package learning.java.opps.interfacePractice;

/*Create an interface shape with abstract method draw, create class Rectangle and Triangle which implements this interface shape and print which type of shape it is by creating the object of the classes.*/

interface Shape{
    void draw();
}

class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName());
    }
}
class Trangle implements Shape{
    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName());
    }
}

public class InterfacePractice {
    public static void main(String[] args) {
        Shape shape = new Rectangle();
        shape.draw();
        shape = new Trangle();
        shape.draw();
    }
}
