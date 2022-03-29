/*
What is constructor and what it does ?
1. It allocated the memory, only having a class won't work. When creating a object, it need a memory and constructor will do that for you.
2. Constructor don't have a return type.
3. You can initialize values inside constructor.
4. Constructor is a member method.
5. Constructor will have same name as class name.
 */

class Build {
    int num;
    double num1;
    double result;

    Build(){
        System.out.println("This is a default constructor.");
    }
    //This is a default constructor which is called automatically when object of this class is created.
    //We don't even have to define the access privilege

    Build(int i){
        System.out.println("This is a constructor with one parameter.");
    }

    //Initializing values inside constructor.
    Build(int i, double d){
        num = i;
        num1 = d;
        System.out.println("Two values are:- " + num + " and " + num1);
    }

}

public class ConstructorDemo {

    public static void main(String[] args){
        Build build = new Build(); //It will automatically call the default constructor now and print "This is a default constructor."
        Build build1 = new Build(4);
        Build build2 = new Build(2,5.5);
    }

}
