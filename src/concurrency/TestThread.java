package concurrency;

class ThreadExample extends Thread{
    private Thread t;

    private String threadName;

    public ThreadExample(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " +  threadName );

        try {

            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);

                // Let the thread sleep for a while.
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start () {
        System.out.println("Starting " +  threadName );

        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}

public class TestThread {
    public static void main(String[] args) {
        ThreadExample threadExample1 = new ThreadExample("Thread-1");
        threadExample1.start();

        ThreadExample threadExample2 = new ThreadExample("Thread-2");
        threadExample2.start();
    }
}
