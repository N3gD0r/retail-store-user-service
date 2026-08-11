package org.n3gd0r.retail.store.userservice.domain;

import java.util.UUID;

import org.n3gd0r.commons.AbstractEntityId;

/**
 * UserDetailsId
 */
public class UserDetailsId extends AbstractEntityId<UUID> {
    protected UserDetailsId() {
    }

    public UserDetailsId(UUID id) {
        super(id);
    }
}
