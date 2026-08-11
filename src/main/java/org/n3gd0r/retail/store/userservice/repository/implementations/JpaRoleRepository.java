package org.n3gd0r.retail.store.userservice.repository.implementations;

import java.util.List;

import org.n3gd0r.retail.store.userservice.domain.RoleEnum;
import org.n3gd0r.retail.store.userservice.domain.UserRole;
import org.n3gd0r.retail.store.userservice.domain.exceptions.UserRoleNotFoundException;
import org.n3gd0r.retail.store.userservice.repository.RoleRepository;
import org.n3gd0r.retail.store.userservice.repository.SpringDataJpaRoleRepository;
import org.springframework.stereotype.Repository;

/**
 * JpaRoleRepository
 */
@Repository
public class JpaRoleRepository implements RoleRepository {
    private final SpringDataJpaRoleRepository repository;

    public JpaRoleRepository(SpringDataJpaRoleRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserRole getRole(RoleEnum role) {
        return repository.findById(role).orElseThrow(UserRoleNotFoundException::new);
    }

    @Override
    public List<UserRole> roles() {
        return repository.findAll();
    }
}
