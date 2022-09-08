package ExceptionHandling;

/*
Writing multiple Exceptions into same catch blocks was introduced in Java 1.7

 */
public class ExceptionHandlingMultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            int array[] = new int[5];
            array[5] = 7; //We know this will throw IndexOutOfBoundException
            //Let's create another exception
            int r = 5 / 0; //This will throw Arithmetic Exceptions
        /*}catch(IndexOutOfBoundsException e){
            System.out.println("Error Occurred.");
        }catch(ArithmeticException e){
            System.out.println("Error Occurred.");
        }*/
            //Above in both the case we see same message so why we need two catch blocks, we can handle both Exceptions in one catch blocks.
        }catch(IndexOutOfBoundsException | ArithmeticException e){
            System.out.println("Error Occurred.");
        }
        //Lets say there is another Exception that might occurred in try block then we can catch all Exception with Exception catch block.
        //But point to remember we can't mention Exception catch block before other catch blocks, it will show error because Exception catch block will catch all the Exceptions and other catch blocks will be unreachable.
        catch(Exception e){
            System.out.println("Error occurred.");
        }
    }
}
