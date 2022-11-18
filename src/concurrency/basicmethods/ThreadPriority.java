package concurrency.basicmethods;

public class ThreadPriority {
    static Thread thread1 = new Thread(()-> {
        for(int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + "- " + i);
        }
    }, "Thread-1");

    public static void main(String[] args) {
        thread1.start();
        thread1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(thread1.getPriority());

        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        System.out.println(Thread.currentThread().getPriority());
    }
}
