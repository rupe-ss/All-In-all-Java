package com.after5hours;

class RunnableThread1 implements Runnable{
    public void run(){
        for(int i =0; i <5; i++){
            System.out.println("Hi");
            try{Thread.sleep(500);}catch(Exception e){};
        }
    }
}
class RunnableThread2 implements Runnable{
    public void run(){
        for(int i = 0; i<5;i++){
            System.out.println("Hello");
            try{Thread.sleep(500);}catch(Exception e){};
        }
    }
}
public class MultiThreadingRunnableInterface {
    public static void main(String[] args) {
        //First we have to create object of Thread class
        Runnable thread1 = new RunnableThread1();
        Runnable thread2 = new RunnableThread2();

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);

        t1.start();
        try{Thread.sleep(10);}catch(Exception e){};
        t2.start();
    }
}
