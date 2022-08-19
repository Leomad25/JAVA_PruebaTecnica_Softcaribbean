package com.todo1.hulk_store_backend.persistence.mapper.compound;

import com.todo1.hulk_store_backend.persistence.mapper.InvoiceMapper;
import com.todo1.hulk_store_backend.persistence.mapper.ProductMapper;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {
        InvoiceMapper.class,
        ProductMapper.class
})
public interface InvoiceHasProductMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "count", target = "count"),
            @Mapping(source = "selled", target = "selled"),
            @Mapping(source = "value", target = "value"),
            @Mapping(source = "invoice", target = "invoice"),
            @Mapping(source = "product", target = "product")
    })
    com.todo1.hulk_store_backend.domain.entity.compound.InvoiceHasProduct toInvoiceHasProduct(com.todo1.hulk_store_backend.persistence.entity.compound.InvoiceHasProduct invoiceHasProduct);

    @InheritInverseConfiguration
    com.todo1.hulk_store_backend.persistence.entity.compound.InvoiceHasProduct toInvoiceHasProduct(com.todo1.hulk_store_backend.domain.entity.compound.InvoiceHasProduct invoiceHasProduct);
}
