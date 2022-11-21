package concurrency.atomicvariables;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariableIncrement {

    private static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {

        AtomicVariableIncrement atomicVariableIncrement = new AtomicVariableIncrement();

        Thread thread1 = new Thread(atomicVariableIncrement::increment, "thread1");
        Thread thread2 = new Thread(atomicVariableIncrement::increment, "thread2");
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Counter: " + counter);
    }

    private void increment(){
        for(int i = 0; i < 1000; i++){
            counter.getAndIncrement();
        }
    }
}
