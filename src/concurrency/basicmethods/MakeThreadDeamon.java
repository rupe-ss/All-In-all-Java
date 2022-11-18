package concurrency.basicmethods;

public class MakeThreadDeamon {
    public static void main(String[] args) {

        Thread thread1 = new Thread(()-> {
            while(true){
                System.out.println(Thread.currentThread().getName() + " is running...");
            }
        }, "Deamon thread");

        Thread thread2 = new Thread(()-> {
            System.out.println(Thread.currentThread().getName() + " is terminating.");
        }, "Normal thread");

        //Making a thread deamon thread
        thread1.setDaemon(true);
        thread1.start();
        thread2.start();

    }
}
