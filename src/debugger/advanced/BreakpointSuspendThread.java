package debugger.advanced;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Below this we are practicing how Breakpoint work in multiple Thread
//Learned how to import Junit library in regular Java core project
public class BreakpointSuspendThread {

    @Test
    public void main() throws InterruptedException {
        assertEquals(1, work().size());
    }

    static List<Integer> work() throws InterruptedException {
        final List<Integer> list = Collections.synchronizedList(new ArrayList<>());

        //When we call start() method the start() method will automatically call the run() method. run() method is in Runnable interface with only one abstract method. Because of this we can use Lamda Expression here.
        Thread thread = new Thread(()-> addIfAbsent(list, 17));
        thread.start();
        addIfAbsent(list, 17);
        thread.join();
        System.out.println("Element of List: " + list);
        return list;
    }

    private static void addIfAbsent(List<Integer> list, int i){
        /*if(!list.contains(i))
            list.add(i);*/
        //So, fix for above code will be.
        synchronized (list){
            if(!list.contains(i))
                list.add(i);
        }
    }
}
