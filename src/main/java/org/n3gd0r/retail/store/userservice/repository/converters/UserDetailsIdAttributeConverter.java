package org.n3gd0r.retail.store.userservice.repository.converters;

import java.util.UUID;

import org.n3gd0r.retail.store.userservice.domain.UserDetailsId;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

/**
 * UserDetailsIdAttributeConverter
 */
@Converter(autoApply = true)
public class UserDetailsIdAttributeConverter implements AttributeConverter<UserDetailsId, UUID> {

    @Override
    public UUID convertToDatabaseColumn(UserDetailsId attribute) {
        return attribute.getId();
    }

    @Override
    public UserDetailsId convertToEntityAttribute(UUID dbData) {
        return new UserDetailsId(dbData);
    }
}
