package concurrency.waitandnotify;

import java.util.ArrayList;
import java.util.List;

class Processor{
    private final static int UPPER_LIMIT = 5;
    private final static int LOWER_LIMIT = 0;
    private final static List<Integer> list = new ArrayList<>();
    private final static Object lock = new Object();
    private static int value = 0;

    private void producer() throws InterruptedException {
        synchronized (lock){
            while(true) {
                if (list.size() == UPPER_LIMIT) {
                    System.out.println("Waiting for item to be removed");
                    Thread.sleep(1000);
                    lock.wait();
                } else {
                    Thread.sleep(500);
                    System.out.println("Adding item " + value);
                    list.add(value);
                    value++;
                    //This notify method will only notify if another thread is in WAITING state
                    lock.notify();
                }
            }
        }
    }

    private void consumer() throws InterruptedException {
        synchronized (lock) {
            while (true) {
                if (list.size() == LOWER_LIMIT) {
                    System.out.println("Waiting for item to be added");
                    Thread.sleep(1000);
                    lock.wait();
                } else {
                    System.out.println("Removing item " + value);
                    Thread.sleep(500);
                    list.remove(list.size() - 1);
                    lock.notify();
                }
            }
        }
    }

    public void process(){
        Thread thread1 = new Thread(()-> {
            try {
                producer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread2 = new Thread(()-> {
            try {
                consumer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread1.start();
        thread2.start();
    }
}

public class AddToList {
    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.process();
    }
}
