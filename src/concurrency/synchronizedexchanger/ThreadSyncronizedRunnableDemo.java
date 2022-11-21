package concurrency.synchronizedexchanger;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertSame;

class RunnableThread implements Runnable{

    private Thread t;
    private String threadName;

    RunnableThread(String threadName){
        this.threadName = threadName;
        System.out.println("Creating " + threadName);
    }
    @Override
    public void run() {
        System.out.println("Running " + threadName);

        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);

                // Let the thread sleep for a while.
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start(){
        System.out.println("Starting " + threadName);

        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }

}

public class ThreadSyncronizedRunnableDemo {
    public static void main(String[] args) {
        RunnableThread runnableThread1 = new RunnableThread("Thread-1");
        runnableThread1.start();

        RunnableThread runnableThread2 = new RunnableThread("Thread-2");
        runnableThread2.start();
    }

    public static class ConcurrencyTest {
        @Test
        void main() throws InterruptedException {
            assertSame(1, work().size());
        }

        static List<Integer> work() throws InterruptedException{
            final List<Integer> list = Collections.synchronizedList(new ArrayList<>());
            Thread thread = new Thread(()-> addIfAbsent(list, 20));
            thread.start();
            addIfAbsent(list, 20);
            thread.join();
            System.out.println("Elements: " + list);
            return list;
        }

        private static void addIfAbsent(List<Integer> list, int x){
            synchronized (list){
                if(!list.contains(x)){
                    list.add(x);
                }
            }
        }
    }
}

