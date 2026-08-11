package org.n3gd0r.retail.store.userservice.usecase.register;

import org.n3gd0r.commons.mediator.Command;
import org.n3gd0r.retail.store.userservice.domain.User;
import org.springframework.util.Assert;

/**
 * RegisterUserParameters
 */
public class RegisterUserParameters extends Command<User> {
    private final String userName;
    private final String password;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String phoneNumber;
    private final String street;
    private final String streetNumber;
    private final String country;
    private final String locality;
    private final String zipCode;

    public RegisterUserParameters(String userName, String password, String email, String firstName, String lastName,
            String phoneNumber, String street, String streetNumber, String country, String locality,
            String zipCode) {
        Assert.hasText(userName, "The RegisterUserParameters userName should have text");
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.street = street;
        this.streetNumber = streetNumber;
        this.country = country;
        this.locality = locality;
        this.zipCode = zipCode;
    }

    public String userName() {
        return userName;
    }

    public String password() {
        return password;
    }

    public String firstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    public String email() {
        return email;
    }

    public String phoneNumber() {
        return phoneNumber;
    }

    public String street() {
        return street;
    }

    public String streetNumber() {
        return streetNumber;
    }

    public String zipCode() {
        return zipCode;
    }

    public String country() {
        return country;
    }

    public String locality() {
        return locality;
    }
}
