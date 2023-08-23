package java8newfeatures.functionalProgramming.callbacks;

import java.util.function.Consumer;

public class CallBackConsumerFunction {
    public static void main(String[] args) {
        hello("Paulo", null, firstname -> System.out.println("Lastname is not provided for " + firstname));
    }

    static void hello(String firstname, String lastname, Consumer<String> callback){
        System.out.println(firstname);
        if(lastname != null && !lastname.isEmpty()) System.out.println(lastname);
        else callback.accept(firstname);
    }

    /*
    How callback are written in JavaScript
    function hello(firstname, lastname, callback){
        console.log(firstname);
        if(lastname){
            console.log(lastname);
        } else {
            callback();
        }
    }
    //Calling hello() function
    hello("Paulo", "Coelho", () => console.log("Lastname is not provided."))
    */
}
