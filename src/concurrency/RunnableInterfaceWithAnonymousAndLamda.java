package concurrency;

public class RunnableInterfaceWithAnonymousAndLamda {

    public static void main(String[] args) {

        //Creating Thread with Runnable Interface with anonymous class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running.");
                System.out.println("Thread created with Runnable interface with anonymous class is running");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    static class RunnableInterfaceLamda{
        public static void main(String[] args) {

            //Creating Thread with Runnable Interface with Lambda Expression
            Runnable runnable = ()-> {
                System.out.println("Thread is running.");
                System.out.println("Thread created with Runnable interface with anonymous class is running");
            };

            Thread thread = new Thread(runnable);
            thread.start();
        }
    }
}
