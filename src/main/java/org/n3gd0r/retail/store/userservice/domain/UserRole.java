package org.n3gd0r.retail.store.userservice.domain;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

/**
 * UserRole
 */
@Entity
public class UserRole {
    @Id
    @Enumerated(EnumType.STRING)
    private RoleEnum role;
    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<User> users = new ArrayList<>();

    public UserRole() {
    }

    public UserRole(RoleEnum role, List<User> users) {
        this.role = role;
        for (User user : users) {
            addUser(user);
        }
    }

    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users.clear();
        this.users.addAll(users);
        this.users.forEach(u -> u.setRole(this));
    }

    public void addUser(User user) {
        users.add(user);
        user.setRole(this);
    }

    public boolean hasUser(User user) {
        return users.stream().anyMatch(u -> u.equals(user));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((role == null) ? 0 : role.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UserRole other = (UserRole) obj;
        if (role != other.role)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("UserRole [role=%s]", role);
    }
}
