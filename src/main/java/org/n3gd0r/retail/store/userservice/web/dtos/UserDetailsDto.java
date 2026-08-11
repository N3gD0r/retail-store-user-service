package org.n3gd0r.retail.store.userservice.web.dtos;

import org.n3gd0r.retail.store.userservice.domain.UserDetails;

/**
 * UserDetailsDto
 */
public record UserDetailsDto(String firstName, String lastName, String email, String phoneNumber, String country,
        String locality, String zipCode, String street, String streetNumber) {
    public static UserDetailsDto of(UserDetails details) {
        return new UserDetailsDto(details.getFirstName(), details.getLastName(), details.getEmail(),
                details.getPhoneNumber(), details.getCountry(), details.getLocality(), details.getZipCode(),
                details.getStreet(), details.getStreetNumber());
    }
}
