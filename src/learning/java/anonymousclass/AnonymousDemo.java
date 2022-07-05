package learning.java.anonymousclass;/*
Let's see how anonymous class works
1. We can make anonymous class when there is parent class and we want to override the method from parent class to sub class.
2. But why create new class extends the Parent class and override the method and specially when only overriding one method.
3. Instead we can make a Object of parent class and create a anonymous class while creating a Object.
4. See example below for more understanding.
 */

/*
Lets say this Super class is jar file and we can't edit this class but we want to override show() method in this class.
Now, instead of creating new class and extending this learning.java.anonymousclass.SuperClass we can make a anonymous class.
 */

class SuperClass{
    public void show(){
        System.out.println("Show method from parent class.");
    }
}

public class AnonymousDemo {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass(){
            @Override
            public void show() {
                System.out.println("Adding more feature to show method using anonymous class.");
            }
        }; //This class is anonymous class because this class don't have a name.
        superClass.show();
    }
}
