public class OperatorDemo {

    public static void main(String[] args){
        int n = 3;

        int m = 8;

        int r = 6/2;

        double r1 = (double) m/n; // Also, called explicit conversion
        System.out.println(r);
        System.out.println(r1);

        int i = 5, j = 7;

        j = ++i;
        System.out.println(j); // This will print 6 because it will increment and assign value of i to j

        j = i++;
        System.out.println(j); //This will print 6 again because it will assign and increment later
        System.out.println(i); //This will print 7 because no matter what it will increment the value of i twice.
    }
}
