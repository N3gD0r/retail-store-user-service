package org.n3gd0r.retail.store.userservice.repository.converters;

import java.util.UUID;

import org.n3gd0r.retail.store.userservice.domain.UserId;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

/**
 * UserIdAttributeConverter
 */
@Converter(autoApply = true)
public class UserIdAttributeConverter implements AttributeConverter<UserId, UUID> {

    @Override
    public UUID convertToDatabaseColumn(UserId attribute) {
        return attribute.getId();
    }

    @Override
    public UserId convertToEntityAttribute(UUID dbData) {
        return new UserId(dbData);
    }
}
