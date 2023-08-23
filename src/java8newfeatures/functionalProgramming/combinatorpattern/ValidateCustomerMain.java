package java8newfeatures.functionalProgramming.combinatorpattern;

import java.time.LocalDate;

import static java8newfeatures.functionalProgramming.combinatorpattern.CustomerValidatorInterface.*;

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
        3. We can do way better than this.
         */
        System.out.println(new CustomerValidatorService().isValid(customer));

        /*
        Combinator Pattern:-
        1. We will create an interface name CustomerValidatorInterface
        2. In the interface we will add the static method that will validate the Customer object.
        */
        ValidatorResult result = isUsernameValid()
                .and(isEmailValid())
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);

        if (result != ValidatorResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }else System.out.println(result.name());
    }
}
