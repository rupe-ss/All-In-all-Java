package java8newfeatures.functionalProgramming.combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

    private boolean isUsernameValid(String username){
        return username.length() > 5;
    }

    private boolean isEmailValid(String email){
        return email.contains("@") && email.contains(".com");
    }

    private boolean isPhoneNumberValid(String phone){
        return phone.length() == 11 && phone.startsWith("+1");
    }

    private boolean isAdult(LocalDate dob){
        return Period.between(dob, LocalDate.now()).getYears() > 18;
    }

    public boolean isValid(Customer customer){
        return isUsernameValid(customer.getUsername()) &&
                isPhoneNumberValid(customer.getPhoneNumber()) &&
                isEmailValid(customer.getEmail()) &&
                isAdult(customer.getDob());
    }

}
