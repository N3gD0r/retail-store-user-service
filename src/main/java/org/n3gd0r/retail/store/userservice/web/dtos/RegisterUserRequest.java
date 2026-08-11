package org.n3gd0r.retail.store.userservice.web.dtos;

import org.n3gd0r.retail.store.userservice.usecase.register.RegisterUserParameters;

/**
 * RegisterUserRequest
 */
public record RegisterUserRequest(String userName, String password, String email, String firstName, String lastName,
        String phoneNumber, String street, String streetNumber, String country, String locality, String zipCode) {

    public RegisterUserParameters toParameters() {
        return new RegisterUserParameters(userName, password, email, firstName, lastName, phoneNumber, street,
                streetNumber, country, locality, zipCode);
    }
}
