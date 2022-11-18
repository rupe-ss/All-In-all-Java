package concurrency.synchronizedexchanger;

public class SynchronizedClassLevelLocking {

    private static int counter1 = 0;
    private static int counter2 = 0;

    private static synchronized void increment1(){
        counter1++;
    }

    private static synchronized void increment2(){
        counter2++;
    }

    public void process(){
        Thread thread1 = new Thread(()-> {
            for (int i = 0; i < 1000; i++){
                increment1();
            }
            System.out.println("Counter1: " + counter1);
        });

        Thread thread2 = new Thread(()-> {
            for (int i = 0; i < 1000; i++){
                increment2();
            }
            System.out.println("Counter2: " + counter2);
        });

        thread1.start();
        thread2.start();
    }

    public static void main(String[] args) {
        SynchronizedClassLevelLocking synchronizedClassLevelLocking = new SynchronizedClassLevelLocking();
        synchronizedClassLevelLocking.process();
    }

}
