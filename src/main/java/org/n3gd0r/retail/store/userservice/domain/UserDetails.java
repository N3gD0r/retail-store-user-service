package org.n3gd0r.retail.store.userservice.domain;

import org.n3gd0r.commons.AbstractEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

/**
 * UserDetails
 */
@Entity
public class UserDetails extends AbstractEntity<UserDetailsId> {
    @Column(length = 50)
    private String firstName;
    @Column(length = 50)
    private String lastName;
    @Column(length = 50)
    private String email;
    @Column(length = 15)
    private String phoneNumber;
    @Column(length = 30)
    private String street;
    @Column(length = 10)
    private String streetNumber;
    @Column(length = 6)
    private String zipCode;
    @Column(length = 30)
    private String locality;
    @Column(length = 30)
    private String country;
    @OneToOne(mappedBy = "userDetails")
    private User user;

    protected UserDetails() {
    }

    public UserDetails(UserDetailsId id, String firstName, String lastName, String email, String phoneNumber,
            String street, String streetNumber, String zipCode, String locality, String country) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.street = street;
        this.streetNumber = streetNumber;
        this.zipCode = zipCode;
        this.locality = locality;
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
