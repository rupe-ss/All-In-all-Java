package concurrency.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockAndUnlock {

    private static int counter = 0;
    //Lock is am interface so we need to make object of class that implements Lock interface
    private final static Lock lock = new ReentrantLock();

    private static void increment(){
        lock.lock();
        try {
            for(int i = 0; i < 500; i++){
                counter++;
            }
            //Always use try/finally while using lock because if exception happens in try block then unlock() method will never execute.
        }finally {
            lock.unlock();
        }
    }

    //Another advantange of using lock instead of synchronized keyword is we can call unlock() method from completely independent method without any issue
    private static void add(){
        //lock.unlock();
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(()-> {
           increment();
        });

        Thread thread2 = new Thread(()-> {
            increment();
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}
