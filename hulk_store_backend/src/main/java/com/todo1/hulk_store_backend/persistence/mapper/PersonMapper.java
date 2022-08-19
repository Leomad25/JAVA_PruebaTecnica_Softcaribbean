package com.todo1.hulk_store_backend.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {
    UserMapper.class
})
public interface PersonMapper {
    @Mappings({
            @Mapping(source = "idPerson", target = "idPerson"),
            @Mapping(source = "firstName", target = "firstName"),
            @Mapping(source = "lastName", target = "lastName"),
            @Mapping(source = "identification", target = "identification"),
            @Mapping(source = "idUser", target = "idUser"),
            @Mapping(source = "user", target = "user")
    })
    com.todo1.hulk_store_backend.domain.entity.Person toPerson(com.todo1.hulk_store_backend.persistence.entity.Person person);

    @InheritInverseConfiguration
    com.todo1.hulk_store_backend.persistence.entity.Person toPerson(com.todo1.hulk_store_backend.domain.entity.Person person);
}
