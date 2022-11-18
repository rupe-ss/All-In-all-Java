package concurrency.basicmethods;

public class ThreadMethods {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(()-> {
            for(int i = 0; i < 50; i++){
                System.out.println(Thread.currentThread().getName() + "- " + i);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread-1");

        Thread thread2 = new Thread(()-> {
            for(int i = 0; i < 50; i++){
                System.out.println(Thread.currentThread().getName() + "- " + i);
            }
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread-2");

        thread1.start();
        thread2.start();

        thread2.join();

        System.out.println("Waiting for thread to complete.");
    }
}
