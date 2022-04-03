package com.after5hours;
/*
1. Let's print 5 times Hi in one class and 5 times Hello in another class.
2. Make a object of both the class and call the method print() in main method.
3. At this point only main thread is running so it will print 5 times Hi and go to another class to call print() method and print 5 times Hello.
4. To make a thread we need to extends class with Thread class, once you do it all the reference of this class will become a thread as well. So you will have access to method that are in Thread class as well.
5. Now, to start those threads we need to call start() method. But it won't run print() method because when we call start() method using the Object reference start() method will automatically call run() method so it is not even calling print() method.
6. So, we have to rename print method with run method so it will call the loop to print Hi and Hello.
7. Now at this point it wll run both thread class and print Hi Hello in random order.
8. Let's put a sleep to thread for some milliseconds after every print. We can do that using sleep() method from Thread class.
9. Now at this it will print Hi and Hello together but might not be order because it depends on core processing time.
10. If you want to print in order add sleep time between 2 start method call.
 */
//Making this class thread with extending Thread class
class Thread1 extends Thread{
    //Replacing print() method to run() method so it will be called when start() method is called.
    public void run(){
        for(int i=0; i<5;i++){
            System.out.println("Hi");
            //This will throw an Exception so we need to handle it. Its a checked Exception.
            try{ Thread.sleep(500); }catch(Exception e){}
        }
    }
}
class Thread2 extends Thread{
    //Replacing print() method to run() method so it will be called when start() method is called.
    public void run(){
        for(int i =0; i<5;i++){
            System.out.println("Hello");
            //This will throw an Exception so we need to handle it. Its a checked Exception.
            try{ Thread.sleep(500); }catch(Exception e){}
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        //To make in order, Hi and Hello. We can put sleep time here but I didn't understand this part.
        try{ Thread.sleep(500); }catch(Exception e){}
        t2.start();
    }
}
