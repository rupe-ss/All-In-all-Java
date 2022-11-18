package concurrency.synchronizedexchanger;

public class SynchronizedObjectLevelLocking {

    private static int counter1 = 0;
    private static int counter2 = 0;

    //Here problem with synchronized keyword, even though increment1() and increment2() methods are independent to each other thread1 and thread2 can't access both method at same time because synchronized will lock the instance of SynchronizedObjectLevelLocking.class or Object of SynchronizedObjectLevelLocking.class
    private static synchronized void increment1(){
        counter1++;
    }

    private static synchronized void increment2(){
        counter2++;
    }

    private static void process(){
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
        process();
    }
}
