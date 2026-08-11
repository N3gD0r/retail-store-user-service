package org.n3gd0r.retail.store.userservice.domain.exceptions;

import org.n3gd0r.retail.store.userservice.domain.UserId;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * UserNotFoundException
 * Thrown when the user with specific id (or username) was not found
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(UserId id) {
        super("User with id %s not found".formatted(id.getId()));
    }

    public UserNotFoundException(String userName) {
        super("User with useranme %s not found".formatted(userName));
    }
}
