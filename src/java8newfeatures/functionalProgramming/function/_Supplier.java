package java8newfeatures.functionalProgramming.function;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getUrl());
        System.out.println(getUrlSupplier.get());
    }

    private static Supplier<String> getUrlSupplier = () -> "jdbc//:localhost:8080//functional_programming";

    //Regular Java Code
    private static String getUrl(){
        return "jdbc//:localhost:8080//functional_programming";
    }

}
