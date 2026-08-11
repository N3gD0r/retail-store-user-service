package org.n3gd0r.retail.store.userservice.repository;

import java.util.Optional;

import org.n3gd0r.retail.store.userservice.domain.User;
import org.n3gd0r.retail.store.userservice.domain.UserId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * SpringDataJpaUserRepository
 */
public interface SpringDataJpaUserRepository
        extends CrudRepository<User, UserId>, PagingAndSortingRepository<User, UserId> {
    Optional<User> getUserByUserName(String userName);

    boolean existsByUserName(String userName);

}
