package org.n3gd0r.retail.store.userservice.repository.implementations;

import java.util.Optional;
import java.util.UUID;

import org.n3gd0r.retail.store.userservice.domain.User;
import org.n3gd0r.retail.store.userservice.domain.UserDetailsId;
import org.n3gd0r.retail.store.userservice.domain.UserId;
import org.n3gd0r.retail.store.userservice.domain.exceptions.UserNameAlreadyExistsException;
import org.n3gd0r.retail.store.userservice.domain.exceptions.UserNameIsEmptyException;
import org.n3gd0r.retail.store.userservice.domain.exceptions.UserNotFoundException;
import org.n3gd0r.retail.store.userservice.repository.SpringDataJpaUserRepository;
import org.n3gd0r.retail.store.userservice.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

/**
 * JpaUserRepository
 */
@Repository
public class JpaUserRepository implements UserRepository {
    private final SpringDataJpaUserRepository repository;

    public JpaUserRepository(SpringDataJpaUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserId nextId() {
        return new UserId(UUID.randomUUID());
    }

    @Override
    public UserDetailsId nextUserDetailsId() {
        return new UserDetailsId(UUID.randomUUID());
    }

    @Override
    public User getById(UserId id) {
        return repository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
    }

    @Override
    public User getByUserName(String userName) {
        return repository.getUserByUserName(userName).orElseThrow(() -> new UserNotFoundException(userName));
    }

    @Override
    public Optional<User> findById(UserId id) {
        return repository.findById(id);
    }

    @Override
    public void save(User user) {
        repository.save(user);
    }

    @Override
    public void validateExistsById(UserId id) {
        if (!repository.existsById(id)) {
            throw new UserNotFoundException(id);
        }
    }

    @Override
    public void validateExistsByUserName(String userName) {
        if (userName.isEmpty()) {
            throw new UserNameIsEmptyException();
        }
        if (repository.existsByUserName(userName)) {
            throw new UserNameAlreadyExistsException(userName);
        }
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public void deleteById(UserId userId) {
        repository.deleteById(userId);
    }

    @Override
    public long count() {
        return repository.count();
    }
}
