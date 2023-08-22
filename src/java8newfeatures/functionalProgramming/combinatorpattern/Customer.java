package java8newfeatures.functionalProgramming.combinatorpattern;

import java.time.LocalDate;

public class Customer {
     private final String username;
     private final String firstName;
     private final String lastName;
     private final String email;
     private final String phoneNumber;
     private final LocalDate dob;

    public Customer(String username, String firstName, String lastName, String email, String phoneNumber, LocalDate dob) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dob = dob;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getDob() {
        return dob;
    }
}
