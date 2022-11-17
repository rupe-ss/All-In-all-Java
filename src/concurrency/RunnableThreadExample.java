package concurrency;

class RunnableInterfaceDemo implements Runnable{

    @Override
    public void run() {
        for(int i =0; i <5; i++){
            System.out.println("Hi");
            try{
                Thread.sleep(500);
            }catch(Exception e){};
        }
    }
}

class RunnableInterfaceDemo1 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i<5;i++){
            System.out.println("Hello");
            try{Thread.sleep(500);}catch(Exception e){};
        }
    }
}

public class RunnableThreadExample {

    public static void main(String[] args) {
        RunnableInterfaceDemo runnableInterfaceDemo = new RunnableInterfaceDemo();
        RunnableInterfaceDemo1 runnableInterfaceDemo1 = new RunnableInterfaceDemo1();

        Thread thread1 = new Thread(runnableInterfaceDemo, "Thread-1");
        Thread thread2 = new Thread(runnableInterfaceDemo1, "Thread-2");

        thread1.start();
        try{Thread.sleep(10);}catch(Exception e){};
        thread2.start();
    }

}
