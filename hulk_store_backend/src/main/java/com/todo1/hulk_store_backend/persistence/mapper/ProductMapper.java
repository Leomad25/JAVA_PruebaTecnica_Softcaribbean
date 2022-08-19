package com.todo1.hulk_store_backend.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mappings({
            @Mapping(source = "idProduct", target = "idProduct"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "reference", target = "reference"),
            @Mapping(source = "invoicesHasProducts", target = "invoicesHasProducts")
    })
    com.todo1.hulk_store_backend.domain.entity.Product toProduct(com.todo1.hulk_store_backend.persistence.entity.Product product);

    @InheritInverseConfiguration
    com.todo1.hulk_store_backend.persistence.entity.Product toProduct(com.todo1.hulk_store_backend.domain.entity.Product product);
}
