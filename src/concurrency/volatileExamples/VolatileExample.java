package concurrency.volatileExamples;

public class VolatileExample {

    private static class Worker implements Runnable{
        //Here if we want to make sure the terminated variable is coming from RAM main memory then we have to use "volatile" keyword. Thread will use cache if it is available in cache memory
        private boolean terminated;

        public boolean isTerminated() {
            return this.terminated;
        }

        public void setTerminated(boolean terminated) {
            this.terminated = terminated;
        }

        @Override
        public void run() {
            while (!terminated){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Worker class is running");
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker();

        Thread thread = new Thread(worker);
        thread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        worker.setTerminated(true);

        thread.join();
        System.out.println("Worker class is terminated");
    }
}
