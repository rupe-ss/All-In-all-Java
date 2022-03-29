public class Iteration {

    public static void main(String[] args){

        /*
        Assignment

        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        1 2 3 4 5 6

        A
        A B
        A B C

        $ $ $ $
        $     $
        $     $
        $ $ $ $

         */
        for(int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
