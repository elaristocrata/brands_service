package com.ilandsoftware.start.shop.domain.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

/**
 * A DTO for the {@link com.ilandsoftware.start.shop.dataprovider.entity.Brand} entity
 */
@Builder
@Data
public class CreateBrandRequest implements Serializable {
    private final UUID brand_uuid;
    private final String brandName;
    private final String brandSlug;
    private final String brandImage;
    private final Instant createdAt;
    private final Instant updatedAt;
}
