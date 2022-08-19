package com.todo1.hulk_store_backend.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface PaymentMapper {
    @Mappings({
            @Mapping(source = "idPayment", target = ""),
            @Mapping(source = "number", target = "number"),
            @Mapping(source = "cvc", target = "cvc"),
            @Mapping(source = "idUser", target = "idUser"),
            @Mapping(source = "user", target = "user")
    })
    com.todo1.hulk_store_backend.domain.entity.Payment toPayment(com.todo1.hulk_store_backend.persistence.entity.Payment payment);

    @InheritInverseConfiguration
    com.todo1.hulk_store_backend.persistence.entity.Payment toPayment(com.todo1.hulk_store_backend.domain.entity.Payment payment);
}