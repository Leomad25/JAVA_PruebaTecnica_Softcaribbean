package com.todo1.hulk_store_backend.persistence.mapper.compound;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface InvoiceHasProductPKMapper {
    @Mappings({
            @Mapping(source = "idInvoice", target = "idInvoice"),
            @Mapping(source = "idProduct", target = "idProduct")
    })
    com.todo1.hulk_store_backend.domain.entity.compound.InvoiceHasProductPK toInvoiceHasProductPk(com.todo1.hulk_store_backend.persistence.entity.compound.InvoiceHasProductPK invoiceHasProductPK);

    @InheritInverseConfiguration
    com.todo1.hulk_store_backend.persistence.entity.compound.InvoiceHasProductPK toInvoiceHasProductPk(com.todo1.hulk_store_backend.domain.entity.compound.InvoiceHasProductPK invoiceHasProductPK);
}
