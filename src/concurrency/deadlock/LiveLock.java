package concurrency.deadlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LiveLock {

    private final Lock lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();

    public void worker1(){
        while (true){
            try {
                lock1.tryLock(50, TimeUnit.MILLISECONDS);
                Thread.sleep(500);
                System.out.println("Worker1 acquire the lock1...");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Worker1 tries to get the lock2...");
            if(lock2.tryLock()){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Worker1 acquire the lock2...");
                lock2.unlock();
            } else {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Worker1 can not acquire the lock2...");
                continue;
            }
            break;
        }
        lock2.unlock();
    }

    public void worker2(){
        while (true){
            try {
                lock2.tryLock(50, TimeUnit.MILLISECONDS);
                System.out.println("Worker2 acquire the lock2...");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Worker2 tries to get the lock1...");
            if(lock1.tryLock()){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Worker2 acquire the lock1...");
                lock1.unlock();
            } else {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Worker2 can not acquire the lock1...");
                continue;
            }
            break;
        }
        lock1.unlock();
    }

    public static void main(String[] args) {
        LiveLock liveLock = new LiveLock();

        new Thread(liveLock::worker1, "worker-1 ").start();
        new Thread(liveLock::worker2, "worker-2 ").start();
    }
}
