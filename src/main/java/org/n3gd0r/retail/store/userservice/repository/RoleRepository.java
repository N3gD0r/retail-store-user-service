package org.n3gd0r.retail.store.userservice.repository;

import java.util.List;

import org.n3gd0r.retail.store.userservice.domain.RoleEnum;
import org.n3gd0r.retail.store.userservice.domain.UserRole;

/**
 * RoleRepository
 */
public interface RoleRepository {
    UserRole getRole(RoleEnum role);

    List<UserRole> roles();
}
