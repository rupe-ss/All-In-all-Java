package InterviewPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomNumber {

    //Creating list of random number using Random class
    public static void main(String[] args) {

        Random random = new Random();

        int[] randomNumberList = random.ints(0,100).limit(10).sorted().toArray();

        System.out.println(Arrays.toString(randomNumberList));
    }
}
