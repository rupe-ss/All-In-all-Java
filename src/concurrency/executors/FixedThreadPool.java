package concurrency.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Task implements Runnable{

    private int id;

    Task(int id){
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Running thread with Task id - " + id + " and Thread id - " + Thread.currentThread().getName());
        long duration = (long) (Math.random() * 5);
        try {
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            //e.printStackTrace();
        }
    }
}

public class FixedThreadPool {
    public static void main(String[] args) {
        //It will create fixed number of threads and keep reusing it.
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 10; i++)
            executor.execute(new Task(i));

        executor.shutdown();

        //If we want to shutdown the executor immediately if there is any exception then we can use sgutdownNow() method
        try {
            if(!executor.awaitTermination(1000, TimeUnit.MILLISECONDS))
                executor.shutdownNow();
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }
    }
}
