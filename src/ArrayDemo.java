public class ArrayDemo {
    public static void main(String[] args){
        //Lets create a one dimentional array
        int nums[] = new int[5];
        //We are doing new because in Java array is an Object and to create new object we have to use new word and this will create a memory in heap memory.
        //Another way to create array is initializing the varaible while creating a array.
        int a[] = {1,2,3,4,5,6};
        System.out.println("Below is the one-dimensional array. Printing using for loop");
        for(int i =0; i < 6; i++){
            System.out.print(" " + a[i]);
        }
        System.out.println("\nBelow is another one-dimensional array where I am using enhanced for loop to print it.");
        int numbers[] = {1,2,3,4,5,6,7,8,9};
        // for(int i = 0; i < nums.length; i++){
        // 	System.out.print(" " + nums[i]);
        // }
        for(int k : numbers){
            System.out.print(" " + k);
        }
        System.out.println("\nBelow is the two dimensional array, where I am using nested for loop to print the integers");

        //Below is the two dimensional array
        int d [][] = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}};

        // How to print two dimensional array
        for( int i = 0; i < d.length; i++){
            for (int j = 0; j < d[i].length; j++){
                System.out.print(" " + d[i][j]);
            }
            System.out.println();
        }

        System.out.println("Below is the example of Jagged array and using enhanced for loop to print the numbers.");
        //Let's create a Jagged Array, it is two dimensional array with different number of columns in each rows.
        int jagged[][] = { {1,2}, {4,5,6}, {10,20,30,30,40,50}};
        for(int k[] : jagged){
            for(int q: k){
                System.out.print(" "+ q);
            }
            System.out.println();
        }
    }
}
