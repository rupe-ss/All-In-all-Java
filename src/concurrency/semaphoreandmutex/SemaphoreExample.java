package concurrency.semaphoreandmutex;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

//Singleton pattern -
enum Downloader{
    INSTANCE;

    //We need to provide fair as 'true' if we want to provide access to the longest waiting thread
    private Semaphore semaphore = new Semaphore(3, true);

    public void download(){
        try {
            //Given thread will acquire permit if available
            semaphore.acquire();
            downloadData();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            //It is going to release the permit and return to semaphore
            semaphore.release();
        }
    }

    private void downloadData(){
        try {
            System.out.println("Downloading data from the web...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
public class SemaphoreExample {
    public static void main(String[] args) {
        //Create multiple threads - executors
        //Instead of creating threads one by one we are using executor to create a threads
        ExecutorService service = Executors.newCachedThreadPool();

        for(int i = 0; i < 12; i++){
            service.execute(new Runnable() {
                @Override
                public void run() {
                    Downloader.INSTANCE.download();
                }
            });
        }
    }
}
