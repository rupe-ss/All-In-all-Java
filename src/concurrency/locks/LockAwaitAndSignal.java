package concurrency.locks;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockAwaitAndSignal {

    private static class Worker{
        //Creating Lock Object
        private static final Lock lock = new ReentrantLock();
        //We are creating condition object here because we need to use wait() and notify() methods just like we did in previous examples
        private static final Condition condition = lock.newCondition();
        public static void produce() throws InterruptedException {
            lock.lock();
            System.out.println("Currently in produce method.");
            Thread.sleep(2000);
            try {
                condition.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Thread.sleep(2000);
            System.out.println("Back in produce method again.");
            lock.unlock();
        }

        public static void consume(){
            lock.lock();
            System.out.println("Currently in consume method.");
            condition.signal();
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(()-> {
            try {
                Worker.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread2 = new Thread(()-> {
            Worker.consume();
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
