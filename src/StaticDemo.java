/*
Notes:
1. Static loads when class is loaded and it will only load once.
2. To call static method you don't need a object of that class. You can call static method without having a Object.
2. You can not call non-static property in static method. Below main is static method and we can not called property that is non-static, it will throw a error.
 */

class Student {
    int id;
    String name ;
    static String university;

    static{
        university = "The Rising Star";
        System.out.println(university);
    }

    Student(){
        this.name = "student";
        System.out.println(name);
    }

    Student(String name){
        this.name = name;
        System.out.println(name);
    }
}

public class StaticDemo {
    //Below is static property, so it can be called inside main class.
    static String className = "StaticDemo";

    public static void main(String[] args){
        Student student = new Student();
        Student student1 = new Student("student1");

        System.out.println("Here, class name is " + className + ".");
    }
}
