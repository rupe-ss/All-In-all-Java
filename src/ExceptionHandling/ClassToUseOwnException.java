package ExceptionHandling;

public class ClassToUseOwnException {
    public static void main(String[] args) {
        int i = 10;
        int j = 9;

        try{
            int r = j/i;
            if(r == 0) throw new OwnException("This is not possible, and k can not be zero.");

        } catch (OwnException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
