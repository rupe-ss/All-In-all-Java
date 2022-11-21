package concurrency.atomicvariables;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariableExample {

    static class Counter {

        //private int c = 0;
        private AtomicInteger c = new AtomicInteger(0);

        public void increment(){
            //c++;
            c.getAndIncrement();
        }

        public int value(){
            //return c;
            return c.get();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final Counter counter = new Counter();

        //1000 threads
        for(int i = 0; i < 1000 ; i++) {

            new Thread(new Runnable() {

                public void run() {
                    counter.increment();
                }
            }).start();
        }
        Thread.sleep(6000);
        System.out.println("Final number (should be 1000): " + counter.value());
    }
}
