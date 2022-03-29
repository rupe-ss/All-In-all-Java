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

        //Iteration continue in for loop
        System.out.println("\n");
        for(int i = 1; i <= 10; i++){
            //Below here what it is doing is, it is skipping the code below continue only when i value is 7
            if(i == 7)
                continue;
            System.out.println("Value is " + i);
        }

        //Iteration continue in for loop
        System.out.println("\n");
        for(int i = 1; i <= 10; i++){
            //Below here what it is doing is, it is breaking the for loop when i value is more than 5
            if(i > 5)
                break;
            System.out.println("Value is " + i);
        }
    }
}
