package concurrency.synchronizedexchanger;

public class SynchronizedExchangerMain {

    public static void main(String[] args) throws InterruptedException {

        SynchronizedExchanger exchanger = new SynchronizedExchanger();

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
        protected Object object = null;

        public synchronized void setObject(Object o){
            this.object = o;
        }

        public synchronized Object getObject(){
            return this.object;
        }

        public void setObj(Object o){
            synchronized (this){
                this.object = o;
            }
        }

        public Object getObj(){
            synchronized (this){
                return this.object;
            }
        }
    }

}
