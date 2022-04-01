class Calculator{
    public int add(int i, int j){
        return i+j;
    }
}

class AdvCal extends Calculator{
    public int sub(int i, int j){
        return i-j;
    }
}

public class Inheritance {
    //We have a one class name Calculator, and this class name Calculator have one method add.
    //Let's say we want to add another feature in this Calculator class but this is a Jar file meaning this is .class file not .java file. Then we can't change the code in Calculator class but we need to add more feature.
    //In this case we can make new class and extends the Calculator class so that we don't have to write extra

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(5, 3));

        //Now we can make reference of AdvCal and use both add and sub method.
        AdvCal advCal = new AdvCal();
        System.out.println(advCal.add(4, 7));
    }
}
