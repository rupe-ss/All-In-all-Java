package concurrency.deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLock {
    private final Lock lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();

    public void worker1(){
        lock1.lock();
        try {
            Thread.sleep(2000);
            System.out.println("Worker1 locking lock1");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Worker1 waiting for lock2 to unlock");
        lock2.lock();

        lock1.unlock();
        lock2.unlock();
    }

    public void worker2(){
        lock2.lock();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Worker2 locking lock2");
        System.out.println("Worker2 waiting for lock1 to unlock");
        lock1.lock();

        lock2.unlock();
        lock1.unlock();
    }

    public static void main(String[] args) {
        DeadLock deadLock = new DeadLock();

        //Below is the Method reference which makes code short and sweet.
        new Thread(deadLock::worker1).start();
        new Thread(deadLock::worker2).start();
    }
}
