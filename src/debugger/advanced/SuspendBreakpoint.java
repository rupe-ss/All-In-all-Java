package debugger.advanced;

public class SuspendBreakpoint {
    static SuspendBreakpoint instance;
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.println(getInstance(i));
        }

        //We are calling warmUp method first, but we might not be interested when warmUp() is calling work() method.
        //We are only interested to debug work() method when it is calling from realWork() method.
        //In this we can add suspend method as marker.
        warmUp();

        realWork();
    }

    static SuspendBreakpoint getInstance(int i){
        //With suspend breakpoint we can change the value of instance and make it null everytime it hits this breakpoint.
        //We can change the behaviour of the program.
        if(instance == null)
            instance = new SuspendBreakpoint();
        return instance;
    }

    private static void realWork(){
        for(int i = 0; i < 10; i++) {
            work();
        }
    }
    private static void warmUp(){
        for(int i = 0; i < 10; i++){
            work();
        }
    }
    private static void work(){
        // do something here
        //Now, we have added suspend breakpoint above in realWork() method we can tell this breakpoint, only enable when it is called from realWork() method.
        int a = 5;
    }
}
