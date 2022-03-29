
/*
We are learning about method overloading and examples of overloading method.
 */
class Casio{
    public void add(int i, int j){
        System.out.println(i + j);
    }
    public void add(int i, int j, int k){
        System.out.println(i + j + k);
    }
    public void add(double i, double j){
        System.out.println(i + j);
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args){
        Casio casio = new Casio();
        casio.add(2,5);
        casio.add(2,3,4);
        casio.add(2.3, 2.2);
    }

}
