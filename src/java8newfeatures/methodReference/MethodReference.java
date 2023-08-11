package java8newfeatures.methodReference;

import java.util.Arrays;
import java.util.List;

/*
Below is the example using method reference for forEach. Let's implement our own.
 */
interface Printer{
    String parse(String str);
}

class StringConverter{
    public static String convert(String str){
        if(str.length() < 3)
            return str.toUpperCase();
        else return str.toLowerCase();
    }

    public String convertNonStatic(String str){
        if(str.length() < 3)
            return str.toUpperCase();
        else return str.toLowerCase();
    }

}

class PrintLog{
    public static void log(String str, Printer printer){
        str = printer.parse(str);
        System.out.println(str);
    }
}

public class MethodReference {
    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(1,2,3,4,5);
        /*
        Let's understand what is happening below in the code, forEach method is sending a value one at a time and println method is printing those values. Basically, we know it just sending and printing.
        We can use method reference here, in method reference we don't even have to pass the value. It will determine it self.
         */
//        arrayList.forEach(i -> System.out.println(i));
        /*
        To use method reference we have to tell them where the method is coming from. This is functional programming, passing method inside method not the value.
         */
        arrayList.forEach(System.out::println);

        /*
        1. Let's create a string value.
        2. Let us assume there is method to print the value we pass in server console or anywhere we want. We will pass name in below scenario.
        3. And this method belongs to another class name PrintLog.
        4. Below code won't be affected if you change the logic on log() method.
        5. Now, let's assume we want to convert below name to something and print it. We want to add logic before printing.
        6. Based on that logic it will convert the name and then it will print.
        7. Below log() method takes String as parameter and Interface Object as logic to convert the string.
        8. We can create a Object of Interface using anonymous class and pass the Object to method.
         */

        /*//Now we can convert below code into Lamda Expression
        String name = "Learning Method Reference";
        PrintLog printLog =  new PrintLog();
        printLog.log(name, new Printer() {
            @Override
            public String parse(String str) {
                return StringConverter.convert(str);
            }
        });*/

        /*
        String name = "Learning Method Reference";
        PrintLog printLog =  new PrintLog();
        // Lamda Expression will look like something below and it will still work just like above anonymous class.
        printLog.log(name, str -> StringConverter.convert(str));
        */

        /*//Now, lets convert from Lamda Expression to method reference.
        String name = "Learning Method Reference";
        PrintLog printLog =  new PrintLog();
        printLog.log(name, StringConverter::convert);*/

        //Now let's see example where method is not static
        StringConverter stringConverter = new StringConverter();
        String name = "Learning Method Reference";
        PrintLog printLog =  new PrintLog();
        printLog.log(name, stringConverter::convertNonStatic);
        PrintLog.log("Using static method", StringConverter::convert);
    }
}
