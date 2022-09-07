package Inheritance;
class Employer{
    float salary = 40000;
}

public class Programmer extends Employer{
    int bonus = 10000;
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        System.out.println(programmer.salary);
        System.out.println(programmer.bonus);
    }

    //Hierarchical Inheritance => When two classes inherits same class then it is known as hierarchical inheritance.

}
