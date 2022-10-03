package Java11BeyondBasics.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExercise01 {
    /*
    Problem Statement
        In a lottery contest the company decided to give prize to those participants whose name started with “J” and has exactly 4 letters in it. Write a chained stream operations based code to find the name of winners.
    Input : [“Jack”, “John”, “Garry”, “Jill”, “Jim”, “Frank”]
    Output: [Jack, John, Jill]
    Click here to download the starter code for this exercise.
    Note: Check the project using SonarLint to maintain the coding standards. Ignore the violations which occur due to "System.out" statements.
     */
    public static void main(String[] args) {
        List<String> names=new ArrayList<String>();
        names.add("Jack");
        names.add("John");
        names.add("Jill");
        names.add("Jim");
        names.add("Garry");
        names.add("Frank");

        // Write your code here
        List<String> winners = names.stream().filter(name -> name.charAt(0) == 'J' && name.length() == 4)
                .collect(Collectors.toList());
        System.out.println(winners);
    }
}
