package org.n3gd0r.retail.store.userservice.repository;

import org.n3gd0r.retail.store.userservice.domain.RoleEnum;
import org.n3gd0r.retail.store.userservice.domain.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * SpringDataJpaRoleRepository
 */
public interface SpringDataJpaRoleRepository extends JpaRepository<UserRole, RoleEnum> {

}
