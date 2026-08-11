package org.n3gd0r.retail.store.userservice.domain;

import org.n3gd0r.commons.AbstractEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity(name = "retail_user")
@Table(name = "retail_user")
public class User extends AbstractEntity<UserId> {
    @Column(length = 255, unique = true)
    private String userName;
    @Column(length = 255)
    private String userPassword;
    private boolean active;
    @OneToOne(cascade = CascadeType.ALL)
    private UserDetails userDetails;
    @ManyToOne
    private UserRole role;

    protected User() {
    }

    public User(UserId id, String userName, String userPassword, boolean active, UserDetails userDetails,
            UserRole role) {
        super(id);
        this.userName = userName;
        this.userPassword = userPassword;
        this.active = active;
        this.userDetails = userDetails;
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
}
