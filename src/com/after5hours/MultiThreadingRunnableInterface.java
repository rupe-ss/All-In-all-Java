package com.after5hours;

/*
Since, Runnable is Functional Interface we can use Lamda Expression.

 */

/*//Since, there is only one method we can use anonymous class to define this method.
class RunnableThread1 implements Runnable{
    public void run(){
        for(int i =0; i <5; i++){
            System.out.println("Hi");
            try{Thread.sleep(500);}catch(Exception e){};
        }
    }
}*/

/*//Since, there is only one method we can use anonymous class to define this method.
class RunnableThread2 implements Runnable{
    public void run(){
        for(int i = 0; i<5;i++){
            System.out.println("Hello");
            try{Thread.sleep(500);}catch(Exception e){};
        }
    }
}*/
public class MultiThreadingRunnableInterface {
    public static void main(String[] args) throws Exception{
        /*//First we have to create object of Thread class
        Runnable thread1 = new RunnableThread1();
        Runnable thread2 = new RunnableThread2();*/

        /*//1. We are going to use anonymous class to make Object of Runnable Interface, because we need to pass Runnable Object in Thread constructor.
        Runnable thread1 = new Runnable() {
            @Override
            public void run() {
                for(int i =0; i <5; i++){
                    System.out.println("Hi");
                    try{Thread.sleep(500);}catch(Exception e){};
                }
            }
        };

        Runnable thread2 = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<5;i++){
                    System.out.println("Hello");
                    try{Thread.sleep(500);}catch(Exception e){};
                }
            }
        };*/

        /*//2. Let's use our more knowledge to reduce code. Above we are overriding run() method and Runnable is Functional Interface so we can use Lamda Expression.
        Runnable thread1 = () -> { //Since, this method have more than 1 line we need the curly brackets as well
            for(int i =0; i <5; i++){
                System.out.println("Hi");
                try{Thread.sleep(500);}catch(Exception e){};
            }
        };

        Runnable thread2 = () -> { //Since, this method have more than 1 line we need the curly brackets as well
            for(int i =0; i <5; i++){
                System.out.println("Hello");
                try{Thread.sleep(500);}catch(Exception e){};
            }
        };*/

        //3. We are passing Object to Thread constructor so we can make Object while creating Thread Object to reduce code.
        Thread t1 = new Thread(() -> { //Since, this method have more than 1 line we need the curly brackets as well
            for(int i =0; i <5; i++){
                System.out.println("Hi");
                try{Thread.sleep(500);}catch(Exception e){};
            }
        }, "Hi Thread");
        Thread t2 = new Thread(() -> { //Since, this method have more than 1 line we need the curly brackets as well
            for(int i =0; i <5; i++){
                System.out.println("Hello");
                try{Thread.sleep(500);}catch(Exception e){};
            }
        }, "Hello Thread");

        /*//Let's print the default name of Threads
        System.out.println("t1 Thread name is: " + t1.getName());
        System.out.println("t2 Thread name is: " + t2.getName());*/

        /*//Let's set the name of Threads
        t1.setName("Hi Thread");
        t2.setName("Hello Thread");*/

        //Let's print the default name of Threads
        System.out.println("t1 Thread name is: " + t1.getName());
        System.out.println("t2 Thread name is: " + t2.getName());

        //We can give priority to Threads with number or CONSTANT
        System.out.println("Priority to Thread t1: " + t1.getPriority());
        System.out.println("Priority to Thread t2: " + t2.getPriority());

        //Changing priority to Threads
        t1.setPriority(10);
        t2.setPriority(1);

        /*t1.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);*/

        //We can give priority to Threads with number or CONSTANT
        System.out.println("Priority to Thread t1: " + t1.getPriority());
        System.out.println("Priority to Thread t2: " + t2.getPriority());

        t1.start();
        try{Thread.sleep(10);}catch(Exception e){};
        t2.start();

        //We can check if Thread is alive or not using isAlive() method
        if(t1.isAlive()){
            System.out.println("Thread1 is running.");
        }
        if(t2.isAlive()){
            System.out.println("Thread2 is running.");
        }

        //join() method will execute this line when thread stop running and main thread will stop waiting and execute the remaining code.
        //join() method will throw an Exception so we will handle with throws Exception.
        t1.join();
        t2.join();

        if(!t1.isAlive()){
            System.out.println("Thread1 is not running. Thread1 already joined with main Thread.");
        }
        if(!t2.isAlive()){
            System.out.println("Thread2 is not running. Thread2 already joined with main Thread.");
        }

        //We will print something after both Thread is joined.
        System.out.println("Bye Bye");
    }
}
