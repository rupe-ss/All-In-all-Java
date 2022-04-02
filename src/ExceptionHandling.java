/*
How to handle Exception and why to handle Exception ?
 */
public class ExceptionHandling {
    public static void main(String[] args) {
        int i = 5;
        int j = 3;
        int k = 0;
        int r;

        r = i/j;
        System.out.println("First result is: " + r);

        try{
            r = j/k; //If error occur here then this line won't execute so value of r won't change.
        }catch(Exception e){
            System.out.println("Error occured \n" + e.getMessage());
            //If we want to log message in red color then we can use err
            System.err.println("Error occured \n" + e.getMessage());
        }finally {
            //Finally block will execute no matter what, either there is exception or not.
            System.out.println("Second result is: " + r);
        }
    }
}
