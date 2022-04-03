package com.after5hours;
/*
Since two Threads is calling same method count(), count value should be 2000 by the end of program stops but is always less than 2000. Why?
It is because both threads are fetching same data at some point this will cause this problem.
To fix this we need to use synchronized keyword, this will make sure once one Thread is using the method at once.
With synchronized added in method, count will always be 2000 now.
 */
class Counter{
    int count;
    public synchronized void count(){
        count++;
    }
}

public class SynchronizedDemo {
    public static void main(String[] args) throws Exception{
        Counter c = new Counter();
        //Lets create 2 Thread that will call the count method 1000 times
        Thread t1 = new Thread(()->{for(int i=0;i<1000;i++) c.count();}, "t1");

        Thread t2 = new Thread(()->{for(int i=0;i<1000;i++) c.count();}, "t2");
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Total count: "+ c.count);
    }
}
