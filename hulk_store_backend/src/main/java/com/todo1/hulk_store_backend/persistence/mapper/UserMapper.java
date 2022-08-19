package com.todo1.hulk_store_backend.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mappings({
            @Mapping(source = "idUser", target = "idUser"),
            @Mapping(source = "nickName", target = "nickName"),
            @Mapping(source = "password", target = "password"),
            @Mapping(source = "person", target = "person"),
            @Mapping(source = "payment", target = "payment"),
            @Mapping(source = "invoicesBuyer", target = "invoicesBuyer"),
            @Mapping(source = "invoicesSeller", target = "invoicesSeller")
    })
    com.todo1.hulk_store_backend.domain.entity.User toUser(com.todo1.hulk_store_backend.persistence.entity.User user);

    @InheritInverseConfiguration
    com.todo1.hulk_store_backend.persistence.entity.User toUser(com.todo1.hulk_store_backend.domain.entity.User user);
}
