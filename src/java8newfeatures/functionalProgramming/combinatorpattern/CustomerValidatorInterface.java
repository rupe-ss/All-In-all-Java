package java8newfeatures.functionalProgramming.combinatorpattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static java8newfeatures.functionalProgramming.combinatorpattern.CustomerValidatorInterface.ValidatorResult;
import static java8newfeatures.functionalProgramming.combinatorpattern.CustomerValidatorInterface.ValidatorResult.*;

public interface CustomerValidatorInterface extends Function<Customer, ValidatorResult> {

    static CustomerValidatorInterface isUsernameValid(){
        return customer -> customer.getUsername().length() >= 5 ? SUCCESS : USERNAME_IS_NOT_VALID;
    }

    static CustomerValidatorInterface isEmailValid(){
        return customer -> customer.getEmail().contains("@") && customer.getEmail().contains(".com") ? SUCCESS : EMAIL_IS_NOT_VALID;
    }

    static CustomerValidatorInterface isPhoneNumberValid(){
        return customer -> customer.getPhoneNumber().startsWith("+1") && customer.getPhoneNumber().length() == 11 ? SUCCESS : PHONE_NUMBER_IS_NOT_VALID;
    }

    static CustomerValidatorInterface isAdult(){
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 18 ? SUCCESS : NOT_ADULT;
    }

    default CustomerValidatorInterface and(CustomerValidatorInterface other){
        return customer -> {
            ValidatorResult validatorResult = this.apply(customer);
            return validatorResult.equals(SUCCESS) ? other.apply(customer) : validatorResult;
        };
    }

    enum ValidatorResult{
        SUCCESS,
        USERNAME_IS_NOT_VALID,
        EMAIL_IS_NOT_VALID,
        PHONE_NUMBER_IS_NOT_VALID,
        NOT_ADULT
    }
}
