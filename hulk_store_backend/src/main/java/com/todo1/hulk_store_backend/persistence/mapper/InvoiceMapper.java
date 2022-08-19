package com.todo1.hulk_store_backend.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface InvoiceMapper {
    @Mappings({
            @Mapping(source = "idInvoice", target = "idInvoice"),
            @Mapping(source = "reference", target = "reference"),
            @Mapping(source = "buyer", target = "buyer"),
            @Mapping(source = "seller", target = "seller"),
            @Mapping(source = "invoiceHasProducts", target = "invoiceHasProducts"),
            @Mapping(source = "userBuyer", target = "userBuyer"),
            @Mapping(source = "userSeller", target = "userSeller")
    })
    com.todo1.hulk_store_backend.domain.entity.Invoice toInvoice(com.todo1.hulk_store_backend.persistence.entity.Invoice invoice);

    @InheritInverseConfiguration
    com.todo1.hulk_store_backend.persistence.entity.Invoice toInvoice(com.todo1.hulk_store_backend.domain.entity.Invoice invoice);
}
