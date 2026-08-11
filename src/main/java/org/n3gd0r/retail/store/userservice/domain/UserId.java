package org.n3gd0r.retail.store.userservice.domain;

import java.util.UUID;

import org.n3gd0r.commons.AbstractEntityId;

/**
 * UserId
 */
public class UserId extends AbstractEntityId<UUID> {
    protected UserId() {
    }

    public UserId(UUID id) {
        super(id);
    }
}
