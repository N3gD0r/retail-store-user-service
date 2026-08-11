package org.n3gd0r.retail.store.userservice.web.dtos;

import java.util.UUID;

import org.n3gd0r.retail.store.userservice.domain.User;

public record UserResponse(UUID id, String userName, UserDetailsDto details) {
    public static UserResponse of(User user) {
        return new UserResponse(user.getId().getId(), user.getUserName(), UserDetailsDto.of(user.getUserDetails()));
    }
}
