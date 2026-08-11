package org.n3gd0r.retail.store.userservice.domain.exceptions;

/**
 * UserNameIsEmptyException
 */
public class UserNameIsEmptyException extends RuntimeException {
    public UserNameIsEmptyException() {
        super("UserName cannot be empty");
    }
}
