package concurrency.synchronizedexchanger;

public class SynchronizedLockWithCustomLocking {

    private static int counter1 = 0;
    private static int counter2 = 0;
    private static final Object Lock1 = new Object();
    private static final Object Lock2 = new Object();

    private static void increment1(){
        //Synchronized lock with custom Object
        synchronized (Lock1){
            counter1++;
        }
    }

    private static void increment2(){
        synchronized (Lock2){
            counter2++;
        }
    }

    public static void process(){
        Thread thread1 = new Thread(()-> {
            for(int i = 0; i < 50; i++){
                increment1();
            }
        });
        Thread thread2 = new Thread(()-> {
            for(int i = 0; i < 50; i++){
                increment2();
            }
        });

        thread1.start();
        thread2.start();
    }

    public static void main(String[] args) {
        process();
    }
}
