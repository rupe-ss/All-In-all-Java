package concurrency.synchronizedexchanger;

public class Rentrance {

    private int count = 0;

    //Here monitor object will be the same instance
    public synchronized void inc(){

    }

    //Here monitor object will be the same instance
    //This will hold the monitor object and when java goes to inc() method it will know it is same monitor object
    public synchronized int incAndGet() {
        inc();
        return this.count;
    }
}
