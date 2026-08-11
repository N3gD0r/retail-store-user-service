package org.n3gd0r.retail.store.userservice.web;

import org.n3gd0r.commons.mediator.Mediator;
import org.n3gd0r.retail.store.userservice.domain.User;
import org.n3gd0r.retail.store.userservice.web.dtos.RegisterUserRequest;
import org.n3gd0r.retail.store.userservice.web.dtos.UserResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

/**
 * UserController
 */
@RestController
@RequestMapping("/api/users")
public class UserController {
    private final Mediator mediator;

    public UserController(Mediator mediator) {
        this.mediator = mediator;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse registerUser(@Valid @RequestBody RegisterUserRequest request) {
        User user = mediator.send(request.toParameters());
        return UserResponse.of(user);
    }
}
