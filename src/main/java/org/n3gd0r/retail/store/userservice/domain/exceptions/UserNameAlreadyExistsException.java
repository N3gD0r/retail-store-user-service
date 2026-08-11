package org.n3gd0r.retail.store.userservice.domain.exceptions;

/**
 * UserNameAlreadyExistsException
 */
public class UserNameAlreadyExistsException extends RuntimeException {
    public UserNameAlreadyExistsException(String userName) {
        super("Username already exists".formatted(userName));
    }
}
