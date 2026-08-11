package org.n3gd0r.retail.store.userservice.repository;

import java.util.Optional;

import org.n3gd0r.retail.store.userservice.domain.User;
import org.n3gd0r.retail.store.userservice.domain.UserDetailsId;
import org.n3gd0r.retail.store.userservice.domain.UserId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * UserRepository
 */
public interface UserRepository {
    UserId nextId();

    UserDetailsId nextUserDetailsId();

    User getById(UserId id);

    User getByUserName(String userName);

    Optional<User> findById(UserId id);

    void save(User user);

    void validateExistsById(UserId id);

    void validateExistsByUserName(String userName);

    Page<User> findAll(Pageable pageable);

    void deleteById(UserId userId);

    long count();
}
