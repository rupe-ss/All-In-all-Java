package concurrency.racecondition;

public class RaceConditionIssueExample {

    //Shared Object from two different threads
    public static void main(String[] args) {

        Object object = new Object();
        MyRunnable runnable = new MyRunnable(object);

        //Since both of these thread will share the same Runnable object(shared object) variable count will never reach the 2_000_000
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
    }

    //Separate Thread sharing two different object
    static class SeparateObjectThreads{
        public static void main(String[] args) {

            Object object = new Object();

            //Even though we are creating two different Runnable objects both thread refers to same Object. Hence, chances of race condition occurrence.
            MyRunnable runnable1 = new MyRunnable(object);
            MyRunnable runnable2 = new MyRunnable(object);

            //Since both of these thread will not share the same Runnable object(shared object) variable count will reach 1_000_000 on each thread.
            Thread thread1 = new Thread(runnable1);
            Thread thread2 = new Thread(runnable2);
            thread1.start();
            thread2.start();
        }
    }

    //Runnable Thread
    static class MyRunnable implements Runnable{
        private Object object = null;

        public MyRunnable(Object object) {
            this.object = object;
        }

        private int count = 0;
        @Override
        public void run() {
            for(int i = 0; i < 1_000_000; i++){
                count++;
            }
            System.out.println(object);
            System.out.println(Thread.currentThread().getName() + ": " + this.count);
        }

    }

}
