package concurrency.synchronizedexchanger;

public class StaticSynchronizedExchanger {

    public static void main(String[] args) throws InterruptedException {
        SynchronizedExchangerMain.SynchronizedExchanger exchanger = new SynchronizedExchangerMain.SynchronizedExchanger();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 1000; i++){
                    exchanger.setObject("" + i);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 1000; i++){
                    System.out.println(exchanger.getObject());
                }
            }
        });

        thread1.start();
        Thread.sleep(1);
        thread2.start();
    }


    static class SynchronizedExchanger {

        //Here this will be monitor object
        private static Object object = null;

        public static synchronized void setObject(Object o){
            object = o;
        }

        public static synchronized Object getObject(){
            return object;
        }

        public static void setObj(Object o){
            //Here we are passing class object and this will be the monitor object
            synchronized (SynchronizedExchanger.class){
                object = o;
            }
        }

        public static Object getObj(){
            //Here we are passing class object and this will be the monitor object
            synchronized (SynchronizedExchanger.class){
                return object;
            }
        }
    }
}
