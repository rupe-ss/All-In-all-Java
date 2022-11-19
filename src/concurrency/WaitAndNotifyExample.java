package concurrency;

class Process{
    public void produce() throws InterruptedException {
        synchronized (this){
            System.out.println("Running the produce method...");
            wait();
            System.out.println("Again Coming Back and running produce method...");
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(2000);
        synchronized (this){
            System.out.println("Running the consume method...");
            Thread.sleep(2000);
            notify();
        }
    }

}
public class WaitAndNotifyExample {
    public static void main(String[] args) throws InterruptedException {
        Process process = new Process();

        Thread thread1 = new Thread(()-> {
            try {
                process.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread2 = new Thread(()-> {
            try {
                process.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread1.start();
        thread2.start();
    }
}
