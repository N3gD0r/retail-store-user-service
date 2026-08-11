package org.n3gd0r.retail.store.userservice.domain.exceptions;

/**
 * UserRoleNotFoundException
 */
public class UserRoleNotFoundException extends RuntimeException {
    public UserRoleNotFoundException() {
        super("UserRole not found");
    }
}
