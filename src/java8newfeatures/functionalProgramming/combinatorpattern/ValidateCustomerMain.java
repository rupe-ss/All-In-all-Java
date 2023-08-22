package java8newfeatures.functionalProgramming.combinatorpattern;

import java.time.LocalDate;

public class ValidateCustomerMain {
    public static void main(String[] args) {
        Customer customer = new Customer("johnson",
                "John",
                "Son",
                "johnson@gmail.com",
                "+1203456234",
                LocalDate.of(2000, 02, 10));

        /*
        Why we shouldn't use CustomerValidatorService approach to validate object in Java.
        1. We build CustomerValidatorService which is not loosely coupled because if we need to validate more
        variable like firstName and lastName than we have to make changes inside a methods.
        2. If there is any validation error then we don't know which validation failed.
         */
        System.out.println(new CustomerValidatorService().isValid(customer));
    }
}
