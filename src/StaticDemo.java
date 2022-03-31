/*
Notes:
1. Static loads when class is loaded and it will only load once.
2. To call static method you don't need a object of that class. You can call static method without having a Object.
3. You can not call non-static property in static method. Below main is static method and we can not called property that is non-static, it will throw a error.
4. Object is created in heap memory but static will load into class loader.
5. Also one more thing we can use Class name and change the value of static and it will be same for everyone.
6. If you want to initialize the non-static variable use constructor but if you want to initialize static variable we can use static block.
 */

class Student {
    int id;
    String name ;
    static String university;

//    static{
//        university = "The Rising Star";
//        System.out.println(university);
//    }

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
        Student.university = "The Shining Star";
        System.out.println(Student.university);
        Student student = new Student();
        Student student1 = new Student("student1");
        student.university = "The Rising Star";

        System.out.println("Here, class name is " + className + ".");

        System.out.println(Student.university);
    }
}
