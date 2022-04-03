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
    public static void main(String[] args) {
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
        });
        Thread t2 = new Thread(() -> { //Since, this method have more than 1 line we need the curly brackets as well
            for(int i =0; i <5; i++){
                System.out.println("Hello");
                try{Thread.sleep(500);}catch(Exception e){};
            }
        });

        t1.start();
        try{Thread.sleep(10);}catch(Exception e){};
        t2.start();
    }
}
