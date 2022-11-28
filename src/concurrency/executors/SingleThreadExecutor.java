package concurrency.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class MyThread implements Runnable{

    private int id;

    MyThread(int id){
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Running thread with Task id - " + id + " and Thread id - " + Thread.currentThread().getName());
        try {
            long duration = (long) (Math.random() * 5);
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class SingleThreadExecutor {

    public static void main(String[] args) {
        //This will create one thread and reuse that thread to complete all task.
        //It will work sequentially, if created thread is shutdown due to error then it will create another one.
        ExecutorService executor = Executors.newSingleThreadExecutor();
        for(int i = 0; i < 5; i++)
            executor.execute(new MyThread(i));

        executor.shutdown();
    }

}
