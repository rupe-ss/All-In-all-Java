package learning.java.additional;

class Addition{
    public int add(int ... i){ //When you use 3 dots its call Variable length Arguments, now the arguments comes in the form of array not in Integer
        int sum = 0;
        //Since, argument is coming into form of array we have to use for loop to add now.
        System.out.println(i); //This will print hash code because i is an array here.
        for(int k: i){
            sum += k;
        }
        return sum;
    }
}

public class VarargsDemo {
    public static void main(String[] args) {
        //Lets create a method that will add numbers
        Addition addition = new Addition();
        System.out.println(addition.add(1,2,3,4));
        System.out.println(addition.add(3,4));
        int[] array = {1,2,3,4};
        System.out.println(addition.add(array));
    }
}
